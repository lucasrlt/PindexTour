package com.pindex.main.ui.fragments.blocks

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.Fragment
import com.pindex.main.R
import com.pindex.main.utils.Constants
import com.pindex.main.utils.MediaLoader

/**
 * Custom Fragment for the Audio block.
 */
class AudioBlockFragment : Fragment(R.layout.fragment_pindex_block_audio) {

    // Background image
    private lateinit var imageView: AppCompatImageView

    // Button (icon + text)
    private lateinit var buttonView: AppCompatButton

    // Audio player
    private var mediaPlayer: MediaPlayer? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageView = view.findViewById(R.id.pindex_block_audio_image)
        buttonView = view.findViewById(R.id.pindex_block_audio_button)

        // Set the background image
        val imagePath = arguments?.getString(Constants.BlockFragmentArguments.AUDIO_BLOCK_IMAGE_PATH)
        imagePath?.let {
            MediaLoader.loadImageFromFirebase(imagePath, imageView)
        }
        // Set the audio text
        val audioName = arguments?.getString(Constants.BlockFragmentArguments.AUDIO_BLOCK_NAME)
        setAudioText(audioName)

        // Set the button on click event
        buttonView.setOnClickListener {

            // First click: setup the media player

        }
    }

    /**
     * Display the given [text] in the component.
     */
    private fun setAudioText(text: String?) {
        buttonView.text = text
    }

    /**
     * Display the play icon in the component.
     */
    private fun setPlayIcon() {
        val icon = R.drawable.ic_baseline_play_arrow
        buttonView.setCompoundDrawablesWithIntrinsicBounds(icon, 0, 0, 0)
    }

    /**
     * Display the pause icon in the component.
     */
    private fun setPauseIcon() {
        val icon = R.drawable.ic_baseline_pause
        buttonView.setCompoundDrawablesWithIntrinsicBounds(icon, 0, 0, 0)
    }

}
