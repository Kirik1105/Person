public class Person {
    String ФИО;
    String должность;
    String email;
    String телефон;
    int зарплата;
    int возраст;
    Person(String Name,String Work,String mail,String Phone,int Pay,int Age){
        ФИО=Name;
        должность=Work;
        email=mail;
        телефон=Phone;
        зарплата=Pay;
        возраст=Age;
    }
    public void ShowPerson(){
        System.out.println("-----------------");
        System.out.println("ФИО: "+ФИО);
        System.out.println("Должность:"+должность);
        System.out.println("Email:"+email);
        System.out.println("Телефон:"+телефон);
        System.out.println("Зарплата:"+зарплата);
        System.out.println("Возраст:"+возраст);

    }

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Donald Thornton", "Great chief", "donthornton@mailbox.com", "95685419", 68726, 50);
        persArray[2] = new Person("Virgil Hart", "Derived", "virhart@mailbox.com", "84269463", 41613, 21);
        persArray[3] = new Person("Bond Eland", "Farmer", "boeland@mailbox.com", "80996846", 99197, 34);
        persArray[4] = new Person("Alfie Nichols", "Translater", "alnichols@mailbox.com", "73016722", 79042, 70);

        for (int x=0;x<5;x++){
            if (persArray[x].возраст>40)
            persArray[x].ShowPerson();
        }
    }
}
