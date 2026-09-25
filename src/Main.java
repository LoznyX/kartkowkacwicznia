import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 1; i < 100; i++) {
            int liczby = r.nextInt(1, 100);
            if(liczby % 2 ==0){
                list.add(liczby);
            }
            if(liczby / liczby % 2 ==0)
        }System.out.println("parzyste: "+list);
        HashSet<Integer> unikatowe = new HashSet<>(list);
        System.out.println(unikatowe);
        }

    }




      /* 1. wylosuj 100 liczb z zakresu od 1 do 50
      2. zapisz liczby w liscie
      3.policz ile jest wartosci unikatowych
      4.zapisz liste z wartosciami tylko parzystymi
      5.oblicz ile jest liczb pierwszych wylosowanych
      6.zrob klase ksiazka z polem tytul autor czy dostepna
      7.zrob klase czytelnik z polem imie i wyporzyczone ksiazki
      8.zrob klase biblioteka z polami ksiazki,czytelnicy
      9.zaprogramuj wszystko co potrzebujesz zeby zrobic meode wyporzycz,
      ksziazka po wyporzyczeniu ksziazka ma byc niedostepna do wyporzyczenia a uzytkownik
      ktory ma ja wyporzyczano wyswietlac sie bedzie u niego
       */




