/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.frontend.browser.pages

import zakadabar.core.browser.application.target
import zakadabar.core.browser.crud.ZkCrudTarget
import zakadabar.core.browser.form.ZkForm
import zakadabar.core.browser.table.ZkTable
import zakadabar.core.resource.localized
import remenyo.szamologep.data.ExampleEntityBo


/**
 * CRUD target for [ExampleEntityBo].
 *
 * Generated with Bender at 2021-06-01T09:28:42.141Z.
 */
class ExampleEntityCrud : ZkCrudTarget<ExampleEntityBo>() {
    init {
        companion = ExampleEntityBo.Companion
        boClass = ExampleEntityBo::class
        editorClass = ExampleEntityForm::class
        tableClass = ExampleEntityTable::class
    }
}

/**
 * Form for [ExampleEntityBo].
 *
 * Generated with Bender at 2021-06-01T09:28:42.141Z.
 */
class ExampleEntityForm : ZkForm<ExampleEntityBo>() {
    override fun onCreate() {
        super.onCreate()

        build(localized<ExampleEntityForm>()) {
            + section {
                + bo::name
            }
        }
    }
}

/**
 * Table for [ExampleEntityBo].
 *
 * Generated with Bender at 2021-06-01T09:28:42.141Z.
 */
class ExampleEntityTable : ZkTable<ExampleEntityBo>() {

    override fun onConfigure() {

        crud = target<ExampleEntityCrud>()

        titleText = localized<ExampleEntityTable>()

        add = true
        search = true
        export = true

        + ExampleEntityBo::name

        + actions()
    }
}