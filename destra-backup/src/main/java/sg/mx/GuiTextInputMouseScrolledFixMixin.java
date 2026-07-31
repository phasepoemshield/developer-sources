package sg.mx;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.gui.GuiTextInput;

@Mixin(GuiTextInput.class)
public abstract class GuiTextInputMouseScrolledFixMixin {

    private static final Map<Class<?>, Method> RELEASE_CACHE = new ConcurrentHashMap<>();

    @Inject(method = "mouseScrolled", at = @At("HEAD"), remap = false)
    private void destra$fixSliderRelease(double mouseX, double mouseY, int amount, CallbackInfo ci) {
        Object self = (Object) this;
        Class<?> cls = self.getClass();
        Method release = RELEASE_CACHE.computeIfAbsent(cls, GuiTextInputMouseScrolledFixMixin::resolveRelease);
        if (release != null) {
            try {
                release.invoke(self, mouseX, mouseY, amount);
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static Method resolveRelease(Class<?> cls) {
        for (Class<?> c = cls; c != null && c != Object.class; c = c.getSuperclass()) {
            for (Method m : c.getDeclaredMethods()) {
                if (m.getName().equals("onMouseReleased")
                        && m.getParameterCount() == 3
                        && m.getParameterTypes()[0] == double.class
                        && m.getParameterTypes()[1] == double.class
                        && m.getParameterTypes()[2] == int.class) {
                    m.setAccessible(true);
                    return m;
                }
            }
        }
        return null;
    }
}
