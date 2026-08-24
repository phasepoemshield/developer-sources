package moscow.rockstar.module.visuals;

import lombok.Generated;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.mixins.EntityRenderStateAddition;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.entity.Entity;

@ModuleInfo(name = "Anti Invisible", category = ModuleCategory.VISUALS, desc = "Подсветка невидимых игроков и сущностей")
public class AntiInvisible extends BaseModule {
   private final SliderSetting opacity = new SliderSetting(this, "Прозрачность")
      .min(10.0F)
      .max(100.0F)
      .step(1.0F)
      .currentValue(50.0F)
      .suffix(number -> "%");

   public boolean shouldModifyOpacity(EntityRenderState renderState) {
      Entity entity = ((EntityRenderStateAddition)renderState).rockstar$getEntity();
      return entity.isInvisible();
   }

   @Generated
   public SliderSetting getOpacity() {
      return this.opacity;
   }
}
