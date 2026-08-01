package ru.metaculture.protection;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.NamedParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class O00000000OOO0 {
   private static final byte[] O00000000 = new byte[]{87, 83, 78, 49};
   private static final byte[] O000000000 = "WildSnap-v1".getBytes(StandardCharsets.UTF_8);
   private static final byte[] O0000000000 = "wildsnap/aes-gcm".getBytes(StandardCharsets.UTF_8);
   private static final String O00000000000 = "MCowBQYDK2VuAyEAKimzdBToBe4IjoYMuCYjJrr36rpeC+pSXoyJ9NSdR38=";
   private static final SecureRandom O000000000000 = new SecureRandom();

   private O00000000OOO0() {
   }

   public static byte[] O00000000(byte[] bs) throws Exception {
      KeyFactory var1 = KeyFactory.getInstance("X25519");
      PublicKey var2 = var1.generatePublic(new X509EncodedKeySpec(Base64.getDecoder().decode("MCowBQYDK2VuAyEAKimzdBToBe4IjoYMuCYjJrr36rpeC+pSXoyJ9NSdR38=")));
      return O00000000(bs, var2);
   }

   static byte[] O00000000(byte[] bs, PublicKey publicKey) throws Exception {
      KeyPairGenerator var2 = KeyPairGenerator.getInstance("X25519");
      var2.initialize(NamedParameterSpec.X25519);
      KeyPair var3 = var2.generateKeyPair();
      KeyAgreement var4 = KeyAgreement.getInstance("X25519");
      var4.init(var3.getPrivate());
      var4.doPhase(publicKey, true);
      byte[] var5 = var4.generateSecret();
      byte[] var6 = O000000000(var5, var3.getPublic().getEncoded());
      byte[] var7 = new byte[12];
      O000000000000.nextBytes(var7);
      Cipher var8 = Cipher.getInstance("AES/GCM/NoPadding");
      var8.init(1, new SecretKeySpec(var6, "AES"), new GCMParameterSpec(128, var7));
      byte[] var9 = var8.doFinal(bs);
      ByteArrayOutputStream var10 = new ByteArrayOutputStream(var9.length + 128);
      var10.writeBytes(O00000000);
      O00000000(var10, var3.getPublic().getEncoded().length);
      var10.writeBytes(var3.getPublic().getEncoded());
      var10.write(var7.length);
      var10.writeBytes(var7);
      O000000000(var10, var9.length);
      var10.writeBytes(var9);
      Arrays.fill(var5, (byte)0);
      Arrays.fill(var6, (byte)0);
      return var10.toByteArray();
   }

   public static byte[] O00000000(byte[] bs, byte[] cs) throws Exception {
      ByteBuffer var2 = ByteBuffer.wrap(bs);

      for (byte var6 : O00000000) {
         if (var2.get() != var6) {
            throw new IllegalArgumentException("bad wildsnap magic");
         }
      }

      int var17 = Short.toUnsignedInt(var2.getShort());
      byte[] var18 = new byte[var17];
      var2.get(var18);
      int var19 = Byte.toUnsignedInt(var2.get());
      byte[] var20 = new byte[var19];
      var2.get(var20);
      int var7 = var2.getInt();
      byte[] var8 = new byte[var7];
      var2.get(var8);
      KeyFactory var9 = KeyFactory.getInstance("X25519");
      PublicKey var10 = var9.generatePublic(new X509EncodedKeySpec(var18));
      PrivateKey var11 = var9.generatePrivate(new PKCS8EncodedKeySpec(cs));
      KeyAgreement var12 = KeyAgreement.getInstance("X25519");
      var12.init(var11);
      var12.doPhase(var10, true);
      byte[] var13 = var12.generateSecret();
      byte[] var14 = O000000000(var13, var18);
      Cipher var15 = Cipher.getInstance("AES/GCM/NoPadding");
      var15.init(2, new SecretKeySpec(var14, "AES"), new GCMParameterSpec(128, var20));
      byte[] var16 = var15.doFinal(var8);
      Arrays.fill(var13, (byte)0);
      Arrays.fill(var14, (byte)0);
      return var16;
   }

   private static byte[] O000000000(byte[] bs, byte[] cs) throws Exception {
      Mac var2 = Mac.getInstance("HmacSHA256");
      var2.init(new SecretKeySpec(O000000000, "HmacSHA256"));
      byte[] var3 = var2.doFinal(bs);
      var2.init(new SecretKeySpec(var3, "HmacSHA256"));
      var2.update(O0000000000);
      var2.update(cs);
      var2.update((byte)1);
      byte[] var4 = var2.doFinal();
      Arrays.fill(var3, (byte)0);
      return Arrays.copyOf(var4, 32);
   }

   private static void O00000000(ByteArrayOutputStream byteArrayOutputStream, int i) {
      byteArrayOutputStream.write(i >>> 8 & 0xFF);
      byteArrayOutputStream.write(i & 0xFF);
   }

   private static void O000000000(ByteArrayOutputStream byteArrayOutputStream, int i) {
      byteArrayOutputStream.write(i >>> 24 & 0xFF);
      byteArrayOutputStream.write(i >>> 16 & 0xFF);
      byteArrayOutputStream.write(i >>> 8 & 0xFF);
      byteArrayOutputStream.write(i & 0xFF);
   }
}
