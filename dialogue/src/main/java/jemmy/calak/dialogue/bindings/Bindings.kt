package jemmy.calak.dialogue.bindings

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:iconDialog")
fun setIconDialog(view: ImageView, uri: Int?) {
    view.apply {
        if (uri != null) {
            setImageResource(uri)
        }
    }
}