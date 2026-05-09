package com.example.dz1

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.fillMaxSize
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class ImageWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            Image(
                provider = ImageProvider(R.mipmap.vidjet),
                contentDescription = "Виджет-картинка",
                modifier = GlanceModifier.fillMaxSize()
            )
        }
    }
}

class ImageWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = ImageWidget()
}