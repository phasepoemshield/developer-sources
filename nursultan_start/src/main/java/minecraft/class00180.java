/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01487
 *  minecraft.class02325
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.IntStream;
import minecraft.class00171;
import minecraft.class00174;
import minecraft.class01487;
import minecraft.class02325;

class class00180
implements class00171 {
    class00180() {
    }

    @Override
    public <T> T N(DynamicOps<T> dynamicOps, List<T> list, class02325<StringReader> class023252) {
        UUID uUID;
        Optional var4 = dynamicOps.getStringValue(list.getFirst()).result();
        if (var4.isEmpty()) {
            class023252.y().N(class023252.M(), class00174.N);
            return null;
        }
        try {
            uUID = UUID.fromString((String)var4.get());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            class023252.y().N(class023252.M(), class00174.N);
            return null;
        }
        return (T)dynamicOps.createIntList(IntStream.of(class01487.N((UUID)uUID)));
    }
}

