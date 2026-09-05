package org.wild.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_412;
import net.minecraft.class_4185;
import net.minecraft.class_433;
import net.minecraft.class_437;
import net.minecraft.class_638;
import net.minecraft.class_639;
import net.minecraft.class_642;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.UvuuunvnNNUU;
import ru.metaculture.protection.VvVVnnNNNuV;
import ru.metaculture.protection.nvnvNnuUVNV;
import ru.metaculture.protection.uNuVuVnNnu;
import ru.metaculture.protection.uVuVNVuuN;

@Mixin({class_433.class})
public abstract class GameMenuScreenMixin extends class_437 {
   @Shadow
   private class_4185 field_40792;
   @Unique
   private class_4185 wild$reconnectButton;

   protected GameMenuScreenMixin(class_2561 var1) {
      super(var1);
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void wild$disablePvpSafeDisconnectButton(CallbackInfo var1) {
      this.wild$initReconnectButton();
      if (this.field_40792 != null && UvuuunvnNNUU.UuuNnUvUuv()) {
         this.field_40792.field_22763 = false;
      }

      if (this.wild$reconnectButton != null && UvuuunvnNNUU.UuuNnUvUuv()) {
         this.wild$reconnectButton.field_22763 = false;
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void wild$keepPvpSafeDisconnectButtonDisabled(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.field_40792 != null && UvuuunvnNNUU.UuuNnUvUuv()) {
         this.field_40792.field_22763 = false;
      }

      if (this.wild$reconnectButton != null) {
         boolean var6 = this.wild$hasReconnectTarget();
         this.wild$reconnectButton.field_22764 = var6;
         this.wild$reconnectButton.field_22763 = var6 && this.wild$canReconnect();
      }
   }

   @Unique
   private void wild$initReconnectButton() {
      if (this.field_40792 != null && this.wild$hasReconnectTarget()) {
         int var1 = this.field_40792.method_46426();
         int var2 = this.field_40792.method_46427();
         this.field_40792.method_55444(100, this.field_40792.method_25364(), var1, var2);
         this.wild$reconnectButton = class_4185.method_46430(class_2561.method_43470("Перезаход"), var1x -> this.wild$reconnect())
            .method_46434(var1 + 104, var2, 100, this.field_40792.method_25364())
            .method_46431();
         this.method_37063(this.wild$reconnectButton);
      }
   }

   @Unique
   private boolean wild$canReconnect() {
      return this.wild$hasReconnectTarget() && !UvuuunvnNNUU.UuuNnUvUuv();
   }

   @Unique
   private boolean wild$hasReconnectTarget() {
      class_310 var1 = this.field_22787;
      if (!uVuVNVuuN.uVunuUNVVUUV && var1 != null && !var1.method_1542()) {
         class_642 var2 = var1.method_1558();
         return var2 != null && var2.field_3761 != null && !var2.field_3761.isBlank();
      } else {
         return false;
      }
   }

   @Unique
   private void wild$reconnect() {
      class_310 var1 = this.field_22787;
      if (this.wild$canReconnect()) {
         class_642 var2 = var1.method_1558();
         if (var2 != null && var2.field_3761 != null && !var2.field_3761.isBlank()) {
            class_642 var3 = new class_642(var2.field_3752, var2.field_3761, var2.method_55616());
            var3.method_2996(var2);
            class_639 var4 = class_639.method_2950(var3.field_3761);
            nvnvNnuUVNV.UuUVuuUu();
            class_433.method_72130(var1, class_638.field_61021);
            class_412.method_36877(new uNuVuVnNnu(new VvVVnnNNNuV()), var1, var4, var3, false, null);
         }
      }
   }
}
