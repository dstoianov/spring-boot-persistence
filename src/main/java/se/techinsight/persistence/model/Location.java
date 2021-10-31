package se.techinsight.persistence.model;


import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "locations")
@EntityListeners(AuditingEntityListener.class)
public class Location extends MappedAuditableBase{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @NotNull
    @NotBlank
    @Column(name = "city_name", unique = true, nullable = false, updatable = false)
    private String cityName;

    @Column(name = "country_name", nullable = false)
    private String countryName;

//    @CreatedDate
//    @Column(name = "created_on", updatable = false)
//    private LocalDateTime createdOn;
//
//    @LastModifiedDate
//    @Column(name = "updated_on")
//    private LocalDateTime updatedOn;


}
