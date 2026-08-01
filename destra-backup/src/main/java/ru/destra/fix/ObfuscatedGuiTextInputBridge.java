package ru.destra.fix;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.gui.DrawContext;

public final class ObfuscatedGuiTextInputBridge {
    private static final Map<Class<?>, Handles> CACHE = new ConcurrentHashMap<>();

    private ObfuscatedGuiTextInputBridge() {
    }

    public static void mouseClicked(Object self, double mouseX, double mouseY, int button) {
        invoke(self, CACHE.computeIfAbsent(self.getClass(), ObfuscatedGuiTextInputBridge::resolve).click, mouseX, mouseY, button);
    }

    public static void mouseReleased(Object self, double mouseX, double mouseY, int button) {
        Method release = CACHE.computeIfAbsent(self.getClass(), ObfuscatedGuiTextInputBridge::resolve).release;
        if (release != null) {
            invoke(self, release, mouseX, mouseY, button);
        }
    }

    public static void charTyped(Object self, char chr, int modifiers) {
        invoke(self, CACHE.computeIfAbsent(self.getClass(), ObfuscatedGuiTextInputBridge::resolve).charTyped, chr, modifiers);
    }

    public static void keyPressed(Object self, int keyCode, int scanCode, int modifiers) {
        invoke(self, CACHE.computeIfAbsent(self.getClass(), ObfuscatedGuiTextInputBridge::resolve).keyPressed, keyCode, scanCode, modifiers);
    }

    public static void mouseScrolled(Object self, double mouseX, double mouseY, int amount) {
        Method scroll = CACHE.computeIfAbsent(self.getClass(), ObfuscatedGuiTextInputBridge::resolve).scroll;
        if (scroll != null) {
            invoke(self, scroll, mouseX, mouseY, amount);
        }
    }

    public static void render(Object self, DrawContext context, int mouseX, int mouseY) {
        invoke(self, CACHE.computeIfAbsent(self.getClass(), ObfuscatedGuiTextInputBridge::resolve).render, context, mouseX, mouseY);
    }

    private static Handles resolve(Class<?> type) {
        Method render = null;
        Method keyPressed = null;
        Method charTyped = null;
        List<Method> doubleDoubleInt = new ArrayList<>(2);

        for (Method method : type.getDeclaredMethods()) {
            method.setAccessible(true);
            Class<?>[] params = method.getParameterTypes();
            if (matches(params, DrawContext.class, int.class, int.class) && !"render".equals(method.getName())) {
                render = method;
            } else if (matches(params, int.class, int.class, int.class) && !"keyPressed".equals(method.getName())) {
                keyPressed = method;
            } else if (matches(params, char.class, int.class) && !"charTyped".equals(method.getName())) {
                charTyped = method;
            } else if (matches(params, double.class, double.class, int.class) && !"mouseClicked".equals(method.getName()) && !"mouseScrolled".equals(method.getName())) {
                doubleDoubleInt.add(method);
            }
        }

        Method click = null;
        Method scroll = null;
        Method release = null;
        if (render != null) {
            for (Method method : doubleDoubleInt) {
                if (method.getName().equals(render.getName())) {
                    click = method;
                    break;
                }
            }
        }
        if (click == null && doubleDoubleInt.size() == 1) {
            click = doubleDoubleInt.getFirst();
        }
        for (Method method : doubleDoubleInt) {
            if (method != click) {
                if (method.getName().equals("onMouseRelease") || method.getName().equals("onMouseReleased")) {
                    release = method;
                } else {
                    scroll = method;
                }
            }
        }

        return new Handles(render, click, keyPressed, charTyped, scroll, release);
    }

    private static boolean matches(Class<?>[] actual, Class<?>... expected) {
        if (actual.length != expected.length) {
            return false;
        }
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != expected[i]) {
                return false;
            }
        }
        return true;
    }

    private static void invoke(Object self, Method method, Object... args) {
        if (method == null) {
            throw new IllegalStateException("Missing obfuscated GUI bridge for " + self.getClass().getName());
        }

        try {
            method.invoke(self, args);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to invoke obfuscated GUI bridge for " + self.getClass().getName(), e);
        }
    }

    private record Handles(
        Method render,
        Method click,
        Method keyPressed,
        Method charTyped,
        Method scroll,
        Method release
    ) {
    }
}
