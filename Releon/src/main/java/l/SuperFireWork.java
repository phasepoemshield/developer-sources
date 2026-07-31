package l;

import antidaunleak.api.annotation.Native;
import net.minecraft.util.math.Vec3d;

public class SuperFireWork extends Helper242 {
   private final Setting5 modeSetting = new Setting5("Режим", "Выберите тип режима").method2381("Grim", "Custom");
   private final Setting2 speedSetting = new Setting2("Скорость", "Скорость полета фейерверка")
      .method2078(1.0F, 50.0F)
      .method2086(20.0F)
      .method2081(() -> this.modeSetting.method2385("Custom"));

   public SuperFireWork() {
      super("SuperFireWork", "Super FireWork", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.modeSetting, this.speedSetting});
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void method1959(Event26 var1) {
      if (this.modeSetting.method2385("Grim")) {
         int var2 = Helper351.INSTANCE.method3483().method3333() > 0.0F ? 45 : -45;
         double var3 = Math.abs((Helper351.INSTANCE.method3483().method3333() + var2) % 90.0F - var2) / 45.0F;
         double var5 = 1.0 + 0.3 * var3 * var3;
         boolean var7 = Math.abs(Helper351.INSTANCE.method3496().method3334()) > 60.0F;
         Vec3d var8 = var1.method4143();
         var1.method4144(new Vec3d(var8.x * var5, var7 ? var8.y * var5 : var8.y, var8.z * var5));
      } else if (this.modeSetting.method2385("Custom")) {
         int var21 = Helper351.INSTANCE.method3483().method3333() > 0.0F ? 45 : -45;
         double var23 = Math.abs((Helper351.INSTANCE.method3483().method3333() + var21) % 90.0F - var21) / 45.0F;
         double var25 = 1.0 + 0.3 * var23 * var23;
         boolean var27 = Math.abs(Helper351.INSTANCE.method3496().method3334()) > 60.0F;
         Vec3d var29 = Helper351.INSTANCE.method3496().method3329();
         float var9 = this.speedSetting.method2082() / 20.0F;
         double var10 = var9 * var25;
         var1.method4144(new Vec3d(var29.x * var10, var27 ? var29.y * var10 : var29.y * var9, var29.z * var10));
      } else if (this.modeSetting.method2385("BravoHvH")) {
         int var22 = Helper351.INSTANCE.method3483().method3333() > 0.0F ? 45 : -45;
         double var24 = Helper351.INSTANCE.method3483().method3333();
         double var26 = Math.abs((var24 + var22) % 90.0 - var22) / 45.0;
         double var28 = 0.26;
         double var30 = var28 / 2.2;
         double var11 = var28 * var26 * var26;
         double var13 = Math.abs(var24 % 90.0) / 90.0;
         double var15 = var30 * var13 * var13;
         double var17 = 0.95 + var11 + var15;
         boolean var19 = Math.abs(Helper351.INSTANCE.method3496().method3334()) > 60.0F;
         Vec3d var20 = var1.method4143();
         var1.method4144(new Vec3d(var20.x * var17, var19 ? var20.y * var17 : var20.y, var20.z * var17));
      }
   }
}
