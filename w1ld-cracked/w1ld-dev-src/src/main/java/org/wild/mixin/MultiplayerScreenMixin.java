package org.wild.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_500;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.UUnnuuNNvVV;

@Mixin({class_500.class})
public class MultiplayerScreenMixin extends class_437 {
   protected MultiplayerScreenMixin(class_2561 var1) {
      super(var1);
   }

   @Inject(
      method = {"init"},
      at = {@At("RETURN")}
   )
   private void addProxyButton(CallbackInfo var1) {
      byte var2 = 80;
      byte var3 = 20;
      int var4 = this.field_22789 - var2 - 5;
      byte var5 = 5;
      this.method_37063(
         class_4185.method_46430(class_2561.method_43470("Proxy"), var1x -> this.field_22787.method_1507(new UUnnuuNNvVV(this)))
            .method_46434(var4, var5, var2, var3)
            .method_46431()
      );
   }
}
