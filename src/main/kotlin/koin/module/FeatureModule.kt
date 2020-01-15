package koin.module

import feature_one.FeatureContract
import feature_one.FeaturePresenter
import feature_one.FeatureView
import org.koin.dsl.module

val featureModule = module {
    single { FeaturePresenter() as FeatureContract.Presenter }
    single { FeatureView(get()) as FeatureContract.View }
}