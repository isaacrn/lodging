package br.com.commons.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClientDTO {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String cpf;

    private String sex;

    private String birthday;

    public ClientDTO(String name, String cpf, String sex, String birthday) {
        this.name = name;
        this.cpf = cpf;
        this.sex = sex;
        this.birthday = birthday;
    }

    public ClientDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
