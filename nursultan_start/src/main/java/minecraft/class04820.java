/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00394
 *  minecraft.class01929
 *  minecraft.class07491
 *  minecraft.class07579
 *  minecraft.class07709
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00394;
import minecraft.class01929;
import minecraft.class07491;
import minecraft.class07579;
import minecraft.class07709;

final class class04820
extends Record
implements class07579<class00394, class07709> {
    private final class07491<? extends class00394> contextParam;

    public class04820(class07491<? extends class00394> class074912) {
        this.contextParam = class074912;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04820.class, "contextParam", "contextParam"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04820.class, "contextParam", "contextParam"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04820.class, "contextParam", "contextParam"}, this);
    }

    public class07709 N(class00394 class003942) {
        return class003942.y_2((class01929)class003942.G().method_30349());
    }

    public class07491<? extends class00394> N() {
        return this.contextParam;
    }
}

