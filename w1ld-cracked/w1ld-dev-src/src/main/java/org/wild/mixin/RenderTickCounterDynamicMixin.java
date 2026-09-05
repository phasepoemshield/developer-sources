package org.wild.mixin;

import it.unimi.dsi.fastutil.floats.FloatUnaryOperator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_9779.class_9781;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NvvuNnNU;

@Environment(EnvType.CLIENT)
@Mixin({class_9781.class})
public class RenderTickCounterDynamicMixin {
   @Shadow
   private float field_51958;
   @Shadow
   private float field_51959;
   @Shadow
   private long field_51962;
   @Shadow
   @Final
   private float field_51964;
   @Shadow
   @Final
   private FloatUnaryOperator field_51965;

   @Inject(
      method = {"beginRenderTick(J)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$timer(long var1, CallbackInfoReturnable<Integer> var3) {
      if (NvvuNnNU.NVNnnvnuunNv != 1.0F) {
         this.field_51958 = (float)(var1 - this.field_51962) / this.field_51965.apply(this.field_51964) * NvvuNnNU.NVNnnvnuunNv;
         this.field_51962 = var1;
         this.field_51959 = this.field_51959 + this.field_51958;
         int var4 = (int)this.field_51959;
         this.field_51959 -= var4;
         var3.setReturnValue(var4);
      }
   }
}
