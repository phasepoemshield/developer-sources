/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02315
 *  minecraft.class02325
 *  minecraft.class02328
 *  minecraft.class02332
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02315;
import minecraft.class02325;
import minecraft.class02328;
import minecraft.class02332;

public final class class02171<S>
extends Record
implements class02315<S> {
    private final class02315<S> term;

    public class02171(class02315<S> class023152) {
        this.term = class023152;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02171.class, "term", "term"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02171.class, "term", "term"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02171.class, "term", "term"}, this);
    }

    public boolean N(class02325<S> class023252, class02332 class023322, class02328 class023282) {
        int n = class023252.M();
        if (!this.term.N(class023252, class023322, class023282)) {
            class023252.N(n);
        }
        return true;
    }

    public class02315<S> N() {
        return this.term;
    }
}

