/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05855
 *  minecraft.class06246
 *  minecraft.class06254
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import minecraft.class05855;
import minecraft.class06246;
import minecraft.class06254;

public interface class06270 {
    public static final MapCodec<class06270> y = class05855.field_44802.dispatchMap(class06270::N, class05855::N);

    public Either<class06246, class06254> y();

    public class05855 N();
}

