package at;

import at.annotation.Relation;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Relation(type = "Dokument", sourceClass = AnnotationTest2.class)
@Entity
@Data
public class AnnotationTest2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}