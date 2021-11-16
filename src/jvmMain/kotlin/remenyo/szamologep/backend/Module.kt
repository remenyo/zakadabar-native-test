/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package remenyo.szamologep.backend

import zakadabar.core.authorize.AppRolesBase
import zakadabar.core.authorize.SimpleRoleAuthorizerProvider
import zakadabar.core.route.RoutedModule
import zakadabar.core.server.server
import zakadabar.core.util.PublicApi
import remenyo.szamologep.backend.business.ExampleEntityBl

@PublicApi
object Module : RoutedModule {

    override fun onModuleLoad() {
        zakadabar.lib.accounts.install(MyRoles)
        zakadabar.lib.i18n.install()

        server += SimpleRoleAuthorizerProvider {
            all = MyRoles.siteMember
            read = MyRoles.myRole
        }

        server += ExampleEntityBl()
    }

}

object MyRoles : AppRolesBase() {
    val myRole by "my-role"
    val siteMember by "site-member"
}