package ar.mikellbobadilla.classes;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
public class Person {
    private Integer id;
    private String name;
    private String lastName;
    private int age;
}
