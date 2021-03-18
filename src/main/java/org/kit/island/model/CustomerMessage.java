package org.kit.island.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CustomerMessage {

    @NotNull
    private String phone;
    private String name;
    @NotNull
    private String message;

}
