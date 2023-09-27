package com.hieunv.mvvmarch.sample.ui.main.fragment.add_friend

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddFriendViewModel @ViewModelInject constructor() : ViewModel() {

    companion object {
        private const val TAG = "AddFriendViewModel"
    }
    val value = MutableLiveData<Int>()
    private var number = 0
    fun count(){
        value.postValue(++number)
    }
}
