/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06563
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06563;
import minecraft.class07892;
import minecraft.class07899;

public final class class07890
extends Record {
    private final class07892 pattern;
    private final class06563 baseColor;
    private final class06563 patternColor;
    public static final Codec<class07890> N = Codec.INT.xmap(class07890::new, class07890::N);

    public class06563 L() {
        return this.baseColor;
    }

    public class07890(int n) {
        this(class07899.u(n), class07899.y(n), class07899.L(n));
    }

    public class07890(class07892 class078922, class06563 class065632, class06563 class065633) {
        this.pattern = class078922;
        this.baseColor = class065632;
        this.patternColor = class065633;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07890.class, "pattern;baseColor;patternColor", "pattern", "baseColor", "patternColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07890.class, "pattern;baseColor;patternColor", "pattern", "baseColor", "patternColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07890.class, "pattern;baseColor;patternColor", "pattern", "baseColor", "patternColor"}, this);
    }

    public class06563 u() {
        return this.patternColor;
    }

    public class07892 y() {
        return this.pattern;
    }

    public int N() {
        return class07899.N(this.pattern, this.baseColor, this.patternColor);
    }
}

