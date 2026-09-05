/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class03266
 *  minecraft.class04233
 *  minecraft.class04234
 *  minecraft.class06333
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.client.rendering.SpriteSourcesAccessor
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class01894;
import minecraft.class03266;
import minecraft.class04216;
import minecraft.class04219;
import minecraft.class04221;
import minecraft.class04233;
import minecraft.class04234;
import minecraft.class06333;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.client.rendering.SpriteSourcesAccessor;

@Environment(value=EnvType.CLIENT)
public class class04223
implements SpriteSourcesAccessor {
    private static final class06333<class01894, MapCodec<? extends class04233>> L = new class06333();
    public static final Codec<class04233> N = L.N(class01894.N).dispatch(class04233::N, mapCodec -> mapCodec);
    public static final Codec<List<class04233>> y = N.listOf().fieldOf("sources").codec();

    public static /* synthetic */ class06333 y() {
        return L;
    }

    public static void N() {
        L.N((Object)class01894.y((String)"single"), class04216.y);
        L.N((Object)class01894.y((String)"directory"), class04221.y);
        L.N((Object)class01894.y((String)"filter"), class04219.y);
        L.N((Object)class01894.y((String)"unstitch"), (Object)class04234.L);
        L.N((Object)class01894.y((String)"paletted_permutations"), (Object)class03266.u);
    }
}

