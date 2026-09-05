/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11000
 *  com.google.common.collect.Streams
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DataResult$Success
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class04480
 *  minecraft.class04490
 *  minecraft.class07709
 *  minecraft.class07741
 *  minecraft.class08296
 */
package minecraft;

import Nursultan.class11000;
import com.google.common.collect.Streams;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.runtime.SwitchBootstraps;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.stream.Stream;
import minecraft.class04480;
import minecraft.class04490;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class08296;
import minecraft.class08310;
import minecraft.class08327;

public class class08318<T>
implements class08310<T> {
    private final class04490 L;
    private final String u;
    public final class08296 N;
    public final Codec<T> y;
    private final class07741 i;

    class08318(class04490 class044902, String string, class08296 class082962, Codec<T> codec, class07741 class077412) {
        this.L = class044902;
        this.u = string;
        this.N = class082962;
        this.y = codec;
        this.i = class077412;
    }

    @Override
    public Iterator<T> iterator() {
        ListIterator var1 = this.i.listIterator();
        return new class11000(this, var1);
    }

    @Override
    public Stream<T> y() {
        return Streams.mapWithIndex((Stream)this.i.stream(), (class077092, l) -> {
            DataResult dataResult = this.y.parse(this.N.N(), class077092);
            Objects.requireNonNull(dataResult);
            DataResult dataResult2 = dataResult;
            int n = 0;
            return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult2, (int)n)) {
                default -> throw new MatchException(null, null);
                case 0 -> ((DataResult.Success)dataResult2).value();
                case 1 -> {
                    DataResult.Error var7_5 = (DataResult.Error)dataResult2;
                    this.N((int)l, (class07709)class077092, (DataResult.Error<?>)var7_5);
                    yield var7_5.partialValue().orElse(null);
                }
            };
        }).filter(Objects::nonNull);
    }

    public void N(int n, class07709 class077092, DataResult.Error<?> error) {
        this.L.N_47((class04480)new class08327(this.u, n, class077092, error));
    }

    @Override
    public boolean N() {
        return this.i.isEmpty();
    }
}

