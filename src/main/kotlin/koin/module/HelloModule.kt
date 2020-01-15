package koin.module

import feature_two.data.HelloMessageData
import feature_two.service.HelloService
import feature_two.service.HelloServiceImpl
import feature_two.service.WorldService
import feature_two.service.WorldServiceImpl
import org.koin.dsl.module

val helloModule = module {
    single { HelloMessageData() }
    single { HelloServiceImpl(get()) as HelloService }
    single { (lowLevelAttribute: String) -> WorldServiceImpl(lowLevelAttribute) as WorldService }
}