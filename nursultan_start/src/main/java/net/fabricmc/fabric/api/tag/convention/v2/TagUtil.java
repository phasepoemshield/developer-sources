/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class03530
 *  minecraft.class04206
 *  minecraft.class05946
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.tag.convention.v2;

import java.util.Objects;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class03530;
import minecraft.class04206;
import minecraft.class05946;
import org.jspecify.annotations.Nullable;

public final class TagUtil {
    public static final String C_TAG_NAMESPACE = "c";
    public static final String FABRIC_TAG_NAMESPACE = "fabric";

    private TagUtil() {
    }

    public static <T> boolean isIn(class03530<T> class035302, T t) {
        return TagUtil.isIn(null, class035302, t);
    }

    public static <T> boolean isIn(@Nullable class01042 class010422, class03530<T> class035302, T t) {
        class00751 class007512;
        Optional optional;
        Objects.requireNonNull(class035302);
        Objects.requireNonNull(t);
        Optional optional2 = class010422 != null ? class010422.method_46759(class035302.N()) : class04206.NF.y(class035302.N().N());
        if (optional2.isPresent() && class035302.u(((class00751)optional2.get()).i()) && (optional = (class007512 = (class00751)optional2.get()).u(t)).isPresent()) {
            return class007512.y((class05946)optional.get()).N(class035302);
        }
        return false;
    }
}

