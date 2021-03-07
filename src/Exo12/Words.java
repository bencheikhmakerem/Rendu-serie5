package Exo12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Words 
{
		public static void main(String[] args) 
		{			
			ArrayList<String> words = new ArrayList<>() ;
			words.add("one");
			words.add("two");
			words.add("three");
			words.add("four");
			words.add("five");
			words.add("six");
			words.add("seven");
			words.add("eight");
			words.add("nine");
			words.add("ten");
			words.add("eleven");
			words.add("tweleve");

			System.out.println("\n----la liste des mots initiales ----");
			words.forEach(s->System.out.println(s));
						
			Predicate<String> p=
					s->(s.length()%2==0);
			words.removeIf(p);
			System.out.println("\n----la liste après predicate ----");
			words.forEach(s->System.out.println(s));
			
			Function<String, String> f1=
					s->s.toUpperCase();
			System.out.println("\n----la liste en majuscule ----");
			words.forEach(s->System.out.println(f1.apply(s)));
			
			Predicate<String> p1=
					s->s.startsWith("e")||s.startsWith("a")||s.startsWith("u")||s.startsWith("i")||s.startsWith("y");
		    System.out.println("\n----test predicate ----");
			words.forEach(s->System.out.println(p1.test(s)));
			
			
			words.replaceAll((s)->p1.test(s)? s.toUpperCase():s);
			System.out.println("\n----Mot commençant par voyelle en majuscule ----");
			words.forEach(s->System.out.println(s));
			
			Comparator<String> comp=
						(s1,s2)->s1.length()-s2.length();
			words.sort(comp);
			System.out.println("\n----test comparator par longeur de mot ----");
			words.forEach(s->System.out.println(s));
			
			

		}
	


}
