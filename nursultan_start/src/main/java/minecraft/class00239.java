/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00299
 *  minecraft.class02362
 *  minecraft.class03729
 *  minecraft.class04247
 *  minecraft.class06521
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00299;
import minecraft.class02362;
import minecraft.class03729;
import minecraft.class04247;
import minecraft.class06521;

public final class class00239<T extends class06521<?>>
extends Record {
    private final class00299 optionDisplay;
    private final Optional<class03729<T>> recipe;

    public Optional<class03729<T>> L() {
        return this.recipe;
    }

    public class00239(class00299 class002992, Optional<class03729<T>> optional) {
        this.optionDisplay = class002992;
        this.recipe = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00239.class, "optionDisplay;recipe", "optionDisplay", "recipe"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00239.class, "optionDisplay;recipe", "optionDisplay", "recipe"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00239.class, "optionDisplay;recipe", "optionDisplay", "recipe"}, this);
    }

    public class00299 y() {
        return this.optionDisplay;
    }

    public static <T extends class06521<?>> class02362<class04247, class00239<T>> N() {
        return class02362.N((class02362)class00299.y, class00239::y, class002992 -> new class00239((class00299)class002992, Optional.empty()));
    }
}

