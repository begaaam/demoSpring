package web.learn.com.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import web.learn.com.entites.Avis;
import web.learn.com.repository.Avisrepository;

@AllArgsConstructor
@Service
public class AvisService {
    private Avisrepository avisrepository;
   public void creer(Avis avis){
       this.avisrepository.save(avis);
   }
}
