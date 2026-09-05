package org.wild.mixin;

import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.VUUnVnVNNU;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.uNVVnVUNun;

@Mixin({class_743.class})
public abstract class KeyboardInputMixin {
   @Unique
   private uNVVnVUNun inputEvent;

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/Vec2f;<init>(FF)V",
         shift = Shift.BEFORE
      )}
   )
   private void onTickBeforeMovementVector(CallbackInfo var1) {
      VUUnVnVNNU.UuUVuuUu();
      class_743 var2 = (class_743)this;
      float var3 = getMovementMultiplier(var2.field_54155.comp_3159(), var2.field_54155.comp_3160());
      float var4 = getMovementMultiplier(var2.field_54155.comp_3161(), var2.field_54155.comp_3162());
      this.inputEvent = new uNVVnVUNun(var3, var4, var2.field_54155.comp_3163(), var2.field_54155.comp_3164(), var2.field_54155.comp_3165(), 0.3);
      NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)this.inputEvent);
   }

   @Redirect(
      method = {"tick"},
      at = @At(
         value = "NEW",
         target = "Lnet/minecraft/util/math/Vec2f;"
      )
   )
   private class_241 redirectVec2fCreation(float var1, float var2) {
      return this.inputEvent != null
         ? new class_241(this.inputEvent.vVvUvVVuuNvV(), this.inputEvent.uUnuvNvvNU()).method_35581()
         : new class_241(var1, var2).method_35581();
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/input/KeyboardInput;playerInput:Lnet/minecraft/util/PlayerInput;",
         opcode = 181,
         shift = Shift.AFTER
      )}
   )
   private void onTickAfterPlayerInput(CallbackInfo var1) {
      if (this.inputEvent != null) {
         class_743 var2 = (class_743)this;
         class_10185 var3 = var2.field_54155;
         class_10185 var4 = new class_10185(
            var3.comp_3159(),
            var3.comp_3160(),
            var3.comp_3161(),
            var3.comp_3162(),
            this.inputEvent.uNNnnnuuuN(),
            this.inputEvent.nuUnNvnuUu(),
            this.inputEvent.VVuuUN()
         );
         var2.field_54155 = var4;
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("RETURN")}
   )
   private void onTickReturn(CallbackInfo var1) {
      this.inputEvent = null;
   }

   @Unique
   private static float getMovementMultiplier(boolean var0, boolean var1) {
      if (var0 == var1) {
         return 0.0F;
      } else {
         return var0 ? 1.0F : -1.0F;
      }
   }
}
