/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class02325
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import minecraft.class00171;
import minecraft.class00174;
import minecraft.class02325;
import org.jspecify.annotations.Nullable;

class class00152
implements class00171 {
    class00152() {
    }

    @Override
    public <T> T N(DynamicOps<T> dynamicOps, List<T> list, class02325<StringReader> class023252) {
        Boolean bl = class00152.N(dynamicOps, list.getFirst());
        if (bl == null) {
            class023252.y().N(class023252.M(), class00174.y);
            return null;
        }
        return (T)dynamicOps.createBoolean(bl.booleanValue());
    }

    private static <T> @Nullable Boolean N(DynamicOps<T> dynamicOps, T t) {
        Optional var2 = dynamicOps.getBooleanValue(t).result();
        if (var2.isPresent()) {
            return (Boolean)var2.get();
        }
        Optional var3 = dynamicOps.getNumberValue(t).result();
        if (var3.isPresent()) {
            return ((Number)var3.get()).doubleValue() != 0.0;
        }
        return null;
    }
}

