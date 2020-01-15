package feature_one

class FeatureView(private val presenter: FeatureContract.Presenter) : FeatureContract.View {
    override fun showText() {
        println(presenter.getText())
    }
}