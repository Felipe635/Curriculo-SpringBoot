package br.ado3.dsw.ado3dsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/exemplo")
public class HomeController {
    @GetMapping("/exemplo-view")
    public ModelAndView exemploViewObj() {
        ModelAndView mv = new ModelAndView("message-view");

        List<String> formacoes = new ArrayList<>();
        formacoes.add("Técnico em Análise e Desenvolvimento de Sistemas - Etec - inicio em jan/2019 - conclusão em dez/2021");
        formacoes.add("Curso de Programação Web - IOS - inicio em jan/2022 - conclusão em jun/2022");
        formacoes.add("Tecnólogo em Análise e Desenvolvimento de Sistemas - Senac - inicio em agos/2022 - conclusão em dez/2024");
        mv.addObject("nome", "Felipe SA");
        mv.addObject("paragrafo", "Analista de Suporte Junior");
        mv.addObject("sobre", "Atuo como analista de suporte no sevice desk da Smart Fit pela GapFill desde maio de 2023. Tenho conhecimento básico em HTML, CSS, JavaScript, Java e PHP.");
        mv.addObject("experiencias", "Analista de Suporte Junior na Smart Fit pela GapFill - inicio em mai/2023.");
        mv.addObject("formacoes", formacoes);

        return mv;
    }

}
