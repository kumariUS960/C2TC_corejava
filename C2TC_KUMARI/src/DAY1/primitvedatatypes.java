package DAY1;

public class primitvedatatypes {
	public static void main(String[] args) {
		
		byte bytemax=127;
		byte bytemin=-127;
		System.out.println("bytemax:" +bytemax +"bytemin:" +bytemin);
		
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("\nMinshort " +
				shortMin+"\nMaxshort "+shortMax);
		

		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("\nMinint " +
				minInt+"\nMaxint "+maxInt);
		
		
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		
		System.out.println("\nMinlong" +
				minLong+"\nMaxlong "+maxLong);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("\nfloat "+f+" \ndouble "+d);
		
		//boolean 
		boolean flag=false;
		System.out.println("\nboolean:  "+flag);
		
	}

}
