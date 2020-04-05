package test;

public class Test {
    public static int nextIdUser;
    private int number;
    private int age;
    private int year;
    private String name;
    private String surname;
    private int id;

    public Test(int number, int age, int year, String name, String surname){
        this(number, age, year);
        this.name = name;
        this.surname = surname;
    }
    public Test(int number, int age, int year){
        id=nextIdUser;
        nextIdUser++;
        this.number = number;
        this.age = age;
        this.year = year;
    }
    public int getIdUser(){
        return id;
    }
    public int getNumber(){
        return number;
    }
    public int getAge(){
        return age;
    }
    public int getYear(){
        return year;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    static {
        nextIdUser = 1;
    }
}
