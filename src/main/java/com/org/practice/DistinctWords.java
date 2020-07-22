package com.org.practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DistinctWords {

	public static void main(String[] args) throws IOException {

		StringTokenizer st = new StringTokenizer("Hello World this my class to run");

		getData("C:\\Users\\sparimi\\Desktop\\Log.txt");
		

	}

	public static void getData(String fileName) throws IOException {

		Set<String> wordSet = new HashSet<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

		String line;
		while ((line = br.readLine()) != null) {

			StringTokenizer st = new StringTokenizer(line, ".,;:\"");

			while (st.hasMoreTokens()) {

				wordSet.add(st.nextToken().toString());
			}
		}

		wordSet.forEach(e -> {
			System.out.println(e);
		});
	}

}
