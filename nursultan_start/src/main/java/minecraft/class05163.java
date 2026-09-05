/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00753
 *  minecraft.class01296
 *  minecraft.class02362
 *  minecraft.class05186
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class07536
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import minecraft.class00753;
import minecraft.class01296;
import minecraft.class02362;
import minecraft.class05186;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class07536;
import org.slf4j.Logger;

public class class05163 {
    private static final Logger L = LogUtils.getLogger();
    public static final Codec<class05163> N = Codec.INT_STREAM.comapFlatMap(intStream -> class07536.N((IntStream)intStream, (int)6).map(nArray -> new class05163(nArray[0], nArray[1], nArray[2], nArray[3], nArray[4], nArray[5])), class051632 -> IntStream.of(class051632.u, class051632.i, class051632.R, class051632.M, class051632.B, class051632.Z)).stable();
    public static final class02362<ByteBuf, class05163> y = class02362.N((class02362)class07209.field_48404, class051632 -> new class07209(class051632.u, class051632.i, class051632.R), (class02362)class07209.field_48404, class051632 -> new class07209(class051632.M, class051632.B, class051632.Z), (class072092, class072093) -> new class05163(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class072093.method_10263(), class072093.method_10264(), class072093.method_10260()));
    private int u;
    private int i;
    private int R;
    private int M;
    private int B;
    private int Z;

    public class00753 L() {
        return new class00753(this.M - this.u, this.B - this.i, this.Z - this.R);
    }

    public class05163 L(int n, int n2, int n3) {
        return new class05163(this.B() - n, this.Z() - n2, this.z() - n3, this.U() + n, this.E() + n2, this.W() + n3);
    }

    public class07209 M() {
        return new class07209(this.u + (this.M - this.u + 1) / 2, this.i + (this.B - this.i + 1) / 2, this.R + (this.Z - this.R + 1) / 2);
    }

    public class05163(int n, int n2, int n3, int n4, int n5, int n6) {
        this.u = n;
        this.i = n2;
        this.R = n3;
        this.M = n4;
        this.B = n5;
        this.Z = n6;
        if (n4 < n || n5 < n2 || n6 < n3) {
            class07536.y((String)("Invalid bounding box data, inverted bounds for: " + String.valueOf(this)));
            this.u = Math.min(n, n4);
            this.i = Math.min(n2, n5);
            this.R = Math.min(n3, n6);
            this.M = Math.max(n, n4);
            this.B = Math.max(n2, n5);
            this.Z = Math.max(n3, n6);
        }
    }

    public class05163(class07209 class072092) {
        this(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class05163) {
            class05163 class051632 = (class05163)object;
            return this.u == class051632.u && this.i == class051632.i && this.R == class051632.R && this.M == class051632.M && this.B == class051632.B && this.Z == class051632.Z;
        }
        return false;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("minX", this.u).add("minY", this.i).add("minZ", this.R).add("maxX", this.M).add("maxY", this.B).add("maxZ", this.Z).toString();
    }

    public int hashCode() {
        return Objects.hash(this.u, this.i, this.R, this.M, this.B, this.Z);
    }

    public int B() {
        return this.u;
    }

    public int Z() {
        return this.i;
    }

    public int i() {
        return this.B - this.i + 1;
    }

    public int U() {
        return this.M;
    }

    public int z() {
        return this.R;
    }

    public boolean u(int n, int n2, int n3) {
        return n >= this.u && n <= this.M && n3 >= this.R && n3 <= this.Z && n2 >= this.i && n2 <= this.B;
    }

    public int u() {
        return this.M - this.u + 1;
    }

    public class05163 y(int n, int n2, int n3) {
        return new class05163(this.u + n, this.i + n2, this.R + n3, this.M + n, this.B + n2, this.Z + n3);
    }

    @Deprecated
    public class05163 y(class05163 class051632) {
        this.u = Math.min(this.u, class051632.u);
        this.i = Math.min(this.i, class051632.i);
        this.R = Math.min(this.R, class051632.R);
        this.M = Math.max(this.M, class051632.M);
        this.B = Math.max(this.B, class051632.B);
        this.Z = Math.max(this.Z, class051632.Z);
        return this;
    }

