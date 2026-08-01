package sg.mx;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.event.RenderEvent;
import ru.destra.event.WorldRenderEvent;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

@Mixin(targets = "ru.destra.module.TargetEspModule", remap = false)
public abstract class TargetEspDebugMixin {

    private static final AtomicInteger tickCount = new AtomicInteger();
    private static final AtomicInteger worldCount = new AtomicInteger();

    @Inject(method = "onRenderTick", at = @At("HEAD"), remap = false)
    private void destra$debugRenderTick(RenderEvent event, CallbackInfo ci) {
        int n = tickCount.incrementAndGet();
        if (n % 60 == 1) {
            try {
                Object self = (Object) this;
                Class<?> clazz = self.getClass();
                Object targetVal = null, animVal = null;
                boolean enabled = false;
                for (Field f : clazz.getDeclaredFields()) {
                    f.setAccessible(true);
                    if (f.getType() == LivingEntity.class && !java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                        Object v = f.get(self);
                        if (v != null && targetVal == null) targetVal = v;
                    }
                    if ("ru.destra.animation.TimedAnimation".equals(f.getType().getName())
                            && !java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                        Object v = f.get(self);
                        if (v != null && animVal == null) {
                            animVal = v;
                        }
                    }
                    if ("enabled".equals(f.getName()) && f.getType() == boolean.class) {
                        enabled = f.getBoolean(self);
                    }
                }
                double animValue = -1;
                if (animVal != null) {
                    try {
                        animValue = (double) animVal.getClass().getMethod("getValue").invoke(animVal);
                    } catch (Throwable ignored) {}
                }
                // Removed console spam
            } catch (Throwable e) {
                // Removed console spam
            }
        }
    }

    @Inject(method = "onWorldRender", at = @At("HEAD"), remap = false)
    private void destra$debugWorldRender(WorldRenderEvent event, CallbackInfo ci) {
        int n = worldCount.incrementAndGet();
        if (n % 60 == 1) {
            try {
                Object self = (Object) this;
                Class<?> clazz = self.getClass();
                LivingEntity target = null, prevTarget = null;
                Object anim1 = null, anim2 = null;
                for (Field f : clazz.getDeclaredFields()) {
                    f.setAccessible(true);
                    if (f.getType() == LivingEntity.class && !java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                        LivingEntity val = (LivingEntity) f.get(self);
                        if (val != null) {
                            if (target == null) target = val;
                            else if (prevTarget == null) prevTarget = val;
                        }
                    }
                    if ("ru.destra.animation.TimedAnimation".equals(f.getType().getName())
                            && !java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
                        Object v = f.get(self);
                        if (v != null) {
                            if (anim1 == null) anim1 = v;
                            else if (anim2 == null) anim2 = v;
                        }
                    }
                }
                double a1 = -1, a2 = -1;
                if (anim1 != null) try { a1 = (double) anim1.getClass().getMethod("getValue").invoke(anim1); } catch (Throwable ignored) {}
                if (anim2 != null) try { a2 = (double) anim2.getClass().getMethod("getValue").invoke(anim2); } catch (Throwable ignored) {}

                // Removed console spam
            } catch (Throwable e) {
                // Removed console spam
            }
        }
    }
}
