package sg.mx;

import java.lang.reflect.Method;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(targets = "ru.destra.gui.SliderElement", remap = false)
public abstract class SliderElementBridgeMixin {

    private static Method onPress;
    private static Method onRelease;
    private static Method onChar;
    private static Method onKey;

    static {
        try {
            Class<?> cls = Class.forName("ru.destra.gui.SliderElement");
            onPress = find(cls, "onMousePressed");
            onRelease = find(cls, "onMouseReleased");
            onChar = find(cls, "onCharTyped");
            onKey = find(cls, "onKeyPressed");
        } catch (ClassNotFoundException e) {
        }
    }

    private static Method find(Class<?> cls, String name) {
        for (Method m : cls.getDeclaredMethods()) {
            if (m.getName().equals(name)) {
                m.setAccessible(true);
                return m;
            }
        }
        return null;
    }

    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (onPress != null) {
            try { onPress.invoke(this, mouseX, mouseY, button); } catch (Exception e) {}
        }
    }

    public void mouseReleased(double mouseX, double mouseY, int button) {
        if (onRelease != null) {
            try { onRelease.invoke(this, mouseX, mouseY, button); } catch (Exception e) {}
        }
    }

    public void charTyped(char chr, int modifiers) {
        if (onChar != null) {
            try { onChar.invoke(this, chr, modifiers); } catch (Exception e) {}
        }
    }

    public void keyPressed(int keyCode, int scanCode, int modifiers) {
        if (onKey != null) {
            try { onKey.invoke(this, keyCode, scanCode, modifiers); } catch (Exception e) {}
        }
    }
}
