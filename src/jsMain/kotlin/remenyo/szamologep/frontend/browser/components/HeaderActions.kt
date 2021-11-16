/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.frontend.browser.components

import zakadabar.core.browser.ZkElement
import zakadabar.core.browser.theme.ZkThemeRotate
import zakadabar.core.resource.ZkIcons
import remenyo.szamologep.frontend.browser.resources.AppDarkTheme
import remenyo.szamologep.frontend.browser.resources.AppLightTheme

class HeaderActions : ZkElement() {

    override fun onCreate() {
        + ZkThemeRotate(
            ZkIcons.darkMode to AppDarkTheme(),
            ZkIcons.lightMode to AppLightTheme()
        )
    }

}