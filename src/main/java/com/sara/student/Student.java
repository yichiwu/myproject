package com.sara.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
//        int max = ;
//        if (english > math) {
//            max = english;
//        } else {
//            max = math;
//        }
        return (english > math) ? english : math;
    }

    public void print() {
        System.out.print(name + "\t" + english + "\t" + math +
                "\t" + getAverage());
        if (getAverage() >= 60) {
            System.out.print("\tPASS");
        } else {
            System.out.print("\tFAILED");
        }

        int average = getAverage();
        char grading = 'F';
        switch (average/10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println("\t" + grading);
    }

    public int getAverage() {
        return (english+math)/2;
    }
}
