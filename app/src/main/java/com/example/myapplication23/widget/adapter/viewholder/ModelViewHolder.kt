package com.example.myapplication23.widget.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication23.databinding.ViewholderRestaurantBinding
import com.example.myapplication23.model.Model
import com.example.myapplication23.screen.base.BaseViewModel
import com.example.myapplication23.widget.adapter.listener.AdapterListener

abstract class ModelViewHolder<M : Model>(
    binding: ViewholderRestaurantBinding,
    protected val viewModel: BaseViewModel
) : RecyclerView.ViewHolder(binding.root) {

    abstract fun reset()

    open fun bindData(model: M) {
        reset()
    }

    abstract fun bindViews(model: M, listener: AdapterListener)
}