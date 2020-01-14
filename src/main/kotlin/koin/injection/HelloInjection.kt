package koin.injection

import org.koin.core.KoinComponent
import org.koin.core.inject
import service.HelloService

class HelloInjection : KoinComponent {

    val helloService by inject<HelloService>()

    fun sayHello() = println(helloService.hello())
}