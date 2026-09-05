/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class04206
 *  minecraft.class06069
 *  minecraft.class07001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class03368;
import minecraft.class04206;
import minecraft.class06069;
import minecraft.class07001;
import org.jspecify.annotations.Nullable;

public interface class03336 {
    public static final Codec<class03336> L = class04206.P.T().dispatch(class03336::N, class03368::codec);

    public class03368<?> N();

    public @Nullable class07001 N(class06069 var1, @Nullable class07001 var2);
}

