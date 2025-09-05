package it.korea.jpa.entity.comp;

import org.hibernate.annotations.BatchSize;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employee")
public class EmployeeEntity {

    @Id
    private String emId;
    private String emName;


    //부서 매핑!
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="dept_id", nullable = false)

    private DepartEntity department;
}
