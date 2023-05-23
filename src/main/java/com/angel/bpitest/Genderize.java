package com.angel.bpitest;

public class Genderize {

    private int count;
    private String gender;
    private String name;
    private float probability;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getProbability() {
        return probability;
    }

    public void setProbability(float probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "Genderize{" +
                "count=" + count +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", probability=" + probability +
                '}';
    }
}
