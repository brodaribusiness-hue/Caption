package com.autocaption.app.video

import android.content.Context
import android.net.Uri
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.common.MediaItem
import androidx.media3.ui.PlayerView

/**
 * Manages video preview playback with only play/pause controls.
 */
class VideoPreviewPlayer(
    private val context: Context,
    private val player: ExoPlayer,
    private val playerView: PlayerView
) {

    fun loadVideo(uri: Uri) {
        val mediaItem = MediaItem.fromUri(uri)
        player.setMediaItem(mediaItem)
        player.prepare()
    }

    fun togglePlayPause() {
        if (player.isPlaying) {
            player.pause()
        } else {
            player.play()
        }
    }

    fun play() {
        player.play()
    }

    fun pause() {
        player.pause()
    }

    fun isPlaying(): Boolean = player.isPlaying
}
