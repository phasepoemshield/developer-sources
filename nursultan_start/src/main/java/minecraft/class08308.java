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
 *  minecraft.class01424
 *  minecraft.class01929
 *  minecraft.class04480
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class06995
 *  minecraft.class07001
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07737
 *  minecraft.class07741
 *  minecraft.class08295
 *  minecraft.class08296
 *  minecraft.class08299
 *  net.fabricmc.fabric.api.serialization.v1.view.FabricReadView
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10419;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import java.lang.runtime.SwitchBootstraps;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import minecraft.class01424;
import minecraft.class01929;
import minecraft.class04480;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class06995;
import minecraft.class07001;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07737;
import minecraft.class07741;
import minecraft.class08295;
import minecraft.class08296;
import minecraft.class08299;
import minecraft.class08305;
import minecraft.class08310;
import minecraft.class08313;
import minecraft.class08316;
import minecraft.class08318;
import minecraft.class08319;
import minecraft.class08333;
import minecraft.class08335;
import net.fabricmc.fabric.api.serialization.v1.view.FabricReadView;
import org.jspecify.annotations.Nullable;

public class class08308
implements class08299,
FabricReadView {
    private final class04490 N;
    private final class08296 y;
    private final class07001 L;

    public Optional<class08319> L(String string) {
        class07741 class077412 = (class07741)this.N(string, class07741.N);
        return class077412 != null ? Optional.of(this.N(string, this.y, class077412)) : Optional.empty();
    }

    public <T> class08310<T> L(String string, Codec<T> codec) {
        class07741 class077412 = (class07741)this.N(string, class07741.N);
        return class077412 != null ? this.N(string, class077412, codec) : this.y.i();
    }

    public Optional<String> M(String string) {
        class07707 class077072 = (class07707)this.N(string, class07707.N);
        return class077072 != null ? Optional.of(class077072.U()) : Optional.empty();
    }

    private class08308(class04490 class044902, class08296 class082962, class07001 class070012) {
        this.N = class044902;
        this.y = class082962;
        this.L = class070012;
    }

    public Optional<int[]> B(String string) {
        class06995 class069952 = (class06995)this.N(string, class06995.N);
        return class069952 != null ? Optional.of(class069952.M()) : Optional.empty();
    }

    private @Nullable class07737 Z(String string) {
        class07709 class077092 = this.L.N(string);
        if (class077092 == null) {
            return null;
        }
        if (class077092 instanceof class07737) {
            return (class07737)class077092;
        }
        this.N.N_47((class04480)new class08313(string, class077092.u()));
        return null;
    }

    public Optional<Integer> i(String string) {
        class07737 class077372 = this.Z(string);
        return class077372 != null ? Optional.of(class077372.B()) : Optional.empty();
    }

    public boolean contains(String string) {
        return this.L.y(string);
    }

    public Collection keys() {
        return this.L.i();
    }

    public class08319 u(String string) {
        class07741 class077412 = (class07741)this.N(string, class07741.N);
        return class077412 != null ? this.N(string, this.y, class077412) : this.y.u();
    }

    public class08299 y(String string) {
        class07001 class070012 = (class07001)this.N(string, class07001.y);
        return class070012 != null ? this.N(string, class070012) : this.y.L();
    }

    public <T> Optional<class08310<T>> y(String string, Codec<T> codec) {
        class07741 class077412 = (class07741)this.N(string, class07741.N);
        return class077412 != null ? Optional.of(this.N(string, class077412, codec)) : Optional.empty();
    }

    public String N(String string, String string2) {
        class07707 class077072 = (class07707)this.N(string, class07707.N);
        return class077072 != null ? class077072.U() : string2;
    }

    private <T> class08310<T> N(String string, class07741 class077412, Codec<T> codec) {
        return class077412.isEmpty() ? this.y.i() : new class08318<T>(this.N, string, this.y, codec, class077412);
    }

    public double N(String string, double d) {
        class07737 class077372 = this.Z(string);
        return class077372 != null ? class077372.U() : d;
    }

    public float N(String string, float f) {
        class07737 class077372 = this.Z(string);
        return class077372 != null ? class077372.E() : f;
    }

    static class08299 N(class04490 class044902, class08296 class082962, class07001 class070012) {
        return class070012.z() ? class082962.L() : new class08308(class044902, class082962, class070012);
    }

    private class08299 N(String string, class07001 class070012) {
        return class070012.z() ? this.y.L() : new class08308(this.N.N_46((class04489)new class10419(string)), this.y, class070012);
    }

    public class01929 N() {
        return this.y.y();
    }

    private class08319 N(String string, class08296 class082962, class07741 class077412) {
        return class077412.isEmpty() ? class082962.u() : new class08295(this.N, string, class082962, class077412);
    }

    public boolean N(String string, boolean bl) {
        class07737 class077372 = this.Z(string);
        return class077372 != null ? class077372.z() != 0 : bl;
    }

    public Optional<class08299> N(String string) {
        class07001 class070012 = (class07001)this.N(string, class07001.y);
        return class070012 != null ? Optional.of(this.N(string, class070012)) : Optional.empty();
    }

    public static class08299 N(class04490 class044902, class01929 class019292, class07001 class070012) {
        return new class08308(class044902, new class08296(class019292, (DynamicOps)class07713.N), class070012);
    }

    public <T> Optional<T> N(MapCodec<T> mapCodec) {
        DynamicOps var2 = this.y.N();
        DataResult dataResult = var2.getMap((Object)this.L).flatMap(mapLike -> mapCodec.decode(var2, mapLike));
        Objects.requireNonNull(dataResult);
        DataResult dataResult2 = dataResult;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult2, (int)n)) {
            default -> throw new MatchException(null, null);
            case 0 -> Optional.of(((DataResult.Success)dataResult2).value());
            case 1 -> {
                DataResult.Error var6_5 = (DataResult.Error)dataResult2;
                this.N.N_47((class04480)new class08333(var6_5));
                yield var6_5.partialValue();
            }
        };
    }

    public <T> Optional<T> N(String string, Codec<T> codec) {
        class07709 class077092 = this.L.N(string);
        if (class077092 == null) {
            return Optional.empty();
        }
        DataResult dataResult = codec.parse(this.y.N(), (Object)class077092);
        Objects.requireNonNull(dataResult);
        DataResult dataResult2 = dataResult;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)dataResult2, (int)n)) {
            default -> throw new MatchException(null, null);
            case 0 -> Optional.of(((DataResult.Success)dataResult2).value());
            case 1 -> {
                DataResult.Error var7_6 = (DataResult.Error)dataResult2;
                this.N.N_47((class04480)new class08335(string, class077092, var7_6));
                yield var7_6.partialValue();
            }
        };
    }

    public static class08319 N(class04490 class044902, class01929 class019292, List<class07001> list) {
        return new class08316(class044902, new class08296(class019292, (DynamicOps)class07713.N), list);
    }

    private <T extends class07709> @Nullable T N(String string, class01424<T> class014242) {
        class07709 class077092 = this.L.N(string);
        if (class077092 == null) {
            return null;
        }
        class01424 var4 = class077092.u();
        if (var4 != class014242) {
            this.N.N_47((class04480)new class08305(string, class014242, var4));
            return null;
        }
        return (T)class077092;
    }

    public long N(String string, long l) {
        class07737 class077372 = this.Z(string);
        return class077372 != null ? class077372.M() : l;
    }

    public int N(String string, int n) {
        class07737 class077372 = this.Z(string);
        return class077372 != null ? class077372.B() : n;
    }

    public int N(String string, short s) {
        class07737 class077372 = this.Z(string);
        return class077372 != null ? class077372.Z() : s;
    }

    public byte N(String string, byte by) {
        class07737 class077372 = this.Z(string);
        return class077372 != null ? class077372.z() : by;
    }

    public Optional<Long> R(String string) {
        class07737 class077372 = this.Z(string);
        return class077372 != null ? Optional.of(class077372.M()) : Optional.empty();
    }

    public Optional getOptionalLongArray(String string) {
        return this.L.E(string);
    }

    public Optional getOptionalByteArray(String string) {
        return this.L.z(string);
    }
}

