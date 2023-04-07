package com.user.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="micro_user")
@Data
public class User {
    @Id
    @Column(name="ID")
    private String userId;
    @Column(name="NAME",length = 20)
    private String userName;
    @Column(name="MAIL")
    private String email;
    @Column(name="MOBILE_NUMBER")
    private String moNum;

    @Transient
    private List<Rating> ratings;

}
