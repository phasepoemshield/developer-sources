/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07491
 *  minecraft.class07579
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02666;
import minecraft.class07491;
import minecraft.class07579;

final class class02712<T extends class02666>
extends Record
implements class07579<T, class02666> {
    private final class07491<? extends T> contextParam;

    class02712(class07491<? extends T> class074912) {
        this.contextParam = class074912;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02712.class, "contextParam", "contextParam"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02712.class, "contextParam", "contextParam"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02712.class, "contextParam", "contextParam"}, this);
    }

    public class02666 N(T t) {
        return t;
    }

    public class07491<? extends T> N() {
        return this.contextParam;
    }
}

