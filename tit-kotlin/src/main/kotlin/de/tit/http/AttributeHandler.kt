package de.tit.http

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

@Component
class AttributeHandler() {

    val logger: Logger = LoggerFactory.getLogger(AttributeHandler::class.java)


    fun greeting2(request: ServerRequest): Mono<ServerResponse> {
        return ok().body(fromObject(arrayOf(1, 2, 3)))
    }

}