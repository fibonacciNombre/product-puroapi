package com.puroapi.services.product.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
public class Card implements Serializable {

    @NotNull
    String id;
    String cardId;
    String name;
    String dueDate;


}
