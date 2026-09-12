package Nursultan;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import minecraft.class00381;
import minecraft.class00481;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00514;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00891;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07259;
import minecraft.class07261;
import minecraft.class07321;
import org.joml.Matrix4f;

@class11080(
   L = "BlockESP",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class BlockESP extends class11067 {
   public static Object L_0;
   public static Object L_1 = new class09087(class09069.N(3).R(), class09069.y().R());
   public static Object L_2;
   public static Object L_3;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object u_5;
   public Object u_6;
   public Object u_7;
   public boolean u_init;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;

   private void L(long var1) {
      this.k();
      Set var3 = (Set)((Map)this.u_3).get(var1);
      if (var3 != null && (class03448)((class06202)super.y_0).T_3 != null) {
         Map var4 = (Map)this.u_0;
         IntArrayList var5 = new IntArrayList();
         IntArrayList var6 = new IntArrayList();
         int var7 = class07321.N(var1) << 4;
         int var8 = class07321.y(var1) << 4;
         Iterator var9 = var3.iterator();

         while (var9.hasNext()) {
            class07209 var10 = (class07209)var9.next();
            class00500 var11 = ((class03448)((class06202)super.y_0).T_3).method_8320(var10);
            class11025 var12 = (class11025)var4.get(var11.i());
            if (var12 == null) {
               var9.remove();
            } else {
               class00494 var13 = var11.R((class03448)((class06202)super.y_0).T_3, var10);
               if (!var13.method_1110()) {
                  int var14 = var10.method_10263() - var7;
                  int var15 = var10.method_10260() - var8;
                  if (class00891.N(var13)) {
                     this.N(var6, (double)var14, (double)var10.method_10264(), (double)var15, var12.y());
                  } else {
                     this.N(var5, var13, var14, var10.method_10264(), var15, var12.y());
                  }
               }
            }
         }

         if (var3.isEmpty()) {
            ((Map)this.u_3).remove(var1);
         }

         class11030 var16 = new class11030(var5.toIntArray(), var6.toIntArray());
         if (var16.u()) {
            ((Map)this.u_2).remove(var1);
         } else {
            ((Map)this.u_2).put(var1, var16);
         }

         this.u_5 = true;
      }
   }

   public void P() {
      this.k();
      this.u_0 = Map.of();
      this.n();
      this.Y();
   }

   public BlockESP() {
      this.k();
      this.u_0 = Map.of();
      this.u_1 = (class11507)class11524.N(this, "delta-mode", false).N_6((var1, var2) -> this.l());
      this.u_2 = new HashMap();
      this.u_3 = new HashMap();
      this.u_4 = new LinkedHashSet();
      this.u_7 = class06889.L;
      this.i_0 = class11213.N((class09087)class09063.N_0, 65536, 0);
      this.i_1 = class11213.N((class09087)L_1, 16384);
      this.i_2 = class11204.L().N((class12036)class11215.N_0).N((class09322)class11185.N_4).N(1).N();
      this.i_3 = class11204.L().N((class12036)class11215.N_0).N((class09322)class11185.z_1).N(1).N();
      this.i_4 = new Matrix4f();
   }

   static {
      v();
   }

   @Override
   public boolean Z() {
      this.k();
      this.u_5 = true;
      if (!((class11507)this.u_1).i()) {
         this.j();
      }

      return true;
   }

   @Override
   public boolean i() {
      this.k();
      ((Set)this.u_4).clear();
      ((Map)this.u_2).clear();
      ((Map)this.u_3).clear();
      this.u_5 = true;
      return true;
   }

   private void b() {
      this.k();
      ((Set)this.u_4).removeIf(var1 -> this.N(var1.longValue()) == null);
      ((Map)this.u_3).keySet().removeIf(var1 -> this.N(var1.longValue()) == null);
      if (((Map)this.u_2).keySet().removeIf(var1 -> this.N(var1.longValue()) == null)) {
         this.u_5 = true;
      }
   }

   private void n() {
      this.k();
      ((Map)this.u_2).clear();
      this.u_5 = true;
      if (((class11507)this.u_1).i()) {
         List.copyOf(((Map)this.u_3).keySet()).forEach(this::L);
      } else {
         this.j();
      }
   }

   private void l() {
      this.k();
      ((Set)this.u_4).clear();
      ((Map)this.u_3).clear();
      this.n();
   }

   public Collection<class11025> m() {
      this.k();
      return ((Map)this.u_0).values();
   }

   private void k() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_5 = false;
         this.u_6 = 0;
      }
   }

   private static void v() {
      L_0 = -1;
      L_1 = null;
      L_2 = 24;
      L_3 = 20;
   }

   private void j() {
      this.k();
      if ((class03448)((class06202)super.y_0).T_3 != null && (class04453)((class06202)super.y_0).T_4 != null) {
         class07321 var1 = ((class04453)((class06202)super.y_0).T_4).method_31476();
         int var2 = (Integer)((class05630)((class06202)super.y_0).i_7).i().method_41753() + 1;

         for (int var3 = var1.B - var2; var3 <= var1.B + var2; var3++) {
            for (int var4 = var1.Z - var2; var4 <= var1.Z + var2; var4++) {
               if (((class03448)((class06202)super.y_0).T_3).method_8398().N(var3, var4, class00549.m, false) != null) {
                  ((Set)this.u_4).add(class07321.u(var3, var4));
               }
            }
         }
      }
   }

   private void y(class00570 var1) {
      this.k();
      Map var2 = (Map)this.u_0;
      IntArrayList var3 = new IntArrayList();
      IntArrayList var4 = new IntArrayList();
      class07321 var5 = var1.R();
      class00554[] var6 = var1.u();
      class07218 var7 = new class07218();

      for (int var8 = 0; var8 < var6.length; var8++) {
         class00554 var9 = var6[var8];
         if (!var9.L() && var9.N(var1x -> var2.containsKey(var1x.i()))) {
            int var10 = var1.method_31604(var8) << 4;

            for (int var11 = 0; var11 < 16; var11++) {
               for (int var12 = 0; var12 < 16; var12++) {
                  for (int var13 = 0; var13 < 16; var13++) {
                     class00500 var14 = var9.N(var13, var11, var12);
                     class11025 var15 = (class11025)var2.get(var14.i());
                     if (var15 != null) {
                        var7.N(var5.i() + var13, var10 + var11, var5.R() + var12);
                        class00494 var16 = var14.R(var1, var7);
                        if (!var16.method_1110()) {
                           if (class00891.N(var16)) {
                              this.N(var4, (double)var13, (double)(var10 + var11), (double)var12, var15.y());
                           } else {
                              this.N(var3, var16, var13, var10 + var11, var12, var15.y());
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      long var17 = var5.y();
      class11030 var18 = new class11030(var3.toIntArray(), var4.toIntArray());
      ((class06202)super.y_0).execute(() -> this.N(var17, var18));
   }

   private void y(class07261 var1) {
      this.k();
      if (!((class11507)this.u_1).i()) {
         var1.N((var1x, var2x) -> {
            this.k();
            ((Set)this.u_4).add(class07321.N(var1x));
         });
      } else if ((class03448)((class06202)super.y_0).T_3 != null) {
         Map var2 = (Map)this.u_0;
         LinkedHashSet var3 = new LinkedHashSet();
         var1.N((var3x, var4) -> {
            this.k();
            long var5 = class07321.N(var3x);
            if (var2.containsKey(var4.i())) {
               ((Map)this.u_3).computeIfAbsent(var5, var0 -> new HashSet<>()).add(var3x.method_10062());
               var3.add(var5);
            } else {
               Set var7 = (Set)((Map)this.u_3).get(var5);
               if (var7 != null && var7.remove(var3x)) {
                  var3.add(var5);
               }
            }
         });
         var3.forEach(this::L);
      }
   }

   public class11025 y(class00891 var1) {
      this.k();
      return (class11025)((Map)this.u_0).get(var1);
   }

   private void y(long var1) {
      ((class06202)super.y_0).execute(() -> {
         this.k();
         if (!((class11507)this.u_1).i()) {
            ((Set)this.u_4).add(var1);
         }
      });
   }

   public void y(Collection<class11025> var1) {
      this.k();
      LinkedHashMap var2 = new LinkedHashMap();
      var1.forEach(var1x -> var2.put(var1x.N(), var1x));
      this.u_0 = Collections.unmodifiableMap(var2);
      this.n();
   }

   public boolean N(class00891 var1) {
      this.k();
      if (!((Map)this.u_0).containsKey(var1)) {
         return false;
      } else {
         LinkedHashMap var2 = new LinkedHashMap((Map)this.u_0);
         var2.remove(var1);
         this.u_0 = Collections.unmodifiableMap(var2);
         this.n();
         this.Y();
         return true;
      }
   }

   private void N(class06889 var1) {
      this.k();
      this.u_5 = false;
      this.u_7 = var1;
      class11184 var2 = ((class11213)this.i_0).M();
      class11184 var3 = ((class11213)this.i_1).M();
      var2.N();
      var3.N();

      for (Entry var5 : ((Map)this.u_2).entrySet()) {
         long var6 = (Long)var5.getKey();
         float var8 = (float)((double)(class07321.N(var6) << 4) - ((class06889)this.u_7).M);
         float var9 = (float)(-((class06889)this.u_7).B);
         float var10 = (float)((double)(class07321.y(var6) << 4) - ((class06889)this.u_7).Z);
         this.N(var2, ((class11030)var5.getValue()).y(), var8, var9, var10);
         this.N(var3, ((class11030)var5.getValue()).N(), var8, var9, var10);
      }

      ((class11213)this.i_0).N(var2, 35048);
      ((class11213)this.i_1).N(var3, 35048);
   }

   private void N(class11184 var1, int[] var2, float var3, float var4, float var5) {
      for (byte var6 = 0; var6 < var2.length; var6 += 4) {
         var1.N(Float.intBitsToFloat(var2[var6]) + var3)
            .N(Float.intBitsToFloat(var2[var6 + 1]) + var4)
            .N(Float.intBitsToFloat(var2[var6 + 2]) + var5)
            .N(var2[var6 + 3]);
         var1.y();
      }
   }

   private class00570 N(long var1) {
      return ((class03448)((class06202)super.y_0).T_3).method_8398().N(class07321.N(var1), class07321.y(var1), class00549.m, false);
   }

   private void N(IntArrayList var1, class00494 var2, int var3, int var4, int var5, int var6) {
      var2.method_1104((var6x, var8, var10, var12, var14, var16) -> {
         this.N(var1, (double)var3 + var6x, (double)var4 + var8, (double)var5 + var10, var6);
         this.N(var1, (double)var3 + var12, (double)var4 + var14, (double)var5 + var16, var6);
      });
   }

   public void N(Collection<class11025> var1) {
      this.k();
      LinkedHashMap var2 = new LinkedHashMap((Map)this.u_0);
      var1.forEach(var1x -> var2.put(var1x.N(), var1x));
      this.u_0 = Collections.unmodifiableMap(var2);
      this.n();
      this.Y();
   }

   @class11782
   public void N(class09343 var1) {
      this.k();
      ((Set)this.u_4).clear();
      ((Map)this.u_2).clear();
      ((Map)this.u_3).clear();
      this.u_5 = true;
   }

   private void N(long var1, class11030 var3) {
      this.k();
      if (this.U() && (class03448)((class06202)super.y_0).T_3 != null && !((class11507)this.u_1).i()) {
         if (var3.u()) {
            if (((Map)this.u_2).remove(var1) != null) {
               this.u_5 = true;
            }
         } else {
            ((Map)this.u_2).put(var1, var3);
            this.u_5 = true;
         }
      }
   }

   public void N(class11025 var1) {
      this.k();
      LinkedHashMap var2 = new LinkedHashMap((Map)this.u_0);
      var2.put(var1.N(), var1);
      this.u_0 = Collections.unmodifiableMap(var2);
      this.n();
      this.Y();
   }

   @class11782
   public void N(class10961 var1) {
      class00381 var10000 = var1.N();
      Objects.requireNonNull(var10000);
      class00381<?> var2 = var10000;
      switch (var2) {
         case class00514 var4:
            this.y(class07321.u(var4.N(), var4.y()));
            break;
         case class07259 var5:
            this.y(class07321.N(var5.y()));
            break;
         case class07261 var6:
            ((class06202)super.y_0).execute(() -> this.y(var6));
            break;
         case class00481 var7:
            ((class06202)super.y_0).execute(() -> {
               this.k();
               long var2x = var7.N().y();
               ((Set)this.u_4).remove(var2x);
               ((Map)this.u_3).remove(var2x);
               if (((Map)this.u_2).remove(var2x) != null) {
                  this.u_5 = true;
               }
            });
            break;
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.k();
      class06889 var2 = var1.y().y();
      if ((Boolean)this.u_5) {
         this.N(var2);
      }

      if (!((class11213)this.i_0).B() || !((class11213)this.i_1).B()) {
         class11925.N(((class06202)super.y_0).e(), true);
         ((Matrix4f)this.i_4)
            .set(var1.N())
            .translate((float)(((class06889)this.u_7).M - var2.M), (float)(((class06889)this.u_7).B - var2.B), (float)(((class06889)this.u_7).Z - var2.Z));
         ((class11216)class11925.L_6).N(var1.i(), (Matrix4f)this.i_4);
         if (!((class11213)this.i_0).B()) {
            ((class11204)this.i_2).y();
            ((class11213)this.i_0).N(((class11204)this.i_2).i());
         }

         if (!((class11213)this.i_1).B()) {
            ((class11204)this.i_3).y();
            ((class11213)this.i_1).N(((class11204)this.i_3).i(), 24, ((class11213)this.i_1).y());
         }
      }
   }

   private void N(IntArrayList var1, double var2, double var4, double var6, int var8) {
      var1.add(Float.floatToRawIntBits((float)var2));
      var1.add(Float.floatToRawIntBits((float)var4));
      var1.add(Float.floatToRawIntBits((float)var6));
      var1.add(var8);
   }

   @class11782
   public void N(class11380 var1) {
      this.k();
      if ((class03448)((class06202)super.y_0).T_3 != null) {
         if (!((class11507)this.u_1).i()) {
            Iterator var2 = ((Set)this.u_4).iterator();

            while (var2.hasNext()) {
               long var3 = (Long)var2.next();
               class00570 var5 = this.N(var3);
               if (var5 != null) {
                  var2.remove();
                  ((ExecutorService)class11938.L_1).execute(() -> this.y(var5));
               }
            }
         }

         int var10002 = (Integer)this.u_6 + 1;
         this.u_6 = var10002;
         if (var10002 >= 20) {
            this.u_6 = 0;
            this.b();
         }
      }
   }

   private void Y() {
      class11519.y(class11511.class);
   }
}
