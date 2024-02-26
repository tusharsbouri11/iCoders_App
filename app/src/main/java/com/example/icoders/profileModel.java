package com.example.icoders;

public class profileModel {

    private int img;
    private String name, desig, link;

    public profileModel(int img, String name, String desig, String link)
    {
        this.img=img;
        this.name=name;
        this.desig=desig;
        this.link=link;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getDesig() {
        return desig;
    }

    public String getLink() {
        return desig;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
