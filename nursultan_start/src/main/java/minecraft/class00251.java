/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01263
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01263;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;

public final class class00251
extends Record
implements class00381<class07280> {
    private final class01263 bookSettings;
    public static final class02362<class00667, class00251> N = class02362.N((class02362)class01263.N, class00251::N, class00251::new);

    public class00251(class01263 class012632) {
        this.bookSettings = class012632;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00251.class, "bookSettings", "bookSettings"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00251.class, "bookSettings", "bookSettings"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00251.class, "bookSettings", "bookSettings"}, this);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class01263 N() {
        return this.bookSettings;
    }

    public class02897<class00251> method_65080() {
        return class04248.Nb;
    }
}

