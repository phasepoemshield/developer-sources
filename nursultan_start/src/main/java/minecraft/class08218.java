/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04513
 *  minecraft.class05946
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04513;
import minecraft.class05946;
import minecraft.class08221;

final class class08218
extends Record {
    final class05946<class04513> normal;
    final class05946<class04513> ominous;

    private class08218(class05946<class04513> class059462, class05946<class04513> class059463) {
        this.normal = class059462;
        this.ominous = class059463;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08218.class, "normal;ominous", "normal", "ominous"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08218.class, "normal;ominous", "normal", "ominous"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08218.class, "normal;ominous", "normal", "ominous"}, this);
    }

    public class05946<class04513> y() {
        return this.ominous;
    }

    public class05946<class04513> N() {
        return this.normal;
    }

    public static class08218 N(String string) {
        return new class08218(class08221.N(string + "/normal"), class08221.N(string + "/ominous"));
    }
}

