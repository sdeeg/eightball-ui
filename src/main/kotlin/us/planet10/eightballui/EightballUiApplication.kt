package us.planet10.eightballui

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(TargetURLs::class)
class EightballUiApplication

fun main(args: Array<String>) {
	runApplication<EightballUiApplication>(*args)
}
