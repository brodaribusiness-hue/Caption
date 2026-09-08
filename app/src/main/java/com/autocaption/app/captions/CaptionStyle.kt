package com.autocaption.app.captions

import android.graphics.Color

/**
 * Defines a caption style with font, colors, and effects.
 */
data class CaptionStyle(
    val id: String,
    val name: String,
    val fontName: String,
    val fontSize: Float,
    val primaryColor: Int,
    val secondaryColor: Int = primaryColor,
    val strokeColor: Int = Color.BLACK,
    val strokeWidth: Float = 2f,
    val glowColor: Int? = null,
    val glowRadius: Float = 0f,
    val effectType: String = "none" // "glow", "outline", "karaoke", "bounce", "box", etc.
)
