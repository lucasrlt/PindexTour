package com.pindex.main.ui.fragments.blocks

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.Fragment
import com.pindex.main.R
import com.pindex.main.utils.Constants
import com.pindex.main.utils.MediaLoader

/**
 * Custom Fragment for the Borderless Image block.
 */
class BorderlessImageBlockFragment : Fragment(R.layout.fragment_pindex_block_borderless_image) {

    private lateinit var imageView: AppCompatImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageView = view.findViewById(R.id.pindex_block_borderless_image)

        // Load the image from Firebase
        val imagePath = arguments?.getString(Constants.BlockFragmentArguments.BORDERLESS_IMAGE_BLOCK_TITLE)
        imagePath?.let {
            MediaLoader.loadImageFromFirebase(imagePath, imageView)
        }
    }

}
