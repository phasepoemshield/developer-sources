package l;

import java.awt.Color;
import net.minecraft.util.math.MathHelper;

public class WorldTweaks extends Helper242 {
   public final Setting8 modeSetting = new Setting8("Настройки мира", "Позволяет настроить мир").method2585("Time", "Fog", "Sky Waves", "No Clouds");
   public final Setting2 timeSetting = new Setting2("Время", "Устанавливает значение времени")
      .method2086(12.0F)
      .method2079(0, 24)
      .method2081(() -> this.modeSetting.method2588("Time"));
   public final Setting2 distanceSetting = new Setting2("Дистанция тумана", "Устанавливает расстояние тумана")
      .method2086(100.0F)
      .method2079(20, 200)
      .method2081(() -> this.modeSetting.method2588("Fog"));
   public Setting7 colorSetting = new Setting7("Цвет", "Выберите цвет для esp").method2555(new Color(255, 101, 57, 255).getRGB());
   public final Setting7 skyColorSetting = new Setting7("Цвет неба", "Основной цвет волнового неба")
      .method2555(new Color(174, 55, 62, 255).getRGB())
      .method2551(
         new Color(174, 55, 62, 255).getRGB(),
         new Color(70, 105, 220, 255).getRGB(),
         new Color(135, 70, 210, 255).getRGB(),
         new Color(35, 165, 145, 255).getRGB(),
         new Color(230, 120, 45, 255).getRGB()
      )
      .method2552(() -> this.modeSetting.method2588("Sky Waves"));
   public final Setting2 skyWaveSpeed = new Setting2("Sky Waves Speed", "Animation speed")
      .method2086(0.45F)
      .method2078(0.05F, 2.0F)
      .method2081(() -> this.modeSetting.method2588("Sky Waves"));
   public final Setting2 skyWaveIntensity = new Setting2("Sky Waves Intensity", "Wave brightness and contrast")
      .method2086(1.0F)
      .method2078(0.2F, 2.5F)
      .method2081(() -> this.modeSetting.method2588("Sky Waves"));
   private int step;

   public static WorldTweaks method2811() {
      return Helper222.method1979(WorldTweaks.class);
   }

   public WorldTweaks() {
      super("WorldTweaks", "Ambience", Helper269.RENDER);
      this.setup(
         new Helper264[]{
            this.modeSetting, this.timeSetting, this.distanceSetting, this.colorSetting, this.skyColorSetting, this.skyWaveSpeed, this.skyWaveIntensity
         }
      );
   }

   @Override
   public void deactivate() {
      super.deactivate();
   }

   @Helper104
   public void method2812(Helper400 var1) {
      if (this.modeSetting.method2588("Fog")) {
         var1.method4075(this.distanceSetting.method2082());
         float var2 = MathHelper.clamp(1.0F - this.step / 50.0F, 0.1F, 1.0F);
         var1.method4076(this.colorSetting.method2553());
         var1.method582();
      }
   }
}
