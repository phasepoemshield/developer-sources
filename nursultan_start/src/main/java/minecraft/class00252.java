/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class06510
 *  minecraft.class06521
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00239;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class06510;
import minecraft.class06521;

public final class class00252<T extends class06521<?>>
extends Record {
    final class06510 input;
    private final class00239<T> recipe;

    public class00239<T> L() {
        return this.recipe;
    }

    public class00252(class06510 class065102, class00239<T> class002392) {
        this.input = class065102;
        this.recipe = class002392;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00252.class, "input;recipe", "input", "recipe"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00252.class, "input;recipe", "input", "recipe"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00252.class, "input;recipe", "input", "recipe"}, this);
    }

    public class06510 y() {
        return this.input;
    }

    public static <T extends class06521<?>> class02362<class04247, class00252<T>> N() {
        return class02362.N((class02362)class06510.field_48355, class00252::y, class00239.N(), class00252::L, class00252::new);
    }
}

