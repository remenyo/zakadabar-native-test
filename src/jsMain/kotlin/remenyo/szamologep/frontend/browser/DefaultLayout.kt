/*
 * Copyright © 2020, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.frontend.browser

import zakadabar.core.browser.layout.ZkDefaultLayout
import zakadabar.core.browser.titlebar.ZkAppHandle
import zakadabar.core.browser.titlebar.ZkAppTitleBar
import remenyo.szamologep.frontend.browser.components.HeaderActions
import remenyo.szamologep.frontend.browser.pages.Home
import remenyo.szamologep.resources.strings

object DefaultLayout : ZkDefaultLayout() {

    override fun onCreate() {
        super.onCreate()

        appHandle = ZkAppHandle(zke { + strings.applicationName }, onIconClick = ::onToggleSideBar, target = Home)
        sideBar = SideBar()
        titleBar = ZkAppTitleBar(::onToggleSideBar)

        titleBar.globalElements += HeaderActions()

    }

}