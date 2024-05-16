package us.planet10.eightballui

import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.exchange

@RestController
class EightballUiAPI(val restTemplate: RestTemplate, val httpEntity: HttpEntity<String>, val targetURLs: TargetURLs) {

    @GetMapping("/fqdn")
    fun getFQDN() = restTemplate.exchange<String>(""+targetURLs.urls.get("fqdn"), HttpMethod.GET, httpEntity, String::class.java)

    @GetMapping("/local")
    fun getLocal() = restTemplate.exchange<String>(""+targetURLs.urls.get("local"), HttpMethod.GET, httpEntity, String::class.java)

    @GetMapping("/scg-fqdn")
    fun getSCGFQDN() = restTemplate.exchange<String>(""+targetURLs.urls.get("scg-fqdn"), HttpMethod.GET, httpEntity, String::class.java)

    @GetMapping("/scg-local")
    fun getSCGLocal() = restTemplate.exchange<String>(""+targetURLs.urls.get("scg-local"), HttpMethod.GET, httpEntity, String::class.java)
}
