/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00268;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class00278
extends Record
implements class00381<class07280> {
    private final List<class00268> entries;
    private final boolean replace;
    public static final class02362<class04247, class00278> N = class02362.N((class02362)class00268.L.N_33(class02389.N()), class00278::N, (class02362)class02389.y, class00278::y, class00278::new);

    public class00278(List<class00268> list, boolean bl) {
        this.entries = list;
        this.replace = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00278.class, "entries;replace", "entries", "replace"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00278.class, "entries;replace", "entries", "replace"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00278.class, "entries;replace", "entries", "replace"}, this);
    }

    public boolean y() {
        return this.replace;
    }

    @Override
    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public List<class00268> N() {
        return this.entries;
    }

    @Override
    public class02897<class00278> method_65080() {
        return class04248.Ns;
    }
}

