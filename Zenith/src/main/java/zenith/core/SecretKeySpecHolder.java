package zenith;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class SecretKeySpecHolder {
   private final SecretKeySpec l1lII1IllIII;
   private final SecureRandom IIlIl1Il1IIIl = new SecureRandom();

   public SecretKeySpecHolder(String s) {
      this.l1lII1IllIII = new SecretKeySpec(ArrayListHolder(s), "AES");
   }

   public String ZenithInternal149(String s) {
      try {
         byte[] abyte = new byte[12];
         this.IIlIl1Il1IIIl.nextBytes(abyte);
         Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
         cipher.init(1, this.l1lII1IllIII, new GCMParameterSpec(128, abyte));
         byte[] abyte1 = cipher.doFinal(s.getBytes(StandardCharsets.UTF_8));
         JsonObject jsonobject = new JsonObject();
         jsonobject.addProperty("v", 1);
         jsonobject.addProperty("enc", "AES_GCM");
         jsonobject.addProperty("nonce", Base64.getEncoder().encodeToString(abyte));
         jsonobject.addProperty("ciphertext", Base64.getEncoder().encodeToString(abyte1));
         return jsonobject.toString();
      } catch (Exception exception) {
         throw new IllegalStateException(exception);
      }
   }

   public String ZenithInternal150(String s) {
      try {
         JsonObject jsonobject = JsonParser.parseString(s).getAsJsonObject();
         String s1 = StringHolder_8(jsonobject, "nonce");
         String s2 = StringHolder_8(jsonobject, "ciphertext");
         if (!s1.isEmpty() && !s2.isEmpty()) {
            byte[] abyte = Base64.getDecoder().decode(s1);
            byte[] abyte1 = Base64.getDecoder().decode(s2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.l1lII1IllIII, new GCMParameterSpec(128, abyte));
            byte[] abyte2 = cipher.doFinal(abyte1);
            return new String(abyte2, StandardCharsets.UTF_8);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (Exception exception) {
         throw new IllegalArgumentException(exception);
      }
   }

   private static String StringHolder_8(JsonObject jsonobject, String s) {
      return jsonobject.has(s) && !jsonobject.get(s).isJsonNull() ? jsonobject.get(s).getAsString() : "";
   }

   private static byte[] ArrayListHolder(String s) {
      try {
         return MessageDigest.getInstance("SHA-256").digest(s.getBytes(StandardCharsets.UTF_8));
      } catch (Exception exception) {
         throw new IllegalStateException(exception);
      }
   }
}
