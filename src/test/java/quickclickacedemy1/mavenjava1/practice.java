package quickclickacedemy1.mavenjava1;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class practice {
	
	@Test
	public void streamFilter()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Raja");
		names.add("baja");
		names.add("kaja");
		names.add("laja");
		
		 names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		
		
		long d=Stream.of("Raja","baja","laja","laja").filter(s->
		{
			s.startsWith("j");
			return true;
		}).count();
		System.out.println(d);
	}
	
	@Test
	public void Streamamp()
	{
		Stream.of("Abhijeet","Don","Alekha","adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	}
	


