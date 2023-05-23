package com.example.beans;

public class Trainer {

    private String trainerName;
    private String trainerType;
    private String trainerNumberofSloat;

    private String trainerForSubject;

    public Trainer(String trainerName, String trainerType, String trainerNumberofSloat, String trainerForSubject) {
        this.trainerName = trainerName;
        this.trainerType = trainerType;
        this.trainerNumberofSloat = trainerNumberofSloat;
        this.trainerForSubject = trainerForSubject;
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

    public String getTrainerForSubject() {
        return trainerForSubject;
    }

    public void setTrainerForSubject(String trainerForSubject) {
        this.trainerForSubject = trainerForSubject;
    }
}
