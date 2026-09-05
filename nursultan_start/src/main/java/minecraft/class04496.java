/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01128
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class08036
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class00734;
import minecraft.class01128;
import minecraft.class04488;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class08036;

class class04496
implements class04488 {
    class04496() {
    }

    public List<class04770> N(class04782 class047822, Predicate<? super class08036> predicate) {
        return class047822.method_18766(predicate);
    }

    @Override
    public <T extends class07049> List<T> N(class04782 class047822, class01128<class07049, T> class011282, class00734 class007342, Predicate<? super T> predicate) {
        return class047822.method_18023(class011282, class007342, predicate);
    }
}

