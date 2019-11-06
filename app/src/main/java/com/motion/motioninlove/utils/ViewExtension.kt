package com.motion.motioninlove.utils

import android.text.TextUtils
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.motion.motioninlove.R

fun ImageView.loadImage(url : String?=""){
    if (!TextUtils.isEmpty(url) && url?.contains("http") == true) {
        Glide
            .with(this.context)
            .load(url)
            .centerCrop()
            .placeholder(R.drawable.shape_gray)
            .error(R.drawable.shape_gray)
            .into(this)
    }
}
