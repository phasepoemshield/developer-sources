/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01128
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class08036
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import minecraft.class00734;
import minecraft.class01128;
import minecraft.class04488;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class08036;

class class04504
implements class04488 {
    final /* synthetic */ List y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class04504(List list) {
        this.y = list;
    }

    public List<class08036> N(class04782 class047822, Predicate<? super class08036> predicate) {
        return this.y.stream().filter(predicate).toList();
    }

    @Override
    public <T extends class07049> List<T> N(class04782 class047822, class01128<class07049, T> class011282, class00734 class007342, Predicate<? super T> predicate) {
        return this.y.stream().map(arg_0 -> class011282.N(arg_0)).filter(Objects::nonNull).filter(predicate).toList();
    }
}

