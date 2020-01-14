import data.HelloMessageData
import koin.injection.HelloInjection
import koin.module.helloModule
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import service.HelloService

class HelloAppTest : KoinTest {

    private val model by inject<HelloMessageData>()
    private val service by inject<HelloService>()

    @Before
    fun before() {
        startKoin {
            modules(helloModule)
        }
    }

    @After
    fun after() {
        stopKoin()
    }

    @Test
    fun testHelloKoinInjection() {
        val helloInjection = HelloInjection()
        helloInjection.sayHello()

        assertEquals(service, helloInjection.helloService)
        assertEquals("Hey, ${model.message}", service.hello())
    }
}