package koin.module

import data.HelloMessageData
import org.koin.dsl.module
import service.HelloService
import service.HelloServiceImpl

val helloModule = module {
    single { HelloMessageData() }
    single { HelloServiceImpl(get()) as HelloService }
}