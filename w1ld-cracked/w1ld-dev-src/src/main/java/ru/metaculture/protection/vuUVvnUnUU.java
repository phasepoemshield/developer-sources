package ru.metaculture.protection;

import it.unimi.dsi.fastutil.objects.Reference2ByteOpenHashMap;
import java.util.function.Predicate;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2591;
import net.minecraft.class_2680;

public final class vuUVvnUnUU {
   public static final int UuUVuuUu = 0;
   public static final int C00OOC00oO = 1;
   public static final int uUnuvNvvNU = 2;
   public static final int vVvUvVVuuNvV = 3;
   public static final int uNNnnnuuuN = 4;
   public static final int nuUnNvnuUu = 5;
   public static final int VVuuUN = 6;
   public static final int vNUvnnVnUvu = 7;
   public static final int uVUuuVnNVU = 8;
   public static final int vuuuNvNuv = 9;
   public static final int nvUVNnuu = 10;
   public static final int UuuNnUvUuv = 11;
   public static final int nUUVuvU = 12;
   public static final int UnUNVVVNuv = 13;
   public static final int vNVuvnUUnuUn = 14;
   public static final int UvnvNVnnnnNU = 15;
   public static final int uVUVnuvnuVuv = 16;
   public static final int NVNnnvnuunNv = 17;
   public static final int uVunuUNVVUUV = 18;
   public static final int UNnVVNvvnVvU = 19;
   public static final int uNnUnnuNUnNu = 20;
   public static final int NnUuNNU = 21;
   public static final int nNvNUVU = 22;
   public static final int UnUNuUU = 12;
   public static final int uUVuVvuNUvnu = 4190208;
   public static final int UvUvUNuvNU = 4095;
   private static final byte c0oOOCcCoC0 = -1;
   private static final Reference2ByteOpenHashMap<class_2248> VVnVNnunVvu = new Reference2ByteOpenHashMap();
   private static final Reference2ByteOpenHashMap<class_2591<?>> unNNVVNnvvV = new Reference2ByteOpenHashMap();
   private static final class_2591<?>[] NuunnvnN = new class_2591[12];
   private static final int[] NVUunUNUN = new int[22];
   private static final Predicate<class_2680> UUVNuUNUvUnV = var0 -> VVnVNnunVvu.getByte(var0.method_26204()) != -1;

   private vuUVvnUnUU() {
   }

   private static void UuUVuuUu(class_2248 var0, int var1) {
      VVnVNnunVvu.put(var0, (byte)var1);
   }

   private static void UuUVuuUu(class_2591<?> var0, int var1) {
      unNNVVNnvvV.put(var0, (byte)var1);
      NuunnvnN[var1] = var0;
   }

   public static class_2591<?> UuUVuuUu(int var0) {
      return var0 >= 0 && var0 < NuunnvnN.length ? NuunnvnN[var0] : null;
   }

   public static Predicate<class_2680> UuUVuuUu() {
      return UUVNuUNUvUnV;
   }

   public static int UuUVuuUu(class_2680 var0) {
      return VVnVNnunVvu.getByte(var0.method_26204());
   }

   public static int UuUVuuUu(class_2591<?> var0) {
      return unNNVVNnvvV.getByte(var0);
   }

   public static int C00OOC00oO(int var0) {
      return NVUunUNUN[var0];
   }

   static {
      VVnVNnunVvu.defaultReturnValue((byte)-1);
      unNNVVNnvvV.defaultReturnValue((byte)-1);
      UuUVuuUu(class_2246.field_10418, 12);
      UuUVuuUu(class_2246.field_29219, 12);
      UuUVuuUu(class_2246.field_10212, 13);
      UuUVuuUu(class_2246.field_29027, 13);
      UuUVuuUu(class_2246.field_10571, 14);
      UuUVuuUu(class_2246.field_29026, 14);
      UuUVuuUu(class_2246.field_23077, 14);
      UuUVuuUu(class_2246.field_27120, 15);
      UuUVuuUu(class_2246.field_29221, 15);
      UuUVuuUu(class_2246.field_10090, 16);
      UuUVuuUu(class_2246.field_29028, 16);
      UuUVuuUu(class_2246.field_10080, 17);
      UuUVuuUu(class_2246.field_29030, 17);
      UuUVuuUu(class_2246.field_10442, 18);
      UuUVuuUu(class_2246.field_29029, 18);
      UuUVuuUu(class_2246.field_10013, 19);
      UuUVuuUu(class_2246.field_29220, 19);
      UuUVuuUu(class_2246.field_10213, 20);
      UuUVuuUu(class_2246.field_22109, 21);
      UuUVuuUu(class_2591.field_11914, 0);
      UuUVuuUu(class_2591.field_11891, 1);
      UuUVuuUu(class_2591.field_11901, 2);
      UuUVuuUu(class_2591.field_11889, 3);
      UuUVuuUu(class_2591.field_16411, 4);
      UuUVuuUu(class_2591.field_11888, 5);
      UuUVuuUu(class_2591.field_11887, 6);
      UuUVuuUu(class_2591.field_11899, 7);
      UuUVuuUu(class_2591.field_11903, 8);
      UuUVuuUu(class_2591.field_11896, 9);
      UuUVuuUu(class_2591.field_42781, 10);
      UuUVuuUu(class_2591.field_42780, 11);
      NVUunUNUN[12] = 2368548;
      NVUunUNUN[13] = 14200728;
      NVUunUNUN[14] = 16766720;
      NVUunUNUN[15] = 13137226;
      NVUunUNUN[16] = 2647255;
      NVUunUNUN[17] = 14818075;
      NVUunUNUN[18] = 5629672;
      NVUunUNUN[19] = 2545261;
      NVUunUNUN[20] = 15787216;
      NVUunUNUN[21] = 9128501;
   }
}
