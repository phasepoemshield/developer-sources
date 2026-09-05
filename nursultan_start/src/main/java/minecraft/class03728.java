/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  java.util.HexFormat
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HexFormat;
import minecraft.class06338;

public final class class03728
extends Record {
    private final int rgba;
    public static final Codec<class03728> N = class06338.P.xmap(class03728::new, class03728::N);

    public class03728(int n) {
        this.rgba = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03728.class, "rgba", "rgba"}, this, object);
    }

    public String toString() {
        return HexFormat.of().toHexDigits((long)this.rgba, 8);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03728.class, "rgba", "rgba"}, this);
    }

    public int N() {
        return this.rgba;
    }
}

