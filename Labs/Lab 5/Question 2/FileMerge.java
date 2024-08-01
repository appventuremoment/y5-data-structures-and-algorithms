import java.io.*;
import java.util.ArrayList;

public class FileMerge {
    public static void main(String[] args) {
        try{
            BufferedReader in1 = new BufferedReader(new FileReader("C:/Users/user/Documents/GitHub/y5-data-structures-and-algorithms/Labs/Lab 5/Question 2/records1.csv"));
            BufferedReader in2 = new BufferedReader(new FileReader("C:/Users/user/Documents/GitHub/y5-data-structures-and-algorithms/Labs/Lab 5/Question 2/records2.csv"));
            String line;
            ArrayList<Person> a1 = new ArrayList<>(), a2 = new ArrayList<>();
            while ((line = in1.readLine()) != null) {
                String[] temp = line.split(",");
                a1.add(new Person(Integer.valueOf(temp[0]), temp[1], temp[2], temp[3]));
            }
            while ((line = in2.readLine()) != null) {
                String[] temp = line.split(",");
                a2.add(new Person(Integer.valueOf(temp[0]), temp[1], temp[2], temp[3]));
            }


            ArrayList<Person> combined = new ArrayList<>();
            int pointer1 = 0, pointer2 = 0;
            while (pointer1 < a1.size() && pointer2 < a2.size()) {
                if (a1.get(pointer1).getId() < a2.get(pointer2).getId()) combined.add(a1.get(pointer1++));
                else combined.add(a2.get(pointer2++));
            }
            while (pointer1 < a1.size()) {
                combined.add(a1.get(pointer1++));
            }
            while (pointer2 < a2.size()) {
                combined.add(a2.get(pointer2++));
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/user/Documents/GitHub/y5-data-structures-and-algorithms/Labs/Lab 5/Question 2/recordsAll.csv"));
            for (Person p : combined) {
                bw.write(p.toString() + "\n");
            }
        }
        catch(Exception e){}
    }
}