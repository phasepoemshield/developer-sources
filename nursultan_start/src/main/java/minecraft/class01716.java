/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03099
 */
package minecraft;

import minecraft.class01742;
import minecraft.class01752;
import minecraft.class03099;

@FunctionalInterface
public interface class01716<T> {
    default public class01742<T> N(T t) {
        return (class017522, class030992) -> this.N(t, class017522, class030992);
    }

    public void N(T var1, class01752<T> var2, class03099 var3);
}

