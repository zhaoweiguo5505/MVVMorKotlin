package com.example.mylibrary

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<VM :BaseViewModel> :AppCompatActivity(){

    lateinit var mBinding: ViewDataBinding
    lateinit var viewModel: VM
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        viewModel = initVM()
        mBinding = DataBindingUtil.setContentView(this,getLayoutID())
        initVIew()
        initData()
    }

    open  fun getLayoutID():Int = 0

    abstract fun initVM():VM

    abstract fun initVIew()

    abstract fun initData()
}