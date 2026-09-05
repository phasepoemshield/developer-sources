/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00381
 *  minecraft.class00638
 *  minecraft.class03096
 *  minecraft.class04782
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00381;
import minecraft.class00458;
import minecraft.class00638;
import minecraft.class03096;
import minecraft.class04782;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07878;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00417 {
    private static final Logger N = LogUtils.getLogger();

    public static <T extends class00638> class07878 N(Exception exception, class00381<T> class003812, T t) {
        if (exception instanceof class07878) {
            class07878 class078782 = (class07878)exception;
            class00417.N(class078782.N(), t, class003812);
            return class078782;
        }
        class07080 class070802 = class07080.N((Throwable)exception, (String)"Main thread packet handler");
        class00417.N(class070802, t, class003812);
        return new class07878(class070802);
    }

    public static <T extends class00638> void N(class00381<T> class003812, T t, class04782 class047822) throws class03096 {
        class00417.N(class003812, t, class047822.method_8503().yK());
    }

    public static <T extends class00638> void N(class07080 class070802, T t, @Nullable class00381<T> class003812) {
        if (class003812 != null) {
            class07074 class070742 = class070802.N("Incoming Packet");
            class070742.N("Type", () -> class003812.method_65080().toString());
            class070742.N("Is Terminal", () -> Boolean.toString(class003812.R()));
            class070742.N("Is Skippable", () -> Boolean.toString(class003812.i()));
        }
        t.N(class070802);
    }

    public static <T extends class00638> void N(class00381<T> class003812, T t, class00458 class004582) throws class03096 {
        if (!class004582.N()) {
            class004582.N(t, class003812);
            throw class03096.N;
        }
    }
}

