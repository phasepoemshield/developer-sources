/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.system.MemoryUtil
 */
package minecraft;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryUtil;

public class class04674 {
    private class04674() {
    }

    public static double y() {
        return GLFW.glfwGetTime();
    }

    public static void N() {
        MemoryUtil.memSet((long)0L, (int)0, (long)1L);
    }
}

