/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class02362
 *  minecraft.class04247
 */
package minecraft;

import minecraft.class02131;
import minecraft.class02362;
import minecraft.class04247;

public interface class04383<T> {
    default public class02131<T> N(int n) {
        return new class02131(n, this);
    }

    public static <T> class04383<T> N(class02362<? super class04247, T> class023622) {
        return () -> class023622;
    }

    public T method_12714(T var1);

    public class02362<? super class04247, T> codec();
}

