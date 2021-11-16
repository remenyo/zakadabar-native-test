/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.frontend.browser.pages

import zakadabar.core.browser.page.ZkPage
import zakadabar.core.browser.util.plusAssign
import remenyo.szamologep.frontend.browser.resources.appStyles

object Home : ZkPage() {

    override fun onCreate() {
        classList += appStyles.home

        + "This is the home page of your application. Click on \"Login\" (on the left) and use \"so\" - \"so\" to log in."
    }

}