package us.planet10.eightballui

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.client.RestTemplate
import java.util.*

@Configuration
class EightballUiConfig {
    @Bean
    fun restTemplate(builder: RestTemplateBuilder): RestTemplate {
        val restTemplate = builder.build()
        return restTemplate
    }

    @Bean
    fun httpEntity(): HttpEntity<String> {
        val headers = HttpHeaders()
        headers.accept = Arrays.asList(MediaType.APPLICATION_JSON)
        headers.contentType = MediaType.APPLICATION_JSON
        return HttpEntity<String>(headers)
    }
}

@ConfigurationProperties(prefix = "app")
data class TargetURLs(val urls: Map<String, String>)
