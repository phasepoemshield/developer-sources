package moscow.rockstar.module.visuals;

import lombok.Generated;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.ColorSetting;
import moscow.rockstar.config.settings.RangeSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.colors.Colors;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
@ModuleInfo(name = "Custom Fog", category = ModuleCategory.VISUALS, desc = "Настройка тумана (дистанция, цвет, размытие)")
public class CustomFog extends BaseModule {
   private final RangeSetting distance = new RangeSetting(this, "Дистанция тумана")
      .min(0.0F)
      .max(100.0F)
      .step(0.5F)
      .firstValue(2.0F)
      .secondValue(50.0F);
   private final BooleanSetting fogColorEnabled = new BooleanSetting(this, "Цвет тумана включен").enabled(true);
   private final BooleanSetting themeSync = new BooleanSetting(this, "Синхронизация с темой", () -> !this.fogColorEnabled.isEnabled()).enabled(true);
   private final ColorSetting fogColor = new ColorSetting(this, "Цвет тумана", () -> !this.fogColorEnabled.isEnabled() || this.themeSync.isEnabled())
      .color(Colors.getAccent())
      .alpha(false);
   private final BooleanSetting depthBlur = new BooleanSetting(this, "Размытие глубины");
   private final SliderSetting blurStrength = new SliderSetting(this, "Сила размытия", () -> !this.depthBlur.isEnabled())
      .min(0.1F)
      .max(10.0F)
      .step(0.05F)
      .currentValue(1.0F);
   private final SliderSetting blurOffset = new SliderSetting(this, "Смещение размытия", () -> !this.depthBlur.isEnabled())
      .min(0.05F)
      .max(12.0F)
      .step(0.05F)
      .currentValue(1.0F);
   private final BooleanSetting noSkyBlur = new BooleanSetting(this, "Без размытия неба", () -> !this.depthBlur.isEnabled());

   public boolean shouldModifyFog(Camera camera) {
      if (this.isEnabled() && mc.world != null && mc.player != null) {
         Entity entity = camera.getFocusedEntity();
         if (camera.getSubmersionType() == CameraSubmersionType.WATER) {
            return false;
         } else if (camera.getSubmersionType() == CameraSubmersionType.LAVA) {
            return false;
         } else if (camera.getSubmersionType() == CameraSubmersionType.POWDER_SNOW) {
            return false;
         } else {
            if (entity instanceof LivingEntity livingEntity) {
               if (livingEntity.hasStatusEffect(StatusEffects.BLINDNESS)) {
                  return false;
               }

               if (livingEntity.hasStatusEffect(StatusEffects.NIGHT_VISION)) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public boolean shouldApplyDepthBlur(Camera camera) {
      return this.depthBlur.isEnabled() && this.shouldModifyFog(camera);
   }

   @Generated
   public RangeSetting getDistance() {
      return this.distance;
   }

   public ColorRGBA getEffectiveFogColor() {
      return this.themeSync.isEnabled() ? Colors.getAccent() : this.fogColor.getColor();
   }

   @Generated
   public BooleanSetting getFogColorEnabled() {
      return this.fogColorEnabled;
   }

   @Generated
   public BooleanSetting getThemeSync() {
      return this.themeSync;
   }

   @Generated
   public ColorSetting getFogColor() {
      return this.fogColor;
   }

   @Generated
   public BooleanSetting getDepthBlur() {
      return this.depthBlur;
   }

   @Generated
   public SliderSetting getBlurStrength() {
      return this.blurStrength;
   }

   @Generated
   public SliderSetting getBlurOffset() {
      return this.blurOffset;
   }

   @Generated
   public BooleanSetting getNoSkyBlur() {
      return this.noSkyBlur;
   }
}
