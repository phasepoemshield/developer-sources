package ru.metaculture.protection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public final class O00000OOO000 implements AutoCloseable {
   private final Map<String, O00000OOO000.W289> O00000000 = new LinkedHashMap<>();
   static int O000000000 = -1;

   public O00000OOO000.W289 O00000000(String string, String string2, String string3) {
      O00000OOO000.W289 var4 = this.O00000000.get(string);
      if (var4 != null) {
         return var4;
      } else {
         O00000OOO000.W289 var5 = new O00000OOO000.W289(O0000O00OO0.O00000000(string2, string3));
         this.O00000000.put(string, var5);
         return var5;
      }
   }

   @Override
   public void close() {
      for (O00000OOO000.W289 var2 : this.O00000000.values()) {
         var2.close();
      }

      this.O00000000.clear();
      O000000000 = -1;
   }

   public void O00000000() {
      O000000000 = -1;
   }

   public static final class W289 implements AutoCloseable {
      private final O0000O00OO0 O00000000;
      private final Map<String, Integer> O000000000 = new HashMap<>();
      private final Map<String, O00000OOO000.W290> O0000000000 = new HashMap<>();

      W289(O0000O00OO0 o0000O00OO0) {
         this.O00000000 = o0000O00OO0;
      }

      public void O00000000() {
         int var1 = this.O00000000.O0000000000();
         if (O00000OOO000.O000000000 != var1 || GL11.glGetInteger(35725) != var1) {
            GL20.glUseProgram(var1);
            O00000OOO000.O000000000 = var1;
         }
      }

      public void O00000000(String string, int i) {
         int var3 = this.O00000000(string);
         if (var3 >= 0 && this.O000000000(string).O00000000(0, i, 0.0F, 0.0F, 0.0F, 0.0F)) {
            GL20.glUniform1i(var3, i);
         }
      }

      public void O00000000(String string, float f) {
         int var3 = this.O00000000(string);
         if (var3 >= 0 && this.O000000000(string).O00000000(1, 0, f, 0.0F, 0.0F, 0.0F)) {
            GL20.glUniform1f(var3, f);
         }
      }

      public void O00000000(String string, float f, float g) {
         int var4 = this.O00000000(string);
         if (var4 >= 0 && this.O000000000(string).O00000000(2, 0, f, g, 0.0F, 0.0F)) {
            GL20.glUniform2f(var4, f, g);
         }
      }

      public void O00000000(String string, float f, float g, float h) {
         int var5 = this.O00000000(string);
         if (var5 >= 0 && this.O000000000(string).O00000000(3, 0, f, g, h, 0.0F)) {
            GL20.glUniform3f(var5, f, g, h);
         }
      }

      public void O00000000(String string, float f, float g, float h, float i) {
         int var6 = this.O00000000(string);
         if (var6 >= 0 && this.O000000000(string).O00000000(4, 0, f, g, h, i)) {
            GL20.glUniform4f(var6, f, g, h, i);
         }
      }

      private int O00000000(String string) {
         return this.O000000000.computeIfAbsent(string, this.O00000000::O00000000);
      }

      private O00000OOO000.W290 O000000000(String string) {
         return this.O0000000000.computeIfAbsent(string, stringx -> new O00000OOO000.W290());
      }

      @Override
      public void close() {
         this.O00000000.O000000000();
         this.O000000000.clear();
         this.O0000000000.clear();
         O00000OOO000.O000000000 = -1;
      }
   }

   static final class W290 {
      private int O00000000 = -1;
      private int O000000000;
      private float O0000000000;
      private float O00000000000;
      private float O000000000000;
      private float O0000000000000;

      boolean O00000000(int i, int j, float f, float g, float h, float k) {
         if (this.O00000000 == i
            && this.O000000000 == j
            && Float.floatToIntBits(this.O0000000000) == Float.floatToIntBits(f)
            && Float.floatToIntBits(this.O00000000000) == Float.floatToIntBits(g)
            && Float.floatToIntBits(this.O000000000000) == Float.floatToIntBits(h)
            && Float.floatToIntBits(this.O0000000000000) == Float.floatToIntBits(k)) {
            return false;
         } else {
            this.O00000000 = i;
            this.O000000000 = j;
            this.O0000000000 = f;
            this.O00000000000 = g;
            this.O000000000000 = h;
            this.O0000000000000 = k;
            return true;
         }
      }
   }
}
