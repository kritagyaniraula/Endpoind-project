package com.example.exelcreator;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table

public class ExelModel {
    @Id

    private Integer ID;
    private String Name;
    private String Roll;
    private String Address;

}
