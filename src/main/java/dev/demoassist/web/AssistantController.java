package dev.demoassist.web;

import dev.demoassist.model.Prompt;
import dev.demoassist.service.AssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/assist")
public class AssistantController {

    @Autowired
    private AssistantService assistantService;

    @GetMapping(value = "/public/ask")
    public ResponseEntity<String> askAssistant(@RequestBody Prompt prompt) {

        String response = assistantService.askAssistant(prompt);

        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/public/save-embeddings")
    public ResponseEntity<String> saveEmbeddings(@RequestBody Prompt prompt) {

        String response = assistantService.saveEmbeddings(prompt);

        return new ResponseEntity<String>(response, HttpStatus.OK);
    }

}
