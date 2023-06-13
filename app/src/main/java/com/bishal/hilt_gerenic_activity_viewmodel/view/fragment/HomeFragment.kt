package com.bishal.hilt_gerenic_activity_viewmodel.view.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.bishal.hilt_gerenic_activity_viewmodel.BR
import com.bishal.hilt_gerenic_activity_viewmodel.R
import com.bishal.hilt_gerenic_activity_viewmodel.databinding.FragmentHomeBinding
import com.bishal.hilt_gerenic_activity_viewmodel.view.fragment.base.BaseFragment
import com.bishal.hilt_gerenic_activity_viewmodel.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override val layoutRes: Int = R.layout.fragment_home
    override val bindingVariable = BR.viewModel
    override val viewModel: MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }



}