package at.htl.entity;

import java.util.Date;
import java.util.List;

public class Contract {
    Date endDateOfContract;
    Employee employee;
    Client client;
    Double salary;
    List<TypeOfFacilityManagement> listOfFacilityManagement;
    Long id;

    public Contract(Date endDateOfContract, Employee employee, Client client, Double salary, List<TypeOfFacilityManagement> listOfFacilityManagement) {
        this.endDateOfContract = endDateOfContract;
        this.employee = employee;
        this.client = client;
        this.salary = salary;
        this.listOfFacilityManagement = listOfFacilityManagement;
    }

    public Date getEndDateOfContract() {
        return endDateOfContract;
    }

    public void setEndDateOfContract(Date endDateOfContract) {
        this.endDateOfContract = endDateOfContract;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<TypeOfFacilityManagement> getListOfFacilityManagement() {
        return listOfFacilityManagement;
    }

    public void setListOfFacilityManagement(List<TypeOfFacilityManagement> listOfFacilityManagement) {
        this.listOfFacilityManagement = listOfFacilityManagement;
    }

    public void addTypeOfFacilityManagement(TypeOfFacilityManagement typeOfFacilityManagement){
        listOfFacilityManagement.add(typeOfFacilityManagement);
    }

}
