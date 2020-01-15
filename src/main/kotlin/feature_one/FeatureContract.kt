package feature_one

interface FeatureContract {
    interface Presenter {
        fun getText(): String
    }

    interface View {
        fun showText()
    }
}