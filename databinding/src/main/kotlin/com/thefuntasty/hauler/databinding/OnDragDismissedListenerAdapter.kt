package com.thefuntasty.hauler.databinding

import androidx.databinding.BindingAdapter
import com.thefuntasty.hauler.HaulerView

@BindingAdapter("app:onDragDismissedListener")
fun HaulerView.setOnDragDismissedListener(listener: OnDragDismissedListener) {
    this.setOnDragDismissedListener { listener.onDragDismissed(it) }
}
