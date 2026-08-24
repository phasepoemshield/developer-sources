package melancholia.runtime;

// $VF: Compiled from StringDecryptor.java
public final class StringDecryptor {
   private StringDecryptor() {
   }

   public static String d(String enc, int key) {
      char[] c = enc.toCharArray();

      for (int i = 0; i < c.length; i++) {
         c[i] = (char)(c[i] ^ key + i * 31);
      }

      return new String(c);
   }
}
