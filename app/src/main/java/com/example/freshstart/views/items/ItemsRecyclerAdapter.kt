package com.example.freshstart.views.items

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.freshstart.BR
import com.example.freshstart.R
import com.example.freshstart.viewmodels.MainFragmentViewModel

class ItemsRecyclerAdapter(
        private val context: Context,
        private val viewModel: MainFragmentViewModel
) : RecyclerView.Adapter<ItemsRecyclerAdapter.ItemViewHolder>() {

    private val items: List<ItemPresentation>
        get() = viewModel.items.value ?: emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder =
            ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val view = holder.itemView as? FrameLayout ?: return

        val dataBinding = DataBindingUtil.bind<ViewDataBinding>(view) ?: return

        dataBinding.setVariable(BR.viewModel, viewModel)
        dataBinding.setVariable(BR.item, items[position])
    }


    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}