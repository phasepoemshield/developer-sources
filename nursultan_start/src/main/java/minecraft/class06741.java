/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02477
 *  minecraft.class02500
 *  minecraft.class02666
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02477;
import minecraft.class02500;
import minecraft.class02666;

public final class class06741
extends Record
implements class02500 {
    private final class02477<?> type;

    public class06741(class02477<?> class024772) {
        this.type = class024772;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06741.class, "type", "type"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06741.class, "type", "type"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06741.class, "type", "type"}, this);
    }

    public boolean N(class02666 class026662) {
        return class026662.method_58694(this.type) != null;
    }

    public class02477<?> N() {
        return this.type;
    }
}

