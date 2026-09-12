package Nursultan;

import minecraft.class01054;
import minecraft.class05216;
import minecraft.class07049;
import org.joml.Vector4f;

public abstract class class11051<T extends class07049> extends class11817 {
   public Object N_0;

   public class05216 L(T var1) {
      return var1.method_5476().L();
   }

   private void L() {
   }

   public void L(class01054 var1, class09093 var2, Vector4f var3, T var4) {
   }

   public class11051(EntityESP var1, String var2, boolean var3) {
      super(var2, var3);
      this.L();
      this.N_0 = var1;
   }

   public int u(T var1) {
      return -1442182646;
   }

   public int y(T var1) {
      return -1;
   }

   public void y(class01054 var1, class09093 var2, Vector4f var3, T var4) {
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, T var4) {
      this.N(var1, var2, var3, (T)var4, this.L((T)var4), this.y((T)var4), this.u((T)var4));
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, T var4, int var5) {
      this.L();
      float var6 = var3.x;
      float var7 = var3.y;
      float var8 = var3.z - var6;
      float var9 = var3.w - var7;
      int var10 = -1291187702;
      float var11 = 1.0F;
      class11174 var12 = (class11174)class11190.y_3;
      class11176.N(var12.u(), var6 - 1.0F, var7 - 1.0F, 3.0F, var9 + 2.0F, var10);
      class11176.N(var12.u(), var6 - 1.0F + var8, var7 - 1.0F, 3.0F, var9 + 2.0F, var10);
      class11176.N(var12.u(), var6 + 2.0F, var7 - 1.0F, var8 - 3.0F, 3.0F, var10);
      class11176.N(var12.u(), var6 + 2.0F, var7 - 2.0F + var9, var8 - 3.0F, 3.0F, var10);
      class11176.N(var12.u(), var6, var7, 1.0F, var9, var5);
      class11176.N(var12.u(), var6 + var8, var7, 1.0F, var9, var5);
      class11176.N(var12.u(), var6 + 1.0F, var7, var8 - 1.0F, 1.0F, var5);
      class11176.N(var12.u(), var6 + 1.0F, var7 + var9 - 1.0F, var8 - 1.0F, 1.0F, var5);
      float var14 = (((EntityESP)this.N_0).m().i() - 4.0F) / 4.0F;
      var3.y = (float)Math.round(var3.y - var14);
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, T var4, int var5, int var6) {
   }

   public void N(class01054 var1, class09093 var2, Vector4f var3, T var4, class05216 var5, int var6, int var7) {
      this.L();
      float var8 = ((EntityESP)this.N_0).m().i();
      float var9 = (var8 - 4.0F) / 4.0F;
      float var10 = var2.N(var8, class09079.REGULAR, false) + var9;
      var3.y -= var10;
      float var11 = var3.x();
      float var12 = var3.y();
      float var13 = var3.z();
      float var14 = var11 + (var13 - var11) * 0.5F;
      float var15 = var2.y(var5, var8, class09079.REGULAR, false);
      float var16 = var14 - var15 / 2.0F;
      var2.y(var5).N(var16, var12).N(var8).y(var7).u(var9).N(class09079.REGULAR).i(var6).L();
   }
}
