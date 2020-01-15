package koin.injection

import feature_one.FeatureContract
import org.koin.core.KoinComponent
import org.koin.core.inject

class FeatureInjection : KoinComponent {

    val featurePresenter by inject<FeatureContract.Presenter>()
    private val featureView by inject<FeatureContract.View>()

    val showText = featureView.showText()
}