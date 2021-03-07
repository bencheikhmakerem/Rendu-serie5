package Exo13;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class PlayWithMap {
	public static void main(String[] args) {
		Map<Integer,String> Imutablemap=
				Map.ofEntries(
						Map.entry(3, "one"),
						Map.entry(4, "four"),
						Map.entry(5, "three"),
						Map.entry(6, "eleven"));
			
		Map<Integer, String> map1 = new HashMap<>(Imutablemap);
				List<Integer> keys=
						List.of(1,2,3,4,5,6,7,8);
				for (int key : keys) {
						map1.putIfAbsent(key, "");
						System.out.println(key + "=" +map1.get(key));
						
				}
				
				List<String> strings =List.of("one","two","three","four","five","six","seven",
						"eight","nine","ten","eleven","tweleve");
				
				Map<Integer, List<String>> map2 = new HashMap<>();
				
					for (String string : strings) {
						int key=string.length();
						map2.computeIfAbsent(key, k->new ArrayList<>()).add(string);
			
						
					}
					System.out.println("\n affichage deuxième map");
					map2.forEach((key,string)->System.out.println(key+"="+string));
					
					
				Map<Integer, String> map3 = new HashMap<>();
					for (String word : strings) 
					{
						int key = word.length();
						map3.merge(key, word, (ValeurExistante, NouvelleValeur) -> ValeurExistante + ", " + NouvelleValeur);
					}
					System.out.println("\n affichage troisième map:");
					map3.forEach((key, string) -> System.out.println(key + " = " + string));
				
			}
	}
	

