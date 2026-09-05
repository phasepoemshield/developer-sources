/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02897
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04261;
import minecraft.class04288;

public final class class04278
extends Record
implements class00381<class04288> {
    private final class01894 key;
    public static final class02362<class00667, class04278> N = class00381.N(class04278::N, class04278::new);

    private class04278(class00667 class006672) {
        this(class006672.T());
    }

    public class04278(class01894 class018942) {
        this.key = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04278.class, "key", "key"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04278.class, "key", "key"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04278.class, "key", "key"}, this);
    }

    public class01894 N() {
        return this.key;
    }

    public void method_65081(class04288 class042882) {
        class042882.N(this);
    }

    private void N(class00667 class006672) {
        class006672.N(this.key);
    }

    public class02897<class04278> method_65080() {
        return class04261.N;
    }
}

