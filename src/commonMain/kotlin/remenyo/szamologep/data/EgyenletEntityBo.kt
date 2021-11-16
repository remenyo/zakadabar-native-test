/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.data

import kotlinx.serialization.Serializable
import remenyo.szamologep.MathActions
import zakadabar.core.data.EntityBo
import zakadabar.core.data.EntityBoCompanion
import zakadabar.core.data.EntityId
import zakadabar.core.schema.BoSchema


/**
 * Business Object of ExampleEntityBo.
 *
 * Generated with Bender at 2021-06-01T09:28:42.140Z.
 *
 * Please do not implement business logic in this class. If you add fields,
 * please check the frontend table and form, and also the persistence API on
 * the backend.
 */
@Serializable
class EgyenletEntityBo(

    override var id: EntityId<EgyenletEntityBo>,
    var a: Double,
    var b: Double,
    var method : MathActions

) : EntityBo<EgyenletEntityBo> {

    companion object : EntityBoCompanion<EgyenletEntityBo>("example-entity")

    override fun getBoNamespace() = boNamespace
    override fun comm() = comm

    override fun schema() = BoSchema {
        + ::id
        + ::a
        + ::b
        + ::method
    }



}