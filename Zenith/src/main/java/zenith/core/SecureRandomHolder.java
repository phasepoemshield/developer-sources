package zenith;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public final class SecureRandomHolder {
   private static final int Il1IlllIIl111 = 256;
   private static final int lIIII11lI111ll11ll11111l = 32;
   private static final int lIIl111IIl11l11Il1111IlIlIlI = 128;
   private static final int l1II1l1lII11I1ll1l = 12;
   private static final SecureRandom lI1Ill1I1I1 = new SecureRandom();
   private static final byte II1IIIlIl1II11I1l1Il1 = 1;
   private static final int Illll11Il1lll1II1IIII = 5000;
   private static final int IIlI1IIII1IIl1ll1lIl = 12;

   public static String ListHolder_6(String s, String s1) throws Exception {
      if (s == null) {
         throw new IllegalArgumentException("plainText == null");
      } else if (s1 == null) {
         throw new IllegalArgumentException("password == null");
      } else {
         byte[] abyte = new byte[16];
         lI1Ill1I1I1.nextBytes(abyte);
         int i = ModuleHolder(s1);
         byte[] abyte1 = StringHolder_8(s1.toCharArray(), abyte, i, 64);
         byte[] abyte2 = Arrays.copyOf(abyte1, 32);
         byte[] abyte3 = Arrays.copyOfRange(abyte1, 32, abyte1.length);
         SecretKeySpec secretkeyspec = new SecretKeySpec(abyte2, "AES");
         byte[] abyte4 = new byte[12];
         lI1Ill1I1I1.nextBytes(abyte4);
         Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
         GCMParameterSpec gcmparameterspec = new GCMParameterSpec(128, abyte4);
         cipher.init(1, secretkeyspec, gcmparameterspec);
         byte[] abyte5 = cipher.doFinal(s.getBytes(StandardCharsets.UTF_8));
         byte[] abyte6 = StringHolder_8(abyte3, abyte4, abyte5);
         ByteBuffer bytebuffer = ByteBuffer.allocate(2 + abyte.length + 1 + abyte4.length + 4 + abyte6.length);
         bytebuffer.order(ByteOrder.BIG_ENDIAN);
         bytebuffer.put((byte)1);
         bytebuffer.put((byte)abyte.length);
         bytebuffer.put(abyte);
         bytebuffer.put((byte)abyte4.length);
         bytebuffer.put(abyte4);
         bytebuffer.putInt(i);
         bytebuffer.put(abyte6);
         byte[] abyte7 = bytebuffer.array();
         return Base64.getEncoder().encodeToString(abyte7);
      }
   }

   public static String SecureRandomHolder_2(String s, String s1) throws Exception {
      if (s == null) {
         throw new IllegalArgumentException("base64Blob == null");
      } else if (s1 == null) {
         throw new IllegalArgumentException("password == null");
      } else {
         byte[] abyte = Base64.getDecoder().decode(s);
         ByteBuffer bytebuffer = ByteBuffer.wrap(abyte).order(ByteOrder.BIG_ENDIAN);
         byte b0 = bytebuffer.get();
         if (b0 != 1) {
            throw new IllegalArgumentException("Unsupported version: " + b0);
         } else {
            int i = Byte.toUnsignedInt(bytebuffer.get());
            byte[] abyte1 = new byte[i];
            bytebuffer.get(abyte1);
            int j = Byte.toUnsignedInt(bytebuffer.get());
            byte[] abyte2 = new byte[j];
            bytebuffer.get(abyte2);
            int k = bytebuffer.getInt();
            byte[] abyte3 = new byte[bytebuffer.remaining()];
            bytebuffer.get(abyte3);
            byte[] abyte4 = StringHolder_8(s1.toCharArray(), abyte1, k, 64);
            byte[] abyte5 = Arrays.copyOf(abyte4, 32);
            byte[] abyte6 = Arrays.copyOfRange(abyte4, 32, abyte4.length);
            SecretKeySpec secretkeyspec = new SecretKeySpec(abyte5, "AES");
            byte[] abyte7 = StringHolder_8(abyte6, abyte2, abyte3);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            GCMParameterSpec gcmparameterspec = new GCMParameterSpec(128, abyte2);
            cipher.init(2, secretkeyspec, gcmparameterspec);
            byte[] abyte8 = cipher.doFinal(abyte7);
            return new String(abyte8, StandardCharsets.UTF_8);
         }
      }
   }

   private static int ModuleHolder(String s) {
      int i = Math.max(1, s.length());
      int j = 0;
      int k = 0;

      for (int l = 0; l < s.length(); l++) {
         char c0 = s.charAt(l);
         j += c0 * (l + 1);
         k ^= c0 << l % 8;
      }

      long j1 = (long)j * 31L ^ (long)k & 255L ^ (long)s.hashCode();
      int i1 = 20000 + (int)(Math.abs(j1) % 100000L);
      return Math.max(10000, Math.min(200000, i1));
   }

   private static byte[] StringHolder_8(char[] achar, byte[] abyte, int i, int j) {
      try {
         PBEKeySpec pbekeyspec = new PBEKeySpec(achar, abyte, i, j * 8);
         SecretKeyFactory secretkeyfactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
         SecretKey secretkey = secretkeyfactory.generateSecret(pbekeyspec);
         return secretkey.getEncoded();
      } catch (GeneralSecurityException generalsecurityexception) {
         throw new RuntimeException("PBKDF2 failure", generalsecurityexception);
      }
   }

   private static byte[] StringHolder_8(byte[] abyte, byte[] abyte1, byte[] abyte2) {
      try {
         MessageDigest messagedigest = MessageDigest.getInstance("SHA-512");
         byte[] abyte3 = new byte[abyte2.length];
         int i = 0;

         for (int j = 0; j < abyte2.length; i++) {
            messagedigest.reset();
            messagedigest.update(abyte);
            messagedigest.update((byte)(i & 0xFF));
            messagedigest.update((byte)(i >> 8 & 0xFF));
            messagedigest.update(abyte1);
            byte[] abyte4 = messagedigest.digest();
            int k = Math.min(abyte4.length, abyte2.length - j);

            for (int l = 0; l < k; l++) {
               abyte3[j + l] = (byte)(abyte2[j + l] ^ abyte4[l]);
            }

            j += k;
         }

         return abyte3;
      } catch (NoSuchAlgorithmException nosuchalgorithmexception) {
         throw new RuntimeException(nosuchalgorithmexception);
      }
   }

   public static byte[] StringHolder_8(byte[] abyte, String s) throws Exception {
      byte[] abyte1 = new byte[16];
      lI1Ill1I1I1.nextBytes(abyte1);
      int i = ModuleHolder(s);
      byte[] abyte2 = StringHolder_8(s.toCharArray(), abyte1, i, 64);
      byte[] abyte3 = Arrays.copyOf(abyte2, 32);
      byte[] abyte4 = Arrays.copyOfRange(abyte2, 32, abyte2.length);
      SecretKeySpec secretkeyspec = new SecretKeySpec(abyte3, "AES");
      byte[] abyte5 = new byte[12];
      lI1Ill1I1I1.nextBytes(abyte5);
      Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
      cipher.init(1, secretkeyspec, new GCMParameterSpec(128, abyte5));
      byte[] abyte6 = cipher.doFinal(abyte);
      byte[] abyte7 = StringHolder_8(abyte4, abyte5, abyte6);
      ByteBuffer bytebuffer = ByteBuffer.allocate(2 + abyte1.length + 1 + abyte5.length + 4 + abyte7.length).order(ByteOrder.BIG_ENDIAN);
      bytebuffer.put((byte)1);
      bytebuffer.put((byte)abyte1.length);
      bytebuffer.put(abyte1);
      bytebuffer.put((byte)abyte5.length);
      bytebuffer.put(abyte5);
      bytebuffer.putInt(i);
      bytebuffer.put(abyte7);
      byte[] abyte8 = bytebuffer.array();
      Arrays.fill(abyte2, (byte)0);
      Arrays.fill(abyte3, (byte)0);
      Arrays.fill(abyte4, (byte)0);
      Arrays.fill(abyte, (byte)0);
      return Base64.getEncoder().encodeToString(abyte8).getBytes(StandardCharsets.UTF_8);
   }

   public static byte[] EventBus(byte[] abyte, String s) throws Exception {
      String s1 = new String(abyte, StandardCharsets.UTF_8);
      byte[] abyte1 = Base64.getDecoder().decode(s1);
      ByteBuffer bytebuffer = ByteBuffer.wrap(abyte1).order(ByteOrder.BIG_ENDIAN);
      byte b0 = bytebuffer.get();
      if (b0 != 1) {
         throw new IllegalArgumentException("Unsupported version: " + b0);
      } else {
         int i = Byte.toUnsignedInt(bytebuffer.get());
         byte[] abyte2 = new byte[i];
         bytebuffer.get(abyte2);
         int j = Byte.toUnsignedInt(bytebuffer.get());
         byte[] abyte3 = new byte[j];
         bytebuffer.get(abyte3);
         int k = bytebuffer.getInt();
         byte[] abyte4 = new byte[bytebuffer.remaining()];
         bytebuffer.get(abyte4);
         byte[] abyte5 = StringHolder_8(s.toCharArray(), abyte2, k, 64);
         byte[] abyte6 = Arrays.copyOf(abyte5, 32);
         byte[] abyte7 = Arrays.copyOfRange(abyte5, 32, abyte5.length);
         SecretKeySpec secretkeyspec = new SecretKeySpec(abyte6, "AES");
         byte[] abyte8 = StringHolder_8(abyte7, abyte3, abyte4);
         Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
         cipher.init(2, secretkeyspec, new GCMParameterSpec(128, abyte3));
         byte[] abyte9 = cipher.doFinal(abyte8);
         Arrays.fill(abyte5, (byte)0);
         Arrays.fill(abyte6, (byte)0);
         Arrays.fill(abyte7, (byte)0);
         return abyte9;
      }
   }

   public static byte[] EventTarget(byte[] abyte, String s) throws Exception {
      byte[] abyte1 = new byte[12];
      lI1Ill1I1I1.nextBytes(abyte1);
      byte[] abyte2 = StringHolder_8(s.toCharArray(), abyte1, 5000, 32);
      SecretKeySpec secretkeyspec = new SecretKeySpec(abyte2, "AES");
      byte[] abyte3 = new byte[12];
      lI1Ill1I1I1.nextBytes(abyte3);
      Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
      cipher.init(1, secretkeyspec, new GCMParameterSpec(128, abyte3));
      byte[] abyte4 = cipher.doFinal(abyte);
      ByteBuffer bytebuffer = ByteBuffer.allocate(abyte1.length + abyte3.length + abyte4.length);
      bytebuffer.put(abyte1);
      bytebuffer.put(abyte3);
      bytebuffer.put(abyte4);
      Arrays.fill(abyte2, (byte)0);
      return bytebuffer.array();
   }

   public static byte[] ZenithInternal095(byte[] abyte, String s) throws Exception {
      ByteBuffer bytebuffer = ByteBuffer.wrap(abyte);
      byte[] abyte1 = new byte[12];
      bytebuffer.get(abyte1);
      byte[] abyte2 = new byte[12];
      bytebuffer.get(abyte2);
      byte[] abyte3 = new byte[bytebuffer.remaining()];
      bytebuffer.get(abyte3);
      byte[] abyte4 = StringHolder_8(s.toCharArray(), abyte1, 5000, 32);
      SecretKeySpec secretkeyspec = new SecretKeySpec(abyte4, "AES");
      Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
      cipher.init(2, secretkeyspec, new GCMParameterSpec(128, abyte2));
      byte[] abyte5 = cipher.doFinal(abyte3);
      Arrays.fill(abyte4, (byte)0);
      return abyte5;
   }
}
