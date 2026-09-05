/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class08289
 *  minecraft.class08294
 *  net.fabricmc.fabric.api.serialization.v1.view.FabricWriteView
 *  net.fabricmc.fabric.mixin.serialization.ValueOutputMixin
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class08289;
import minecraft.class08294;
import net.fabricmc.fabric.api.serialization.v1.view.FabricWriteView;
import net.fabricmc.fabric.mixin.serialization.ValueOutputMixin;
import org.jspecify.annotations.Nullable;

public interface class08329
extends FabricWriteView,
ValueOutputMixin {
    public void L(String var1);

    public class08289 y(String var1);

    public <T> void y(String var1, Codec<T> var2, @Nullable T var3);

    public void N(String var1, int[] var2);

    public void N(String var1, String var2);

    public void N(String var1, double var2);

    public class08329 N(String var1);

    public boolean N();

    public <T> class08294<T> N(String var1, Codec<T> var2);

    public void N(String var1, byte var2);

    public void N(String var1, boolean var2);

    @Deprecated
    public <T> void N(MapCodec<T> var1, T var2);

    public <T> void N(String var1, Codec<T> var2, T var3);

    public void N(String var1, float var2);

    public void N(String var1, long var2);

    public void N(String var1, int var2);

    public void N(String var1, short var2);
}

