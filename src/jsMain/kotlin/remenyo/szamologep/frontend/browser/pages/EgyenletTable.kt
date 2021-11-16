/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.frontend.browser.pages

import remenyo.szamologep.MathActions
import remenyo.szamologep.data.EgyenletEntityBo
import zakadabar.core.browser.table.ZkTable
import zakadabar.core.browser.toast.toastInfo
import zakadabar.core.data.QueryBo
import zakadabar.core.resource.css.px
import zakadabar.core.resource.localized

class EgyenletTable : ZkTable<EgyenletEntityBo>() {

    fun commandToChar(command: MathActions): String {
        return when (command) {
            MathActions.ADD -> "+"
            MathActions.SUB -> "-"
            MathActions.MUL -> "*"
            MathActions.DIV -> "/"
        }
    }

    fun calculateAction(a: Double, b: Double, command: MathActions): Double {
        return when (command) {
            MathActions.ADD -> a + b
            MathActions.SUB -> a - b
            MathActions.MUL -> a * b
            MathActions.DIV -> a / b
        }
    }

    override fun onConfigure() {
        super.onConfigure()
        height = 400.px
        add = true // do not show the add action in the title
        search = true // show the search action in the title
        export = false // show the export action in the title
        titleText = localized<EgyenletEntityBo>()

        + EgyenletEntityBo::id
        + EgyenletEntityBo::a
        + EgyenletEntityBo::b
        + EgyenletEntityBo::method

        + actions {
            + action("Kiszámol") { index, row ->
                toastInfo { "${row.a} ${commandToChar(row.method)} ${row.b} = ${calculateAction(row.a, row.b, row.method)}" }
            }
        }

        + custom {
            label = "kiszámított érték"
            render = { + calculateAction(it.a, it.b, it.method).toString() }
        } size "max-content"
    }
}