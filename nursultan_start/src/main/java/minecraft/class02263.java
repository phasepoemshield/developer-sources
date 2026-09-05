/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02306
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import minecraft.class02306;

public class class02263 {
    private final Map<class02306, Boolean> L;
    public static final Codec<class02263> N = Codec.unboundedMap((Codec)class02306.field_49114, (Codec)Codec.BOOL).xmap(class02263::new, class022632 -> class022632.L);
    public static final class02263 y = new class02263(Map.of());

    public class02263(Map<class02306, Boolean> map) {
        this.L = map;
    }

    public boolean N(Set<class02306> set) {
        for (Map.Entry<class02306, Boolean> entry : this.L.entrySet()) {
            if (set.contains(entry.getKey()) == entry.getValue().booleanValue()) continue;
            return false;
        }
        return true;
    }

    public class02263 N(class02263 class022632) {
        HashMap<class02306, Boolean> hashMap = new HashMap<class02306, Boolean>(class022632.L);
        hashMap.putAll(this.L);
        return new class02263(Map.copyOf(hashMap));
    }
}

