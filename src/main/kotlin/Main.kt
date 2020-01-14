import koin.injection.HelloInjection
import koin.module.helloModule
import org.koin.core.context.startKoin

fun main() {

    startKoin {
        modules(helloModule)
    }

    HelloInjection().sayHello()
}