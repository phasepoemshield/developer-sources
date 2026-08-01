package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

public class O0000O000OOO {
   private final double O00000000;
   private final double O000000000;
   private int O0000000000;
   private int O00000000000;
   private static int O000000000000;

   public O0000O000OOO(MinecraftClient minecraftClient) {
      this.O0000000000 = minecraftClient.getWindow().getWidth();
      this.O00000000000 = minecraftClient.getWindow().getHeight();
      O000000000000 = 1;
      short var2 = 2;
      if (var2 == 0) {
         var2 = 1000;
      }

      while (O000000000000 < var2 && this.O0000000000 / (O000000000000 + 1) >= 320 && this.O00000000000 / (O000000000000 + 1) >= 240) {
         O000000000000++;
      }

      this.O00000000 = (double)this.O0000000000 / O000000000000;
      this.O000000000 = (double)this.O00000000000 / O000000000000;
      this.O0000000000 = MathHelper.ceil(this.O00000000);
      this.O00000000000 = MathHelper.ceil(this.O000000000);
   }

   public int O00000000() {
      return this.O0000000000;
   }

   public int O000000000() {
      return this.O00000000000;
   }

   public int O0000000000() {
      return this.O0000000000;
   }

   public int O00000000000() {
      return this.O00000000000;
   }

   public double O000000000000() {
      return this.O00000000;
   }

   public double O0000000000000() {
      return this.O000000000;
   }

   public static int O000000000000O() {
      return O000000000000;
   }
}
