package Domen;

import Services.EmployeeService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTeam implements Iterable<Employee> {
    private String department;
    private List<Employee> team = new ArrayList<>();

    public EmployeeTeam(List<Employee> team, String department) {
        this.team = team;
        this.department = department;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator(team);
    }

    public List<Employee> getTeam() {
        return team;
    }

    public void addEmployee(Employee coworker) {
        this.team.add(coworker);
    }
}
