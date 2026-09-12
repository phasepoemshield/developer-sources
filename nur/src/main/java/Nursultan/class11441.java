package Nursultan;

import java.time.Duration;
import java.util.Arrays;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;
import org.joml.Matrix4fStack;

public class class11441 extends class11807<TargetEsp> {
   public static Object y_0 = Duration.ofMillis(300L);
   public static Object y_1 = Duration.ofMillis(100L);
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;

   private static void M() {
      y_0 = null;
      y_1 = null;
   }

   public class11441(TargetEsp var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.R();
      this.L_0 = new class11934[4];
      this.L_1 = class11174.N()
         .N(class11204.L().N((class12036)class12019.N_1).N((class09322)class11185.Z_1).N(4).N())
         .N(class11213.N((class09087)class09063.N_2, 4096, 1024))
         .N();
      this.L_2 = ((class09322)class11185.Z_1).z("u_projection");
      this.L_3 = ((class09322)class11185.Z_1).z("u_view");
      this.L_4 = ((class09322)class11185.Z_1).M("texture_in");

      for (int var4 = 0; var4 < ((class11934[])this.L_0).length; var4++) {
         ((class11934[])this.L_0)[var4] = new class11934(class11903.FORWARDS);
      }
   }

   static {
      N();
      M();
   }

   @Override
   public void y(Object var1) {
      this.R();
      if (var1 instanceof class09321 var2) {
         boolean var3 = ((TargetEsp)super.N_1).m();
         Duration var4 = var3 ? (Duration)y_0 : (Duration)y_1;

         for (int var5 = 1; var5 < ((class11934[])this.L_0).length; var5++) {
            class11934 var6 = ((class11934[])this.L_0)[var5 - 1];
            int var7 = var3 ? 1 : 0;
            if (var3 ? !(var6.E() > 0.4F) : !(var6.E() <= 0.6F)) {
               var6.N((double)var7, var4, var3 ? (class11887)class11905.y_0 : (class11887)class11905.N_5);
               break;
            }

            ((class11934[])this.L_0)[var5].N((double)var7, var4, var3 ? (class11887)class11905.y_0 : (class11887)class11905.N_5);
         }

         for (class11934 var8 : (class11934[])this.L_0) {
            var8.N();
         }

         if (Arrays.<class11934>stream((class11934[])this.L_0).allMatch(var0 -> var0.N(class11903.BACKWARDS))) {
            return;
         }

         Matrix4fStack var26 = var2.R();
         class07438 var28 = ((TargetEsp)super.N_1).T();
         class06889 var30 = var2.y().y();
         class11184 var31 = ((class11174)this.L_1).R();
         float var9 = (float)(class11925.i(var28) - var30.M);
         float var10 = (float)(class11925.u(var28) - var30.B) + var28.method_17682() / 2.0F;
         float var11 = (float)(class11925.L(var28) - var30.Z);
         float var12 = (float)(
            (
                     1.0
                        - Math.sin(
                           (double)Math.max(
                              ((float)var28.fields_2212a028292fd3c078969e3ee4c71d9e8_0.intValue() - ((class06202)super.N_0).NK().N(false))
                                 / 10.0F
                                 * (float) Math.PI,
                              0.0F
                           )
                        )
                  )
                  * 0.3F
               + 0.7F
         );
         int var13 = ((class11515)((TargetEsp)super.N_1).L_5).i();
         byte var14 = 4;
         float var15 = 0.2F;
         float var16 = var15 * 2.0F * var12;
         float var19 = (float)(
            Math.sin(
                  (double)((float)((class04453)((class06202)super.N_0).T_4).field_6012 + ((class06202)super.N_0).NK().N(false))
                     % 40.0
                     / 40.0
                     * (float) (Math.PI * 2)
               )
               * 2.0
         );

         for (int var20 = 0; var20 < var14; var20++) {
            var26.pushMatrix();
            var26.translate(var9, var10, var11);
            float var21 = ((class11934[])this.L_0)[var20].E().floatValue() * 0.5F;
            var26.scale(1.0F + (0.5F - var21));
            var26.rotate(var2.y().M());
            float var22 = (float)var20 * ((float) (Math.PI * 2) / (float)var14);
            var26.rotate(var22 + var19, 0.0F, 0.0F, 1.0F);
            var26.translate(0.0F, var16, 0.0F);
            var26.rotate((float) Math.PI, 0.0F, 0.0F, 1.0F);
            int var23 = var31.i();
            int var24 = class11300.N(var13, (int)((float)class11300.y(var13) * var21 * 2.0F));
            var31.N(var26, -var15, var15, 0.0F).N(0.0F, 0.0F).y(var24).y();
            var31.N(var26, var15, var15, 0.0F).N(1.0F, 0.0F).y(var24).y();
            var31.N(var26, var15, -var15, 0.0F).N(1.0F, 1.0F).y(var24).y();
            var31.N(var26, -var15, -var15, 0.0F).N(0.0F, 1.0F).y(var24).y();
            ((class11174)this.L_1).L().y(var23);
            var26.popMatrix();
         }

         class11925.N(((class06202)super.N_0).e(), true);
         ((class11174)this.L_1).N(var2x -> {
            this.R();
            ((class12038)this.L_2).N(var2.i());
            ((class12038)this.L_3).N(var2.N());
            ((class12026)this.L_4).N(((class12031)class11998.N_1).N());
         });
      }
   }

   private static void N() {
   }

   private void R() {
   }
}
