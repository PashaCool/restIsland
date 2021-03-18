package org.kit.island.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity(name = "customer_message")
public class CustomerMessage {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "appeal_id")
    private String id;
    @NotNull
    private String phone;
    @Column(name = "customer_name")
    private String name;
    @NotNull
    @Column(name = "customer_message")
    private String message;

}
