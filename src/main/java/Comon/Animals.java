package Comon;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "table_animals")

public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    private int age;
    private String kind;

    private List<Animals> animals;
    public Animals() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Animals(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;



    }
    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }
    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kind='" + kind + '\'' +
                '}';
    }
}
