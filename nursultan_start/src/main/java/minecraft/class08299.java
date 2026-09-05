/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01929
 *  minecraft.class08310
 *  minecraft.class08319
 *  net.fabricmc.fabric.api.serialization.v1.view.FabricReadView
 *  net.fabricmc.fabric.mixin.serialization.ValueInputMixin
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class01929;
import minecraft.class08310;
import minecraft.class08319;
import net.fabricmc.fabric.api.serialization.v1.view.FabricReadView;
import net.fabricmc.fabric.mixin.serialization.ValueInputMixin;

public interface class08299
extends FabricReadView,
ValueInputMixin {
    public Optional<class08319> L(String var1);

    public <T> class08310<T> L(String var1, Codec<T> var2);

    public Optional<String> M(String var1);

    public Optional<int[]> B(String var1);

    public Optional<Integer> i(String var1);

    public class08319 u(String var1);

    public <T> Optional<class08310<T>> y(String var1, Codec<T> var2);

    public class08299 y(String var1);

    public float N(String var1, float var2);

    public long N(String var1, long var2);

    public double N(String var1, double var2);

    @Deprecated
    public class01929 N();

    public String N(String var1, String var2);

    public boolean N(String var1, boolean var2);

    public Optional<class08299> N(String var1);

    @Deprecated
    public <T> Optional<T> N(MapCodec<T> var1);

    public <T> Optional<T> N(String var1, Codec<T> var2);

    public int N(String var1, int var2);

    public int N(String var1, short var2);

    public byte N(String var1, byte var2);

    public Optional<Long> R(String var1);
}

