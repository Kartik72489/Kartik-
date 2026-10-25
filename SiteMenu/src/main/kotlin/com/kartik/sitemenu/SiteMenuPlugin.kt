package com.kartik.sitemenu

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class SiteMenuPlugin : Plugin() {
    private var activity: AppCompatActivity? = null

    override fun load(context: Context) {
        activity = context as? AppCompatActivity

        openSettings = {
            activity?.let {
                SiteMenuDialog().show(it.supportFragmentManager, "SiteMenuDialog")
            }
        }
    }
}
