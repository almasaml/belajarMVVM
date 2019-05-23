package com.almas.belajarmvvm.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.almas.belajarmvvm.R
import java.net.URL

class BindingConverters {
    companion object{

        @JvmStatic
        @BindingAdapter("Load Image")
        fun loadImage(imageView: ImageView, url: String) {
            Glide.with(imageView.context)
                .load(url)
                .apply(RequestOption()
                    .placeholder(R.drawable.sample_image)
                    .error(R.drawable.sample_image)
                    .format(DecodeFormat.PREFER_ARGB_8888))
                .into(imageView)
        }
    }
}

