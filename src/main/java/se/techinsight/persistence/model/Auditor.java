package se.techinsight.persistence.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Auditor implements AuditorAware<String> {

    /*
     * https://youtu.be/2E8_0Qxi6Tg?t=2946
     *
     * 3.1.3 AuditorAware
     * https://docs.spring.io/spring-data/jpa/docs/1.7.0.DATAJPA-580-SNAPSHOT/reference/html/auditing.html
     *
     * https://springbootdev.com/2018/03/13/spring-data-jpa-auditing-with-createdby-createddate-lastmodifiedby-and-lastmodifieddate/
     *
     */

    private final String user;

    public Auditor(@Value("${user.name}") String user) {
        this.user = user;
    }

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(this.user);
    }
}
