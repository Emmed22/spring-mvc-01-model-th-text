package com.estudos.springmvc.spring_mvc_01_model_th_text.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 1. Você acessa /mensagem
@Controller
public class MensagemController {
    // 2. Spring cria uma Request
    @GetMapping("/mensagem")
    // 3. Spring cria um Model vazio
    public String mostrarMensagem(Model model) {
        // 4. Controller preenche o Model:
        // - nome = Mari
        model.addAttribute("nome", "Mari");
        // - curso = DSM
        model.addAttribute("curso", "DSM");
        model.addAttribute("linguagem", "Java");
        model.addAttribute("semestre", "Terceiro Semestre");
        model.addAttribute("livroFavorito", "Confissões");
        model.addAttribute("profissao", "Desenvolvedora");
        model.addAttribute("idade", 20);
        model.addAttribute("cidade", "São Paulo");
        // 5. Spring envia isso para o HTML
        // 6. Thymeleaf lê ${nome} e ${curso}
        // 7. Página aparece pronta
        return ("mensagem");

    }

}
