package ar.mikellbobadilla;

import ar.mikellbobadilla.classes.Person;
import ar.mikellbobadilla.classes.PersonDTO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PersonDTO dto = new PersonDTO(1, "Sting", "Bobadilla", 20);

        Mapper<PersonDTO, Person> mapper = new Mapper<>();
        mapper.map(dto);
    }
}