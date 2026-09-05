/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import minecraft.class00913;
import minecraft.class01894;

public interface class00949 {
    public static final Codec<class00949> N = class01894.N.flatComapMap(class00913::new, class009492 -> {
        if (class009492 instanceof class00913) {
            return DataResult.success((Object)((class00913)class009492).N());
        }
        return DataResult.error(() -> "Unsupported font description type: " + String.valueOf(class009492));
    });
    public static final class00913 y = new class00913(class01894.y((String)"default"));
}

