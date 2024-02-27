package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * @apiNote агрегатор студенческих групп в поток студентов
 */
public class StudentSteam implements Iterable<StudentGroup>, Comparable<StudentGroup> {
    private int numOfSteam;
    private static int numGenerator = 100;
    private List<StudentGroup> steam;

    public StudentSteam() {
    }

    public StudentSteam(List<StudentGroup> steam) {
        this.steam = steam;
        this.numOfSteam = numGenerator;
        numGenerator += 100;
    }


    public int getNumOfSteam() {
        return numOfSteam;
    }

    public void setNumOfSteam(int numOfSteam) {
        this.numOfSteam = numOfSteam;
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    @Override
    public String toString() {
        System.out.println("Number of steam= " + numOfSteam + "\n" +
                "Number of groups on the steam = " + steam.size());
        for (int i = 0; i < steam.size(); i++) {
            for (Student student : steam.get(i)) {
                System.out.println("group id: " + ((int)steam.get(i).getIdStudentGroup() + (int)numOfSteam) + "; "
                        + student);

            }
        }
        return "the end";
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }

    @Override
    public int compareTo(StudentGroup o) {
        return 0;
    }
}
