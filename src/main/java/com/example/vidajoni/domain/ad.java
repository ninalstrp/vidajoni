package com.example.vidajoni.domain;


import lombok.*;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;


@Entity
@Getter @Setter
@ToString
@NoArgsConstructor
public class ad extends Auditable{
    @Id
    @GeneratedValue
    private int id;

   // private LocalDateTime created;

   @ManyToOne
   private user createdBy;

    @NonNull
    private String title;

    private String description;

    private String size;

    private String picture;

//    @ManyToOne
//    private int idBuyer;

    private Boolean isForSale = true;
}
