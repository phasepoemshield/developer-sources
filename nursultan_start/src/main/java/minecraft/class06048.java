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

public final class class06048
extends Record
implements class06055 {
    private final int offset;
    public static final Codec<class06048> u = Codec.intRange((int)class07376.i, (int)class07376.u).fieldOf("above_bottom").xmap(class06048::new, class06048::L).codec();

    public int L() {
        return this.offset;
    }

    public class06048(int n) {
        this.offset = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06048.class, "offset", "offset"}, this, object);
    }

    public String toString() {
        return this.offset + " above bottom";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06048.class, "offset", "offset"}, this);
    }

    @Override
    public int N(class06057 class060572) {
        return class060572.i() + this.offset;
    }
}

