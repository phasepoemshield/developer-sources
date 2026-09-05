/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01652
 *  minecraft.class02362
 *  minecraft.class02885
 *  minecraft.class02897
 *  minecraft.class03737
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01652;
import minecraft.class02362;
import minecraft.class02885;
import minecraft.class02897;
import minecraft.class03737;

public final class class00541
extends Record
implements class00381<class01652> {
    private final class03737 information;
    public static final class02362<class00667, class00541> N = class00381.N(class00541::N, class00541::new);

    private class00541(class00667 class006672) {
        this(new class03737(class006672));
    }

    public class00541(class03737 class037372) {
        this.information = class037372;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00541.class, "information", "information"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00541.class, "information", "information"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00541.class, "information", "information"}, this);
    }

    public class03737 N() {
        return this.information;
    }

    public void method_65081(class01652 class016522) {
        class016522.method_12069(this);
    }

    private void N(class00667 class006672) {
        this.information.N(class006672);
    }

    public class02897<class00541> method_65080() {
        return class02885.m;
    }
}

