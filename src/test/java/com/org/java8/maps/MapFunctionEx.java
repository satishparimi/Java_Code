package com.org.java8.maps;

import java.util.Arrays;

public class MapFunctionEx {

	public static void main(String[] args) {

		int[] a = { 1, 5, 3, 4, 5, 6, 2, 9, 3, 8, 3, 5 };

		long res = Arrays.stream(a).filter(e -> e > 7).map(e -> {

			return e;
		}).sum();
		System.out.println(res);

	}

}
