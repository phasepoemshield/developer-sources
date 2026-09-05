/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  minecraft.class02136
 *  minecraft.class04540
 *  minecraft.class07078
 *  minecraft.class07428
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class01002;
import minecraft.class01016;
import minecraft.class01043;
import minecraft.class02136;
import minecraft.class04540;
import minecraft.class07078;
import minecraft.class07428;
import minecraft.class07536;

public class class01003 {
    private final Map<class07428, class02136<class01016>> N = class07536.N_74(class07428.class, class074282 -> class04540.y());
    private final Map<class07078<?>, class01043> y = Maps.newLinkedHashMap();
    private float L = 0.1f;

    public class01002 N() {
        return new class01002(this.L, (Map)this.N.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, entry -> ((class02136)entry.getValue()).N())), (Map<class07078<?>, class01043>)ImmutableMap.copyOf(this.y));
    }

    public class01003 N(float f) {
        this.L = f;
        return this;
    }

    public class01003 N(class07078<?> class070782, double d, double d2) {
        this.y.put(class070782, new class01043(d2, d));
        return this;
    }

    public class01003 N(class07428 class074282, int n, class01016 class010162) {
        this.N.get(class074282).N((Object)class010162, n);
        return this;
    }
}

