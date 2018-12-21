package com.html.engine.benchmark.controllers;

import com.html.engine.benchmark.services.HtmlCompiler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HtmlController {

    private final HtmlCompiler htmlCompiler;

    public HtmlController(HtmlCompiler htmlCompiler) {
        this.htmlCompiler = htmlCompiler;
    }

    @GetMapping("/api/generate")
    public String generate() {
        return htmlCompiler.generate();
    }
}
