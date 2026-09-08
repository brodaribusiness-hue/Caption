package com.autocaption.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import com.autocaption.app.transcription.TranscriptSegment
import com.autocaption.app.video.VideoPreviewPlayer

/**
 * Main activity for the AutoCaption application.
 * Handles video upload, playback, caption generation, and export.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var playerView: PlayerView
    private var player: ExoPlayer? = null
    private lateinit var videoPreviewPlayer: VideoPreviewPlayer
    private lateinit var statusText: TextView
    private var currentVideoUri: Uri? = null
    private var transcriptSegments: List<TranscriptSegment> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI
        playerView = findViewById(R.id.videoPlayer)
        statusText = findViewById(R.id.statusText)

        // Initialize ExoPlayer
        player = ExoPlayer.Builder(this).build()
        playerView.player = player

        // Initialize video preview helper
        videoPreviewPlayer = VideoPreviewPlayer(this, player!!, playerView)

        // Setup button listeners
        setupButtonListeners()
    }

    private fun setupButtonListeners() {
        findViewById<Button>(R.id.buttonUploadVideo).setOnClickListener {
            pickVideo()
        }

        findViewById<Button>(R.id.buttonPlayPause).setOnClickListener {
            videoPreviewPlayer.togglePlayPause()
        }

        findViewById<Button>(R.id.buttonGenerateCaptions).setOnClickListener {
            generateCaptions()
        }

        findViewById<Button>(R.id.buttonExport).setOnClickListener {
            exportVideo()
        }
    }

    private fun pickVideo() {
        val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
            type = "video/*"
            addCategory(Intent.CATEGORY_OPENABLE)
        }
        startActivityForResult(intent, REQUEST_VIDEO_PICK)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_VIDEO_PICK && resultCode == RESULT_OK) {
            data?.data?.let { uri ->
                currentVideoUri = uri
                videoPreviewPlayer.loadVideo(uri)
                statusText.text = "Video loaded"
            }
        }
    }

    private fun generateCaptions() {
        if (currentVideoUri == null) {
            statusText.text = "Please upload a video first"
            return
        }
        statusText.text = "Generating captions..."
        // Phase 1: placeholder - will be replaced with actual whisper.cpp integration
        statusText.text = "Caption generation ready (Phase 1 placeholder)"
    }

    private fun exportVideo() {
        if (currentVideoUri == null) {
            statusText.text = "Please upload a video first"
            return
        }
        if (transcriptSegments.isEmpty()) {
            statusText.text = "Please generate captions first"
            return
        }
        statusText.text = "Exporting video..."
        // Phase 3: placeholder - will be replaced with actual export logic
        statusText.text = "Export ready (Phase 3 placeholder)"
    }

    override fun onDestroy() {
        player?.release()
        super.onDestroy()
    }

    companion object {
        private const val REQUEST_VIDEO_PICK = 1001
    }
}
