package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;

public final class O00000O0OOOO0 {
   private final int O00000000;
   private final int O000000000;
   private final List<O00000O0OOOO0.W201> O0000000000;
   private final List<O00000O0OOOO0.W196> O00000000000;
   private float O000000000000 = Float.MAX_VALUE;
   private float O0000000000000 = Float.MAX_VALUE;
   private float O000000000000O = Float.MAX_VALUE;
   private float O00000000000O = -Float.MAX_VALUE;
   private float O00000000000O0 = -Float.MAX_VALUE;
   private float O00000000000OO = -Float.MAX_VALUE;
   private boolean O0000000000O;

   public O00000O0OOOO0(int i, int j, List<O00000O0OOOO0.W201> list, List<O00000O0OOOO0.W196> list2) {
      this.O00000000 = Math.max(1, i);
      this.O000000000 = Math.max(1, j);
      this.O0000000000 = (List<O00000O0OOOO0.W201>)(list == null ? new ArrayList<>() : list);
      this.O00000000000 = (List<O00000O0OOOO0.W196>)(list2 == null ? new ArrayList<>() : list2);
   }

   public int O00000000() {
      return this.O00000000;
   }

   public int O000000000() {
      return this.O000000000;
   }

   public List<O00000O0OOOO0.W201> O0000000000() {
      return this.O0000000000;
   }

   public List<O00000O0OOOO0.W196> O00000000000() {
      return this.O00000000000;
   }

   public O00000O0OOOO0.W201 O00000000(int i) {
      if (i >= 0 && i < this.O0000000000.size()) {
         return this.O0000000000.get(i);
      } else {
         return this.O0000000000.isEmpty() ? null : this.O0000000000.get(0);
      }
   }

   public float O000000000000() {
      this.O0000000000O0O();
      return this.O0000000000000;
   }

   public float O0000000000000() {
      this.O0000000000O0O();
      return this.O00000000000O0;
   }

   public float O000000000000O() {
      this.O0000000000O0O();
      return (this.O000000000000 + this.O00000000000O) * 0.5F;
   }

   public float O00000000000O() {
      this.O0000000000O0O();
      return (this.O0000000000000 + this.O00000000000O0) * 0.5F;
   }

   public float O00000000000O0() {
      this.O0000000000O0O();
      return (this.O000000000000O + this.O00000000000OO) * 0.5F;
   }

   public float O00000000000OO() {
      this.O0000000000O0O();
      float var1 = this.O00000000000O0 - this.O0000000000000;
      return var1 <= 0.0F ? 32.0F : var1;
   }

   public int O0000000000O() {
      int[] var1 = new int[]{0};

      for (O00000O0OOOO0.W196 var3 : this.O00000000000) {
         this.O00000000(var3, var1);
      }

      return var1[0];
   }

   private void O00000000(O00000O0OOOO0.W196 o00000000, int[] is) {
      is[0] += o00000000.O00000000000OO().size();

      for (O00000O0OOOO0.W196 var4 : o00000000.O00000000000O0()) {
         this.O00000000(var4, is);
      }
   }

   public float O0000000000O0() {
      this.O0000000000O0O();
      float var1 = this.O00000000000O - this.O000000000000;
      return var1 <= 0.0F ? 16.0F : var1;
   }

   public float O0000000000O00() {
      this.O0000000000O0O();
      float var1 = this.O00000000000OO - this.O000000000000O;
      return var1 <= 0.0F ? 16.0F : var1;
   }

   private void O0000000000O0O() {
      if (!this.O0000000000O) {
         this.O0000000000O = true;

         for (O00000O0OOOO0.W196 var2 : this.O00000000000) {
            this.O00000000(var2);
         }

         if (this.O0000000000000 > this.O00000000000O0) {
            this.O000000000000 = this.O0000000000000 = this.O000000000000O = 0.0F;
            this.O00000000000O = this.O00000000000O0 = this.O00000000000OO = 32.0F;
         }
      }
   }

