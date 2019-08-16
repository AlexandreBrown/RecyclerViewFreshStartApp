package com.example.freshstart.bindingadapters

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.freshstart.viewmodels.MainFragmentViewModel
import com.example.freshstart.views.items.ItemsRecyclerAdapter

object BindingConversions {

    @JvmStatic
    @BindingAdapter("setItems")
    fun setItems(recyclerView: RecyclerView, viewModel: MainFragmentViewModel) {
        val adapter = ItemsRecyclerAdapter(recyclerView.context, viewModel)
        recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}