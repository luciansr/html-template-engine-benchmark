package com.html.engine.benchmark.services;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class HtmlCompiler {
    private Handlebars handlebars = new Handlebars();
    private Template template;

    public HtmlCompiler() {
        try {
            template = handlebars.compileInline("Hello {{this}}!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String generate() {
        try {
            return template.apply("Handlebars.java");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "error";
    }
}
