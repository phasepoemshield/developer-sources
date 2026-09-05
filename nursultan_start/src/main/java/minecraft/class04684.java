/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class04206
 *  minecraft.class05787
 *  minecraft.class05806
 */
package minecraft;

import minecraft.class00751;
import minecraft.class04206;
import minecraft.class04651;
import minecraft.class04652;
import minecraft.class04656;
import minecraft.class04661;
import minecraft.class04676;
import minecraft.class04688;
import minecraft.class05787;
import minecraft.class05806;

public class class04684 {
    public static final class04651 N = class04684.N("empty", new class05806());
    public static final class05787 y = class04684.N("flowing_water", new class04661());
    public static final class05787 L = class04684.N("water", new class04676());
    public static final class05787 u = class04684.N("flowing_lava", new class04656());
    public static final class05787 i = class04684.N("lava", new class04652());

    private static <T extends class04651> T N(String string, T t) {
        return (T)((class04651)class00751.N((class00751)class04206.L, (String)string, t));
    }

    static {
        for (class04651 class046512 : class04206.L) {
            for (class04688 class046882 : class046512.R().N()) {
                class04651.L.y((Object)class046882);
            }
        }
    }
}

