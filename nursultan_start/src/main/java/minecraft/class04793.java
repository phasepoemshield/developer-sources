/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00809
 *  minecraft.class07049
 *  minecraft.class07491
 *  minecraft.class07579
 *  minecraft.class07709
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00809;
import minecraft.class07049;
import minecraft.class07491;
import minecraft.class07579;
import minecraft.class07709;

final class class04793
extends Record
implements class07579<class07049, class07709> {
    private final class07491<? extends class07049> contextParam;

    class04793(class07491<? extends class07049> class074912) {
        this.contextParam = class074912;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04793.class, "contextParam", "contextParam"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04793.class, "contextParam", "contextParam"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04793.class, "contextParam", "contextParam"}, this);
    }

    public class07709 N(class07049 class070492) {
        return class00809.y((class07049)class070492);
    }

    public class07491<? extends class07049> N() {
        return this.contextParam;
    }
}

