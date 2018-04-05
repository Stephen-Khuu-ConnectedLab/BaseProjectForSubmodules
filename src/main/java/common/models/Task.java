package common.models;

import java.util.Date;

public class Task {
    private String name;
    private String description;
    private Person owner;
    private Date created;

    public Task(String name, String description, Person owner, Date created) {
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
