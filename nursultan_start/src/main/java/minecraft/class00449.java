/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
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
import minecraft.class00381;
import minecraft.class00442;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class00449
extends Record
implements class00381<class07280> {
    private final int entityId;
    private final class00442<?> update;
    public static final class02362<class04247, class00449> N = class02362.N((class02362)class02389.B, class00449::N, class00442.N, class00449::y, class00449::new);

    public class00449(int n, class00442<?> class004422) {
        this.entityId = n;
        this.update = class004422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00449.class, "entityId;update", "entityId", "update"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00449.class, "entityId;update", "entityId", "update"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00449.class, "entityId;update", "entityId", "update"}, this);
    }

    public class00442<?> y() {
        return this.update;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.entityId;
    }

    public class02897<class00449> method_65080() {
        return class04248.Y;
    }
}

