package koin.module

import feature.FeatureContract
import feature.FeaturePresenter
import feature.FeatureView
import org.koin.dsl.module

val featureModule = module {
    single { FeaturePresenter() as FeatureContract.Presenter }
    single { FeatureView(get()) as FeatureContract.View }
}