package com.lucasverrier.login_learn_android;

public class Cartepokemon {
    public void setmImageRessource(int mImageRessource) {
        this.mImageRessource = mImageRessource;
    }

    private int mImageRessource;
    private String description;
    private String attacks;

    public Cartepokemon(int ImageRessource,String mdescription,String mattack)
    {
      mImageRessource = ImageRessource;
        this.description = mdescription;
        this.attacks = mattack;


    }
    public int getmImageRessource()
    {
        return mImageRessource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttacks() {
        return attacks;
    }

    public void setAttacks(String attacks) {
        this.attacks = attacks;
    }
}
