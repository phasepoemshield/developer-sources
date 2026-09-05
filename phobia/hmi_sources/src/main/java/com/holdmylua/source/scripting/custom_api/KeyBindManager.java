/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  org.lwjgl.glfw.GLFW
 */
package com.holdmylua.source.scripting.custom_api;

import com.holdmylua.source.annotation.Safe;
import net.minecraft.class_304;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;

public class KeyBindManager {
    class_304 key;

    @Safe
    public boolean isKeyPressed(int keyCode) {
        if (keyCode != 0) {
            long windowHandle = class_310.method_1551().method_22683().method_4490();
            return GLFW.glfwGetKey((long)windowHandle, (int)keyCode) == 1;
        }
        return false;
    }
}

