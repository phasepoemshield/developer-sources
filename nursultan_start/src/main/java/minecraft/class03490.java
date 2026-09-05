/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05220
 *  minecraft.class05946
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class07310
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05220;
import minecraft.class05946;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class07310;

public final class class03490
extends Record
implements class02694 {
    private final Optional<class06581> back;
    private final Optional<class06581> left;
    private final Optional<class06581> right;
    private final Optional<class06581> front;
    public static final class03490 N = new class03490(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    public static final Codec<class03490> y = class04206.B.T().sizeLimitedListOf(4).xmap(class03490::new, class03490::N);
    public static final class02362<class04247, class03490> L = class02389.N((class05946)class04227.F).N_33(class02389.L((int)4)).N_10(class03490::new, class03490::N);

    public Optional<class06581> L() {
        return this.left;
    }

    public class03490(Optional<class06581> optional, Optional<class06581> optional2, Optional<class06581> optional3, Optional<class06581> optional4) {
        this.back = optional;
        this.left = optional2;
        this.right = optional3;
        this.front = optional4;
    }

    public class03490(class06581 class065812, class06581 class065813, class06581 class065814, class06581 class065815) {
        this(List.of(class065812, class065813, class065814, class065815));
    }

    private class03490(List<class06581> list) {
        this(class03490.N(list, 0), class03490.N(list, 1), class03490.N(list, 2), class03490.N(list, 3));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03490.class, "back;left;right;front", "back", "left", "right", "front"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03490.class, "back;left;right;front", "back", "left", "right", "front"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03490.class, "back;left;right;front", "back", "left", "right", "front"}, this);
    }

    public Optional<class06581> i() {
        return this.front;
    }

    public Optional<class06581> u() {
        return this.right;
    }

    public Optional<class06581> y() {
        return this.back;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        if (this.equals((Object)N)) {
            return;
        }
        consumer.accept(class05220.N);
        class03490.N(consumer, this.front);
        class03490.N(consumer, this.left);
        class03490.N(consumer, this.right);
        class03490.N(consumer, this.back);
    }

    private static void N(Consumer<class00392> consumer, Optional<class06581> optional) {
        consumer.accept((class00392)new class06584((class07310)optional.orElse(class06570.jl), 1).d().y().N(class06541.field_1080));
    }

    public List<class06581> N() {
        return Stream.of(this.back, this.left, this.right, this.front).map(optional -> optional.orElse(class06570.jl)).toList();
    }

    private static Optional<class06581> N(List<class06581> list, int n) {
        if (n >= list.size()) {
            return Optional.empty();
        }
        class06581 class065812 = list.get(n);
        return class065812 == class06570.jl ? Optional.empty() : Optional.of(class065812);
    }
}

