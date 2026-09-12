package Nursultan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class00381;
import minecraft.class00509;
import minecraft.class00681;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class01687;
import minecraft.class01938;
import minecraft.class02294;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06078;
import minecraft.class06202;
import minecraft.class06658;
import minecraft.class06889;
import minecraft.class07438;
import minecraft.class08476;
import org.joml.Matrix4f;
import org.joml.Vector3f;

@class11080(
   L = "KillEffect",
   y = class11072.VISUAL,
   N = class11106.WORLD
)
public class KillEffect extends class11067 {
   public static Object L_0 = new class09087(class09069.N(3).R(), class09069.N(1).R(), class09069.y().R());
   public static Object L_1 = new class12012(true, 1, 1, 1, 1);
   public static Object L_2 = class12036.u().N((class12012)L_1).N();
   public static Object L_3;
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public Object u_3;
   public Object u_4;
   public Object i_0;
   public Object i_1;
   public Object i_2;
   public Object i_3;
   public Object i_4;
   public Object i_5;
   public Object i_6;
   public Object i_7;
   public boolean i_init;

   public KillEffect() {
      this.b();
      this.u_0 = new HashSet();
      this.u_1 = class09064.N(() -> ((class06202)super.y_0).e().N / 2, () -> ((class06202)super.y_0).e().y / 2)
         .N(class11199.LINEAR, class11199.LINEAR)
         .y(class11175.CLAMP_TO_EDGE)
         .y(true)
         .N()
         .N(() -> !this.U());
      this.u_2 = class11213.N((class09087)L_0, 65536);
      this.u_3 = class11213.N((class09087)class09063.N_2, 256, 64);
      this.u_4 = class11218.<class09321>N()
         .N(new class11231(this, (class11213)this.u_2))
         .y((class09064)this.u_1)
         .N_3(
            var1 -> {
               this.b();
               if (!((class11507)this.i_0).i()) {
                  class11925.N(
                     ((class06202)super.y_0).e(),
                     (class09064)this.u_1,
                     0,
                     0,
                     ((class06202)super.y_0).e().N,
                     ((class06202)super.y_0).e().y,
                     0,
                     0,
                     ((class09064)this.u_1).G(),
                     ((class09064)this.u_1).u(),
                     256,
                     9728
                  );
               }
            }
         )
         .N(new class11255(this, (class11213)this.u_3))
         .L(((class06202)super.y_0)::e)
         .L((class09064)this.u_1)
         .N();
      this.i_0 = class11524.N(this, "behind-walls", false);
      this.i_1 = class11524.N(this, "color", -11104513);
      this.i_2 = class11524.N(this, "count", 30.0F, 5.0F, 50.0F, 1.0F);
      this.i_3 = class11524.N(this, "duration", new class11494(4.0F, 12.0F), new class11494(5.0F, 8.0F), 1.0F);
      this.i_4 = new ArrayList();
   }

   static {
      l();
   }

   private void b() {
      if (!this.i_init) {
         this.i_init = true;
         this.i_6 = 0;
         this.i_7 = false;
      }
   }

   private static void l() {
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = 100;
   }

   private void t() {
      this.b();
      if ((Boolean)this.i_7 && class11938.j().y() - (Integer)this.i_6 < 3) {
         ((List)this.i_4).add(new class11263((class07438)this.i_5, class11938.j().y()));
         this.i_5 = null;
      }
   }

   @class11782
   public void N(class11382 var1) {
      this.b();
      if (var1.L() instanceof class07438 var2 && var2 != (class04453)((class06202)super.y_0).T_4) {
         this.i_5 = var2;
         this.i_6 = class11938.j().y();
         this.i_7 = false;
         return;
      }
   }

   @class11782
   public void N(class10990 var1) {
      class00381 var10000 = var1.u();
      Objects.requireNonNull(var10000);
      class00381<?> var2 = var10000;
      switch (var2) {
         case class01938 var4:
            ((class06202)super.y_0).execute(() -> {
               this.b();
               if ((class07438)this.i_5 != null && ((class07438)this.i_5).method_5628() == var4.N() && class11938.j().y() - (Integer)this.i_6 < 3) {
                  this.i_7 = true;
               }
            });
            break;
         case class00509 var5:
            ((class06202)super.y_0)
               .execute(
                  () -> {
                     this.b();
                     if (var5.N() == 3
                        && (class03448)((class06202)super.y_0).T_3 != null
                        && (class07438)this.i_5 != null
                        && var5.N((class03448)((class06202)super.y_0).T_3) == (class07438)this.i_5) {
                        this.t();
                     }
                  }
               );
            break;
         case class06658 var6:
            ((class06202)super.y_0).execute(() -> var6.N().forEach(var1xx -> {
                  this.b();
                  if ((class07438)this.i_5 != null && ((class07438)this.i_5).method_5628() == var1xx) {
                     this.t();
                  }
               }));
            break;
      }
   }

