/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class03003
 *  minecraft.class03010
 *  minecraft.class03013
 *  minecraft.class03979
 *  minecraft.class04020
 *  minecraft.class04036
 *  minecraft.class04039
 *  minecraft.class04047
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class00751;
import minecraft.class03003;
import minecraft.class03010;
import minecraft.class03013;
import minecraft.class03979;
import minecraft.class04020;
import minecraft.class04036;
import minecraft.class04039;
import minecraft.class04047;
import minecraft.class04206;

public interface class03028
extends Function<class04039, class03003> {
    public static final Codec<class03028> y = class04206.NL.T().dispatch(class030282 -> class030282.N().N(), Function.identity());

    public static MapCodec<? extends class03028> N(class00751<MapCodec<? extends class03028>> class007512) {
        class04020.N(class007512, (String)"bandlands", (class03979)class04036.field_35226);
        class04020.N(class007512, (String)"block", (class03979)class04047.N);
        class04020.N(class007512, (String)"sequence", (class03979)class03010.N);
        return class04020.N(class007512, (String)"condition", (class03979)class03013.N);
    }

    public class03979<? extends class03028> N();
}

