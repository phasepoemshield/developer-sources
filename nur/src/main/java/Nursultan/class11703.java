package Nursultan;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05410;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07742;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Matrix3x2fStack;
import org.joml.Vector2i;

public class class11703 extends class11807<AutoSwap> {
   public static Object y_0 = LogManager.getLogger(String.class);
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;
   public static Object y_6;
   public static Object L_0;
   public static Object L_1 = class09211.N(-29813);
   public Object u_0;
   public Object u_1;
   public Object u_2;
   public boolean u_init;

   private void L(int var1) {
      this.i();
      if (var1 != -1) {
         ((class11685[])this.u_0)[var1] = null;
         Path var2 = ((File)((class06202)super.N_0).l_1).toPath().resolve("swap-item").resolve(var1 + ".nbt");

         try {
            Files.deleteIfExists(var2);
         } catch (IOException var4) {
         }
      }
   }

   private static void L() {
   }

   private static void P() {
      y_0 = null;
      y_1 = 140.0F;
      y_2 = 84.0F;
      y_3 = 6.0F;
      y_4 = 8.0F;
      y_5 = 1.0F;
      y_6 = 20.0F;
      L_0 = 50.0F;
      L_1 = null;
   }

   private void T() {
      this.i();

      for (class11685 var4 : (class11685[])this.u_0) {
         if (var4 != null) {
            var4.N(!class11281.y(class11281.R(var4.L())));
         }
      }
   }

   public class11703(AutoSwap var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.i();
      this.u_0 = new class11685[3];
   }

   static {
      L();
      P();
   }

   private void i() {
      if (!this.u_init) {
         this.u_init = true;
         this.u_1 = false;
      }
   }

   private static boolean y(class11685 var0) {
      return var0 != null && !var0.N();
   }

   @Override
   public void y(Object var1) {
      this.i();
      switch (var1) {
         case null:
         default:
            break;
         case class11400 var4:
            class12002 var24 = ((class11527)((AutoSwap)super.N_1).u_0).i();
            if (var4.y(var24, ((class11527)((AutoSwap)super.N_1).u_0).L())) {
               class11923.N(() -> {
                  this.i();
                  this.u_1 = true;
                  ((class06220)((class06202)super.N_0).L_2).z();
                  this.T();
               });
               var4.N();
            } else if (var4.N(var24)) {
               class11923.N(() -> {
                  this.i();
                  if ((class05096)((class06202)super.N_0).v_3 == null) {
                     ((class06202)super.N_0).N(null);
                     this.u_1 = false;
                  }
               });
               var4.N();
            } else if (var4.y(class12002.MOUSE_2) && (Boolean)this.u_1) {
               var4.N();
               this.N(this::L);
            }
            break;
         case class11388 var5:
            this.u_2 = null;
            if ((Boolean)this.u_1) {
               this.N(this::N);
            }

            this.u_1 = false;
            break;
         case class10967 var6:
            if (!(Boolean)this.u_1) {
               return;
            }

            class11925.N(((class06202)super.N_0).e(), true);
            float var25 = class11938.i().u();
            float var26 = (float)((class06202)super.N_0).e().N / 2.0F;
            float var9 = (float)((class06202)super.N_0).e().y / 2.0F;
            Vector2i var10 = class11307.N(((class06220)((class06202)super.N_0).L_2).i(), ((class06220)((class06202)super.N_0).L_2).R());
            float var11 = (float)var10.x - var26;
            float var12 = (float)var10.y - var9;
            float var13 = (float)Math.hypot((double)var11, (double)var12);
            int var14 = ((class11685[])this.u_0).length;
            int var15 = -1;
            if (var13 > 50.0F * var25) {
               var15 = N(var11, var12, var14);
            }

            if (var15 != -1 && y(((class11685[])this.u_0)[var15])) {
               var15 = -1;
            }

            float var16 = var26;
            float var17 = var9;
            if (var13 > 0.0F) {
               float var18 = Math.min(var13 / (182.0F * var25), 1.0F);
               float var19 = 20.0F * var25 * var18 * var18;
               var16 = (float)Math.round(var26 - var11 / var13 * var19);
               var17 = (float)Math.round(var9 - var12 / var13 * var19);
            }

            float var27 = (float) (Math.PI * 2) / (float)var14;

            for (int var28 = 0; var28 < var14; var28++) {
               class11685 var20 = ((class11685[])this.u_0)[var28];
               int var21 = (int)(Math.sin((double)((float)var28 * var27 + var27 / 2.0F)) * 140.0 * (double)var25 + (double)var16);
               int var22 = (int)(-Math.cos((double)((float)var28 * var27 + var27 / 2.0F)) * 140.0 * (double)var25 + (double)var17);
               this.N(var16, var17, (float)var28 * var27, (float)(var28 + 1) * var27, var25, var15 == var28, y(var20));
               if (var20 != null) {
                  Matrix3x2fStack var23 = var6.N().i();
                  var23.pushMatrix();
                  var23.translate((float)var21, (float)var22);
                  var23.scale(3.0F * var25);
                  var23.translate((float)(-var21), (float)(-var22));
                  var6.N().N(var20.y(), var21 - 8, var22 - 8);
                  var23.popMatrix();
               } else {
                  class11176.N(
                     ((class11174)class11190.y_0).u(),
                     (float)var21 - 16.0F * var25,
                     (float)var22 - 16.0F * var25,
                     32.0F * var25,
                     32.0F * var25,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     var15 == var28 ? (Integer)class09181.N_0 : -7171438
                  );
               }
            }

            ((class11174)class11190.y_2).y(var0 -> {
               var0.z("u_projection").N(class11925.L());
               var0.z("u_view").N(RenderSystem.getModelViewMatrix());
            });
            ((class11174)class11190.y_0).N(var0 -> {
               var0.z("u_projection").N(class11925.L());
               var0.z("u_view").N(RenderSystem.getModelViewMatrix());
               var0.M("texture_in").N(((class12031)class11998.N_3).N());
            });
            break;
         case class11368 var7:
            if ((CompletableFuture)this.u_2 != null) {
               if (var7.L() == null) {
                  return;
               }

               class06584 var8 = var7.L().i();
               if (var8.R()) {
                  return;
               }

               ((CompletableFuture)this.u_2).complete(var8);
               var7.N();
               ((class06202)super.N_0).N(null);
            }
      }
   }

