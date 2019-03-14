package com.puroapi.services.product.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class QueryCardParam {

    @NotNull
    String cardId;
}
