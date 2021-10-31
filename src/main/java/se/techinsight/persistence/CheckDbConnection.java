package se.techinsight.persistence;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Slf4j
@Component
public class CheckDbConnection implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void run(String... strings) {
        log.info("EXECUTING  run: CheckDbConnection..");
        Query date = entityManager.createNativeQuery("select now() from dual");
        Query version = entityManager.createNativeQuery("SELECT VERSION()");
        log.info("DB date: '{}'", date.getResultList().get(0));
        log.info("MySQL ver: '{}'", version.getResultList().get(0));
    }
}
