package id.mufiid.detail.di

import id.mufiid.core.di.ModuleContainer
import id.mufiid.detail.navigator.ActivityContainerImpl
import id.mufiid.navigator.activity.DetailActivityContainer
import org.koin.dsl.module

class DetailModuleContainer: ModuleContainer() {
    private val detailModule = module {
        single<DetailActivityContainer> { ActivityContainerImpl() }
    }
}