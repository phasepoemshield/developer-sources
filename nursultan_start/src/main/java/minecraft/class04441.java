/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package minecraft;

import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00392;

public class class04441 {
    static Function<String, Supplier<class00392>> N = string -> () -> class00392.y((String)string);

    public static void N(Function<String, Supplier<class00392>> function) {
        N = function;
    }
}

