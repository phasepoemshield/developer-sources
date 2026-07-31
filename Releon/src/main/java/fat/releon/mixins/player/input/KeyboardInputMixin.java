package fat.releon.mixins.player.input;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import l.Helper124;
import l.Helper336;
import l.Helper351;
import l.Helper352;
import l.Helper379;
import l.Helper59;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({KeyboardInput.class})
public class KeyboardInputMixin extends InputMixin {
   public KeyboardInputMixin() {
   }

   @ModifyExpressionValue(
      method = {"tick"},
      at = {@At(
         value = "NEW",
         target = "(ZZZZZZZ)Lnet/minecraft/util/PlayerInput;"
      )}
   )
   private PlayerInput tickHook(PlayerInput var1) {
      Helper379 var2 = new Helper379(var1);
      Helper124.method1026(var2);
      Helper59.method656(var2);
      return this.transformInput(var2.method3776());
   }

   @Unique
   private PlayerInput transformInput(PlayerInput var1) {
      Helper351 var2 = Helper351.INSTANCE;
      Helper336 var3 = var2.method3525();
      Helper352 var4 = var2.method3499();
      if (mc.player != null && var3 != null && var4 != null && var4.method3547() && var4.method3549()) {
         float var5 = mc.player.getYaw() - var3.method3333();
         float var6 = KeyboardInput.getMovementMultiplier(var1.forward(), var1.backward());
         float var7 = KeyboardInput.getMovementMultiplier(var1.left(), var1.right());
         float var8 = var7 * MathHelper.cos(var5 * (float) (Math.PI / 180.0)) - var6 * MathHelper.sin(var5 * (float) (Math.PI / 180.0));
         float var9 = var6 * MathHelper.cos(var5 * (float) (Math.PI / 180.0)) + var7 * MathHelper.sin(var5 * (float) (Math.PI / 180.0));
         int var10 = Math.round(var8);
         int var11 = Math.round(var9);
         return new PlayerInput(var11 > 0.0F, var11 < 0.0F, var10 > 0.0F, var10 < 0.0F, var1.jump(), var1.sneak(), var1.sprint());
      } else {
         return var1;
      }
   }
}
