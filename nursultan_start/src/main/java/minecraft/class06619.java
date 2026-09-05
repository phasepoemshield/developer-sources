/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08844
 *  org.lwjgl.glfw.GLFW
 */
package minecraft;

import minecraft.class08844;
import org.lwjgl.glfw.GLFW;

public class class06619 {
    public static final class06619 N = new class06619("default", 0L);
    private final String y;
    private final long L;

    private class06619(String string, long l) {
        this.y = string;
        this.L = l;
    }

    public String toString() {
        return this.y;
    }

    public static class06619 N(int n, String string, class06619 class066192) {
        long l = GLFW.glfwCreateStandardCursor((int)n);
        if (l == 0L) {
            return class066192;
        }
        return new class06619(string, l);
    }

    public void N(class08844 class088442) {
        GLFW.glfwSetCursor((long)class088442.B(), (long)this.L);
    }
}

