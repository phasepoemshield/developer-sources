package sg.mx;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "ru.destra.gui.CustomServerListScreen", remap = false)
public abstract class CustomServerListScreenNpeFix {

    @Inject(method = "init", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$fixNullClient(CallbackInfo ci) {
        try {
            MinecraftClient mc = MinecraftClient.getInstance();
            if (mc == null) {
                ci.cancel();
                return;
            }
            Class<?> clazz = this.getClass();
            while (clazz != null && clazz != Object.class) {
                try {
                    java.lang.reflect.Field clientField = clazz.getDeclaredField("client");
                    clientField.setAccessible(true);
                    if (clientField.get(this) == null) {
                        clientField.set(this, mc);
                    }
                } catch (NoSuchFieldException e) {
                }
                clazz = clazz.getSuperclass();
            }
        } catch (Throwable t) {
            ci.cancel();
        }
    }
}
