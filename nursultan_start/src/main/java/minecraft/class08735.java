/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.MapCodec
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01603
 *  minecraft.class04548
 *  minecraft.class06338
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import minecraft.class01603;
import minecraft.class04548;
import minecraft.class06338;
import minecraft.class08736;
import minecraft.class08780;
import org.slf4j.Logger;

public final class class08735
extends Record
implements Comparable<class08735> {
    private final int major;
    private final int minor;
    private static final Logger i = LogUtils.getLogger();
    public static final Codec<class08735> N = class08735.y(0);
    public static final Codec<class08735> y = class08735.y(Integer.MAX_VALUE);

    public int L() {
        return this.minor;
    }

    public class08735(int n, int n2) {
        this.major = n;
        this.minor = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08735.class, "major;minor", "major", "minor"}, this, object);
    }

    public String toString() {
        if (this.minor == Integer.MAX_VALUE) {
            return String.format(Locale.ROOT, "%d.*", this.y());
        }
        return String.format(Locale.ROOT, "%d.%d", this.y(), this.L());
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08735.class, "major;minor", "major", "minor"}, this);
    }

    private static Codec<class08735> y(int n) {
        return class06338.L((Codec)class06338.T, (Codec)class06338.T.listOf(1, 256)).xmap(list -> list.size() > 1 ? class08735.N((int)((Integer)list.getFirst()), (Integer)list.get(1)) : class08735.N((int)((Integer)list.getFirst()), n), class087352 -> class087352.minor != n ? List.of(Integer.valueOf(class087352.y()), Integer.valueOf(class087352.L())) : List.of(Integer.valueOf(class087352.y())));
    }

    public static MapCodec<class04548<class08735>> y(class01603 class016032) {
        int n = class08735.N(class016032);
        return class08780.N.flatXmap(class087802 -> class087802.N(n, true, false, "Pack", "supported_formats"), class045482 -> DataResult.success((Object)((Object)class08780.N((class04548<class08735>)class045482, n))));
    }

    public int y() {
        return this.major;
    }

    public static int N(class01603 class016032) {
        return switch (class016032) {
            default -> throw new MatchException(null, null);
            case class01603.field_14188 -> 64;
            case class01603.field_14190 -> 81;
        };
    }

    public class04548<class08735> N() {
        return new class04548((Comparable)this, (Comparable)class08735.N(this.major, Integer.MAX_VALUE));
    }

    @Override
    public int compareTo(class08735 class087352) {
        int n = Integer.compare(this.y(), class087352.y());
        if (n != 0) {
            return n;
        }
        return Integer.compare(this.L(), class087352.L());
    }

    public static class08735 N(int n, int n2) {
        return new class08735(n, n2);
    }

    public static <ResultType, HolderType extends class08736> DataResult<List<ResultType>> N(List<HolderType> list, int n, BiFunction<HolderType, class04548<class08735>, ResultType> biFunction) {
        int n2 = list.stream().map(class08736::N).mapToInt(class08780::N).min().orElse(Integer.MAX_VALUE);
        ArrayList<ResultType> arrayList = new ArrayList<ResultType>(list.size());
        for (class08736 class087362 : list) {
            class08780 class087802 = class087362.N();
            if (class087802.y().isEmpty() && class087802.L().isEmpty() && class087802.i().isEmpty()) {
                i.warn("Unknown or broken overlay entry {}", (Object)class087362);
                continue;
            }
            DataResult<class04548<class08735>> dataResult = class087802.N(n, false, n2 <= n, "Overlay \"" + String.valueOf(class087362) + "\"", "formats");
            if (dataResult.isSuccess()) {
                arrayList.add(biFunction.apply(class087362, (class04548<class08735>)((class04548)dataResult.getOrThrow())));
                continue;
            }
            return DataResult.error(() -> ((DataResult.Error)((DataResult.Error)dataResult.error().get())).message());
        }
        return DataResult.success(List.copyOf(arrayList));
    }

    public static class08735 N(int n) {
        return new class08735(n, 0);
    }
}

