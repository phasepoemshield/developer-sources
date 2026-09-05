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

public final class class06046
extends Record
implements class06055 {
    private final int y;
    public static final Codec<class06046> u = Codec.intRange((int)class07376.i, (int)class07376.u).fieldOf("absolute").xmap(class06046::new, class06046::L).codec();

    public int L() {
        return this.y;
    }

    public class06046(int n) {
        this.y = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06046.class, "y", "y"}, this, object);
    }

    public String toString() {
        return this.y + " absolute";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06046.class, "y", "y"}, this);
    }

    @Override
    public int N(class06057 class060572) {
        return this.y;
    }
}

