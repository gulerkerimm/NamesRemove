package Namefilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NamesRemove {
    public static void main(String[] args) {

        List <String> list1= new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        List <String> result= new ArrayList<>();

        for(String name :list1){
            if(!name.toLowerCase().contains("a")){
                result.add(name);

            }
        }
        System.out.println(result);
    }
}
