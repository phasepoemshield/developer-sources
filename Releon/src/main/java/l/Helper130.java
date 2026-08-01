package l;

public class Helper130 {
   public Helper130() {
   }

   public static float[] method1067(int var0) {
      return new float[]{(var0 >> 16 & 0xFF) / 255.0F, (var0 >> 8 & 0xFF) / 255.0F, (var0 & 0xFF) / 255.0F, (var0 >> 24 & 0xFF) / 255.0F};
   }

   public static int method1068(int var0, int var1, int var2, int var3) {
      return var3 << 24 | var0 << 16 | var1 << 8 | var2;
   }

   public static int method1069(int var0, int var1, int var2) {
      return 0xFF000000 | var0 << 16 | var1 << 8 | var2;
   }

   public static int method1070(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int method1071(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int method1072(int var0) {
      return var0 & 0xFF;
   }

   public static int method1073(int var0) {
      return var0 >> 24 & 0xFF;
   }
}
