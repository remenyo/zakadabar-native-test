/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
@file:Suppress("unused") // auto binding makes this inspection useless

package remenyo.szamologep.resources

import zakadabar.core.resource.ZkBuiltinStrings

// This pattern makes it possible to switch the strings easily. Demo can work as
// a standalone application, but it is possible to use it as a component library.
// In that case - or when you write an actual component library - you want to your
// strings to be customizable.

internal var strings = AppStrings()

class AppStrings : ZkBuiltinStrings() {
    override val applicationName by "Számológép"
    val EgyenletEntityCrud by "Egyenletek"

    // these will most likely change a bit with the first release of July 2021

    val accountName by "Account Name"
    val email by "E-mail"
    val phone by "Phone"
    val locked by "Locked"
    val lastLoginSuccess by "Last Login Success"
    val lastLoginFail by "Last Login Fail"
    val description by "Description"
    override val loginFailCount by "Login Fail Count"
}