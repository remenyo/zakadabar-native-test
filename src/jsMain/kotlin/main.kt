/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
@file:Suppress("unused") // main is called by webpack

import zakadabar.core.browser.application.ZkApplication
import zakadabar.core.browser.application.application
import zakadabar.core.browser.util.io
import zakadabar.core.resource.initTheme
import remenyo.szamologep.frontend.browser.Routing
import remenyo.szamologep.frontend.browser.resources.AppDarkTheme
import remenyo.szamologep.frontend.browser.resources.AppLightTheme
import remenyo.szamologep.resources.strings

fun main() {

    application = ZkApplication()

    zakadabar.lib.accounts.browser.install(application)
    zakadabar.lib.i18n.browser.install(application)

    io {

        with(application) {

            initSession()

            initTheme(AppLightTheme(), AppDarkTheme())

            initLocale(strings)

            initRouting(Routing())

            run()

        }

    }

}