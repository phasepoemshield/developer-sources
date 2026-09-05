/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03748
 *  minecraft.class04247
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03748;
import minecraft.class04247;

public final class class07248
extends Record {
    private final String text;
    private final Optional<class00392> tooltip;
    public static final class02362<class04247, class07248> N = class02362.N((class02362)class02389.s, class07248::N, (class02362)class03748.i, class07248::y, class07248::new);

    public class07248(String string, Optional<class00392> optional) {
        this.text = string;
        this.tooltip = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07248.class, "text;tooltip", "text", "tooltip"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07248.class, "text;tooltip", "text", "tooltip"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07248.class, "text;tooltip", "text", "tooltip"}, this);
    }

    public Optional<class00392> y() {
        return this.tooltip;
    }

    public String N() {
        return this.text;
    }
}

