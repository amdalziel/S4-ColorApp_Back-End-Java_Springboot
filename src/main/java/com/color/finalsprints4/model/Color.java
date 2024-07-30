package com.color.finalsprints4.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Color {

    @Id
    @SequenceGenerator(name = "color_sequence", sequenceName = "color_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "color_sequence")
    private Long id;

    private String name;
    private int hexNumber;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Vibe> vibeList;

    @ManyToOne
    private Space space;

    @ManyToOne
    private Style style;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHexNumber() {
        return hexNumber;
    }

    public void setHexNumber(int hexNumber) {
        this.hexNumber = hexNumber;
    }

    public void setVibeList(List<Vibe> vibeList) {
        this.vibeList = vibeList;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

}
