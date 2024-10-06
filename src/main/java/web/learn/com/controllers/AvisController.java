package web.learn.com.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import web.learn.com.service.AvisService;
import web.learn.com.entites.Avis;

@AllArgsConstructor
@RequestMapping("avis")
@RestController
public class AvisController {
    private AvisService avisService;
    @ResponseStatus(HttpStatus.CREATED)
     @PostMapping
    public void creer(@RequestBody Avis avis){
        this.avisService.creer(avis);
    }
}
