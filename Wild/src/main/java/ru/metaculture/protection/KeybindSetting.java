package ru.metaculture.protection;

import java.util.function.Supplier;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeybindSetting extends Setting {
   public static final int WHEEL_UP = -200;
   public static final int WHEEL_DOWN = -201;
   private static long O000000000OO;
   private static long O00000000O;
   public int O00000000000;
   public String O000000000000;
   public boolean O0000000000000;
   public boolean O000000000000O;
   private final int O00000000000O;
   private final boolean O00000000000O0;

   public KeybindSetting(String string, int i, boolean bl) {
      this.O00000000 = string;
      this.O00000000000 = i;
      this.O0000000000000 = bl;
      this.O00000000000O = i;
      this.O00000000000O0 = bl;
   }

   public KeybindSetting(String string, int i) {
      this(string, i, false);
   }

   public int O0000000000() {
      return this.O00000000000;
   }

   public void O00000000(int i) {
      this.O00000000000 = i;
   }

   public KeybindSetting O00000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   @Override
   public void O000000000() {
      this.O00000000000 = this.O00000000000O;
      this.O0000000000000 = this.O00000000000O0;
      this.O000000000000O = false;
   }

   public static void O0000000000(int i) {
      long var1 = System.currentTimeMillis() + 120L;
      if (i == WHEEL_UP) {
         O000000000OO = var1;
      } else if (i == WHEEL_DOWN) {
         O00000000O = var1;
      }
   }

   public static boolean O000000000(int i) {
      if (MinecraftAccessor.a_.currentScreen != null) {
         return false;
      } else if (i == WHEEL_UP) {
         return System.currentTimeMillis() < O000000000OO;
      } else if (i == WHEEL_DOWN) {
         return System.currentTimeMillis() < O00000000O;
      } else {
         long var1 = MinecraftAccessor.a_.getWindow().getHandle();
         if (i >= 0) {
            return InputUtil.isKeyPressed(var1, i);
         } else if (i <= -100) {
            int var3 = -i - 100;
            return var3 >= 0 && var3 <= 7 && GLFW.glfwGetMouseButton(var1, var3) == 1;
         } else {
            return false;
         }
      }
   }
}
