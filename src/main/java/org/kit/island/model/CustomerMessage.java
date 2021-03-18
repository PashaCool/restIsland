package org.kit.island.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity(name = "customer_message")
public class CustomerMessage {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotNull
    private String phone;
    @Column(name = "customer_name")
    private String name;
    @NotNull
    @Column(name = "customer_message")
    private String message;

}
