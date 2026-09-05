/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10419
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DataResult$Success
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class01929
 *  minecraft.class04480
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07741
 *  minecraft.class08321
 *  minecraft.class08328
 *  minecraft.class08329
 *  minecraft.class08330
 *  net.fabricmc.fabric.api.serialization.v1.view.FabricWriteView
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10419;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import minecraft.class01929;
import minecraft.class04480;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07741;
import minecraft.class08289;
import minecraft.class08294;
import minecraft.class08298;
import minecraft.class08321;
import minecraft.class08328;
import minecraft.class08329;
import minecraft.class08330;
import net.fabricmc.fabric.api.serialization.v1.view.FabricWriteView;
import org.jspecify.annotations.Nullable;

public class class08303
implements class08329,
FabricWriteView {
    private final class04490 N;
    private final DynamicOps<class07709> y;
    private final class07001 L;

    public void L(String string) {
        this.L.b(string);
    }

    public void putByteArray(String string, byte[] byArray) {
        this.L.N(string, byArray);
    }

    class08303(class04490 class044902, DynamicOps<class07709> dynamicOps, class07001 class070012) {
        this.N = class044902;
        this.y = dynamicOps;
        this.L = class070012;
    }

    private class04490 u(String string) {
        return this.N.N_46((class04489)new class10419(string));
    }

    public class08289 y(String string) {
        class07741 class077412 = new class07741();
        this.L.N(string, (class07709)class077412);
        return new class08328(string, this.N, this.y, class077412);
    }

    public class07001 y() {
        return this.L;
    }

    public <T> void y(String string, Codec<T> codec, @Nullable T t) {
        if (t != null) {
            this.N(string, codec, t);
        }
    }

    public class08329 N(String string) {
        class07001 class070012 = new class07001();
        this.L.N(string, (class07709)class070012);
        return new class08303(this.u(string), this.y, class070012);
    }

    public void N(String string, String string2) {
        this.L.N_67(string, string2);
    }

    public void N(String string, int[] nArray) {
        this.L.N(string, nArray);
    }

    public boolean N() {
        return this.L.z();
    }

    public <T> class08294<T> N(String string, Codec<T> codec) {
        class07741 class077412 = new class07741();
        this.L.N(string, (class07709)class077412);
        return new class08330(this.N, string, this.y, codec, class077412);
    }

    public void N(String string, byte by) {
        this.L.N(string, by);
    }

    public void N(String string, boolean bl) {
        this.L.N(string, bl);
    }

    public <T> void N(MapCodec<T> mapCodec, T t) {
        DataResult dataResult = mapCodec.encoder().encodeStart(this.y, t);
        Objects.requireNonNull(dataResult);
        DataResult var3 = dataResult;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)var3, (int)n)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                DataResult.Success success = (DataResult.Success)var3;
                this.L.N((class07001)success.value());
                break;
            }
            case 1: {
                DataResult.Error error = (DataResult.Error)var3;
                this.N.N_47((class04480)new class08298(t, error));
                error.partialValue().ifPresent(class077092 -> this.L.N((class07001)class077092));
            }
        }
    }

    public <T> void N(String string, Codec<T> codec, T t) {
        DataResult dataResult = codec.encodeStart(this.y, t);
        Objects.requireNonNull(dataResult);
        DataResult var4 = dataResult;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)var4, (int)n)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                DataResult.Success success = (DataResult.Success)var4;
                this.L.N(string, (class07709)success.value());
                break;
            }
            case 1: {
                DataResult.Error error = (DataResult.Error)var4;
                this.N.N_47((class04480)new class08321(string, t, error));
                error.partialValue().ifPresent(class077092 -> this.L.N(string, class077092));
            }
        }
    }

    public static class08303 N(class04490 class044902) {
        return new class08303(class044902, (DynamicOps<class07709>)class07713.N, new class07001());
    }

    public static class08303 N(class04490 class044902, class01929 class019292) {
        return new class08303(class044902, (DynamicOps<class07709>)class019292.N((DynamicOps)class07713.N), new class07001());
    }

    public void N(String string, double d) {
        this.L.N(string, d);
    }

    public void N(String string, float f) {
        this.L.N(string, f);
    }

    public void N(String string, long l) {
        this.L.N(string, l);
    }

    public void N(String string, int n) {
        this.L.N(string, n);
    }

    public void N(String string, short s) {
        this.L.N(string, s);
    }

    public void putLongArray(String string, long[] lArray) {
        this.L.N(string, lArray);
    }
}

