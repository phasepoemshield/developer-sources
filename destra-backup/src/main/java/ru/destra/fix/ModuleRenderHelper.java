package ru.destra.fix;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

public class ModuleRenderHelper {

    public static boolean renderModule(Object self, DrawContext context, int mouseX, int mouseY) {
        try {
            Class<?> selfClass = self.getClass();
            Class<?> gtiClass = Class.forName("ru.destra.gui.GuiTextInput");

            java.lang.reflect.Field xField = gtiClass.getDeclaredField("x");
            java.lang.reflect.Field yField = gtiClass.getDeclaredField("y");
            java.lang.reflect.Field wField = gtiClass.getDeclaredField("width");
            java.lang.reflect.Field hField = gtiClass.getDeclaredField("height");
            xField.setAccessible(true);
            yField.setAccessible(true);
            wField.setAccessible(true);
            hField.setAccessible(true);

            float x = xField.getFloat(self);
            float y = yField.getFloat(self);
            float w = wField.getFloat(self);
            float h = hField.getFloat(self);

            if (w <= 0 || h <= 0) return true;

            float animAlpha = 1.0f;
            try {
                Class<?> cgs = Class.forName("ru.destra.gui.ClickGuiScreen");
                java.lang.reflect.Field af = cgs.getDeclaredField("openCloseAlpha");
                af.setAccessible(true);
                Object anim = af.get(null);
                if (anim != null) {
                    java.lang.reflect.Field cv = anim.getClass().getDeclaredField("currentValue");
                    cv.setAccessible(true);
                    animAlpha = (float) cv.getDouble(anim);
                }
            } catch (Exception ignored) {}

            int bgAlpha = (int)(200 * animAlpha);
            int bg = (bgAlpha << 24) | 0x303030;
            int borderAlpha = (int)(120 * animAlpha);
            int border = (borderAlpha << 24) | 0x505050;
            int textAlpha = (int)(240 * animAlpha);
            int textColor = (textAlpha << 24) | 0xFFFFFF;

            int ix = (int) x;
            int iy = (int) y;
            int iw = (int) w;
            int ih = (int) h;

            context.fill(ix - 1, iy - 1, ix + iw + 1, iy + ih + 1, border);
            context.fill(ix, iy, ix + iw, iy + ih, bg);

            try {
                java.lang.reflect.Field mf = selfClass.getDeclaredField("module");
                mf.setAccessible(true);
                Object module = mf.get(self);
                if (module != null) {
                    java.lang.reflect.Method isEnabled = null;
                    for (java.lang.reflect.Method m : module.getClass().getDeclaredMethods()) {
                        if (m.getParameterCount() == 0 && m.getReturnType() == boolean.class) {
                            String mn = m.getName();
                            if (mn.length() <= 2 || mn.contains("nable") || mn.contains("ggled")) {
                                isEnabled = m;
                                isEnabled.setAccessible(true);
                                break;
                            }
                        }
                    }
                    boolean enabled = false;
                    if (isEnabled != null) {
                        enabled = (boolean) isEnabled.invoke(module);
                    }
                    if (enabled) {
                        int indicator = ((int)(220 * animAlpha) << 24) | 0x5070FF;
                        context.fill(ix, iy, ix + 3, iy + ih, indicator);
                    }

                    java.lang.reflect.Method getName = null;
                    for (java.lang.reflect.Method m : module.getClass().getDeclaredMethods()) {
                        if (m.getParameterCount() == 0 && (m.getReturnType() == String.class || m.getReturnType().getName().contains("Text"))) {
                            getName = m;
                            getName.setAccessible(true);
                            break;
                        }
                    }
                    if (getName != null) {
                        Object nameObj = getName.invoke(module);
                        String name = nameObj != null ? nameObj.toString() : "?";
                        MinecraftClient mc = MinecraftClient.getInstance();
                        context.drawText(mc.textRenderer, name, ix + 8, iy + (ih - 8) / 2, textColor, false);
                    }
                }
            } catch (Throwable ignored) {}

            return true;
        } catch (Throwable t) {
            return false;
        }
    }
}
