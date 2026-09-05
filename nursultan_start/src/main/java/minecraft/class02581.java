/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class01662
 *  minecraft.class02231
 *  minecraft.class02243
 *  minecraft.class02362
 *  minecraft.class02885
 *  minecraft.class02897
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00381;
import minecraft.class01662;
import minecraft.class02231;
import minecraft.class02243;
import minecraft.class02362;
import minecraft.class02885;
import minecraft.class02897;

public final class class02581
extends Record
implements class00381<class01662> {
    private final List<class02231> links;
    public static final class02362<ByteBuf, class02581> N = class02362.N((class02362)class02243.L, class02581::N, class02581::new);

    public class02581(List<class02231> list) {
        this.links = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02581.class, "links", "links"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02581.class, "links", "links"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02581.class, "links", "links"}, this);
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    public List<class02231> N() {
        return this.links;
    }

    public class02897<class02581> method_65080() {
        return class02885.Z;
    }
}

