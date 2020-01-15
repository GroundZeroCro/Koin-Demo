package koin.injection

import feature_two.service.HelloService
import feature_two.service.WorldService
import org.koin.core.KoinComponent
import org.koin.core.inject
import org.koin.core.parameter.parametersOf

class HelloInjection : KoinComponent {

    val helloService by inject<HelloService>()
    val worldService by inject<WorldService>{parametersOf("Mars")}

    fun sayHello() = println(helloService.hello())
    fun sayWorld() = println(worldService.world())
}