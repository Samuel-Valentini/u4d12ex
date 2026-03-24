package samuelvalentini;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import samuelvalentini.entities.Evento;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d12ex");


    public static void main(String[] args) {
        EntityManager entityManager = emf.createEntityManager();
        System.out.println("Hello World!");
        Evento ev1 = new Evento("Festa grande", LocalDate.of(2026, 3, 25), "la festa dell'anno", TipoEvento.PUBBLICO, 20000);
        Evento ev2 = new Evento("Festa tonica", LocalDate.of(2026, 6, 25), "la festa più tonica dell'estate", TipoEvento.PRIVATO, 3000);

    }


}
