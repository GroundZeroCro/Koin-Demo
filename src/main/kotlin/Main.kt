import koin.injection.FeatureInjection
import koin.injection.HelloInjection
import koin.module.featureModule
import koin.module.helloModule
import org.koin.core.context.startKoin

fun main() {

    startKoin {
        modules(listOf(helloModule, featureModule))
    }

    HelloInjection().sayHello()
    FeatureInjection().showText

}