package com.kartik.sitemenu

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

private data class SiteLink(val title: String, val url: String)

class SiteMenuDialog : BottomSheetDialogFragment() {
    private val sites = listOf(
        SiteLink("WeStreamF1", "https://westreamf1.st/westreamf1.php"),
        SiteLink("MyBuffStreams", "https://mybuffstreams.plus/home7"),
        SiteLink("BuffSports", "https://buffsports.io/"),
        SiteLink("RacingLap", "https://racinglap.net/"),
        SiteLink("ReRace", "https://www.rerace.net/"),
        SiteLink("FLive", "https://flive.dpdns.org/"),
        SiteLink("Bingr", "https://bingr.one/home"),
        SiteLink("Vidbox", "https://vidbox.wtf/home")
    )

    override fun onCreateDialog(savedInstanceState: Bundle?) =
        AlertDialog.Builder(requireContext())
            .setTitle("Open a website")
            .setItems(sites.map { it.title }.toTypedArray()) { _, index ->
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(sites[index].url))
                startActivity(intent)
            }
            .setNegativeButton("Close", null)
            .create()
}
