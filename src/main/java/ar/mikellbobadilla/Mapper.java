package ar.mikellbobadilla;

import ar.mikellbobadilla.classes.Person;
import ar.mikellbobadilla.classes.PersonDTO;
import ar.mikellbobadilla.exception.ConstructorException;
import ar.mikellbobadilla.exception.InstanceException;
import lombok.NonNull;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Mapper class that will be used to map objects from one type to another
 * @param <S> Source object to be used as a base for the mapping
 * @param <T> Target object to be used as a base for the mapping
 */
public class Mapper<S, T> {

    private T target;


    private Class<?>[] getTypes(Field[] fields) {
        Class<?>[] types  = new Class[fields.length];
        int count = 0;

        for (Field field: fields) {
            types[count] =field.getType();
            count++;
        }
        return types;
    }

    private <OBJ> Constructor<OBJ> getConstructor (Class<OBJ> clazz, Class<?>[] types) throws ConstructorException {
        try {
            return clazz.getConstructor(types);
        } catch (NoSuchMethodException e) {
            throw new ConstructorException("Cannot find the constructor: ", e);
        }
    }
    private <OBJ> OBJ createInstance(Constructor<OBJ> constructor, Object[] args) throws InstanceException {
        try {
            return constructor.newInstance(args);
        } catch (InstantiationException e) {
            throw new InstanceException("Cannot instantiate the object: ", e);
        } catch (IllegalAccessException e) {
            throw new InstanceException("Cannot access the object: ", e);
        } catch (InvocationTargetException e) {
            throw new InstanceException("Cannot invoke the object: ", e);
        }
    }

/**
     * Method that will be used to map the source object to the target object
     * @param source Source object to be used as a base for the mapping
     * @return new instance of the target object with the values from the source object
     */
    public T map(@NonNull PersonDTO source) {
        /*
        * 1. El primer paso es obtener la clase de la propiedad target
        * 2. Obtener todos las propiedades de la clase target
        * 3. Iterar las propieades y devolver un array de tipos
        * 4. Pasar como argumero el array de tipos a al constructor.
        * 5. Para crear una nueva instancia podemos hacer dos cosas. Es pasarle todos los datos al contructor.
        * */
        Class<?> clazz = target.getClass();
        Class<?>[] types = getTypes(clazz.getFields());
        try {
            Constructor<?> constructor =  clazz.getConstructor(types);

        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }


}
