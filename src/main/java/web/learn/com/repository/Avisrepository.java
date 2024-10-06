package web.learn.com.repository;

import org.springframework.data.repository.CrudRepository;
import web.learn.com.entites.Avis;

public interface Avisrepository extends CrudRepository<Avis,Integer> {
}
