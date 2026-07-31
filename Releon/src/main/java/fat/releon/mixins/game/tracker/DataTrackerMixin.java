package fat.releon.mixins.game.tracker;

import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandler;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.util.math.EulerAngle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({DataTracker.class})
public abstract class DataTrackerMixin {
   public DataTrackerMixin() {
   }

   @Inject(
      method = {"set(Lnet/minecraft/entity/data/TrackedData;Ljava/lang/Object;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private <T> void onSet(TrackedData<T> var1, T var2, CallbackInfo var3) {
      TrackedDataHandler var4 = var1.dataType();
      if (var4 == TrackedDataHandlerRegistry.BYTE && !(var2 instanceof Byte)) {
         var3.cancel();
      }

      if (var4 == TrackedDataHandlerRegistry.ROTATION && !(var2 instanceof EulerAngle)) {
         var3.cancel();
      }
   }
}
