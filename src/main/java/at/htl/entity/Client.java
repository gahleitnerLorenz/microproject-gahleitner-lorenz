package at.htl.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import at.htl.entity.Client;

@Entity
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Client.findAll", query = "SELECT cl FROM Client cl"),
        @NamedQuery(name = "Client.findById", query = "SELECT cl FROM Client cl WHERE cl.id = :id"),
        @NamedQuery(name = "Client.findByName", query = "SELECT cl FROM Client cl WHERE cl.name = :name")
})

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cl_id")
    private Long id;

    @Column(name = "cl_adress")
    private String adress;

    @Column(name = "cl_name")
    private String name;

    @Column(name = "cl_rooms")
    @ElementCollection
    private List<String> rooms;

    @Column(name = "cl_contracts")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Contract> contracts;


    public Client(String adress, String name, List<String> rooms, List<Contract> contracts) {
        this.adress = adress;
        this.name = name;
        this.rooms = rooms;
        this.contracts = contracts;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(String room){
        rooms.add(room);
    }

    public void addContract(Contract contract){
        contracts.add(contract);
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public long getId(){
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == null) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Client client = (Client) obj;
        return Objects.equals(name, client.name) &&
                Objects.equals(adress, client.adress);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adress);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", adress='" + adress + '\'' +
                ", name='" + name + '\'' +
                ", rooms=" + rooms +
                ", contracts=" + contracts +
                '}';
    }
}
