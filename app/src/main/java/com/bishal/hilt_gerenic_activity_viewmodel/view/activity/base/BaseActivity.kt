package com.bishal.hilt_gerenic_activity_viewmodel.view.activity.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import com.bishal.hilt_gerenic_activity_viewmodel.persistence.sharedpref.SharedPrefs
import javax.inject.Inject


abstract class BaseActivity<VDB : ViewDataBinding> : AppCompatActivity() {



    @Inject
    lateinit var  sharedPrefs: SharedPrefs



    protected lateinit var dataBinding:VDB



    @get:LayoutRes
    abstract val layoutRes: Int

    abstract val bindingVariable: Int

    abstract val viewModel: ViewModel







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, layoutRes)
        dataBinding.lifecycleOwner = this
        dataBinding.setVariable(bindingVariable, viewModel)
        dataBinding.executePendingBindings()

    }

}