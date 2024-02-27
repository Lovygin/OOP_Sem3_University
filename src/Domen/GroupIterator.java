package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Переопределение итератора для класса <StudentGroup>
 */
public class GroupIterator implements Iterator<StudentGroup>{
    private int counter = 0;
    private List<StudentGroup> steam;

    public GroupIterator(List<StudentGroup> steam) {
        this.steam = steam;
    }

    @Override
    public boolean hasNext() {
        return counter < steam.size();
    }

    @Override
    public StudentGroup next() {
        return steam.get(counter++);
    }
}
