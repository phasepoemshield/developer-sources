package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;

@Mixin(InventoryScreen.class)
public abstract class InventoryScreenMixin {
   @Unique
   private static final ThreadLocal<Boolean> destra$skipScissor = ThreadLocal.withInitial(() -> false);

   @Inject(method = "drawEntity", at = @At("HEAD"))
   private static void destra$onDrawEntityHead(
      DrawContext var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, LivingEntity var9, CallbackInfo var10
   ) {
      MinecraftClient var11 = MinecraftClient.getInstance();
      DestraClient var12 = DestraClient.getInstance();
      boolean var13 = false;
      if (var12 != null
         && var12.getModuleManager() != null
         && var12.getModuleManager().selfNametag != null
         && var12.getModuleManager().selfNametag.Д()
         && var11.player != null
         && var9.getId() == var11.player.getId()
         && !var11.player.isInvisible()
         && var11.currentScreen instanceof InventoryScreen) {
         var13 = true;
      }

      destra$skipScissor.set(var13);
   }

   @Inject(method = "drawEntity", at = @At("TAIL"))
   private static void destra$onDrawEntityTail(
      DrawContext var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, LivingEntity var9, CallbackInfo var10
   ) {
      destra$skipScissor.set(false);
   }

   @Redirect(method = "drawEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;enableScissor(IIII)V"))
   private static void destra$redirectEnableScissor(DrawContext var0, int var1, int var2, int var3, int var4) {
      if (!destra$skipScissor.get()) {
         var0.enableScissor(var1, var2, var3, var4);
      }
   }

   @Redirect(method = "drawEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;disableScissor()V"))
   private static void destra$redirectDisableScissor(DrawContext var0) {
      if (!destra$skipScissor.get()) {
         var0.disableScissor();
      }
   }
}
