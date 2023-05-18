package algorithmday1;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class SockerMerchant {

	public static void main(String[] args) {

		List<Integer> socks = Arrays.asList(1, 2, 1, 2, 1, 3, 2);

		int n = socks.size();

		System.out.println("Number of matching socks: " + sockerMerchant(n, socks));

	}

	public static int sockerMerchant(int n, List<Integer> socks) {

		HashMap<Integer, Integer> colorIds = new HashMap<>();

		countOccurences(socks, colorIds);

		int count = 0;
		for (int value : colorIds.values()) {
			count += value / 2;
		}

		return count;

	}

	public static void countOccurences(List<Integer> socks, HashMap<Integer, Integer> map) {
		for (int i = 0; i < socks.size(); i++) {
			int colorId = socks.get(i);
			if (map.containsKey(colorId)) {
				map.put(colorId, map.get(colorId) + 1);
			} else {
				map.put(colorId, 1);
			}

		}

	}

}
