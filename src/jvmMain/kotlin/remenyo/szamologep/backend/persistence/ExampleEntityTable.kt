/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.backend.persistence

import zakadabar.core.persistence.exposed.ExposedPaTable
import remenyo.szamologep.data.ExampleEntityBo

object ExampleEntityTable : ExposedPaTable<ExampleEntityBo>(
    tableName = "example_entity"
) {

    internal val name = varchar("name", 100)

}