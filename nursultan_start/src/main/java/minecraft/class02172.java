/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02188
 *  minecraft.class03556
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02178;
import minecraft.class02188;
import minecraft.class03556;

public sealed interface class02172<T, O>
permits class02188, class02178 {
    public class03556<T> N(ImmutableStringReader var1, class01929 var2, DynamicOps<O> var3, Codec<T> var4, class01921<T> var5) throws CommandSyntaxException;
}

