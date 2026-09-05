/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00394
 *  minecraft.class07491
 *  minecraft.class07579
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00394;
import minecraft.class02666;
import minecraft.class07491;
import minecraft.class07579;

final class class02711
extends Record
implements class07579<class00394, class02666> {
    private final class07491<? extends class00394> contextParam;

    class02711(class07491<? extends class00394> class074912) {
        this.contextParam = class074912;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02711.class, "contextParam", "contextParam"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02711.class, "contextParam", "contextParam"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02711.class, "contextParam", "contextParam"}, this);
    }

    public class02666 N(class00394 class003942) {
        return class003942.g();
    }

    public class07491<? extends class00394> N() {
        return this.contextParam;
    }
}

