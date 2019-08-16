package com.example.freshstart.di

import android.app.Application
import com.example.freshstart.di.activities.ActivityModule
import com.example.freshstart.di.fragments.FragmentModule
import com.example.freshstart.main.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            AppModule::class,
            ActivityModule::class,
            FragmentModule::class
        ]
)
@Singleton
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}