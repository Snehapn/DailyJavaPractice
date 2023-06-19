
import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "cat", "dog", "tac", "god", "act" };
		groupAnagrams(arr);

	}

	public static void groupAnagrams(String arr[]) {
		Map<String, List<String>> hmap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			String word = arr[i];
			char[] arrayChar = word.toCharArray();
			Arrays.sort(arrayChar);
			String newWord = new String(arrayChar);

			if (hmap.containsKey(newWord)) {
				hmap.get(newWord).add(word);
			} else {
				List<String> words = new ArrayList<>();
				words.add(newWord);
				hmap.put(newWord, words);
			}
		}
		
		for(String s: hmap.keySet()) {
			List <String> values = hmap.get(s);
			
			if(values.size()>1) {
				System.out.println(values);
			}
		}
		
		

	}

}
