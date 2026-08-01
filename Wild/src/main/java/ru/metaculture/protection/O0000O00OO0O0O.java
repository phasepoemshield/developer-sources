package ru.metaculture.protection;

import java.util.ArrayDeque;
import java.util.Arrays;

public final class O0000O00OO0O0O {
   private final ArrayDeque<float[]> O00000000 = new ArrayDeque<>();

   public O0000O00OO0O0O() {
      this.O000000000();
   }

   public void O00000000() {
      this.O00000000.clear();
      this.O000000000();
   }

   public void O000000000() {
      this.O00000000.push(new float[]{1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F});
   }

   public void O00000000(float f) {
      float var2 = (float)Math.toRadians(f);
      float var3 = (float)Math.cos(var2);
      float var4 = (float)Math.sin(var2);
      float[] var5 = new float[]{var3, -var4, 0.0F, var4, var3, 0.0F, 0.0F, 0.0F, 1.0F};
      float[] var6 = this.O00000000.peek();
      this.O00000000.push(O00000000(var6, var5));
   }

   public void O00000000(float f, float g) {
      float[] var3 = new float[]{1.0F, 0.0F, f, 0.0F, 1.0F, g, 0.0F, 0.0F, 1.0F};
      float[] var4 = this.O00000000.peek();
      this.O00000000.push(O00000000(var4, var3));
   }

   public void O000000000(float f, float g) {
      this.O00000000(-f, -g);
   }

   public void O00000000(float f, float g, float h, float i) {
      float var5 = h - h * f;
      float var6 = i - i * g;
      float[] var7 = new float[]{f, 0.0F, var5, 0.0F, g, var6, 0.0F, 0.0F, 1.0F};
      float[] var8 = this.O00000000.peek();
      this.O00000000.push(O00000000(var8, var7));
   }

   public void O00000000(float f, float g, float h) {
      this.O00000000(f, f, g, h);
   }

   public void O00000000(float[] fs) {
      if (fs != null && fs.length == 9) {
         for (float var5 : fs) {
            if (!Float.isFinite(var5)) {
               throw new IllegalArgumentException("matrix entries must be finite");
            }
         }

         this.O00000000.push(O00000000(this.O00000000.peek(), fs));
      } else {
         throw new IllegalArgumentException("matrix must have length 9");
      }
   }

   public void O000000000(float[] fs) {
      if (fs == null) {
         throw new IllegalArgumentException("matrix must not be null");
      } else if (fs.length != 9) {
         throw new IllegalArgumentException("matrix must have length 9");
      } else {
         for (float var5 : fs) {
            if (!Float.isFinite(var5)) {
               throw new IllegalArgumentException("matrix entries must be finite");
            }
         }

         if (this.O00000000.isEmpty()) {
            throw new IllegalStateException("cannot replace top matrix on an empty stack");
         } else {
            float[] var6 = Arrays.copyOf(fs, fs.length);
            this.O00000000.pop();
            this.O00000000.push(var6);
         }
      }
   }

   public ArrayDeque<float[]> O0000000000() {
      ArrayDeque var1 = new ArrayDeque();

      for (float[] var3 : this.O00000000) {
         var1.addLast(Arrays.copyOf(var3, var3.length));
      }

      return var1;
   }

   public void O00000000(ArrayDeque<float[]> arrayDeque) {
      this.O00000000.clear();
      if (arrayDeque != null) {
         for (float[] var3 : arrayDeque) {
            if (var3 != null && var3.length == 9) {
               this.O00000000.addLast(Arrays.copyOf(var3, var3.length));
            }
         }
      }

      if (this.O00000000.isEmpty()) {
         this.O000000000();
      }
   }

   public void O00000000000() {
      if (this.O00000000.size() > 1) {
         this.O00000000.pop();
      }
   }

   public void O00000000(int i) {
      for (int var2 = 0; var2 < i; var2++) {
         if (this.O00000000.size() > 1) {
            this.O00000000.pop();
         }
      }
   }

   public float[] O000000000000() {
      return this.O00000000.peek();
   }

   private static float[] O00000000(float[] fs, float[] gs) {
      return new float[]{
         fs[0] * gs[0] + fs[1] * gs[3] + fs[2] * gs[6],
         fs[0] * gs[1] + fs[1] * gs[4] + fs[2] * gs[7],
         fs[0] * gs[2] + fs[1] * gs[5] + fs[2] * gs[8],
         fs[3] * gs[0] + fs[4] * gs[3] + fs[5] * gs[6],
         fs[3] * gs[1] + fs[4] * gs[4] + fs[5] * gs[7],
         fs[3] * gs[2] + fs[4] * gs[5] + fs[5] * gs[8],
         fs[6] * gs[0] + fs[7] * gs[3] + fs[8] * gs[6],
         fs[6] * gs[1] + fs[7] * gs[4] + fs[8] * gs[7],
         fs[6] * gs[2] + fs[7] * gs[5] + fs[8] * gs[8]
      };
   }
}
