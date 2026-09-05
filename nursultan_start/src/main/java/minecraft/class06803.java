/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01894
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02168
 *  minecraft.class02477
 *  minecraft.class02487
 *  minecraft.class03519
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02168;
import minecraft.class02477;
import minecraft.class02487;
import minecraft.class03519;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06764;
import minecraft.class06793;
import minecraft.class06797;
import minecraft.class07536;

class class06803
implements class02168<Predicate<class06584>, class06797, class06764> {
    private final class01929 N;
    private final class01921<class06581> y;
    private final class01921<class02477<?>> L;
    private final class01921<class02487<?>> u;

    public Stream<class01894> L() {
        return Stream.concat(class06793.M.keySet().stream(), this.L.z().filter(class035292 -> !((class02477)class035292.N()).u()).map(class035292 -> class035292.B().N()));
    }

    public class06797 R(ImmutableStringReader immutableStringReader, class01894 class018942) throws CommandSyntaxException {
        class06797 class067972 = class06793.M.get(class018942);
        if (class067972 != null) {
            return class067972;
        }
        class02477 class024772 = this.L.N(class05946.N((class05946)class04227.b, (class01894)class018942)).map(class03556::N).orElseThrow(() -> class06793.L.createWithContext(immutableStringReader, (Object)class018942));
        return class06797.N(immutableStringReader, class018942, class024772);
    }

    class06803(class01929 class019292) {
        this.N = class019292;
        this.y = class019292.y(class04227.F);
        this.L = class019292.y(class04227.b);
        this.u = class019292.y(class04227.T);
    }

    public Stream<class01894> u() {
        return Stream.concat(class06793.B.keySet().stream(), this.u.n().map(class05946::N));
    }

    public class06764 i(ImmutableStringReader immutableStringReader, class01894 class018942) throws CommandSyntaxException {
        class06764 class067642 = class06793.B.get(class018942);
        if (class067642 != null) {
            return class067642;
        }
        return this.u.N(class05946.N((class05946)class04227.T, (class01894)class018942)).map(class06764::new).or(() -> this.L.N(class05946.N((class05946)class04227.b, (class01894)class018942)).map(class06793::N)).orElseThrow(() -> class06793.i.createWithContext(immutableStringReader, (Object)class018942));
    }

    public Predicate<class06584> M(ImmutableStringReader immutableStringReader, class01894 class018942) throws CommandSyntaxException {
        return arg_0 -> class06803.N((class03543)this.y.N(class03530.N((class05946)class04227.F, (class01894)class018942)).orElseThrow(() -> class06793.y.createWithContext(immutableStringReader, (Object)class018942)), arg_0);
    }

    public Stream<class01894> y() {
        return this.y.t().map(class03530::y);
    }

    public Predicate<class06584> y(ImmutableStringReader immutableStringReader, class06797 class067972, Dynamic<?> dynamic) throws CommandSyntaxException {
        return class067972.N(immutableStringReader, class03519.N(dynamic, (class01929)this.N));
    }

    public Predicate<class06584> N(ImmutableStringReader immutableStringReader, class06797 class067972) {
        return class067972.y();
    }

    public Predicate<class06584> N(ImmutableStringReader immutableStringReader, class06764 class067642, Dynamic<?> dynamic) throws CommandSyntaxException {
        return class067642.N(immutableStringReader, class03519.N(dynamic, (class01929)this.N));
    }

    private static /* synthetic */ boolean N(class03529 class035292, class06584 class065842) {
        return class065842.N((class03556)class035292);
    }

    public Predicate<class06584> B(ImmutableStringReader immutableStringReader, class01894 class018942) throws CommandSyntaxException {
        return arg_0 -> class06803.N((class03529)this.y.N(class05946.N((class05946)class04227.F, (class01894)class018942)).orElseThrow(() -> class06793.N.createWithContext(immutableStringReader, (Object)class018942)), arg_0);
    }

    private static /* synthetic */ boolean N(class03543 class035432, class06584 class065842) {
        return class065842.N(class035432);
    }

    public Predicate<class06584> y(List<Predicate<class06584>> list) {
        return class07536.y(list);
    }

    public Stream<class01894> N() {
        return this.y.n().map(class05946::N);
    }

    public Predicate<class06584> N(Predicate<class06584> predicate) {
        return predicate.negate();
    }
}

