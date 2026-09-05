/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07376
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06055;
import minecraft.class06057;
import minecraft.class07376;

public final class class06063
extends Record
implements class06055 {
    private final int offset;
    public static final Codec<class06063> u = Codec.intRange((int)class07376.i, (int)class07376.u).fieldOf("below_top").xmap(class06063::new, class06063::L).codec();

    public int L() {
        return this.offset;
    }

    public class06063(int n) {
        this.offset = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06063.class, "offset", "offset"}, this, object);
    }

    public String toString() {
        return this.offset + " below top";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06063.class, "offset", "offset"}, this);
    }

    @Override
    public int N(class06057 class060572) {
        return class060572.R() - 1 + class060572.i() - this.offset;
    }
}

