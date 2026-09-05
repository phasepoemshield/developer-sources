/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class04206;
import minecraft.class05243;
import minecraft.class05244;
import minecraft.class05256;
import minecraft.class05258;
import minecraft.class05261;
import minecraft.class05263;
import minecraft.class05271;

public interface class05240<P extends class05261> {
    public static final class05240<class05243> N = class05240.N("always_true", class05243.N);
    public static final class05240<class05244> y = class05240.N("block_match", class05244.N);
    public static final class05240<class05256> L = class05240.N("blockstate_match", class05256.N);
    public static final class05240<class05271> u = class05240.N("tag_match", class05271.N);
    public static final class05240<class05258> i = class05240.N("random_block_match", class05258.N);
    public static final class05240<class05263> R = class05240.N("random_blockstate_match", class05263.N);

    public static <P extends class05261> class05240<P> N(String string, MapCodec<P> mapCodec) {
        return (class05240)class00751.N((class00751)class04206.m, (String)string, () -> mapCodec);
    }

    public MapCodec<P> codec();
}

