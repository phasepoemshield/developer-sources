/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00329
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00329;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;

public final class class07337
extends Record
implements class00381<class08051> {
    private final class00329 recipe;
    public static final class02362<class00667, class07337> N = class02362.N((class02362)class00329.N, class07337::N, class07337::new);

    public class07337(class00329 class003292) {
        this.recipe = class003292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07337.class, "recipe", "recipe"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07337.class, "recipe", "recipe"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07337.class, "recipe", "recipe"}, this);
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12047(this);
    }

    public class00329 N() {
        return this.recipe;
    }

    public class02897<class07337> method_65080() {
        return class04248.Li;
    }
}

