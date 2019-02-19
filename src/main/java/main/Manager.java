package main;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Objects;

public class Manager {
    private int id;
    private String fname;
    private String lname;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "First_NAME", nullable = true, length = 24)
    public String getfirstName() {
        return fname;
    }

    @Column(name = "Last_NAME", nullable = true, length = 24)
    public String getlastName() {
        return lname;
    }

    public void setfirstName(String name) {
        this.fname = name;
    }

    public void setlastName(String name) {
        this.fname = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager person = (Person) o;
        return id == person.id &&
                Objects.equals(fname, person.fname);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, fname);
    }
}
