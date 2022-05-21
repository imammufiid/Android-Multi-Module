package id.mufiid.koinnavigationmodule

import android.app.Application
import id.mufiid.detail.di.DetailModuleContainer
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        val detailModule = DetailModuleContainer()

        startKoin {
            androidContext(this@MainApplication)
            modules(
                detailModule.modules()
            )
        }
    }

}