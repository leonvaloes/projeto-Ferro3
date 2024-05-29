package br.unoeste.jinwoo.ativooperante2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@SpringBootApplication
public class AtivoOperante2024Application {

    public static void main(String[] args) {
        SpringApplication.run(AtivoOperante2024Application.class, args);
    }

}
