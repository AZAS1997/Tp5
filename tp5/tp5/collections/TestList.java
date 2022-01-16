package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class TestList {
public static void main(String[] args) {
	System.out.println("Les listes");
List<Integer> list1= new ArrayList<Integer>();
list1.add(12);
list1.add(23);
list1.add(23);
list1.add(12);
System.out.println("La boucle for classique");

for(int i = 0;i<list1.size();i++){
Integer e = (Integer) list1.get(i);
System.out.println(" element "+i +" : "+e);
}
System.out.println("La boucle for avanc�e");
for(Integer e :list1){
System.out.println(" element "+e);
}
System.out.println("Un iterateur");
Iterator<Integer> iter = list1.iterator();
while(iter.hasNext()){
Integer e = iter.next();
System.out.println("element : "+e);
}
System.out.println("La m�thode forEach de la List");
list1.forEach(i-> System.out.println(" element "+i));

System.out.println("Q4 A :");
List<Integer> list2= Arrays.asList(1,5,6,9,16);
list2.stream().map(i->i*i).filter(i->i>37).forEach(i->
System.out.println(i));

System.out.println("Q5");
List<Integer> list3= new ArrayList<>();
list3.add(5);
list3.add(10);
list3.add(15);
list3.add(20);
list3.add(2,10);
list3.forEach(i-> System.out.println(i));



}}


