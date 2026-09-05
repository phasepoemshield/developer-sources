/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01042
 *  minecraft.class03530
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.tag.convention.v1;

import minecraft.class01042;
import minecraft.class03530;
import org.jspecify.annotations.Nullable;

@Deprecated
public final class TagUtil {
    private TagUtil() {
    }

    @Deprecated
    public static <T> boolean isIn(class03530<T> class035302, T t) {
        return net.fabricmc.fabric.api.tag.convention.v2.TagUtil.isIn(null, class035302, t);
    }

    @Deprecated
    public static <T> boolean isIn(@Nullable class01042 class010422, class03530<T> class035302, T t) {
        return net.fabricmc.fabric.api.tag.convention.v2.TagUtil.isIn(class010422, class035302, t);
    }
}

