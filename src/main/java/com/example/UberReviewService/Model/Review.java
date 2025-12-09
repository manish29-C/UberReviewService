package com.example.UberReviewService.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookingreview")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel {

    @Column(nullable = false) // make the not null
     private  String  content;

    private Double rating;

    @Override
    public String toString(){
        return "Review: "+this.content +" "+this.rating+" "+this.createdAt;
    }
}