   private void O00000000(O00000O0OOOO0.W196 o00000000) {
      for (O00000O0OOOO0.W197 var3 : o00000000.O00000000000OO()) {
         this.O00000000(var3.O00000000(), var3.O000000000(), var3.O0000000000());
         this.O00000000(var3.O00000000000(), var3.O000000000000(), var3.O0000000000000());
      }

      for (O00000O0OOOO0.W199 var8 : o00000000.O0000000000O()) {
         float[] var4 = var8.O000000000000O();

         for (byte var5 = 0; var5 + 2 < var4.length; var5 += 3) {
            this.O00000000(var8.O00000000() + var4[var5], var8.O000000000() + var4[var5 + 1], var8.O0000000000() + var4[var5 + 2]);
         }
      }

      for (O00000O0OOOO0.W196 var9 : o00000000.O00000000000O0()) {
         this.O00000000(var9);
      }
   }

   private void O00000000(float f, float g, float h) {
      if (f < this.O000000000000) {
         this.O000000000000 = f;
      }

      if (g < this.O0000000000000) {
         this.O0000000000000 = g;
      }

      if (h < this.O000000000000O) {
         this.O000000000000O = h;
      }

      if (f > this.O00000000000O) {
         this.O00000000000O = f;
      }

      if (g > this.O00000000000O0) {
         this.O00000000000O0 = g;
      }

      if (h > this.O00000000000OO) {
         this.O00000000000OO = h;
      }
   }

   public static final class W196 {
      private final String O00000000;
      private final float O000000000;
      private final float O0000000000;
      private final float O00000000000;
      private final float O000000000000;
      private final float O0000000000000;
      private final float O000000000000O;
      private final List<O00000O0OOOO0.W196> O00000000000O = new ArrayList<>();
      private final List<O00000O0OOOO0.W197> O00000000000O0 = new ArrayList<>();
      private final List<O00000O0OOOO0.W199> O00000000000OO = new ArrayList<>();

      public W196(String string, float f, float g, float h, float i, float j, float k) {
         this.O00000000 = string == null ? "" : string;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = h;
         this.O000000000000 = i;
         this.O0000000000000 = j;
         this.O000000000000O = k;
      }

      public String O00000000() {
         return this.O00000000;
      }

      public float O000000000() {
         return this.O000000000;
      }

      public float O0000000000() {
         return this.O0000000000;
      }

      public float O00000000000() {
         return this.O00000000000;
      }

      public float O000000000000() {
         return this.O000000000000;
      }

      public float O0000000000000() {
         return this.O0000000000000;
      }

      public float O000000000000O() {
         return this.O000000000000O;
      }

      public boolean O00000000000O() {
         return this.O000000000000 != 0.0F || this.O0000000000000 != 0.0F || this.O000000000000O != 0.0F;
      }

      public List<O00000O0OOOO0.W196> O00000000000O0() {
         return this.O00000000000O;
      }

      public List<O00000O0OOOO0.W197> O00000000000OO() {
         return this.O00000000000O0;
      }

      public List<O00000O0OOOO0.W199> O0000000000O() {
         return this.O00000000000OO;
      }
   }

   public static final class W197 {
      private final float O00000000;
      private final float O000000000;
      private final float O0000000000;
      private final float O00000000000;
      private final float O000000000000;
      private final float O0000000000000;
      private final float O000000000000O;
      private final float O00000000000O;
      private final float O00000000000O0;
      private final float O00000000000OO;
      private final float O0000000000O;
      private final float O0000000000O0;
      private final float O0000000000O00;
      private final O00000O0OOOO0.W198[] O0000000000O0O;

      public W197(
         float f, float g, float h, float i, float j, float k, float l, float m, float n, float o, float p, float q, float r, O00000O0OOOO0.W198[] o0000000000s
      ) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = i;
         this.O000000000000 = j;
         this.O0000000000000 = k;
         this.O000000000000O = l;
         this.O00000000000O = m;
         this.O00000000000O0 = n;
         this.O00000000000OO = o;
         this.O0000000000O = p;
         this.O0000000000O0 = q;
         this.O0000000000O00 = r;
         this.O0000000000O0O = o0000000000s;
      }

      public float O00000000() {
         return this.O00000000;
      }

      public float O000000000() {
         return this.O000000000;
      }

      public float O0000000000() {
         return this.O0000000000;
      }

      public float O00000000000() {
         return this.O00000000000;
      }

      public float O000000000000() {
         return this.O000000000000;
      }

      public float O0000000000000() {
         return this.O0000000000000;
      }

      public float O000000000000O() {
         return this.O000000000000O;
      }

      public float O00000000000O() {
         return this.O00000000000O;
      }

