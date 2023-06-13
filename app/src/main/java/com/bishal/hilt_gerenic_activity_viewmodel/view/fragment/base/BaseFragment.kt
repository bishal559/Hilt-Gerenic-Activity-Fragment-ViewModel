package com.bishal.hilt_gerenic_activity_viewmodel.view.fragment.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.bishal.hilt_gerenic_activity_viewmodel.persistence.sharedpref.SharedPrefs
import javax.inject.Inject

abstract class BaseFragment< VDB : ViewDataBinding> : Fragment() {



    @Inject
    lateinit var  sharedPrefs: SharedPrefs

    protected lateinit var dataBinding: VDB

    @get:LayoutRes
    protected abstract val layoutRes: Int

    abstract val bindingVariable: Int

    abstract val viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dataBinding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        dataBinding.lifecycleOwner = this
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataBinding.setVariable(bindingVariable, viewModel)
        dataBinding.executePendingBindings()
    }
}