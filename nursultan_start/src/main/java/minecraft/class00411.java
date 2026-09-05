/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00647
 *  minecraft.class00949
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class05194
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class00395;
import minecraft.class00405;
import minecraft.class00647;
import minecraft.class00949;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class05194;
import minecraft.class06338;

public class class00411 {
    public static final MapCodec<class00405> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05194.N.optionalFieldOf("color").forGetter(class004052 -> Optional.ofNullable(class004052.L)), (App)class06338.W.optionalFieldOf("shadow_color").forGetter(class004052 -> Optional.ofNullable(class004052.u)), (App)Codec.BOOL.optionalFieldOf("bold").forGetter(class004052 -> Optional.ofNullable(class004052.i)), (App)Codec.BOOL.optionalFieldOf("italic").forGetter(class004052 -> Optional.ofNullable(class004052.R)), (App)Codec.BOOL.optionalFieldOf("underlined").forGetter(class004052 -> Optional.ofNullable(class004052.M)), (App)Codec.BOOL.optionalFieldOf("strikethrough").forGetter(class004052 -> Optional.ofNullable(class004052.B)), (App)Codec.BOOL.optionalFieldOf("obfuscated").forGetter(class004052 -> Optional.ofNullable(class004052.Z)), (App)class00647.N.optionalFieldOf("click_event").forGetter(class004052 -> Optional.ofNullable(class004052.z)), (App)class00395.N.optionalFieldOf("hover_event").forGetter(class004052 -> Optional.ofNullable(class004052.U)), (App)Codec.STRING.optionalFieldOf("insertion").forGetter(class004052 -> Optional.ofNullable(class004052.E)), (App)class00949.N.optionalFieldOf("font").forGetter(class004052 -> Optional.ofNullable(class004052.W))).apply((Applicative)instance, class00405::N));
    public static final Codec<class00405> y = N.codec();
    public static final class02362<class04247, class00405> L = class02389.L(y);
}

