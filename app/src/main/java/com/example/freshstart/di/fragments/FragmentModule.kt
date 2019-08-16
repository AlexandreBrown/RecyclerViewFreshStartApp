package com.example.freshstart.di.fragments

import com.example.freshstart.views.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    internal abstract fun contributePhotoPinListFragment(): MainFragment
}