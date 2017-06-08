package org.mvnsearch.vokdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class VokDemoApplication {
    companion object {
       @JvmStatic fun main(args: Array<String>) {
          SpringApplication.run(VokDemoApplication::class.java, *args)
       }
    }
}