    public static Optional<class05163> y(Iterable<class05163> iterable) {
        Iterator<class05163> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            return Optional.empty();
        }
        class05163 class051632 = iterator.next();
        class05163 class051633 = new class05163(class051632.u, class051632.i, class051632.R, class051632.M, class051632.B, class051632.Z);
        iterator.forEachRemaining(class051633::y);
        return Optional.of(class051633);
    }

    public boolean y(class00753 class007532) {
        return this.u(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    public Stream<class07321> y() {
        int n = class01296.N((int)this.B());
        int n2 = class01296.N((int)this.z());
        int n3 = class01296.N((int)this.U());
        int n4 = class01296.N((int)this.W());
        return class07321.N((class07321)new class07321(n, n2), (class07321)new class07321(n3, n4));
    }

    public int E() {
        return this.B;
    }

    public boolean N(int n, int n2, int n3, int n4) {
        return this.M >= n && this.u <= n3 && this.Z >= n2 && this.R <= n4;
    }

    public static class05163 N(class00753 class007532, class00753 class007533) {
        return new class05163(Math.min(class007532.method_10263(), class007533.method_10263()), Math.min(class007532.method_10264(), class007533.method_10264()), Math.min(class007532.method_10260(), class007533.method_10260()), Math.max(class007532.method_10263(), class007533.method_10263()), Math.max(class007532.method_10264(), class007533.method_10264()), Math.max(class007532.method_10260(), class007533.method_10260()));
    }

    public class05163 N(int n) {
        return this.L(n, n, n);
    }

    @Deprecated
    public class05163 N(class00753 class007532) {
        return this.N(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    @Deprecated
    public class05163 N(int n, int n2, int n3) {
        this.u += n;
        this.i += n2;
        this.R += n3;
        this.M += n;
        this.B += n2;
        this.Z += n3;
        return this;
    }

    @Deprecated
    public class05163 N(class07209 class072092) {
        this.u = Math.min(this.u, class072092.method_10263());
        this.i = Math.min(this.i, class072092.method_10264());
        this.R = Math.min(this.R, class072092.method_10260());
        this.M = Math.max(this.M, class072092.method_10263());
        this.B = Math.max(this.B, class072092.method_10264());
        this.Z = Math.max(this.Z, class072092.method_10260());
        return this;
    }

    public static class05163 N(class05163 class051632, class05163 class051633) {
        return new class05163(Math.min(class051632.u, class051633.u), Math.min(class051632.i, class051633.i), Math.min(class051632.R, class051633.R), Math.max(class051632.M, class051633.M), Math.max(class051632.B, class051633.B), Math.max(class051632.Z, class051633.Z));
    }

    public static Optional<class05163> N(Iterable<class07209> iterable) {
        Iterator<class07209> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            return Optional.empty();
        }
        class05163 class051632 = new class05163(iterator.next());
        iterator.forEachRemaining(class051632::N);
        return Optional.of(class051632);
    }

    public static class05163 N() {
        return new class05163(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public void N(Consumer<class07209> consumer) {
        class07218 class072182 = new class07218();
        consumer.accept((class07209)class072182.N(this.M, this.B, this.Z));
        consumer.accept((class07209)class072182.N(this.u, this.B, this.Z));
        consumer.accept((class07209)class072182.N(this.M, this.i, this.Z));
        consumer.accept((class07209)class072182.N(this.u, this.i, this.Z));
        consumer.accept((class07209)class072182.N(this.M, this.B, this.R));
        consumer.accept((class07209)class072182.N(this.u, this.B, this.R));
        consumer.accept((class07209)class072182.N(this.M, this.i, this.R));
        consumer.accept((class07209)class072182.N(this.u, this.i, this.R));
    }

    public static class05163 N(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, class07211 class072112) {
        switch (class05186.N[class072112.ordinal()]) {
            default: {
                return new class05163(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
            case 2: {
                return new class05163(n + n4, n2 + n5, n3 - n9 + 1 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n6);
            }
            case 3: {
                return new class05163(n - n9 + 1 + n6, n2 + n5, n3 + n4, n + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
            case 4: 
        }
        return new class05163(n + n6, n2 + n5, n3 + n4, n + n9 - 1 + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
    }

    public boolean N(class05163 class051632) {
        return this.M >= class051632.u && this.u <= class051632.M && this.Z >= class051632.R && this.R <= class051632.Z && this.B >= class051632.i && this.i <= class051632.B;
    }

    public int W() {
        return this.Z;
    }

    public int R() {
        return this.Z - this.R + 1;
    }
}

