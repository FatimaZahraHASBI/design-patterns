import boissons.Boisson;
import boissons.Espresso;
import deco.Chantilly;
import deco.Chocolat;
import deco.Noisette;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------------------");
        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------------------------");
        boisson = new Chantilly(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(""))));
        String line = bufferedReader.readLine();

    }
}
