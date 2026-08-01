package sg.mx;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "ru/destra/module/HudModule", remap = false)
public abstract class HudModuleForceHideMixin {

    @Inject(method = "forceHide", at = @At("HEAD"), cancellable = true, remap = false)
    private void destra$cancelForceHideIfTimerNull(CallbackInfo ci) {
        try {
            Class<?> hudModuleClass = Class.forName("ru.destra.module.HudModule");
            java.lang.reflect.Field scaleAnimField = hudModuleClass.getDeclaredField("scaleAnimation");
            scaleAnimField.setAccessible(true);
            Object scaleAnim = scaleAnimField.get(this);
            if (scaleAnim == null) {
                ci.cancel();
                return;
            }
            Class<?> animClass = scaleAnim.getClass();
            while (animClass != null) {
                for (java.lang.reflect.Field f : animClass.getDeclaredFields()) {
                    f.setAccessible(true);
                    if (f.getType().getName().equals("ru.destra.util.CooldownTimer")) {
                        if (f.get(scaleAnim) == null) {
                            try {
                                Class<?> timerClass = Class.forName("ru.destra.util.CooldownTimer");
                                Object timer = timerClass.getDeclaredConstructor().newInstance();
                                f.set(scaleAnim, timer);
                            } catch (Throwable ignored) {}
                        }
                    }
                }
                animClass = animClass.getSuperclass();
            }
        } catch (Throwable ignored) {}
    }
}
