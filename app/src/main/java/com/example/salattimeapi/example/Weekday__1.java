
package com.example.salattimeapi.example;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Weekday__1 {

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("ar")
    @Expose
    private String ar;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

}
