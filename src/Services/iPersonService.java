package Services;

import Domen.Person;

import java.util.List;

public interface iPersonService<T extends Person> {
    public List<T> getAll();

    public void create(String name, int age);
}
