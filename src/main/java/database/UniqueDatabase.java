package database;

import flowers.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UniqueDatabase  {

    private static UniqueDatabase ourInstance = null;
    private static BufferedWriter file;


    public static UniqueDatabase getInstance() throws IOException {
        if (ourInstance == null){
            ourInstance = new UniqueDatabase();
        }
        return ourInstance; }

    private UniqueDatabase() throws IOException {

    }

    public void add(Order order)throws IOException{
        if (file == null){
            file = new BufferedWriter(new FileWriter("database.txt", true));
        }
        file.append(order.toString());
        file.newLine();
    }

    public void commit() throws IOException {
        file.close();

    }
}
