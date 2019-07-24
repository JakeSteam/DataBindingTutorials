package uk.co.jakelee.databindingexperiments.vogella

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import uk.co.jakelee.databindingexperiments.R

@BindingAdapter("android:src")
fun setImageUrl(view: ImageView, url: String) {
    Glide.with(view.context).load(url).placeholder(R.drawable.ic_list).into(view)
}