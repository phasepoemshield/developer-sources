/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00295;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;

public final class class00268
extends Record {
    private final class00295 contents;
    private final byte flags;
    public static final byte N = 1;
    public static final byte y = 2;
    public static final class02362<class04247, class00268> L = class02362.N(class00295.N, class00268::L, (class02362)class02389.L, class00268::u, class00268::new);

    public class00295 L() {
        return this.contents;
    }

    public class00268(class00295 class002952, boolean bl, boolean bl2) {
        this(class002952, (byte)((bl ? 1 : 0) | (bl2 ? 2 : 0)));
    }

    public class00268(class00295 class002952, byte by) {
        this.contents = class002952;
        this.flags = by;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00268.class, "contents;flags", "contents", "flags"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00268.class, "contents;flags", "contents", "flags"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00268.class, "contents;flags", "contents", "flags"}, this);
    }

    public byte u() {
        return this.flags;
    }

    public boolean y() {
        return (this.flags & 2) != 0;
    }

    public boolean N() {
        return (this.flags & 1) != 0;
    }
}

