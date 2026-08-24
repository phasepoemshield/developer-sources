package moscow.rockstar.module.visuals;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.render.HandRenderEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.SliderSetting;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;

@ModuleInfo(name = "View Model", category = ModuleCategory.VISUALS, desc = "Настройка положения и размера предметов в руках")
public class ViewModel extends BaseModule {
   private final SliderSetting mainTranslateX = new SliderSetting(this, "Смещение основной руки X")
      .min(-2.0F)
      .max(2.0F)
      .currentValue(0.0F)
      .step(0.05F);
   private final SliderSetting mainTranslateY = new SliderSetting(this, "Смещение основной руки Y")
      .min(-2.0F)
      .max(2.0F)
      .currentValue(0.0F)
      .step(0.05F);
   private final SliderSetting offTranslateX = new SliderSetting(this, "Смещение второй руки X")
      .min(-2.0F)
      .max(2.0F)
      .currentValue(0.0F)
      .step(0.05F);
   private final SliderSetting offTranslateY = new SliderSetting(this, "Смещение второй руки Y")
      .min(-2.0F)
      .max(2.0F)
      .currentValue(0.0F)
      .step(0.05F);
   private final SliderSetting sizeLeft = new SliderSetting(this, "Размер левой руки")
      .min(0.1F)
      .max(1.5F)
      .step(0.025F)
      .currentValue(1.0F);
   private final SliderSetting sizeRight = new SliderSetting(this, "Размер правой руки")
      .min(0.1F)
      .max(1.5F)
      .step(0.025F)
      .currentValue(1.0F);
   private final EventListener<HandRenderEvent> onHandRender = event -> {
      MatrixStack matrices = event.getMatrices();
      boolean isMain = event.getArm() == Arm.RIGHT;
      float translateX = isMain ? this.mainTranslateX.getCurrentValue() : this.offTranslateX.getCurrentValue();
      float translateY = isMain ? this.mainTranslateY.getCurrentValue() : this.offTranslateY.getCurrentValue();
      float scale = isMain ? this.sizeRight.getCurrentValue() : this.sizeLeft.getCurrentValue();
      float direction = isMain ? 1.0F : -1.0F;
      matrices.translate(translateX * direction, translateY, 0.0F);
      matrices.scale(scale, scale, scale);
   };
}
