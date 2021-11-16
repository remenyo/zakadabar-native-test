/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.backend.persistence

import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.statements.UpdateBuilder
import zakadabar.core.persistence.exposed.ExposedPaBase
import zakadabar.core.persistence.exposed.entityId
import remenyo.szamologep.data.EgyenletEntityBo

open class EgyenletEntityPa : ExposedPaBase<EgyenletEntityBo, EgyenletEntityTable>(
    table = EgyenletEntityTable
) {
    override fun ResultRow.toBo() = EgyenletEntityBo(
        id = this[table.id].entityId(),
        a = this[EgyenletEntityTable.a],
        b = this[EgyenletEntityTable.b],
        method = this[EgyenletEntityTable.method]
    )

    override fun UpdateBuilder<*>.fromBo(bo: EgyenletEntityBo) {
        this[EgyenletEntityTable.a] = bo.a
        this[EgyenletEntityTable.b] = bo.b
        this[EgyenletEntityTable.method] = bo.method
    }
}