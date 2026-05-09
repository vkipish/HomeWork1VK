package com.example.dz1

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.text.Text

class MyFirstWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            MyWidgetContent()
        }
    }
}

@androidx.compose.runtime.Composable
fun MyWidgetContent() {
    Column(
        modifier = GlanceModifier.fillMaxSize()
    ) {с
        Text(text = "Привет, Glance!")
    }
}