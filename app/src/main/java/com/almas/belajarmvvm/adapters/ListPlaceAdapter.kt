package com.almas.belajarmvvm.adapters

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.almas.belajarmvvm.R
import com.almas.belajarmvvm.models.ListPlaceResponseModel
import com.almas.belajarmvvm.viewmodels.ItemPlaceViewModel
import com.almas.belajarmvvm.databinding.ItemPlaceBinding


class ListPlaceAdapter(val context: Context): RecyclerView.Adapter<ListPlaceAdapter.ItemPlaceViewHolder>() {
    private var listPlace: MutableList<ListPlaceResponseModel.PlaceModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemPlaceViewHolder {
        val binding: ItemPlaceBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_place, parent, false)
        return ItemPlaceViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listPlace.size
    }

    override fun onBindViewHolder(holder: ItemPlaceViewHolder, position: Int) {
        holder.bindData(listPlace[holder.adapterPosition])
    }

    fun setData(list: MutableList<ListPlaceResponseModel.PlaceModel>){
        this.listPlace = list
    }

    class ItemPlaceViewHolder(private val binding: ItemPlaceBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(model: ListPlaceResponseModel.PlaceModel){
            val viewModel = ItemPlaceViewModel(model)
            binding.itemPlace = viewModel
        }
    }
}
