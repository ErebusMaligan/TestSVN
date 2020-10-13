import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest {

	public static void main( String[] args ) {
		Thing t1 = new Thing( Arrays.asList( "A", "B" ) );
		Thing t2 = new Thing( Arrays.asList( "C", "D", "E" ) );
		
		List<Thing> things = Arrays.asList( t1, t2 );
		
		List<String> names = things.stream().map( t -> t.getNames() ).flatMap( List::stream ).collect( Collectors.toList() );
		names.forEach( System.out::println );
		
	}
	
}
