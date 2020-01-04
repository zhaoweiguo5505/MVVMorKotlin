package com.example.mvvmkotlin.viewModel


import androidx.databinding.ObservableField
import com.example.mylibrary.BaseViewModel

class LoginViewModel : BaseViewModel() {
    val userName = ObservableField<String>("")
    val passWord = ObservableField<String>("")

}