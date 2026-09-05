/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import minecraft.class05033;

public interface class07030
extends class05033 {
    public static final Map<String, class07030> N = new Object2ObjectArrayMap();
    public static final Codec<class07030> y = Codec.stringResolver(class05033::method_15434, N::get);
}

