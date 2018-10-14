package de.tit

import de.tit.configuration.properties.TitProperties
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(TitProperties::class)
class TitApplication

fun main(args: Array<String>) {
    val logger = LoggerFactory.getLogger(TitApplication::class.java)
    try {
        runApplication<TitApplication>(*args)
    } catch (ex: Exception) {
        logger.error("Failed to start application ", ex)
    }
}