/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.backend.persistence

import remenyo.szamologep.MathActions
import zakadabar.core.persistence.exposed.ExposedPaTable
import remenyo.szamologep.data.EgyenletEntityBo

object EgyenletEntityTable : ExposedPaTable<EgyenletEntityBo>(
    tableName = "egyenlet_entity"
) {

    internal val a = double("a")
    internal val b = double("b")
    internal val method = enumerationByName("method", 4, MathActions::class) // TODO check size of mathActions in the exposed table

}