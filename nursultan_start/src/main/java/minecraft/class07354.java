/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07084
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07084;
import minecraft.class08051;

public final class class07354
extends Record
implements class00381<class08051> {
    private final Optional<class03556<class07084>> primary;
    private final Optional<class03556<class07084>> secondary;
    public static final class02362<class04247, class07354> N = class02362.N((class02362)class07084.y.N_33(class02389::N), class07354::N, (class02362)class07084.y.N_33(class02389::N), class07354::y, class07354::new);

    public class07354(Optional<class03556<class07084>> optional, Optional<class03556<class07084>> optional2) {
        this.primary = optional;
        this.secondary = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07354.class, "primary;secondary", "primary", "secondary"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07354.class, "primary;secondary", "primary", "secondary"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07354.class, "primary;secondary", "primary", "secondary"}, this);
    }

    public Optional<class03556<class07084>> y() {
        return this.secondary;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12057(this);
    }

    public Optional<class03556<class07084>> N() {
        return this.primary;
    }

    public class02897<class07354> method_65080() {
        return class04248.LZ;
    }
}

