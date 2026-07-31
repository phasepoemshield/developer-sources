package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.SimpleOption;
import net.minecraft.util.math.MathHelper;

public class O0000O00OOO {
   private final double O00000000;
   private final double O000000000;
   private int O0000000000;
   private int O00000000000;
   private static int O000000000000;

   public O0000O00OOO(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         this.O0000000000 = minecraftClient.getWindow().getWidth();
         this.O00000000000 = minecraftClient.getWindow().getHeight();
         O000000000000 = 1;
         boolean var2 = false;

         try {
            SimpleOption var3 = minecraftClient.options.getForceUnicodeFont();
            var2 = var3 != null && Boolean.TRUE.equals(var3.getValue());
         } catch (Exception var4) {
         }

         byte var5 = 2;

         while (O000000000000 < var5 && this.O0000000000 / (O000000000000 + 1) >= 320 && this.O00000000000 / (O000000000000 + 1) >= 240) {
            O000000000000++;
         }

         if (var2 && O000000000000 % 2 != 0 && O000000000000 != 1) {
            O000000000000--;
         }

         this.O00000000 = (double)this.O0000000000 / O000000000000;
         this.O000000000 = (double)this.O00000000000 / O000000000000;
         this.O0000000000 = MathHelper.ceil(this.O00000000);
         this.O00000000000 = MathHelper.ceil(this.O000000000);
      } else {
         this.O0000000000 = 1920;
         this.O00000000000 = 1080;
         O000000000000 = 1;
         this.O00000000 = this.O0000000000;
         this.O000000000 = this.O00000000000;
      }
   }

   public int O00000000() {
      return this.O0000000000;
   }

   public int O000000000() {
      return this.O00000000000;
   }

   public double O0000000000() {
      return this.O00000000;
   }

   public double O00000000000() {
      return this.O000000000;
   }

   public static int O000000000000() {
      return O000000000000;
   }
}
