package com.example.freshstart.di

import com.example.freshstart.di.viewmodels.ViewModelModule
import dagger.Module

@Module(
        includes = [
            ViewModelModule::class
        ]
)
internal class AppModule