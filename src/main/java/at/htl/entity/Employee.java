package at.htl.entity;

import java.time.LocalDate;
import java.util.List;

public class Employee {
    private String name;
    private LocalDate birthdate;
    private long id;
    private List<Contract> contracts;

    public Employee(String name, LocalDate birthdate, List<Contract> contracts) {
        this.name = name;
        this.birthdate = birthdate;
        this.contracts = contracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public void addContract(Contract contract){
        contracts.add(contract);
    }
}
