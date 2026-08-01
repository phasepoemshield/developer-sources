package l;

import net.minecraft.util.math.MathHelper;

public class CameraSettings extends Helper242 {
   private float fov = 110.0F;
   private float smoothFov = 30.0F;
   private float lastChangedFov = 30.0F;
   static Setting3 clipSetting = new Setting3("Сквозь блоки", "Камера проходит сквозь блоки").method2201(true);
   private Setting2 distanceSetting = new Setting2("Дистанция камеры", "Настройка расстояния камеры").method2086(3.0F).method2078(2.0F, 15.0F);
   private Setting9 zoomSetting = new Setting9("Зум", "Клавиша для увеличения камеры");

   public static CameraSettings method2210() {
      return Helper222.method1979(CameraSettings.class);
   }

   public CameraSettings() {
      super("CameraSettings", "CameraSettings", Helper269.RENDER);
      this.setup(new Helper264[]{clipSetting, this.zoomSetting, this.distanceSetting});
   }

   @Helper104
   public void method2211(Event17 var1) {
      if (var1.method3903(this.zoomSetting.getKey())) {
         this.fov = Math.min(this.lastChangedFov, (float)(mc.options.getFov().getValue() - 20));
      }

      if (var1.method3906(this.zoomSetting.getKey(), true)) {
         this.lastChangedFov = this.fov;
         this.fov = mc.options.getFov().getValue().intValue();
      }
   }

   @Helper104
   public void method2212(Helper428 var1) {
      if (Helper38.method543(this.zoomSetting)) {
         this.fov = (int)MathHelper.clamp(this.fov - var1.method4388() * 10.0, 10.0, (double)mc.options.getFov().getValue().intValue());
         var1.method582();
      }
   }

   @Helper104
   public void method2213(Helper437 var1) {
      var1.method4552(
         (int)MathHelper.clamp(
            (this.smoothFov = Helper147.method1250(1.6, this.smoothFov, this.fov)) + 1.0F, 10.0F, (float)mc.options.getFov().getValue().intValue()
         )
      );
      var1.method582();
   }

   @Helper104
   public void method2214(Helper378 var1) {
      var1.method3741(clipSetting.method2200());
      var1.method3742(this.distanceSetting.method2082());
      FreeLook var2 = Helper222.method1979(FreeLook.class);
      if (!var2.isState() || !Helper38.method543(FreeLook.freeLookSetting)) {
         var1.method3743(Helper349.method3473());
      }

      var1.method582();
   }
}
