package uk.co.jakelee.databindingexperiments.vogella

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("android:src")
fun setImageUrl(view: ImageView, url: String) {
    Glide.with(view.context).load(url).into(view)
}