      public float O00000000000O0() {
         return this.O00000000000O0;
      }

      public float O00000000000OO() {
         return this.O00000000000OO;
      }

      public float O0000000000O() {
         return this.O0000000000O;
      }

      public float O0000000000O0() {
         return this.O0000000000O0;
      }

      public float O0000000000O00() {
         return this.O0000000000O00;
      }

      public boolean O0000000000O0O() {
         return this.O00000000000OO != 0.0F || this.O0000000000O != 0.0F || this.O0000000000O0 != 0.0F;
      }

      public O00000O0OOOO0.W198 O00000000(int i) {
         return i >= 0 && i < this.O0000000000O0O.length ? this.O0000000000O0O[i] : null;
      }
   }

   public static final class W198 {
      private final int O00000000;
      private final float O000000000;
      private final float O0000000000;
      private final float O00000000000;
      private final float O000000000000;

      public W198(int i, float f, float g, float h, float j) {
         this.O00000000 = i;
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = h;
         this.O000000000000 = j;
      }

      public int O00000000() {
         return this.O00000000;
      }

      public float O000000000() {
         return this.O000000000;
      }

      public float O0000000000() {
         return this.O0000000000;
      }

      public float O00000000000() {
         return this.O00000000000;
      }

      public float O000000000000() {
         return this.O000000000000;
      }
   }

   public static final class W199 {
      private final float O00000000;
      private final float O000000000;
      private final float O0000000000;
      private final float O00000000000;
      private final float O000000000000;
      private final float O0000000000000;
      private final float[] O000000000000O;
      private final O00000O0OOOO0.W200[] O00000000000O;

      public W199(float f, float g, float h, float i, float j, float k, float[] fs, O00000O0OOOO0.W200[] o000000000000s) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = i;
         this.O000000000000 = j;
         this.O0000000000000 = k;
         this.O000000000000O = fs;
         this.O00000000000O = o000000000000s;
      }

      public float O00000000() {
         return this.O00000000;
      }

      public float O000000000() {
         return this.O000000000;
      }

      public float O0000000000() {
         return this.O0000000000;
      }

      public float O00000000000() {
         return this.O00000000000;
      }

      public float O000000000000() {
         return this.O000000000000;
      }

      public float O0000000000000() {
         return this.O0000000000000;
      }

      public float[] O000000000000O() {
         return this.O000000000000O;
      }

      public O00000O0OOOO0.W200[] O00000000000O() {
         return this.O00000000000O;
      }

      public boolean O00000000000O0() {
         return this.O00000000000 != 0.0F || this.O000000000000 != 0.0F || this.O0000000000000 != 0.0F;
      }

      public float O00000000(int i) {
         return this.O000000000000O[i * 3];
      }

      public float O000000000(int i) {
         return this.O000000000000O[i * 3 + 1];
      }

      public float O0000000000(int i) {
         return this.O000000000000O[i * 3 + 2];
      }
   }

   public static final class W200 {
      private final int O00000000;
      private final int[] O000000000;
      private final float[] O0000000000;
      private final float[] O00000000000;
      private final int O000000000000;

      public W200(int i, int[] is, float[] fs, float[] gs, int j) {
         this.O00000000 = i;
         this.O000000000 = is;
         this.O0000000000 = fs;
         this.O00000000000 = gs;
         this.O000000000000 = j;
      }

      public int O00000000() {
         return this.O00000000;
      }

      public int O00000000(int i) {
         return this.O000000000[i];
      }

      public float O000000000(int i) {
         return this.O0000000000[i];
      }

      public float O0000000000(int i) {
         return this.O00000000000[i];
      }

      public int O000000000() {
         return this.O000000000000;
      }
   }

   public static final class W201 {
      private final String O00000000;
      private final byte[] O000000000;
      private final int O0000000000;
      private final int O00000000000;

      public W201(String string, byte[] bs, int i, int j) {
         this.O00000000 = string == null ? "texture" : string;
         this.O000000000 = bs == null ? new byte[0] : bs;
         this.O0000000000 = Math.max(1, i);
         this.O00000000000 = Math.max(1, j);
      }

      public String O00000000() {
         return this.O00000000;
      }

      public byte[] O000000000() {
         return this.O000000000;
      }

      public int O0000000000() {
         return this.O0000000000;
      }

      public int O00000000000() {
         return this.O00000000000;
      }
   }
}
