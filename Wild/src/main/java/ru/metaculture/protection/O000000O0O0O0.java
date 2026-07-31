package ru.metaculture.protection;

import net.minecraft.util.math.MathHelper;

public class O000000O0O0O0 extends O000000O0O0000 {
   private static O000000O0O0O0.W37 O0000000000O00;
   private static O000000O0O0O0.W34 O0000000000O0O;
   public static O000000O0O0O0.W36 O00000000 = O000000O0O0O0.W36.IDLE;
   public static float O000000000;
   public static float O0000000000;
   public static float O00000000000;
   public static float O000000000000;
   public static int O0000000000000;
   public static int O000000000000O;
   public static int O00000000000O;
   public static O000000O0O00OO O00000000000O0;
   public static boolean O00000000000OO;

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void O00000000(O000000O0O0O0.W37 o00000000000, Runnable runnable) {
      O0000000000O00 = o00000000000;
      boolean var4 = false /* VF: Semaphore variable */;

      try {
         var4 = true;
         runnable.run();
         var4 = false;
      } finally {
         if (var4) {
            O0000000000O00 = null;
         }
      }

      O0000000000O00 = null;
   }

   public static boolean O00000000() {
      return !O00000000.equals(O000000O0O0O0.W36.IDLE);
   }

   private void O0000000000() {
      if (O0000000000O0O != null) {
         O000000O0O0O0.W35 var2 = O0000000000O0O.nextStep();
         if (var2 != null && !var2.O00000000000 && var2.O00000000 != null) {
            O00000000(var2.O00000000, var2.O000000000, var2.O0000000000);
         } else {
            this.O000000000();
         }
      } else {
         O000000O0O00OO var1 = new O000000O0O00OO(O000000O0O00O.O0000000000, O000000O0O00O.O00000000000);
         if (O00000000(var1, O00000000000, O000000000000)) {
            this.O000000000();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (O00000000.equals(O000000O0O0O0.W36.AIM) && O00000000000O > O000000000000O) {
         if (O00000000000OO) {
            this.O000000000();
         } else {
            O00000000 = O000000O0O0O0.W36.RESET;
         }
      }

      if (O00000000.equals(O000000O0O0O0.W36.RESET)) {
         this.O0000000000();
      }

      O00000000000O++;
   }

   public static void O00000000(O000000O0O00OO o000000O0O00OO, float f, float g, float h, float i, int j, int k, boolean bl) {
      O000000000(o000000O0O00OO, f, g, h, i, j, k, bl, null);
   }

   public static void O00000000(O000000O0O00OO o000000O0O00OO, float f, float g, float h, float i, int j, int k, boolean bl, O000000O0O0O0.W34 o00000000) {
      O000000000(o000000O0O00OO, f, g, h, i, j, k, bl, o00000000);
   }

   private static void O000000000(O000000O0O00OO o000000O0O00OO, float f, float g, float h, float i, int j, int k, boolean bl, O000000O0O0O0.W34 o00000000) {
      if (O0000000000O00 != null) {
         f = O0000000000O00.O00000000;
         g = O0000000000O00.O000000000;
         h = O0000000000O00.O0000000000;
         i = O0000000000O00.O00000000000;
         bl = O0000000000O00.O000000000000;
      }

      if (O0000000000000 <= k) {
         if (O000000O0O0O.O00000000 && o000000O0O00OO != null) {
            O000000O0O0O.O00000000();
            float var9 = o000000O0O00OO.O00000000 + O000000O0O0O.O000000000;
            float var10 = MathHelper.clamp(
               MathHelper.clamp(o000000O0O00OO.O000000000 + O000000O0O0O.O0000000000, O000000O0O0O.O00000000000, O000000O0O0O.O000000000000), -90.0F, 90.0F
            );
            o000000O0O00OO = new O000000O0O00OO(var9, var10);
         }

         if (bl) {
            O000000O0O00O.O00000000 = false;
            if (a_.player != null) {
               O000000O0O00O.O0000000000 = a_.player.getYaw();
               O000000O0O00O.O00000000000 = a_.player.getPitch();
            }
         } else if (O00000000.equals(O000000O0O0O0.W36.IDLE)) {
            O000000O0O00O.O00000000 = true;
         }

         O000000000 = f;
         O0000000000 = g;
         O00000000000 = h;
         O000000000000 = i;
         O000000000000O = j;
         O0000000000000 = k;
         O00000000 = O000000O0O0O0.W36.AIM;
         O00000000000OO = bl;
         O0000000000O0O = o00000000;
         O00000000000O0 = o000000O0O00OO;
         O00000000(o000000O0O00OO, f, g);
      }
   }

   public static void O00000000(O000000O0O00OO o000000O0O00OO, float f, float g, float h, float i, int j, int k) {
      O00000000(o000000O0O00OO, f, g, h, i, j, k, true);
   }

   public static void O00000000(O000000O0O00OO o000000O0O00OO, float f, float g, int i, int j) {
      O00000000(o000000O0O00OO, f, f, g, g, i, j, false);
   }

   public static void O00000000(O000000O0O0O0.W34 o00000000) {
      if (o00000000 != null && O0000000000O0O == o00000000 && !O00000000.equals(O000000O0O0O0.W36.IDLE)) {
         O00000000 = O000000O0O0O0.W36.RESET;
         O00000000000OO = false;
         O00000000000O = 0;
      }
   }

   public static void O000000000(O000000O0O0O0.W34 o00000000) {
      if (O0000000000O0O == o00000000) {
         O0000000000O0O = null;
      }
   }

   static boolean O00000000(O000000O0O00OO o000000O0O00OO, float f, float g) {
      if (a_.player == null) {
         return false;
      } else {
         O000000O0O00OO var3 = new O000000O0O00OO(a_.player);
         float var4 = O0000O00OO0OO0.O000000000000O(o000000O0O00OO.O00000000 - var3.O00000000);
         float var5 = o000000O0O00OO.O000000000 - var3.O000000000;
         float var6 = Math.min(Math.abs(var4), f);
         float var7 = Math.min(Math.abs(var5), g);
         a_.player.setYaw(a_.player.headYaw = a_.player.headYaw + O000000O0O0.O00000000(MathHelper.clamp(var4, -var6, var6)));
         a_.player.setPitch(MathHelper.clamp(a_.player.getPitch() + O000000O0O0.O00000000(MathHelper.clamp(var5, -var7, var7)), -90.0F, 90.0F));
         O00000000000O = 0;
         return new O000000O0O00OO(a_.player).O00000000(o000000O0O00OO) < 1.0F;
      }
   }

   public void O000000000() {
      O00000000 = O000000O0O0O0.W36.IDLE;
      O0000000000000 = 0;
      O00000000000OO = false;
      O0000000000O0O = null;
      O000000O0O00O.O00000000 = O000000O0O00O.O000000000;
   }

   @FunctionalInterface
   public interface W34 {
      O000000O0O0O0.W35 nextStep();
   }

   public static final class W35 {
      public final O000000O0O00OO O00000000;
      public final float O000000000;
      public final float O0000000000;
      public final boolean O00000000000;

      public W35(O000000O0O00OO o000000O0O00OO, float f, float g, boolean bl) {
         this.O00000000 = o000000O0O00OO;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = bl;
      }

      public static O000000O0O0O0.W35 O00000000() {
         return new O000000O0O0O0.W35(null, 0.0F, 0.0F, true);
      }
   }

   public static enum W36 {
      AIM,
      RESET,
      IDLE;
   }

   public static final class W37 {
      public final float O00000000;
      public final float O000000000;
      public final float O0000000000;
      public final float O00000000000;
      public final boolean O000000000000;

      public W37(float f, float g, float h, float i, boolean bl) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = i;
         this.O000000000000 = bl;
      }
   }
}
