
public class DoubleTest {

	public static void main( String[] args ) {
		Double d1 = new Double( 50 );
		Double d2 = new Double( 50 );
		System.out.println( d1.intValue() );
		System.out.println( d2.intValue() );
		System.out.println( (Object)d1.intValue() == (Object)d2.intValue() );
		Double d3 = new Double( 900 );
		Double d4 = new Double( 900 );
		System.out.println( d3.intValue() );
		System.out.println( d4.intValue() );
		System.out.println( (int)( (Object)d3.intValue() ) == (int)( (Object)d4.intValue() ) );
	}	
}