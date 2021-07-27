package model;

public class Student {
    private String name;
    private int age;
    private char gender;
    private String studNum;


    public Student(String name, int age, char gender, String studNum) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studNum = studNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getStudNum() {
        return studNum;
    }

    public void setStudNum(String studNum) {
        this.studNum = studNum;
    }
}
