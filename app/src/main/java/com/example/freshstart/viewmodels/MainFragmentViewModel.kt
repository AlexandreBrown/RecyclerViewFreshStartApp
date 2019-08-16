package com.example.freshstart.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.freshstart.views.items.ItemPresentation
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(): ViewModel() {

    val items: LiveData<List<ItemPresentation>>
        get() = _items

    private val _items: MutableLiveData<List<ItemPresentation>> = MutableLiveData()

    init {
        _items.postValue(listOf(
                ItemPresentation("abc"),
                ItemPresentation("def"),
                ItemPresentation("ghi"),
                ItemPresentation("jkl"),
                ItemPresentation("mno"),
                ItemPresentation("pqr"),
                ItemPresentation("stu"),
                ItemPresentation("vwx"),
                ItemPresentation("yz")
        ))
    }
}