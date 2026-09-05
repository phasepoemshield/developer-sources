/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03674
 */
package minecraft;

import minecraft.class03674;
import minecraft.class08503;

@FunctionalInterface
public interface class08536<T> {
    public class03674 apply(class03674 var1, T var2);

    default public class08503 N(T t) {
        return class036742 -> this.apply((class03674)class036742, t);
    }
}

