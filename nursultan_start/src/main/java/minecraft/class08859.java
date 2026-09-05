/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11659
 *  Nursultan.class11663
 *  com.mojang.logging.LogUtils
 *  minecraft.class02255
 *  minecraft.class08238
 *  minecraft.class08523
 *  org.lwjgl.opengl.GLCapabilities
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class11659;
import Nursultan.class11663;
import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class02255;
import minecraft.class08238;
import minecraft.class08523;
import minecraft.class08861;
import minecraft.class08879;
import minecraft.class08892;
import minecraft.class08893;
import org.lwjgl.opengl.GLCapabilities;
import org.slf4j.Logger;

public abstract class class08859 {
    private static final Logger N = LogUtils.getLogger();

    public boolean y() {
        return false;
    }

    public void N(Supplier<String> supplier) {
    }

    public void N() {
    }

    public static class08859 N(GLCapabilities gLCapabilities, boolean bl, Set<String> set) {
        if (bl) {
            if (gLCapabilities.GL_KHR_debug && class08879.y) {
                set.add("GL_KHR_debug");
                return new class08892();
            }
            if (gLCapabilities.GL_EXT_debug_label && class08879.L) {
                set.add("GL_EXT_debug_label");
                return new class11663();
            }
            N.warn("Debug labels unavailable: neither KHR_debug nor EXT_debug_label are supported");
        }
        return new class11659();
    }

    public void N(class08861 class088612) {
    }

    public void N(class08893 class088932) {
    }

    public void N(class08238 class082382) {
    }

    public void N(class02255 class022552) {
    }

    public void N(class08523 class085232) {
    }
}

