/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class03926
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class03926;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface class03072 {
    public static final Logger N = LogUtils.getLogger();
    public static final class03072 y = class03926::y;
    public static final class03072 L = class039262 -> {
        N.error("Received chat message from {}, but they have no chat session initialized and secure chat is enforced", (Object)class039262.M());
        return null;
    };

    public @Nullable class03926 method_45048(class03926 var1);
}

