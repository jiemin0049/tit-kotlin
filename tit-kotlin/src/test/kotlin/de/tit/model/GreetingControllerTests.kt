package de.tit.model

import de.tit.controller.GreetingController
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
        , classes = arrayOf(GreetingController::class)
)
class GreetingControllerTests {

}