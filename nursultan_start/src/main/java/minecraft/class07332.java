/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07345
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07345;

public final class class07332
extends Record
implements class07345 {
    private final int blockBinding;

    public class07332(int n) {
        this.blockBinding = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07332.class, "blockBinding", "blockBinding"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07332.class, "blockBinding", "blockBinding"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07332.class, "blockBinding", "blockBinding"}, this);
    }

    public int N() {
        return this.blockBinding;
    }
}

