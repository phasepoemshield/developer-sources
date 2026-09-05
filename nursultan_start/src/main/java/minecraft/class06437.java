/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04469
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04469;

final class class06437
extends Record {
    private final class04469 signature;
    private final int deletableAfter;

    class06437(class04469 class044692, int n) {
        this.signature = class044692;
        this.deletableAfter = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06437.class, "signature;deletableAfter", "signature", "deletableAfter"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06437.class, "signature;deletableAfter", "signature", "deletableAfter"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06437.class, "signature;deletableAfter", "signature", "deletableAfter"}, this);
    }

    public int y() {
        return this.deletableAfter;
    }

    public class04469 N() {
        return this.signature;
    }
}

