package com.mockii.model;

//import org.springframework.data.elasticsearch.annotations.Document;

//@Document(indexName = "users", type = "users", shards = 1)
public class Users {

    private String name;
    private String designation;
    private String company;
    private String location;
    private Long id;
    private Long salary;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Users(String name, String designation, String company, String location, Long id, Long salary) {

        this.name = name;
        this.designation = designation;
        this.company = company;
        this.location = location;
        this.id = id;
        this.salary = salary;
    }

    public Users() {

    }
}