package InputOutput;

import Interfaces.Dao;

import java.io.*;

public class DaoIO<T> implements Dao<T> {

    private File hello;

    public DaoIO(File hello) {
        this.hello = hello;
    }

    @Override
    public void write(T t) {
        try(ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(hello))){
            write.writeObject(t);
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    @Override
    public T read() {
        T t = null;

        try(ObjectInputStream read = new ObjectInputStream(new FileInputStream(hello))){
           t = (T)read.readObject();

        }catch (IOException | ClassNotFoundException e){
            e.getStackTrace();
        }

        return t;
    }
}
