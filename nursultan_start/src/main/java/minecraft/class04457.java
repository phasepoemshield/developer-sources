/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.MapCodec
 *  minecraft.class07001
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import minecraft.class07001;
import minecraft.class07701;

public interface class04457 {
    public Stream<class07001> N(class07701 var1) throws CommandSyntaxException;

    public MapCodec<? extends class04457> N();
}

