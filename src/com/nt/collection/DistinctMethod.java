package com.nt.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctMethod {
public static void main(String[] args) {
List<String> vehicleList=Arrays.asList("bus","car","bycycle","bus","car","bike","car");
//List<String> d=vehicleList.stream().distinct().collect(Collectors.toList());
//System.out.println(d);
//vehicleList.stream().distinct().forEach(i->System.out.println(i));
//vehicleList.stream().distinct().forEach(System.out::println);
//System.out.println(vehicleList.stream().distinct().count());

//List<String> v=vehicleList.stream().limit(4).collect(Collectors.toList());
//System.out.println(v);


//vehicleList.stream().limit(4).forEach(i->System.out.println(i));
//List<Integer> numbersList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//System.out.println(numbersList.stream().count());
//System.out.println(numbersList.stream().filter(n->n%2==0).count());
/*
 * stem.out.println(opt1.get()); Optional<Integer> opt=
 * numbersList.stream().min((val1,val2)->{return val1.compareTo(val2);});
 * System.out.println(opt.get());
 * 
 * Optional<Integer> opt1= numbersList.stream().max((val1,val2)->{return
 * val1.compareTo(val2);}); Sy
 */
/*
 * Object[] obj=vehicleList.stream().toArray(); for(Object o:obj ) {
 * System.out.println(o); } System.out.println(obj.toString());
 */
List<String> listVehicles=vehicleList.stream().sorted().collect(Collectors.toList());
System.out.println(listVehicles);

}
}