   private void N(Consumer<Integer> var1) {
      this.i();
      float var2 = (float)((class06202)super.N_0).e().N / 2.0F;
      float var3 = (float)((class06202)super.N_0).e().y / 2.0F;
      Vector2i var4 = class11307.N(((class06220)((class06202)super.N_0).L_2).i(), ((class06220)((class06202)super.N_0).L_2).R());
      float var5 = (float)var4.x - var2;
      float var6 = (float)var4.y - var3;
      int var7 = ((class11685[])this.u_0).length;
      int var8 = -1;
      if (Math.hypot((double)var5, (double)var6) > (double)(50.0F * class11938.i().u())) {
         var8 = N(var5, var6, var7);
      }

      var1.accept(var8);
   }

   private void N(float var1, float var2, float var3, float var4, float var5, boolean var6, boolean var7) {
      int var8;
      int var9;
      if (var7) {
         var8 = ((class09211)L_1).L();
         var9 = ((class09211)L_1).R();
      } else if (var6) {
         class09211 var10 = class09211.N(class09181.N());
         var8 = var10.L();
         var9 = var10.R();
      } else {
         var8 = (Integer)class09181.L_1;
         var9 = (Integer)class09181.L_2;
      }

      class11176.N(((class11174)class11190.y_2).u(), var1, var2, 140.0F * var5, 84.0F * var5, var3, var4, 6.0F * var5 / 2.0F, 8.0F * var5, 1.0F, var8, var9);
   }

   private void N(Integer var1) {
      this.i();
      if (var1 != -1 && !y(((class11685[])this.u_0)[var1])) {
         class11685 var2 = ((class11685[])this.u_0)[var1];
         if (var2 != null) {
            class11938.Z()
               .N(() -> ((AutoSwap)super.N_1).N(var1xx -> var1xx.filter(var1xxx -> var2.L().test(var1xxx.N())).mapToInt(class11297::y).findFirst().orElse(-1)));
         } else {
            this.u_2 = new CompletableFuture();
            ((CompletableFuture)this.u_2).thenAccept(var2x -> {
               this.i();
               ((class11685[])this.u_0)[var1] = class11685.N(var2x);
               this.N(var2x, var1);
            });
            class11923.N(() -> ((class06202)super.N_0).N(new class05410((class04453)((class06202)super.N_0).T_4)));
         }
      }
   }

   @Override
   public void N() {
      this.i();
      Path var1 = ((File)((class06202)super.N_0).l_1).toPath().resolve("swap-item");

      for (int var2 = 0; var2 < ((class11685[])this.u_0).length; var2++) {
         Path var3 = var1.resolve(var2 + ".nbt");
         if (Files.exists(var3)) {
            try {
               ((class11685[])this.u_0)[var2] = class11685.N(class11894.y(var3));
            } catch (Exception var5) {
               class11303.y(class11921.N("error-please-report").N(class06541.field_1061));
               ((Logger)y_0).error(var5, var5);
            }
         }
      }
   }

   private void N(class06584 var1, int var2) {
      try {
         File var3 = ((File)((class06202)super.N_0).l_1).toPath().resolve("swap-item").toFile();
         if (!var3.exists()) {
            Files.createDirectories(var3.toPath());
         }

         File var4 = new File(var3, var2 + ".nbt");
         class07742.y(class11894.N(var1), var4.toPath());
      } catch (IOException var5) {
         class11303.y(class11921.N("error-please-report").N(class06541.field_1061));
         ((Logger)y_0).error(var5, var5);
      }
   }

   private static int N(float var0, float var1, int var2) {
      return (int)Math.floor((double)((class11908.y(Math.atan2((double)(-var0), (double)var1)) + 180.0F) % 360.0F / (360.0F / (float)var2)));
   }
}
