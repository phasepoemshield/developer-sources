/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class04760
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWVidMode
 *  org.lwjgl.glfw.GLFWVidMode$Buffer
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import minecraft.class04760;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public final class class06221 {
    private final long N;
    private final List<class04760> y;
    private class04760 L;
    private int u;
    private int i;

    public int L() {
        return this.u;
    }

    public class06221(long l) {
        this.N = l;
        this.y = Lists.newArrayList();
        this.N();
    }

    public String toString() {
        return String.format(Locale.ROOT, "Monitor[%s %sx%s %s]", this.N, this.u, this.i, this.L);
    }

    public int i() {
        return this.y.size();
    }

    public int u() {
        return this.i;
    }

    public class04760 y() {
        return this.L;
    }

    public class04760 N(Optional<class04760> optional) {
        if (optional.isPresent()) {
            class04760 class047602 = optional.get();
            for (class04760 class047603 : this.y) {
                if (!class047603.equals((Object)class047602)) continue;
                return class047603;
            }
        }
        return this.y();
    }

    public int N(class04760 class047602) {
        return this.y.indexOf(class047602);
    }

    public class04760 N(int n) {
        return this.y.get(n);
    }

    public void N() {
        Object object;
        this.y.clear();
        GLFWVidMode.Buffer buffer = GLFW.glfwGetVideoModes((long)this.N);
        for (int i = buffer.limit() - 1; i >= 0; --i) {
            buffer.position(i);
            object = new class04760(buffer);
            if (object.L() < 8 || object.u() < 8 || object.i() < 8) continue;
            this.y.add((class04760)object);
        }
        int[] nArray = new int[1];
        object = new int[1];
        GLFW.glfwGetMonitorPos((long)this.N, (int[])nArray, (int[])object);
        this.u = nArray[0];
        this.i = object[0];
        GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode((long)this.N);
        this.L = new class04760(gLFWVidMode);
    }

    public long R() {
        return this.N;
    }
}

