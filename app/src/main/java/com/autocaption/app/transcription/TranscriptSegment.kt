package com.autocaption.app.transcription

/**
 * Represents a single word or phrase segment from transcription.
 * Contains the text and its timing information.
 *
 * @param text The transcribed word or phrase
 * @param startTime Start time in milliseconds
 * @param endTime End time in milliseconds
 */
data class TranscriptSegment(
    val text: String,
    val startTime: Long,
    val endTime: Long
)
