package de.tit.http

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router


@Configuration
class ApiRoutes(val attributeHandler: AttributeHandler) {

    @Bean
    fun apiRouter() = router {
        accept(APPLICATION_JSON).nest {
            GET("/greeting2", attributeHandler::greeting2)
        }
        //Kubernetes health check
        ("/.well-known").nest {
            GET("/ready", { ServerResponse.noContent().build() })
            GET("/live", { ServerResponse.noContent().build() })
        }
    }
}
