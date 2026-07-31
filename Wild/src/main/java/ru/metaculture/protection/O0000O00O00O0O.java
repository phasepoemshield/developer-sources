package ru.metaculture.protection;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;

public final class O0000O00O00O0O {
   private static final double O00000000 = 1.0E-7;
   private static volatile boolean O000000000 = false;
   private static volatile double O0000000000 = 0.0;
   private static volatile double O00000000000 = 0.0;
   private static volatile double O000000000000 = 0.0;
   private static volatile float O0000000000000 = 0.0F;
   private static volatile boolean O000000000000O = true;
   private static volatile boolean O00000000000O = false;
   private static volatile boolean O00000000000O0 = false;
   private static volatile float O00000000000OO = 0.0F;
   private static volatile float O0000000000O = 0.0F;
   private static volatile double O0000000000O0 = 0.0;
   private static volatile double O0000000000O00 = 0.0;
   private static volatile boolean O0000000000O0O = false;
   private static volatile long O0000000000OO = 0L;
   private static volatile long O0000000000OO0 = 0L;
   private static volatile long O0000000000OOO = 0L;

   private O0000O00O00O0O() {
   }

   public static void O00000000(Packet<?> packet) {
      if (packet instanceof ClientCommandC2SPacket var9) {
         O00000000(var9);
         O0000000000OO = System.currentTimeMillis();
      } else if (packet instanceof PlayerMoveC2SPacket var1) {
         boolean var2 = var1.isOnGround();
         if (var1.changesLook()) {
            O00000000000OO = var1.getYaw(O00000000000OO);
            O0000000000O = var1.getPitch(O0000000000O);
            O00000000000O0 = true;
            O0000000000OOO = System.currentTimeMillis();
         }

         if (var1.changesPosition()) {
            double var3 = var1.getX(O0000000000);
            double var5 = var1.getY(O00000000000);
            double var7 = var1.getZ(O000000000000);
            O00000000(var3, var5, var7, var2);
         } else {
            O000000000(var2);
         }

         O0000000000OO = System.currentTimeMillis();
      }
   }

   public static void O000000000(Packet<?> packet) {
      if (packet instanceof GameJoinS2CPacket || packet instanceof PlayerRespawnS2CPacket) {
         O0000000000O0();
      }
   }

   private static void O00000000(ClientCommandC2SPacket clientCommandC2SPacket) {
      Mode var1 = clientCommandC2SPacket.getMode();
      if (var1 == Mode.START_SPRINTING) {
         O00000000000O = true;
         O0000000000OO0 = System.currentTimeMillis();
      } else {
         if (var1 == Mode.STOP_SPRINTING) {
            O00000000000O = false;
            O0000000000OO0 = System.currentTimeMillis();
         }
      }
   }

   private static void O00000000(double d, double e, double f, boolean bl) {
      if (!O000000000) {
         O000000000 = true;
         O0000000000 = d;
         O00000000000 = e;
         O000000000000 = f;
         O000000000000O = bl;
         O0000000000000 = 0.0F;
         O0000000000O0 = 0.0;
         O0000000000O00 = 0.0;
         O0000000000O0O = false;
      } else {
         double var7 = e - O00000000000;
         O0000000000O00 = O0000000000O0;
         O0000000000O0 = var7;
         O0000000000O0O = !bl && O0000000000O00 > 1.0E-7 && var7 < -1.0E-7;
         if (bl) {
            O0000000000000 = 0.0F;
         } else if (var7 < -1.0E-7) {
            O0000000000000 += (float)(-var7);
         }

         O0000000000 = d;
         O00000000000 = e;
         O000000000000 = f;
         O000000000000O = bl;
      }
   }

   private static void O000000000(boolean bl) {
      O000000000000O = bl;
      if (bl) {
         O0000000000000 = 0.0F;
         O0000000000O0O = false;
      }
   }

   public static float O00000000() {
      return O0000000000000;
   }

   public static boolean O000000000() {
      return O000000000000O;
   }

   public static boolean O0000000000() {
      return O00000000000O;
   }

   public static boolean O00000000000() {
      return O00000000000O0;
   }

   public static float O00000000(float f) {
      return O00000000000O0 ? O00000000000OO : f;
   }

   public static float O000000000(float f) {
      return O00000000000O0 ? O0000000000O : f;
   }

   public static void O00000000(boolean bl) {
      O00000000000O = bl;
      O0000000000OO0 = System.currentTimeMillis();
   }

   public static double O000000000000() {
      return O0000000000O0;
   }

   public static double O0000000000000() {
      return O0000000000O00;
   }

   public static boolean O000000000000O() {
      return O0000000000O0O;
   }

   public static long O00000000000O() {
      return O0000000000OO;
   }

   public static long O00000000000O0() {
      return O0000000000OO0;
   }

   public static long O00000000000OO() {
      return O0000000000OOO;
   }

   public static boolean O0000000000O() {
      return O000000000;
   }

   public static void O0000000000O0() {
      O000000000 = false;
      O0000000000 = 0.0;
      O00000000000 = 0.0;
      O000000000000 = 0.0;
      O0000000000000 = 0.0F;
      O000000000000O = true;
      O00000000000O = false;
      O00000000000O0 = false;
      O00000000000OO = 0.0F;
      O0000000000O = 0.0F;
      O0000000000O0 = 0.0;
      O0000000000O00 = 0.0;
      O0000000000O0O = false;
      O0000000000OO = 0L;
      O0000000000OO0 = 0L;
      O0000000000OOO = 0L;
   }
}
