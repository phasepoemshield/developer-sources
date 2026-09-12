package Nursultan;

import java.util.Comparator;
import java.util.Optional;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07438;
import minecraft.class07488;
import minecraft.class07843;

@class11080(
   L = "AutoPearl",
   y = class11072.PLAYER,
   N = class11106.AUTO
)
public class AutoPearl extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public Object L_7;
   public boolean L_init;

   public AutoPearl() {
      this.b();
      this.L_0 = class11524.N(this, "only-in-pvp", false);
      this.L_1 = class11524.N(this, "target-follow", false);
      this.L_2 = class11524.N(this, "threshold", 6.0F, 1.0F, 8.0F, 0.5F);
      this.L_3 = class11524.N(this, "min-distance", 5.0F, 5.0F, 10.0F, 1.0F);
      this.L_4 = new class11228((class11225)class11225.L_2);
   }

   private void b() {
      if (!this.L_init) {
         this.L_init = true;
         this.L_5 = 0;
         this.L_6 = 0;
         this.L_7 = 0;
      }
   }

   private boolean s() {
      this.b();
      if (((class11507)this.L_0).i() && !class11907.u()) {
         return true;
      } else {
         return ((class11799)((class03443)((class06202)super.y_0).T_2)).N() < 3 ? true : ((class04453)((class06202)super.y_0).T_4).method_6115();
      }
   }

   private Optional<class11499> N(class07049 var1) {
      this.b();
      Optional<class11223> var2 = ((class11228)this.L_4).N(var1, var1.method_73189(), var1.method_18798()).N();
      if (var2.isEmpty()) {
         return Optional.empty();
      } else {
         class06889 var3 = var2.get().N();
         if (((class04453)((class06202)super.y_0).T_4).method_73189().R(var3) <= (double)((class11504)this.L_3).i().floatValue()) {
            return Optional.empty();
         } else {
            float var4 = class04995.z(((class11504)this.L_2).i());
            class11499 var5 = class11505.N(var3);
            float var6 = var5.y();
            float var7 = var5.R();
            class06889 var8 = ((class04453)((class06202)super.y_0).T_4).method_60478();
            class06889 var9 = ((class04453)((class06202)super.y_0).T_4).method_33571();
            class11499 var10 = null;
            double var11 = Double.MAX_VALUE;
            int var13 = -1;

            for (byte var14 = 0; var14 < 180; var14 += 3) {
               float var15 = (var7 - (float)var14 - 90.0F) % 180.0F + 90.0F;
               class06889 var16 = Trajectory.N((class04453)((class06202)super.y_0).T_4, var8, -var15, var6, 0.0F, 1.5F);
               Optional<class11223> var17 = ((class11228)this.L_4).N(null, var9, var16).N();
               if (!var17.isEmpty()) {
                  double var18 = var17.get().N().M(var3);
                  int var20 = var17.get().L();
                  if (var20 <= var2.get().L() + 100
                     && var18 <= (double)var4
                     && (var18 < var11 && (var13 == -1 || Math.abs(var20 - var13) < 40) || var20 < var13)) {
                     var11 = var18;
                     var13 = var20;
                     var10 = new class11499(var6, var15);
                  }
               }
            }

            return Optional.ofNullable(var10);
         }
      }
   }

   @class11782
   public void N(class11371 var1) {
      if (var1.N() instanceof class07488 var2) {
         ((class03448)((class06202)super.y_0).T_3)
            .method_18456()
            .stream()
            .min(Comparator.comparingDouble(var1x -> var1x.method_5707(var2.method_73189())))
            .ifPresent(var2x -> {
               this.b();
               int var3 = var2.method_5628();
               if (var2x == (class04453)((class06202)super.y_0).T_4 || class11791.u().test(var2x)) {
                  this.L_5 = var3;
               } else if (((class11507)this.L_1).i()) {
                  TargetEsp var4 = class11938.u().r();
                  if (var4.m()) {
                     class07438 var5 = var4.P();
                     if (var5 instanceof class04477 && (class04477)var5 == var2x) {
                        this.L_6 = var3;
                        this.L_7 = 20;
                     }
                  }
               } else {
                  this.L_6 = var3;
                  this.L_7 = 20;
               }
            });
      }
   }

   @class11782(
      y = class11777.AFTER
   )
   public void N(class10992 var1) {
      this.b();
      if ((Integer)this.L_6 != -1 && (Integer)this.L_5 != (Integer)this.L_6) {
         if (((class03448)((class06202)super.y_0).T_3).method_8469((Integer)this.L_6) instanceof class07488 var3) {
            if (!this.s()) {
               int var4 = class11281.L(class06570.nz).min(Comparator.comparingInt(var0 -> var0.N().I() ? 1 : 0)).map(class11297::y).orElse(-1);
               if (class11281.y(var4) || ((class04453)((class06202)super.y_0).T_4).method_7357().N(class06570.nz.E())) {
                  this.L_6 = -1;
               } else if ((Integer)this.L_7 <= 0) {
                  this.L_6 = -1;
               } else {
                  Optional<class11499> var5 = this.N(var3);
                  if (var5.isEmpty()) {
                     this.L_7 = (Integer)this.L_7 - 1;
                  } else {
                     class11499 var6 = var5.get();
                     class11499 var7 = new class11499(var6.y(), -var6.R()).N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0).u(true).N(true);
                     class11534.y(var7);
                     class11938.Z()
                        .N(
                           () -> {
                              this.b();
                              class11534.y(var7);
                              class11322.N(var4);
                              ((class03443)((class06202)super.y_0).T_2)
                                 .N((class03448)((class06202)super.y_0).T_3, var1xx -> new class07843(class07050.field_5808, var1xx, var7.y(), var7.R()));
                              ((class04453)((class06202)super.y_0).T_4).method_6104(class07050.field_5808);
                              this.L_6 = -1;
                              this.L_7 = 0;
                              class11938.Z().y(4, class11322::L);
                           }
                        );
                  }
               }
            }
         } else {
            this.L_6 = -1;
         }
      }
   }
}
