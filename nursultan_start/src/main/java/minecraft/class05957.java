/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01281
 *  minecraft.class01381
 *  minecraft.class03496
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Predicate;
import minecraft.class01281;
import minecraft.class01381;
import minecraft.class03496;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05908;
import minecraft.class05946;
import minecraft.class05955;

public interface class05957
extends class01381,
Predicate<class05908> {
    public static final Codec<class05957> y = class04206.I.T().dispatch("condition", class05957::N, class05955::N);
    public static final Codec<class05957> L = Codec.lazyInitialized(() -> Codec.withAlternative(y, (Codec)class03496.R));
    public static final Codec<class03556<class05957>> u = class01281.N((class05946)class04227.yq, L);

    public class05955 N();
}

