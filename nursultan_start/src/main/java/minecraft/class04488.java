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
import java.util.function.Predicate;
import minecraft.class00734;
import minecraft.class01128;
import minecraft.class04496;
import minecraft.class04504;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class08036;

public interface class04488 {
    public static final class04488 N = new class04496();

    public List<? extends class08036> N(class04782 var1, Predicate<? super class08036> var2);

    public static class04488 N(List<class08036> list) {
        return new class04504(list);
    }

    public static class04488 N(class08036 class080362) {
        return class04488.N(List.of(class080362));
    }

    public <T extends class07049> List<T> N(class04782 var1, class01128<class07049, T> var2, class00734 var3, Predicate<? super T> var4);
}

