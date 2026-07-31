package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.core.ModuleManager;

@Mixin(value = PlayerEntityRenderer.class, remap = false)
public abstract class BabyModDebugMixin {

    private static int logCount = 0;

    @Inject(method = "scale", at = @At("TAIL"))
    private void destra$debugBabyScale(PlayerEntityRenderState state, MatrixStack matrices, CallbackInfo ci) {
        try {
            MinecraftClient mc = MinecraftClient.getInstance();
            if (mc == null || mc.player == null) return;
            if (state.id != mc.player.getId()) return;

            if (logCount < 5) {
                logCount++;
                DestraClient dc = DestraClient.getInstance();
                String info;
                if (dc == null) {
                    info = "DestraClient=null";
                } else {
                    ModuleManager mm = dc.getModuleManager();
                    if (mm == null) {
                        info = "ModuleManager=null";
                    } else if (mm.babyMod == null) {
                        info = "babyMod=null";
                    } else {
                        info = "babyMod.enabled=" + ru.destra.misc.ModuleHelper.isEnabled(mm.babyMod);
                    }
                }
                // System.err.println("[Destra BabyDebug] scale TAIL for local player: " + info + " state.id=" + state.id);
            }
        } catch (Throwable t) {
            if (logCount < 5) {
                logCount++;
                // System.err.println("[Destra BabyDebug] error: " + t.getClass().getSimpleName() + ": " + t.getMessage());
            }
        }
    }
}
