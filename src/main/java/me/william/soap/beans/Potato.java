package me.william.soap.beans;

import lombok.Data;

import java.io.Serializable;

@Data
public class Potato implements Serializable {

    private static final long serialVersionUid = 212L;

    private String breed;
    private String colour;
    private float weight;
    private int id;
}
