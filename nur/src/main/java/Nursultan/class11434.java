package Nursultan;

import java.time.Duration;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;
import org.joml.Matrix4fStack;

public class class11434 extends class11807<TargetEsp> {
   public Object y_0;
   public static Object L_0 = Duration.ofMillis(300L);

   private static void M() {
      L_0 = null;
   }

   public class11434(TargetEsp var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.B();
      this.y_0 = new class11934(class11903.FORWARDS);
   }

   static {
      M();
   }

   private void B() {
   }

   @Override
   public void y(Object var1) {
      this.B();
      if (var1 instanceof class09321 var2) {
         ((class11934)this.y_0).N(((TargetEsp)super.N_1).m() ? 1.0 : 0.0, (Duration)L_0, (class11887)class11905.u_4);
         ((class11934)this.y_0).N();
         if (((class11934)this.y_0).N(class11903.BACKWARDS)) {
            return;
         }

         class11174 var3 = (class11174)class11190.N_3;
         class11174 var4 = (class11174)class11190.N_1;
         Matrix4fStack var5 = var2.R();
         class07438 var6 = ((TargetEsp)super.N_1).T();
         class06889 var7 = var2.y().y();
         float var8 = (float)(class11925.i(var6) - var7.M);
         float var9 = (float)(class11925.u(var6) - var7.B);
         float var10 = (float)(class11925.L(var6) - var7.Z);
         class11184 var11 = var3.R();
         class11184 var12 = var4.R();
         class11178 var13 = var4.L();
         byte var14 = 35;
         float var15 = ((TargetEsp)super.N_1).T().method_17682() / 2.0F;
         double var16 = (double)((float)((class04453)((class06202)super.N_0).T_4).field_6012 + ((class06202)super.N_0).NK().N(false)) / 4.0;
         float var18 = (float)Math.sin(var16) * var15 + var15;
         float var19 = (float)Math.cos(var16);
         int var20 = ((class11515)((TargetEsp)super.N_1).L_5).i();
         int var21 = class11300.N(var20, (int)(255.0 * ((class11934)this.y_0).E()));
         int var22 = class11300.N(var20, (int)(120.0 * ((class11934)this.y_0).E()));
         int var23 = class11300.N(var20, 0);
         float var24 = var6.method_17681();

         for (int var25 = 0; var25 < var14; var25++) {
            int var26 = var12.i();
            float var27 = (float)Math.toRadians((double)(360.0F / (float)var14 * (float)var25));
            float var28 = (float)Math.sin((double)var27) * var24;
            float var29 = (float)Math.cos((double)var27) * var24;
            float var30 = (float)Math.toRadians((double)(360.0F / (float)var14 * (float)(var25 + 1)));
            float var31 = (float)Math.sin((double)var30) * var24;
            float var32 = (float)Math.cos((double)var30) * var24;
            var11.N(var5, var8 + var28, var9 + var18, var10 + var29).N(var5, var8 + var31, var9 + var18, var10 + var32).y(var21).y(var21).N(0.0F).y();
            var12.N(var5, var8 + var31, var9 + var18 - var19 / 2.0F, var10 + var32).y(var23).y();
            var12.N(var5, var8 + var28, var9 + var18 - var19 / 2.0F, var10 + var29).y(var23).y();
            var12.N(var5, var8 + var28, var9 + var18, var10 + var29).y(var22).y();
            var12.N(var5, var8 + var31, var9 + var18, var10 + var32).y(var22).y();
            var13.y(var26);
         }
      }
   }
}
