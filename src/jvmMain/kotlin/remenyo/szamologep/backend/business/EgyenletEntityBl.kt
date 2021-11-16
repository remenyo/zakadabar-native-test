/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.backend.business

import zakadabar.core.authorize.BusinessLogicAuthorizer
import zakadabar.core.business.EntityBusinessLogicBase
import remenyo.szamologep.backend.persistence.EgyenletEntityPa
import remenyo.szamologep.data.EgyenletEntityBo

/**
 * Business Logic for ExampleEntityBo.
 *
 * Generated with Bender at 2021-06-01T09:28:42.142Z.
 */
open class EgyenletEntityBl : EntityBusinessLogicBase<EgyenletEntityBo>(
    boClass = EgyenletEntityBo::class
) {

    override val pa = EgyenletEntityPa()

    override val authorizer: BusinessLogicAuthorizer<EgyenletEntityBo> by provider()

}