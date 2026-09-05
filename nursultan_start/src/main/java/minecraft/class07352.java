/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class08051
 *  minecraft.class08687
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;
import minecraft.class08687;

public final class class07352
extends Record
implements class00381<class08051> {
    private final class08687 input;
    public static final class02362<class00667, class07352> N = class02362.N((class02362)class08687.N, class07352::N, class07352::new);

    public class07352(class08687 class086872) {
        this.input = class086872;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07352.class, "input", "input"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07352.class, "input", "input"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07352.class, "input", "input"}, this);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12067(this);
    }

    public class08687 N() {
        return this.input;
    }

    public class02897<class07352> method_65080() {
        return class04248.Ly;
    }
}