   @class11782
   public void N(class10996 var1) {
      this.b();
      int var2 = class11938.j().y();
      if (!((List)this.i_4).isEmpty()) {
         ((List)this.i_4).removeIf(var2x -> {
            class07438 var3x = var2x.y();
            if (var3x.fields_2212a028292fd3c078969e3ee4c71d9e8_2 <= 0 && !var3x.method_31481()) {
               return var2 - var2x.N() > 100;
            } else {
               this.N(var3x);
               return true;
            }
         });
      }

      if (!((Set)this.u_0).isEmpty()) {
         Iterator var3 = ((Set)this.u_0).iterator();

         while (var3.hasNext()) {
            List<class11232> var4 = ((class11265)var3.next()).N();
            var4.removeIf(var0 -> {
               var0.y();
               return var0.N();
            });
            if (var4.isEmpty()) {
               var3.remove();
            }
         }
      }
   }

   private void N(class07438 var1, class11265 var2, int var3) {
      if (((class06202)super.y_0).Ng().N(var1) instanceof class02294 var5) {
         class08476 var7 = (class08476)var5.method_55269();
         var5.method_62354(var1, var7, 0.0F);
         class06078<?> var9 = ((class12041)var5).N();
         var9.method_2819(var7);
         class01421 var10 = new class01421();
         float var11 = var7.NL;
         var10.y(var11, var11, var11);
         ((class12041)var5).N(var7, var10, var7.x, var11);
         var10.y(-1.0F, -1.0F, 1.0F);
         ((class12041)var5).N(var7, var10);
         if (var1 instanceof class04477) {
            var10.y(0.9375F, 0.9375F, 0.9375F);
         }

         var10.N(0.0F, -1.501F, 0.0F);
         class01686 var12 = var9.method_63512();
         ArrayList var13 = new ArrayList();
         AtomicReference var14 = new AtomicReference<>(0.0F);
         var12.N(var10, (var2x, var3x, var4, var5x) -> {
            float var6 = (var5x.i - var5x.y) / 16.0F;
            float var7x = (var5x.R - var5x.L) / 16.0F;
            float var8 = (var5x.M - var5x.u) / 16.0F;
            float var9x = var6 * var7x * var8;
            if (!(var9x <= 0.0F)) {
               var13.add(new class11237(new Matrix4f(var2x.N()), var5x, var9x));
               var14.set((Float)var14.get() + var9x);
            }
         });
         if (!var13.isEmpty() && !((Float)var14.get() <= 0.0F)) {
            float var15 = (Float)var14.get();
            AtomicInteger var16 = new AtomicInteger(var3);
            class06069 var17 = var1.method_59922();

            for (int var18 = 0; var18 < var13.size(); var18++) {
               class11237 var19 = (class11237)var13.get(var18);
               int var20;
               if (var18 == var13.size() - 1) {
                  var20 = var16.get();
               } else {
                  float var21 = var19.N() / var15;
                  var20 = Math.max(1, Math.round((float)var3 * var21));
                  var20 = Math.min(var20, var16.get());
               }

               if (var20 > 0) {
                  var16.addAndGet(-var20);
                  this.N(var1, var2, var19.y(), var19.L(), var20, var17);
               }
            }
         }
      }
   }

   private void N(class07438 var1) {
      this.b();
      if (!(var1 instanceof class00681)) {
         class11265 var2 = new class11265(var1);
         if (((Set)this.u_0).add(var2)) {
            this.N(var1, var2, ((class11504)this.i_2).i().intValue() * 10);
         }
      }
   }

   private void N(class07438 var1, class11265 var2, Matrix4f var3, class01687 var4, int var5, class06069 var6) {
      this.b();
      double var7 = var1.method_23317();
      double var9 = var1.method_23318();
      double var11 = var1.method_23321();

      for (int var13 = 0; var13 < var5; var13++) {
         float var14 = class04995.N(var6, var4.y, var4.i) / 16.0F;
         float var15 = class04995.N(var6, var4.L, var4.R) / 16.0F;
         float var16 = class04995.N(var6, var4.u, var4.M) / 16.0F;
         Vector3f var17 = new Vector3f(var14, var15, var16);
         Vector3f var18 = var3.transformPosition(var17, new Vector3f());
         double var19 = var7 + (double)var18.x();
         double var21 = var9 + (double)var18.y();
         double var23 = var11 + (double)var18.z();
         class06889 var25 = new class06889(var19, var21, var23);
         var2.N()
            .add(
               new class11232(
                  var25,
                  var25,
                  class11908.y(0.1F, 1.0F),
                  class11908.N((int)(20.0F * ((class11525)this.i_3).i().N()), (int)(20.0F * ((class11525)this.i_3).i().L()))
               )
            );
      }
   }

   @class11782
   public void N(class09321 var1) {
      this.b();
      if (!((Set)this.u_0).isEmpty()) {
         ((class11218)this.u_4).execute(var1);
      }
   }
}
