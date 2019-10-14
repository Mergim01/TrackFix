package com.example.trackfix;

import android.os.Parcel;


public class ListItem{


    private String title;
    private int imageId;
    private String description;
    private String price;

    public ListItem(){
    }



    public ListItem(String title,int imageId, String description,String price ){
        this.title = title;
        this.imageId = imageId;
        this.description = description;
        this.price = price;
    }



    public String getTitle(){
    return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public  int getImageId(){
        return imageId;
    }

    public void setImageId(int imageId){
     this.imageId = imageId;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

}
