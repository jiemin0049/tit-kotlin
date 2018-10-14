package de.tit.configuration.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties("service")
class TitProperties {
    var stage: String? = null
    var username: String? = null
    var password: String? = null
}