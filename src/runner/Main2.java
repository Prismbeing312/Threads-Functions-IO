package runner;

import InputOutput.DaoIO;
import InputOutput.Person;
import Interfaces.Dao;

import java.io.File;

public class Main2 {
    public static void main(String[] args) {
//        Person person = new Person(23, "jake");
//        File file = new File("NewFile.dat");
//        Dao<Person> personDao= new DaoIO<>(file);
//        personDao.write(person);
//        Person person2 = personDao.read();
//        System.out.println(person2);

        Thread thread = new Thread(() -> {
            System.out.println("someshit");
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("someshit2");
            }
        });





    }
}
