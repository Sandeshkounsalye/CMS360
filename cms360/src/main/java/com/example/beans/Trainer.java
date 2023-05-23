package com.example.beans;

public class Trainer {

    private String trainerName;
    private String trainerType;
    private String trainerNumberofSloat;

    public Trainer(String trainerName, String trainerType, String trainerNumberofSloat) {
        this.trainerName = trainerName;
        this.trainerType = trainerType;
        this.trainerNumberofSloat = trainerNumberofSloat;
    }

    Trainer(){}
    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerType() {
        return trainerType;
    }

    public void setTrainerType(String trainerType) {
        this.trainerType = trainerType;
    }

    public String getTrainerNumberofSloat() {
        return trainerNumberofSloat;
    }

    public void setTrainerNumberofSloat(String trainerNumberofSloat) {
        this.trainerNumberofSloat = trainerNumberofSloat;
    }
}
