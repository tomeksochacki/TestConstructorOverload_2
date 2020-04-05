package test;

public class Main {
    public static void main(String[] args) {

        Test test1 = new Test(1,32, 1987, "Tomek", "Sochacki");
        Test test2 = new Test(2,28,2009, "Tra", "Lala");
        Test test3 = new Test(3,58,2000, "Dore", "Mifaloa");


        System.out.println("Test1 have id: " + test1.getIdUser()+ ", have number : " + test1.getNumber() + ", and have year: " + test1.getYear() + ", name and surname is :" +test1.getName()+" "+ test1.getSurname());
        System.out.println("Test2 have id: " + test2.getIdUser()+ ", have number : " + test2.getNumber() + ", and have year: " + test2.getYear() + ", name and surname is :" +test2.getName()+" "+ test2.getSurname());
        System.out.println("Test3 have id: " + test3.getIdUser()+ ", have number : " + test3.getNumber() + ", and have year: " + test3.getYear() + ", name and surname is :" +test3.getName()+" "+ test3.getSurname());

    }


}
