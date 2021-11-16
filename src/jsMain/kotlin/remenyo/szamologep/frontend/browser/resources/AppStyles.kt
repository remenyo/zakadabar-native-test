/*
 * Copyright © 2020-2021, Simplexion, Hungary and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
package remenyo.szamologep.frontend.browser.resources

import zakadabar.core.resource.css.ZkCssStyleSheet
import zakadabar.core.resource.css.cssStyleSheet
import zakadabar.core.resource.css.px

val appStyles by cssStyleSheet(AppStyles())

class AppStyles : ZkCssStyleSheet() {

    // -------------------------------------------------------------------------
    // CSS styles the application
    // -------------------------------------------------------------------------

    val home by cssClass {
        overflowY = "scroll"
        padding = 20.px
    }

}