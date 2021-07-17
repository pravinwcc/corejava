package java8.foreachtest;

import java.util.Arrays;
import java.util.List;

public class ForEachWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfPrimes = Arrays.asList(2, 3, 5, 7, 11, 3, 17);

		listOfPrimes.stream().forEach(i -> {
			System.out.println(i);
		});

		// listOfPrimes.stream().forEach(System.out::println);

		listOfPrimes.stream().filter(j -> j % 2 == 0).forEach(System.out::println);
		listOfPrimes.stream().filter(j -> j % 2 == 0).forEach((i) -> {
			System.out.println(i);
		});

	}

}
