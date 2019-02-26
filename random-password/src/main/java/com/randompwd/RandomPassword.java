package com.randompwd;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;



public class RandomPassword {
	public static String randomAlphaNumeric(int count) {
	    final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	    final StringBuilder builder = new StringBuilder();
	    while (count-- != 0) {
	        final int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
	        builder.append(ALPHA_NUMERIC_STRING.charAt(character));
	    }
	    builder.replace(0, 3, "@a1");
	    return builder.toString();
	}



private static String getrandomDefaultPd(String randomvalue) throws UnsupportedEncodingException, NoSuchAlgorithmException {

    return CryptoUtil.getSha256Hash(randomvalue);

}
	
	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String randomvaluepwd = randomAlphaNumeric(8);

		System.out.println("randomvaluepwd :"+randomvaluepwd);
		String newpd = getrandomDefaultPd(randomvaluepwd);
		System.out.println(newpd);
	}



}
