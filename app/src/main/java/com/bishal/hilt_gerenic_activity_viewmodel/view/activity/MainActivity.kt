package com.bishal.hilt_gerenic_activity_viewmodel.view.activity

import android.os.Bundle
import androidx.activity.viewModels
import com.bishal.hilt_gerenic_activity_viewmodel.BR
import com.bishal.hilt_gerenic_activity_viewmodel.R
import com.bishal.hilt_gerenic_activity_viewmodel.databinding.ActivityMainBinding
import com.bishal.hilt_gerenic_activity_viewmodel.view.activity.base.BaseActivity
import com.bishal.hilt_gerenic_activity_viewmodel.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutRes = R.layout.activity_main
    override val bindingVariable = BR.viewModel
    override val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding.tvName.text = "Hello Generic"
    }
}