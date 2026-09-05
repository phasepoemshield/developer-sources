/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  minecraft.class03519
 *  minecraft.class03748
 *  minecraft.class04439
 *  minecraft.class04457
 *  minecraft.class05216
 *  minecraft.class06623
 *  minecraft.class07049
 *  minecraft.class07701
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07759
 *  minecraft.class07793
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class03519;
import minecraft.class03748;
import minecraft.class04439;
import minecraft.class04457;
import minecraft.class05216;
import minecraft.class06623;
import minecraft.class07049;
import minecraft.class07701;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07759;
import minecraft.class07793;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00418
implements class04439 {
    private static final Logger L = LogUtils.getLogger();
    public static final MapCodec<class00418> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("nbt").forGetter(class00418::y), (App)Codec.BOOL.lenientOptionalFieldOf("interpret", (Object)false).forGetter(class00418::L), (App)class03748.N.lenientOptionalFieldOf("separator").forGetter(class00418::u), (App)class06623.N.forGetter(class00418::i)).apply(instance, class00418::new));
    private final boolean u;
    private final Optional<class00392> i;
    private final String R;
    private final class04457 M;
    protected final @Nullable class07793 y;

    public boolean L() {
        return this.u;
    }

    public class00418(String string, boolean bl, Optional<class00392> optional, class04457 class044572) {
        this(string, class00418.N(string), bl, optional, class044572);
    }

    private class00418(String string, @Nullable class07793 class077932, boolean bl, Optional<class00392> optional, class04457 class044572) {
        this.R = string;
        this.y = class077932;
        this.u = bl;
        this.i = optional;
        this.M = class044572;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class00418)) return false;
        class00418 class004182 = (class00418)object;
        if (!this.M.equals((Object)class004182.M)) return false;
        if (!this.i.equals(class004182.i)) return false;
        if (this.u != class004182.u) return false;
        if (!this.R.equals(class004182.R)) return false;
        return true;
    }

    public String toString() {
        return "nbt{" + String.valueOf(this.M) + ", interpreting=" + this.u + ", separator=" + String.valueOf(this.i) + "}";
    }

    public int hashCode() {
        int n = this.u ? 1 : 0;
        n = 31 * n + this.i.hashCode();
        n = 31 * n + this.R.hashCode();
        n = 31 * n + this.M.hashCode();
        return n;
    }

    public class04457 i() {
        return this.M;
    }

    public Optional<class00392> u() {
        return this.i;
    }

    public String y() {
        return this.R;
    }

    public class05216 N(@Nullable class07701 class077012, @Nullable class07049 class070492, int n) throws CommandSyntaxException {
        if (class077012 == null || this.y == null) {
            return class00392.i();
        }
        Stream<String> stream = this.M.N(class077012).flatMap(class070012 -> {
            try {
                return this.y.N((class07709)class070012).stream();
            }
            catch (CommandSyntaxException commandSyntaxException) {
                return Stream.empty();
            }
        });
        if (this.u) {
            class03519 class035192 = class077012.t().N((DynamicOps)class07713.N);
            class00392 class003922 = (class00392)DataFixUtils.orElse(class00390.N(class077012, this.i, class070492, n), (Object)class00390.L);
            return stream.flatMap(class077092 -> {
                try {
                    class00392 class003922 = (class00392)class03748.N.parse((DynamicOps)class035192, class077092).getOrThrow();
                    return Stream.of(class00390.N(class077012, class003922, class070492, n));
                }
                catch (Exception exception) {
                    L.warn("Failed to parse component: {}", class077092, (Object)exception);
                    return Stream.of(new class05216[0]);
                }
            }).reduce((class052162, class052163) -> class052162.y(class003922).y((class00392)class052163)).orElseGet(class00392::i);
        }
        Stream<String> stream2 = stream.map(class00418::N);
        return class00390.N(class077012, this.i, class070492, n).map(class052162 -> stream2.map(class00392::y).reduce((class052163, class052164) -> class052163.y((class00392)class052162).y((class00392)class052164)).orElseGet(class00392::i)).orElseGet(() -> class00392.y(stream2.collect(Collectors.joining(", "))));
    }

    private static @Nullable class07793 N(String string) {
        try {
            return new class07759().parse(new StringReader(string));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String N(class07709 class077092) {
        if (!(class077092 instanceof class07707)) return class077092.toString();
        class07707 class077072 = (class07707)class077092;
        try {
            return class077072.U();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    public MapCodec<class00418> N() {
        return N;
    }
}

