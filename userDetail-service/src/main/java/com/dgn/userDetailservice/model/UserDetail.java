package com.dgn.userDetailservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TABLE_USERDETAIL")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_DETAIL_ID")
    private Long id;
    @Column(name = "USER_GSM_NUMBER")
    private String gsmNo;
    @Column(name = "USER_TC_NUMBER")
    private String tcKimlikNo;
    @Column(name = "USER_EMAIL")
    private String email;
    @Column(name = "USER_ADDRESS")
    private String address;

    public UserDetail(String gsmNo, String tcKimlikNo, String email, String address) {
        this.gsmNo = gsmNo;
        this.tcKimlikNo = tcKimlikNo;
        this.email = email;
        this.address = address;
    }
}
