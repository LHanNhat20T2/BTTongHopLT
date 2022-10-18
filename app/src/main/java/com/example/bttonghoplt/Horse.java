package com.example.bttonghoplt;

public class Horse {
    private int image;
    private String name;
    private int type;

    public static final int TYPE_Horse = 1;
    public static final int TYPE_Food = 2;
    public static final int TYPE_Tool = 3;

    public Horse(int image, String name, int type) {
        this.image = image;
        this.name = name;
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
