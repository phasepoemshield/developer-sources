/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class02424
 *  minecraft.class03448
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07536
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWVidMode
 */
package minecraft;

import minecraft.class02424;
import minecraft.class02767;
import minecraft.class03448;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07536;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class class02742 {
    private static final int N = 60;
    private static final int y = 10;
    private static final int L = 30;
    private static final int u = 10;
    private static final long i = 60000L;
    private static final long R = 600000L;
    private final class05630 M;
    private final class06202 B;
    private int Z;
    private long z;

    public boolean L() {
        class02767 class027672 = this.y();
        return class027672 == class02767.field_55844 || class027672 == class02767.field_55845;
    }

    public class02742(class05630 class056302, class06202 class062022) {
        this.M = class056302;
        this.B = class062022;
        this.Z = (Integer)class056302.B().method_41753();
    }

    public void u() {
        this.z = class07536.L();
    }

    private int y(int n) {
        long l = GLFW.glfwGetPrimaryMonitor();
        if (l == 0L) {
            return n;
        }
        GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode((long)l);
        if (gLFWVidMode == null) {
            return n;
        }
        int n2 = gLFWVidMode.refreshRate();
        return n2 > 0 ? n2 : n;
    }

    public class02767 y() {
        class02424 class024242 = (class02424)this.M.z().method_41753();
        if (this.B.Nt().z()) {
            return class02767.field_55844;
        }
        if (class024242 == class02424.field_52744) {
            long l = class07536.L() - this.z;
            if (l > 600000L) {
                return class02767.field_55845;
            }
            if (l > 60000L) {
                return class02767.field_55846;
            }
        }
        if ((class03448)this.B.T_3 == null && ((class05096)this.B.v_3 != null || this.B.NZ() != null)) {
            return class02767.field_55847;
        }
        return class02767.field_55843;
    }

    public int N() {
        return switch (this.y().ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> this.Z;
            case 1 -> 10;
            case 2 -> 10;
            case 3 -> Math.min(this.Z, 30);
            case 4 -> this.y(60);
        };
    }

    public void N(int n) {
        this.Z = n;
    }
}

