package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class O0000O00O0O000 {
   public static final float O00000000 = 240.0F;
   public static final float O000000000 = 0.004166667F;
   public static final int O0000000000 = 60;
   private static final float O00000000000 = 1.0E-4F;
   private static final float O000000000000 = 0.016666668F;
   private static final float O0000000000000 = 0.1F;
   private static final O0000O00O0O000 O000000000000O = new O0000O00O0O000();
   private final Object O00000000000O = new Object();
   private final List<O0000O00O0O000.W369> O00000000000O0 = new ArrayList<>();
   private long O00000000000OO = System.nanoTime();
   private float O0000000000O = 0.016666668F;
   private long O0000000000O0 = 0L;

   private O0000O00O0O000() {
   }

   public static O0000O00O0O000 O00000000() {
      return O000000000000O;
   }

   public void O000000000() {
      long var1 = System.nanoTime();
      long var3 = var1 - this.O00000000000OO;
      this.O00000000000OO = var1;
      if (var3 < 0L) {
         var3 = 0L;
      }

      float var5 = (float)var3 / 1.0E9F;
      if (var5 < 1.0E-4F) {
         var5 = 1.0E-4F;
      } else if (var5 > 0.1F) {
         var5 = 0.016666668F;
      }

      this.O0000000000O = var5;
      this.O0000000000O0++;
      synchronized (this.O00000000000O) {
         if (!this.O00000000000O0.isEmpty()) {
            Iterator var7 = this.O00000000000O0.iterator();

            while (var7.hasNext()) {
               O0000O00O0O000.W369 var8 = (O0000O00O0O000.W369)var7.next();
               boolean var9 = var8.O00000000(var5);
               if (!var9) {
                  var7.remove();
               }
            }
         }
      }
   }

   public float O0000000000() {
      return this.O0000000000O;
   }

   public long O00000000000() {
      return this.O0000000000O0;
   }

   public void O000000000000() {
      this.O00000000000OO = System.nanoTime();
      this.O0000000000O = 0.016666668F;
      this.O0000000000O0++;
   }

   public void O00000000(O0000O00O0O000.W369 o00000000) {
      if (o00000000 != null) {
         synchronized (this.O00000000000O) {
            if (!this.O00000000000O0.contains(o00000000)) {
               this.O00000000000O0.add(o00000000);
            }
         }
      }
   }

   public void O000000000(O0000O00O0O000.W369 o00000000) {
      if (o00000000 != null) {
         synchronized (this.O00000000000O) {
            this.O00000000000O0.remove(o00000000);
         }
      }
   }

   public interface W369 {
      boolean O00000000(float f);
   }
}
