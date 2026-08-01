package sg.mx;

import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.ObjectAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.profiler.Profilers;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.event.WorldRenderEvent;
import ru.destra.event.WorldRenderStartEvent;
import ru.destra.render.Render3DUtil;
import ru.destra.render.RenderQueue;
import ru.destra.util.WorldToScreenUtil;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {
   private static final String шДф;

   @ModifyVariable(method = "render", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private boolean destra$disableVanillaBlockOutline(boolean var1) {
      DestraClient var2 = DestraClient.getInstance();
      if (var2 != null && var2.getModuleManager() != null && var2.getModuleManager().blockOverlay != null) {
         return var2.getModuleManager().blockOverlay.Д() ? false : var1;
      } else {
         return var1;
      }
   }

   @Inject(method = "render", at = @At("HEAD"))
   private void onRenderHead(
      ObjectAllocator var1, RenderTickCounter var2, boolean var3, Camera var4, GameRenderer var5, Matrix4f var6, Matrix4f var7, CallbackInfo var8
   ) {
      MatrixStack var9 = new MatrixStack();
      var9.multiplyPositionMatrix(var6);
      WorldToScreenUtil.updateMatrices(var6, var7);
      RenderQueue.clear();
      Render3DUtil.clearAll();
      DestraClient.getInstance().getEventBus().post(new WorldRenderStartEvent(var9, var2.getTickDelta(false), var6, var7, var4));
   }

   @Inject(method = "render", at = @At("RETURN"))
   private void onRenderReturn(
      ObjectAllocator var1, RenderTickCounter var2, boolean var3, Camera var4, GameRenderer var5, Matrix4f var6, Matrix4f var7, CallbackInfo var8
   ) {
      Profilers.get().swap(шДф);
      MatrixStack var9 = new MatrixStack();
      var9.multiplyPositionMatrix(var6);
      DestraClient.getInstance().getEventBus().post(new WorldRenderEvent(var9, var2.getTickDelta(false), var6, var7, var4));
      RenderQueue.flush();
      Render3DUtil.flushAll();
   }

   static {
      VMBridge.identifyClass(WorldRendererMixin.class, "0LBf1qS4");
   }
}
