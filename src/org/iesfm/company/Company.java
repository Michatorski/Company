package org.iesfm.company;

public class Company {
    private String name;
    private String cif;
    private Department[] departments;

    public Company(String name, String cif, Department[] departments) {
        this.name = name;
        this.cif = cif;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }
}
