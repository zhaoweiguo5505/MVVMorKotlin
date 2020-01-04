package com.example.mvvmkotlin.ui

import com.example.mvvmkotlin.R
import com.example.mvvmkotlin.viewModel.LoginViewModel
import com.example.mylibrary.BaseActivity

class LoginActivity : BaseActivity<LoginViewModel>() {
    override fun initVM() = LoginViewModel()

    override fun initVIew() {
    }

    override fun getLayoutID(): Int = R.layout.activity_login
    override fun initData() {
        mBinding.lifecycleOwner = this
    }
}
