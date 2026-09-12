package Nursultan;

import org.joml.Matrix4f;

public class class09205 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public static Object y_0;
   public static Object y_1;

   public class09205() {
      this.u();
      this.N_0 = class11213.N((class09087)class09063.N_2, 256, 6);
      this.N_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_2).N((class09322)class11185.Z_1).N(4).N()).N((class11213)this.N_0).N();
      this.N_2 = new Matrix4f();
      this.N_3 = new Matrix4f();
      this.N_4 = new Matrix4f();
   }

   static {
      N();
   }

   private void u() {
   }

   public void N(class09057 var1, int var2, int var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      if (var1 != null && var2 > 0 && var3 > 0) {
         float var10 = Math.clamp(var6, 0.0F, 1.0F);
         if (!(var10 <= 0.0F)) {
            this.N(var3, var4, var5, var10, var7, var8, var9);
            ((Matrix4f)this.N_2).setOrtho(0.0F, (float)var2, (float)var3, 0.0F, -10000.0F, 10000.0F);
            int var11 = Math.round(var10 * 255.0F);
            int var12 = var11 << 24 | var11 << 16 | var11 << 8 | var11;
            class11176.N((class11213)this.N_0, 0.0F, 0.0F, (float)var2, (float)var3, 0.0F, 1.0F, 1.0F, 0.0F, var12);
            ((class11174)this.N_1).N(var2x -> {
               var2x.z("u_projection").N((Matrix4f)this.N_2);
               var2x.z("u_view").N((Matrix4f)this.N_3);
               var2x.M("texture_in").N(var1);
            });
         }
      }
   }

   private void N(int var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (var5 + var6) * 0.5F;
      float var9 = var8 + (1.0F - var8) * var4;
      float var10 = (1.0F - var7) * (float) Math.PI;
      float var11 = (1.0F - var4) * var10;
      float var12 = (float)var1 * 2.5F;
      ((Matrix4f)this.N_4).identity().m23(-1.0F / var12);
      ((Matrix4f)this.N_3).identity().translate(var2, var3, 0.0F).mul((Matrix4f)this.N_4).rotateX(var11).scale(var9, var9, 1.0F).translate(-var2, -var3, 0.0F);
   }

   private static void N() {
      y_0 = 2.5F;
      y_1 = 10000.0F;
   }
}
