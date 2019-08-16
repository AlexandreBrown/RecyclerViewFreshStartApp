package com.example.freshstart.views


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.freshstart.R
import com.example.freshstart.databinding.FragmentMainBinding
import com.example.freshstart.viewmodels.MainFragmentViewModel
import javax.inject.Inject

class MainFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val mainFragmentViewModel = ViewModelProviders.of(this, viewModelFactory)[MainFragmentViewModel::class.java]

        return DataBindingUtil.inflate<FragmentMainBinding>(inflater, R.layout.fragment_main, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            fragmentViewModel = mainFragmentViewModel
        }.root
    }
}
