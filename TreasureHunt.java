package com.mendix.bms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreasureHunt {

	public static List<Integer> getTreasurePath(List<Integer> pathList) {
		int count = 0;
		int traverse = 0;
		int size = pathList.size();
		List<Integer> treasureList = new ArrayList<>();
		for (int i = 0; i < size; i=count) {
			count += pathList.get(i);
			treasureList.add(pathList.get(i));
			if (pathList.get(i) == 0)
				return Arrays.asList(0);
			else if (traverse++ > pathList.size())
				return Arrays.asList(-1);
		}
		return treasureList;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoKarate1Application.class, args);

		List<Integer> pathValidList = Arrays.asList(2, 1, 2, 0, 2, -1);
		List<Integer> pathZombieList = Arrays.asList(2, 4, 3, 0, -1, -1);
		List<Integer> pathInfiniteList = Arrays.asList(2, 10, 1, -1, 1, -2);

		System.out.println("Treasure : " + getTreasurePath(pathValidList));
		System.out.println("Zombie : " + getTreasurePath(pathZombieList).get(0));
		System.out.println("Infinite : " + getTreasurePath(pathInfiniteList).get(0));

	}
}
