/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10727
 *  Nursultan.class10728
 *  Nursultan.class10729
 *  Nursultan.class10730
 *  Nursultan.class10731
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  java.lang.MatchException
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class02362
 *  minecraft.class04995
 *  minecraft.class05163
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class06993
 *  minecraft.class07226
 *  minecraft.class07536
 *  org.apache.commons.lang3.Validate
 *  org.apache.commons.lang3.tuple.Pair
 */
package minecraft;

import Nursultan.class10727;
import Nursultan.class10728;
import Nursultan.class10729;
import Nursultan.class10730;
import Nursultan.class10731;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class02362;
import minecraft.class04995;
import minecraft.class05163;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class06993;
import minecraft.class07185;
import minecraft.class07192;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07226;
import minecraft.class07536;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.tuple.Pair;

public class class07209
extends class00753 {
    public static final Codec<class07209> field_25064 = Codec.INT_STREAM.comapFlatMap(intStream -> class07536.N((IntStream)intStream, (int)3).map(nArray -> new class07209(nArray[0], nArray[1], nArray[2])), class072092 -> IntStream.of(class072092.method_10263(), class072092.method_10264(), class072092.method_10260())).stable();
    public static final class02362<ByteBuf, class07209> field_48404 = new class07226();
    public static final class07209 field_10980 = new class07209(0, 0, 0);
    public static final int field_54978 = 1 + class04995.M((int)class04995.L((int)30000000));
    public static final int field_10975 = 64 - 2 * field_54978;
    private static final long field_10976 = (1L << field_54978) - 1L;
    private static final long field_10974 = (1L << field_10975) - 1L;
    private static final long field_10973 = (1L << field_54978) - 1L;
    private static final int field_33083 = 0;
    private static final int field_10983 = field_10975;
    private static final int field_10981 = field_10975 + field_54978;
    public static final int field_54979 = (1 << field_54978) / 2 - 1;

    public class07209 method_33096(int n) {
        return new class07209(this.method_10263(), n, this.method_10260());
    }

    public class06889 method_46558() {
        return class06889.y((class00753)this);
    }

    public class07209 method_10084() {
        return new class07209(this.method_10263(), this.method_10264() + 1, this.method_10260());
    }

    public static class07209 method_49637(double d, double d2, double d3) {
        return new class07209(class04995.N((double)d), class04995.N((double)d2), class04995.N((double)d3));
    }

    public class06889 method_61082() {
        return class06889.L((class00753)this);
    }

    public static Stream<class07209> method_29715(class00734 class007342) {
        return class07209.method_17962(class04995.N((double)class007342.N), class04995.N((double)class007342.y), class04995.N((double)class007342.L), class04995.N((double)class007342.u), class04995.N((double)class007342.i), class04995.N((double)class007342.R));
    }

    public class07209 method_10062() {
        return this;
    }

    public class07209(class00753 class007532) {
        this(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    public class07209(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public class07209 method_10087(int n) {
        return new class07209(this.method_10263(), this.method_10264() - n, this.method_10260());
    }

    public /* synthetic */ class00753 method_35850(class07185 class071852, int n) {
        return this.method_30513(class071852, n);
    }

    public /* synthetic */ class00753 method_23227(int n) {
        return this.method_10087(n);
    }

    public /* synthetic */ class00753 method_35852(class00753 class007532) {
        return this.method_10059(class007532);
    }

    public /* synthetic */ class00753 method_35851(class07211 class072112) {
        return this.method_10093(class072112);
    }

    public /* synthetic */ class00753 method_35862(int n) {
        return this.method_35830(n);
    }

    public class07209 method_10077(int n) {
        return new class07209(this.method_10263(), this.method_10264(), this.method_10260() + n);
    }

    public /* synthetic */ class00753 method_35856(int n) {
        return this.method_10088(n);
    }

    public /* synthetic */ class00753 method_35859() {
        return this.method_10072();
    }

    public /* synthetic */ class00753 method_10259(class00753 class007532) {
        return this.method_10075(class007532);
    }

    public /* synthetic */ class00753 method_23226(class07211 class072112, int n) {
        return this.method_10079(class072112, n);
    }

    public /* synthetic */ class00753 method_34592(int n, int n2, int n3) {
        return this.method_10069(n, n2, n3);
    }

    public /* synthetic */ class00753 method_35855() {
        return this.method_10078();
    }

    public class07209 method_10076(int n) {
        return new class07209(this.method_10263(), this.method_10264(), this.method_10260() - n);
    }

    public /* synthetic */ class00753 method_35857() {
        return this.method_10067();
    }

    public /* synthetic */ class00753 method_35858(int n) {
        return this.method_10077(n);
    }

    public /* synthetic */ class00753 method_35854(int n) {
        return this.method_10089(n);
    }

    public /* synthetic */ class00753 method_30931() {
        return this.method_10084();
    }

    public /* synthetic */ class00753 method_23228() {
        return this.method_10074();
    }

    public /* synthetic */ class00753 method_35853(class00753 class007532) {
        return this.method_10081(class007532);
    }

    public class07209 method_10089(int n) {
        return new class07209(this.method_10263() + n, this.method_10264(), this.method_10260());
    }

    public /* synthetic */ class00753 method_35860(int n) {
        return this.method_10076(n);
    }

    public static Iterable<class07209> method_73160(class07209 class072092, class07209 class072093, class06889 class068892) {
        return class07209.method_73158(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class072093.method_10263(), class072093.method_10264(), class072093.method_10260(), class068892);
    }

    public class07209 method_10088(int n) {
        return new class07209(this.method_10263() - n, this.method_10264(), this.method_10260());
    }

    public /* synthetic */ class00753 method_35861() {
        return this.method_10095();
    }

    public /* synthetic */ class00753 method_30930(int n) {
        return this.method_10086(n);
    }

    public long method_10063() {
        return class07209.method_10064(this.method_10263(), this.method_10264(), this.method_10260());
    }

    public class07209 method_10074() {
        return new class07209(this.method_10263(), this.method_10264() - 1, this.method_10260());
    }

    public class07209 method_10086(int n) {
        return new class07209(this.method_10263(), this.method_10264() + n, this.method_10260());
    }

    public static class07209 method_49638(class00737 class007372) {
        return class07209.method_49637(class007372.N(), class007372.y(), class007372.L());
    }

    public class07209 method_10093(class07211 class072112) {
        return new class07209(this.method_10263() + class072112.P(), this.method_10264() + class072112.s(), this.method_10260() + class072112.T());
    }

    public static Iterable<class07209> method_62671(class00734 class007342) {
        class07209 class072092 = class07209.method_49637(class007342.N, class007342.y, class007342.L);
        class07209 class072093 = class07209.method_49637(class007342.u, class007342.i, class007342.R);
        return class07209.method_10097(class072092, class072093);
    }

    public class07209 method_10067() {
        return new class07209(this.method_10263() - 1, this.method_10264(), this.method_10260());
    }

    public class07209 method_10095() {
        return new class07209(this.method_10263(), this.method_10264(), this.method_10260() - 1);
    }

    public static Iterable<class07209> method_73158(int n, int n2, int n3, int n4, int n5, int n6, class06889 class068892) {
        int n7 = Math.min(n, n4);
        int n8 = Math.min(n2, n5);
        int n9 = Math.min(n3, n6);
        int n10 = Math.max(n, n4);
        int n11 = Math.max(n2, n5);
        int n12 = Math.max(n3, n6);
        int n13 = n10 - n7;
        int n14 = n11 - n8;
        int n15 = n12 - n9;
        int n16 = class068892.M >= 0.0 ? n7 : n10;
        int n17 = class068892.B >= 0.0 ? n8 : n11;
        int n18 = class068892.Z >= 0.0 ? n9 : n12;
        ImmutableList<class07185> var19 = class07211.y(class068892);
        class07185 class071852 = (class07185)var19.get(0);
        class07185 class071853 = (class07185)var19.get(1);
        class07185 class071854 = (class07185)var19.get(2);
        class07211 class072112 = class068892.N(class071852) >= 0.0 ? class071852.u() : class071852.i();
        class07211 class072113 = class068892.N(class071853) >= 0.0 ? class071853.u() : class071853.i();
        class07211 class072114 = class068892.N(class071854) >= 0.0 ? class071854.u() : class071854.i();
        int n19 = class071852.N(n13, n14, n15);
        int n20 = class071853.N(n13, n14, n15);
        int n21 = class071854.N(n13, n14, n15);
        return () -> new class10730(class072112, class072113, class072114, n16, n17, n18, n21, n20, n19);
    }

    public class07209 method_10072() {
        return new class07209(this.method_10263(), this.method_10264(), this.method_10260() + 1);
    }

    public class07209 method_10078() {
        return new class07209(this.method_10263() + 1, this.method_10264(), this.method_10260());
    }

    public static Iterable<class07209> method_73159(class00734 class007342, class06889 class068892) {
        class06889 class068893 = class007342.B();
        int n = class04995.N((double)class068893.N());
        int n2 = class04995.N((double)class068893.y());
        int n3 = class04995.N((double)class068893.L());
        class06889 class068894 = class007342.Z();
        int n4 = class04995.N((double)class068894.N());
        int n5 = class04995.N((double)class068894.y());
        int n6 = class04995.N((double)class068894.L());
        return class07209.method_73158(n, n2, n3, n4, n5, n6, class068892);
    }

    public static long method_10091(long l) {
        return l & 0xFFFFFFFFFFFFFFF0L;
    }

    private static /* synthetic */ Iterator method_25995(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        return new class10729(n, n2, n3, n4, n5, n6, n7);
    }

    public static Stream<class07209> method_25998(class07209 class072092, int n, int n2, int n3) {
        return StreamSupport.stream(class07209.method_25996(class072092, n, n2, n3).spliterator(), false);
    }

    public static Stream<class07209> method_20437(class07209 class072092, class07209 class072093) {
        return StreamSupport.stream(class07209.method_10097(class072092, class072093).spliterator(), false);
    }

    public class07209 method_10075(class00753 class007532) {
        return new class07209(this.method_10264() * class007532.method_10260() - this.method_10260() * class007532.method_10264(), this.method_10260() * class007532.method_10263() - this.method_10263() * class007532.method_10260(), this.method_10263() * class007532.method_10264() - this.method_10264() * class007532.method_10263());
    }

    public static Iterable<class07209> method_10094(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n4 - n + 1;
        int n8 = n5 - n2 + 1;
        int n9 = n6 - n3 + 1;
        return () -> class07209.method_10073(n7 * n8 * n9, n7, n8, n, n2, n3);
    }

    public static Stream<class07209> method_23627(class05163 class051632) {
        return class07209.method_17962(Math.min(class051632.B(), class051632.U()), Math.min(class051632.Z(), class051632.E()), Math.min(class051632.z(), class051632.W()), Math.max(class051632.B(), class051632.U()), Math.max(class051632.Z(), class051632.E()), Math.max(class051632.z(), class051632.W()));
    }

    public static Stream<class07209> method_17962(int n, int n2, int n3, int n4, int n5, int n6) {
        return StreamSupport.stream(class07209.method_10094(n, n2, n3, n4, n5, n6).spliterator(), false);
    }

    private static /* synthetic */ Iterator method_10073(int n, int n2, int n3, int n4, int n5, int n6) {
        return new class10728(n, n2, n3, n4, n5, n6);
    }

    public static int method_49925(class07209 class072093, int n, int n2, BiConsumer<class07209, Consumer<class07209>> biConsumer, Function<class07209, class07192> function) {
        ArrayDeque<Pair> arrayDeque = new ArrayDeque<Pair>();
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
        arrayDeque.add(Pair.of((Object)((Object)class072093), (Object)0));
        int n3 = 0;
        while (!arrayDeque.isEmpty()) {
            class07192 class071922;
            Pair pair = (Pair)arrayDeque.poll();
            class07209 class072094 = (class07209)((Object)pair.getLeft());
            int n4 = (Integer)pair.getRight();
            long l = class072094.method_10063();
            if (!longOpenHashSet.add(l) || (class071922 = function.apply(class072094)) == class07192.field_55166) continue;
            if (class071922 == class07192.field_55167) break;
            if (++n3 >= n2) {
                return n3;
            }
            if (n4 >= n) continue;
            biConsumer.accept(class072094, class072092 -> arrayDeque.add(Pair.of((Object)class072092, (Object)(n4 + 1))));
        }
        return n3;
    }

    public static Iterable<class07218> method_30512(class07209 class072092, int n, class07211 class072112, class07211 class072113) {
        Validate.validState((class072112.z() != class072113.z() ? 1 : 0) != 0, (String)"The two directions cannot be on the same axis", (Object[])new Object[0]);
        return () -> new class10727(class072112, class072113, class072092, n);
    }

    public class07209 method_10079(class07211 class072112, int n) {
        if (n == 0) {
            return this;
        }
        return new class07209(this.method_10263() + class072112.P() * n, this.method_10264() + class072112.s() * n, this.method_10260() + class072112.T() * n);
    }

    public static class07209 method_58249(class07209 class072092, class07209 class072093) {
        return new class07209(Math.min(class072092.method_10263(), class072093.method_10263()), Math.min(class072092.method_10264(), class072093.method_10264()), Math.min(class072092.method_10260(), class072093.method_10260()));
    }

    public class07209 method_35830(int n) {
        if (n == 1) {
            return this;
        }
        if (n == 0) {
            return field_10980;
        }
        return new class07209(this.method_10263() * n, this.method_10264() * n, this.method_10260() * n);
    }

    public static Iterable<class07209> method_34848(class06069 class060692, int n, class07209 class072092, int n2) {
        return class07209.method_27156(class060692, n, class072092.method_10263() - n2, class072092.method_10264() - n2, class072092.method_10260() - n2, class072092.method_10263() + n2, class072092.method_10264() + n2, class072092.method_10260() + n2);
    }

    public static Iterable<class07209> method_10097(class07209 class072092, class07209 class072093) {
        return class07209.method_10094(Math.min(class072092.method_10263(), class072093.method_10263()), Math.min(class072092.method_10264(), class072093.method_10264()), Math.min(class072092.method_10260(), class072093.method_10260()), Math.max(class072092.method_10263(), class072093.method_10263()), Math.max(class072092.method_10264(), class072093.method_10264()), Math.max(class072092.method_10260(), class072093.method_10260()));
    }

    public static long method_10060(long l, class07211 class072112) {
        return class07209.method_10096(l, class072112.P(), class072112.s(), class072112.T());
    }

    public class07209 method_10069(int n, int n2, int n3) {
        if (n == 0 && n2 == 0 && n3 == 0) {
            return this;
        }
        return new class07209(this.method_10263() + n, this.method_10264() + n2, this.method_10260() + n3);
    }

    public class07209 method_10059(class00753 class007532) {
        return this.method_10069(-class007532.method_10263(), -class007532.method_10264(), -class007532.method_10260());
    }

    public class07209 method_30513(class07185 class071852, int n) {
        if (n == 0) {
            return this;
        }
        int n2 = class071852 == class07185.field_11048 ? n : 0;
        int n3 = class071852 == class07185.field_11052 ? n : 0;
        int n4 = class071852 == class07185.field_11051 ? n : 0;
        return new class07209(this.method_10263() + n2, this.method_10264() + n3, this.method_10260() + n4);
    }

    public class06889 method_60913(class06889 class068892) {
        return new class06889(class04995.N((double)class068892.M, (double)((float)this.method_10263() + 1.0E-5f), (double)((double)this.method_10263() + 1.0 - (double)1.0E-5f)), class04995.N((double)class068892.B, (double)((float)this.method_10264() + 1.0E-5f), (double)((double)this.method_10264() + 1.0 - (double)1.0E-5f)), class04995.N((double)class068892.Z, (double)((float)this.method_10260() + 1.0E-5f), (double)((double)this.method_10260() + 1.0 - (double)1.0E-5f)));
    }

    public class07218 method_25503() {
        return new class07218(this.method_10263(), this.method_10264(), this.method_10260());
    }

    public static long method_10096(long l, int n, int n2, int n3) {
        return class07209.method_10064(class07209.method_10061(l) + n, class07209.method_10071(l) + n2, class07209.method_10083(l) + n3);
    }

    public static int method_10071(long l) {
        return (int)(l << 64 - field_10975 >> 64 - field_10975);
    }

    public static int method_10061(long l) {
        return (int)(l << 64 - field_10981 - field_54978 >> 64 - field_54978);
    }

    @Deprecated
    public static Stream<class07209> method_51686(class07209 class072092) {
        return Stream.of(class072092, class072092.method_10072(), class072092.method_10078(), class072092.method_10072().method_10078());
    }

    public static long method_10064(int n, int n2, int n3) {
        long l = 0L;
        l |= ((long)n & field_10976) << field_10981;
        l |= ((long)n2 & field_10974) << 0;
        return l |= ((long)n3 & field_10973) << field_10983;
    }

    public static class07209 method_10092(long l) {
        return new class07209(class07209.method_10061(l), class07209.method_10071(l), class07209.method_10083(l));
    }

    public class07209 method_10070(class06993 class069932) {
        return switch (class069932) {
            default -> throw new MatchException(null, null);
            case class06993.field_11463 -> new class07209(-this.method_10260(), this.method_10264(), this.method_10263());
            case class06993.field_11464 -> new class07209(-this.method_10263(), this.method_10264(), -this.method_10260());
            case class06993.field_11465 -> new class07209(this.method_10260(), this.method_10264(), -this.method_10263());
            case class06993.field_11467 -> this;
        };
    }

    public static Iterable<class07209> method_25996(class07209 class072092, int n, int n2, int n3) {
        int n4 = n + n2 + n3;
        int n5 = class072092.method_10263();
        int n6 = class072092.method_10264();
        return () -> class07209.method_25995(class072092.method_10260(), n4, n, n2, n3, n5, n6);
    }

    public static Optional<class07209> method_25997(class07209 class072092, int n, int n2, Predicate<class07209> predicate) {
        for (class07209 class072093 : class07209.method_25996(class072092, n, n2, n)) {
            if (!predicate.test(class072093)) continue;
            return Optional.of(class072093);
        }
        return Optional.empty();
    }

    public class07209 method_10081(class00753 class007532) {
        return this.method_10069(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    public static class07209 method_58250(class07209 class072092, class07209 class072093) {
        return new class07209(Math.max(class072092.method_10263(), class072093.method_10263()), Math.max(class072092.method_10264(), class072093.method_10264()), Math.max(class072092.method_10260(), class072093.method_10260()));
    }

    public static Iterable<class07209> method_27156(class06069 class060692, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n5 - n2 + 1;
        int n9 = n6 - n3 + 1;
        int n10 = n7 - n4 + 1;
        return () -> new class10731(n, n2, class060692, n8, n3, n9, n4, n10);
    }

    public static int method_10083(long l) {
        return (int)(l << 64 - field_10983 - field_54978 >> 64 - field_54978);
    }
}

