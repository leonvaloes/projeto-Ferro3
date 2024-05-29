package br.unoeste.jinwoo.ativooperante2024.restcontrollers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping(value = "apis/cidadadao/")
public class CidadaoRestContoller {
    @GetMapping(value = "teste-conexao")
    public String testeConexao()
    {
        return "conectado";
    }
    //demais apis
}
