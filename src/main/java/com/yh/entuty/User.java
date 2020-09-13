package com.yh.entuty;

import javax.persistence.*;

@Entity
@Table(name="t_user")
public class User {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键自增
    private Integer id;
    //自定义列名
    @Column(name = "name", length = 50)
    private String name;
    @Column
    private String emali;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emali='" + emali + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }
}