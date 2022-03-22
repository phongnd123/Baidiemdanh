import java.util.Scanner;
public class AppPerson {
    public static void main(String[] args) throws Exception {   
    }
}
     class Person{
        String PersonID;
        String PersonName;
        Boolean Gender;
        String Address;

        void nhapPersonID(){
            System.out.println("Hay nhap PersonID ");
            Scanner sc = new Scanner(System.in);
            PersonID = sc.nextLine();
        }
        void nhapPersonName() {
            System.out.println("Hay nhap PersonName ");
            Scanner sc = new Scanner(System.in);
            PersonName = sc.nextLine();
        }
        void nhapGender() {
            
            System.out.println("Hay nhap Gender ");
            Scanner sc = new Scanner(System.in);
            Gender = sc.nextBoolean();
        }
        void nhapAddress() {
            System.out.println("Hay nhap Address ");
            Scanner sc = new Scanner(System.in);
            Address = sc.nextLine();
        }
        void inPersonID() {
            System.out.println("PersonID cua ban la : " + PersonID);
        }
        void inPersonName() {
            System.out.println("PersonName cua ban la : " + PersonName);
        }
        void inGender() {
            System.out.println("Gender cua ban la : " + Gender);
        }
        void inAddress() {
            System.out.println("Address cua ban la : " + Address);
        }
    }