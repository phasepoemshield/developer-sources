/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 *  minecraft.class07321
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00442;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;
import minecraft.class07321;

public final class class00427
extends Record
implements class00381<class07280> {
    private final class07321 chunkPos;
    private final class00442<?> update;
    public static final class02362<class04247, class00427> N = class02362.N((class02362)class07321.y, class00427::N, class00442.N, class00427::y, class00427::new);

    public class00427(class07321 class073212, class00442<?> class004422) {
        this.chunkPos = class073212;
        this.update = class004422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00427.class, "chunkPos;update", "chunkPos", "update"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00427.class, "chunkPos;update", "chunkPos", "update"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00427.class, "chunkPos;update", "chunkPos", "update"}, this);
    }

    public class00442<?> y() {
        return this.update;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class07321 N() {
        return this.chunkPos;
    }

    public class02897<class00427> method_65080() {
        return class04248.k;
    }
}

