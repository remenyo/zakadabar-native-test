/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.frontend.browser.pages

import remenyo.szamologep.MathActions
import zakadabar.core.browser.application.target
import zakadabar.core.browser.crud.ZkCrudTarget
import zakadabar.core.browser.form.ZkForm
import zakadabar.core.browser.table.ZkTable
import zakadabar.core.resource.localized
import remenyo.szamologep.data.EgyenletEntityBo
import zakadabar.core.browser.toast.toastInfo


/**
 * CRUD target for [EgyenletEntityBo].
 *
 * Generated with Bender at 2021-06-01T09:28:42.141Z.
 */
class EgyenletEntityCrud : ZkCrudTarget<EgyenletEntityBo>() {
    init {
        companion = EgyenletEntityBo.Companion
        boClass = EgyenletEntityBo::class
        editorClass = EgyenletEntityForm::class
        tableClass = EgyenletEntityTable::class
    }
}

/**
 * Form for [EgyenletEntityBo].
 *
 * Generated with Bender at 2021-06-01T09:28:42.141Z.
 */
class EgyenletEntityForm : ZkForm<EgyenletEntityBo>() {
    override fun onCreate() {
        super.onCreate()

        build(localized<EgyenletEntityForm>()) {
            + section {
                + bo::id
                + bo::a
                + bo::b
                + bo::method
            }
        }
    }
}

/**
 * Table for [EgyenletEntityBo].
 *
 * Generated with Bender at 2021-06-01T09:28:42.141Z.
 */
class EgyenletEntityTable : ZkTable<EgyenletEntityBo>() {

    fun commandToChar(command: MathActions):String{
        return when (command){
            MathActions.ADD -> "+"
            MathActions.SUB -> "-"
            MathActions.MUL -> "*"
            MathActions.DIV -> "/"
        }
    }

    fun calculateAction(a:Double, b:Double, command: MathActions):Double{
        return when (command){
            MathActions.ADD -> a+b
            MathActions.SUB -> a-b
            MathActions.MUL -> a*b
            MathActions.DIV -> a/b
        }
    }

    override fun onConfigure() {

        crud = target<EgyenletEntityCrud>()

        titleText = localized<EgyenletEntityTable>()

        add = true
        search = true
        export = true

        + EgyenletEntityBo::id
        + EgyenletEntityBo::a
        + EgyenletEntityBo::b
        + EgyenletEntityBo::method

        + actions{
            + action("Kiszámol"){
                index, row -> toastInfo { "${row.a} ${commandToChar(row.method)} ${row.b} = ${calculateAction(row.a,row.b,row.method)}" }
            }
        }

        + custom{
            label = "kiszámított érték"
            render = { + calculateAction(it.a,it.b,it.method).toString() }
        } size "max-content"
    }
}