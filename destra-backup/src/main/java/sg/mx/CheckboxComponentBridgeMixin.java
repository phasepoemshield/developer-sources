package sg.mx;

import java.lang.reflect.Method;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(targets = "ru.destra.gui.CheckboxComponent", remap = false)
public abstract class CheckboxComponentBridgeMixin {

    private static Method onClick;
    private static Method onChar;
    private static Method onKey;

    static {
        try {
            Class<?> cls = Class.forName("ru.destra.gui.CheckboxComponent");
            onClick = find(cls, "onMouseClicked");
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
        if (onClick != null) {
            try { onClick.invoke(this, mouseX, mouseY, button); } catch (Exception e) {}
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
