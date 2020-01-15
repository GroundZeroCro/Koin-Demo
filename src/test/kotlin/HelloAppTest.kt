import feature_two.data.HelloMessageData
import feature_two.service.HelloService
import feature_two.service.WorldService
import koin.injection.HelloInjection
import koin.module.helloModule
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.parameter.parametersOf
import org.koin.test.KoinTest
import org.koin.test.inject

class HelloAppTest : KoinTest {

    private val model by inject<HelloMessageData>()
    private val noParamService by inject<HelloService>()
    private val paramService by inject<WorldService> { parametersOf(SERVICE_PARAM) }

    private lateinit var helloInjection: HelloInjection

    @Before
    fun before() {
        startKoin {
            modules(helloModule)
        }
        helloInjection = HelloInjection()
    }

    @After
    fun after() {
        stopKoin()
    }

    @Test
    fun test_no_parameter_injection() {
        helloInjection.sayHello()

        assertEquals(noParamService, helloInjection.helloService)
        assertEquals("Hey, ${model.message}", noParamService.hello())
    }

    @Test
    fun test_with_parameter_injection() {
        helloInjection.sayWorld()

        assertEquals(paramService, helloInjection.worldService)
        assertEquals("World $SERVICE_PARAM", paramService.world())
    }

    companion object {
        const val SERVICE_PARAM = "Mars"
    }
}