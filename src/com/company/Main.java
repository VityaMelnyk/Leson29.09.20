package com.company;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// тема Отель

        Hostel room1 = new Hostel("room1","nexToilet",100);
        Hostel room2 = new Hostel("room2","nex to exit",100);
        Hostel room3 = new Hostel("room3","nex to lobby",100);
        Hostel room4 = new Hostel("room4","nex to bar",100);

        SemiLux chamber1 = new SemiLux("1", "flor 1", 200, true);
        SemiLux chamber2 = new SemiLux("2", "flor 1", 200);
        SemiLux chamber3 = new SemiLux("3", "flor 1", 200);

        chamber3.getBarPrice(50);
        chamber3.setBreakfastPrice(100);

        List<IAccaunting> list = Stream.of(room1,room2,room3,room4,
                chamber1,chamber2,chamber3).collect(Collector.tolist());

        int income = list.stream().mapToInt(IAccaunting::getTotalSum)
                .sum();
        System.out.println(income + " грн");

        String minProfit = list.stream().min(Comparator.comparing(item -> item.getTotalSum()))
                .orElse(null).getName();
        System.out.println(minProfit);


        List<BaseHousing> list2 = new String.of(room1)

    }
}
