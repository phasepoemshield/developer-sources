/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10470
 *  Nursultan.class10471
 *  Nursultan.class10472
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07438
 */
package minecraft;

import Nursultan.class10470;
import Nursultan.class10471;
import Nursultan.class10472;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07438;

public interface class04803 {
    public static class04803 N(class07438 class074382, class07085 class070852) {
        return class04803.N(class074382, class070852, class065842 -> true);
    }

    public static class04803 N(List<class06584> list, int n) {
        return new class10471(list, n);
    }

    public class06584 N();

    public static class04803 N(class07438 class074382, class07085 class070852, Predicate<class06584> predicate) {
        return new class10470(class074382, class070852, predicate);
    }

    public static class04803 N(Supplier<class06584> supplier, Consumer<class06584> consumer) {
        return new class10472(supplier, consumer);
    }

    public boolean N(class06584 var1);
}

