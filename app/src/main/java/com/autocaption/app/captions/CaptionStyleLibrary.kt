package com.autocaption.app.captions

import android.graphics.Color

/**
 * Library of 15 predefined caption styles.
 */
object CaptionStyleLibrary {

    private val styles = mutableListOf<CaptionStyle>()

    init {
        // 1. Bold Break
        styles.add(
            CaptionStyle(
                id = "bold_break",
                name = "Bold Break",
                fontName = "Anton",
                fontSize = 28f,
                primaryColor = Color.WHITE,
                glowColor = Color.CYAN,
                glowRadius = 8f,
                effectType = "glow"
            )
        )

        // 2. Reach Hook
        styles.add(
            CaptionStyle(
                id = "reach_hook",
                name = "Reach Hook",
                fontName = "Bebas Neue",
                fontSize = 26f,
                primaryColor = Color.WHITE,
                secondaryColor = Color.CYAN,
                effectType = "underline"
            )
        )

        // 3. Wrong Way
        styles.add(
            CaptionStyle(
                id = "wrong_way",
                name = "Wrong Way",
                fontName = "Montserrat Black",
                fontSize = 24f,
                primaryColor = Color.WHITE,
                secondaryColor = Color.parseColor("#FF6B6B"),
                strokeColor = Color.BLACK,
                strokeWidth = 3f,
                effectType = "shadow"
            )
        )

        // 4. Hormozi Sticker
        styles.add(
            CaptionStyle(
                id = "hormozi_sticker",
                name = "Hormozi Sticker",
                fontName = "Poppins ExtraBold",
                fontSize = 26f,
                primaryColor = Color.parseColor("#00FF00"),
                strokeColor = Color.BLACK,
                strokeWidth = 2f,
                effectType = "box_background"
            )
        )

        // 5. Hook Yellow Fade
        styles.add(
            CaptionStyle(
                id = "hook_yellow_fade",
                name = "Hook Yellow Fade",
                fontName = "Bebas Neue",
                fontSize = 28f,
                primaryColor = Color.YELLOW,
                secondaryColor = Color.WHITE,
                strokeColor = Color.BLACK,
                strokeWidth = 2f,
                effectType = "gradient"
            )
        )

        // 6. Athletic Split
        styles.add(
            CaptionStyle(
                id = "athletic_split",
                name = "Athletic Split",
                fontName = "Fjalla One",
                fontSize = 22f,
                primaryColor = Color.WHITE,
                secondaryColor = Color.parseColor("#CC6600"),
                effectType = "split"
            )
        )

        // 7. Hinglish Pop
        styles.add(
            CaptionStyle(
                id = "hinglish_pop",
                name = "Hinglish Pop",
                fontName = "Poppins ExtraBold",
                fontSize = 24f,
                primaryColor = Color.WHITE,
                secondaryColor = Color.RED,
                strokeColor = Color.BLACK,
                strokeWidth = 1f,
                effectType = "badge"
            )
        )

        // 8. Neon Magenta Editorial
        styles.add(
            CaptionStyle(
                id = "neon_magenta_editorial",
                name = "Neon Magenta Editorial",
                fontName = "Playfair Display",
                fontSize = 26f,
                primaryColor = Color.CYAN,
                glowColor = Color.parseColor("#FF1493"),
                glowRadius = 10f,
                effectType = "glow"
            )
        )

        // 9. Hashtag Glow
        styles.add(
            CaptionStyle(
                id = "hashtag_glow",
                name = "Hashtag Glow",
                fontName = "Bebas Neue",
                fontSize = 24f,
                primaryColor = Color.CYAN,
                glowColor = Color.CYAN,
                glowRadius = 6f,
                effectType = "glow"
            )
        )

        // 10. Y2K Collage
        styles.add(
            CaptionStyle(
                id = "y2k_collage",
                name = "Y2K Collage",
                fontName = "Pacifico",
                fontSize = 20f,
                primaryColor = Color.parseColor("#8B6F47"),
                effectType = "sticker"
            )
        )

        // 11. Karaoke Fill
        styles.add(
            CaptionStyle(
                id = "karaoke_fill",
                name = "Karaoke Fill",
                fontName = "Montserrat Black",
                fontSize = 24f,
                primaryColor = Color.WHITE,
                secondaryColor = Color.parseColor("#00FFFF"),
                effectType = "karaoke"
            )
        )

        // 12. Clean Minimal
        styles.add(
            CaptionStyle(
                id = "clean_minimal",
                name = "Clean Minimal",
                fontName = "Roboto",
                fontSize = 20f,
                primaryColor = Color.WHITE,
                effectType = "soft_shadow"
            )
        )

        // 13. Outline Pop
        styles.add(
            CaptionStyle(
                id = "outline_pop",
                name = "Outline Pop",
                fontName = "Montserrat Black",
                fontSize = 24f,
                primaryColor = Color.parseColor("#FFFF00"),
                strokeColor = Color.BLACK,
                strokeWidth = 4f,
                effectType = "outline"
            )
        )

        // 14. Box Highlight
        styles.add(
            CaptionStyle(
                id = "box_highlight",
                name = "Box Highlight",
                fontName = "Inter",
                fontSize = 22f,
                primaryColor = Color.BLACK,
                secondaryColor = Color.YELLOW,
                effectType = "box"
            )
        )

        // 15. Bounce Scale
        styles.add(
            CaptionStyle(
                id = "bounce_scale",
                name = "Bounce Scale",
                fontName = "Nunito",
                fontSize = 22f,
                primaryColor = Color.parseColor("#FF6B9D"),
                effectType = "bounce"
            )
        )
    }

    fun getAllStyles(): List<CaptionStyle> = styles

    fun getStyleById(id: String): CaptionStyle? = styles.find { it.id == id }

    fun getDefaultStyle(): CaptionStyle = styles[0]
}
