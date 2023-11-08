package ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
    List<Automobil> lista = citire();
    lista.forEach(System.out::println);
    }
    public  static List<Automobil> citire() throws FileNotFoundException {
        List<Automobil> lista = new ArrayList<Automobil>();
        Scanner scanner = new Scanner(new File("src/main/resources/automobile.csv"));
        scanner.useDelimiter(",|\\r");
        while(scanner.hasNextLine()){
            String firma = scanner.next().strip();
            String combustibilString = scanner.next();
            Combustibil combustibil = Combustibil.valueOf(combustibilString.toUpperCase());
            if(scanner.hasNextDouble()){
                double pret = scanner.nextDouble();
                String model = scanner.next();
                lista.add(new Masina(firma,combustibil,pret,model));
            }else{
                String dataString = scanner.next();
                LocalDate data = LocalDate.parse(dataString);
                lista.add(new Motocicleta(firma,combustibil,data));
            }
        }
        return lista;
    }
}
