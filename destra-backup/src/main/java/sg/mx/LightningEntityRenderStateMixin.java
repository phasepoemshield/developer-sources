package sg.mx;

import net.minecraft.client.render.entity.state.LightningEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import ru.destra.misc.KillEffectColorAccessor;

@Mixin(LightningEntityRenderState.class)
public class LightningEntityRenderStateMixin implements KillEffectColorAccessor {
   @Unique
   private Integer destra$killEffectColor;

   @Override
   public Integer destra$getKillEffectColor() {
      return this.destra$killEffectColor;
   }

   @Override
   public void destra$setKillEffectColor(Integer var1) {
      this.destra$killEffectColor = var1;
   }
}
