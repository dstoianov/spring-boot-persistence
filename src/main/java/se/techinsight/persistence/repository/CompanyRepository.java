
package se.techinsight.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.techinsight.persistence.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
