package com.cquedu.fmmall.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer u_Account;
    private String u_Name;
    private String u_Password;
    private String u_Sex;
    private String u_Email;
    private String u_Phone;
}
