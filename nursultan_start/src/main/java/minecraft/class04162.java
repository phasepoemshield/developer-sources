/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10321
 *  minecraft.class00311
 *  minecraft.class01894
 *  minecraft.class04782
 *  minecraft.class06584
 */
package minecraft;

import Nursultan.class10321;
import java.util.Map;
import java.util.function.Consumer;
import minecraft.class00311;
import minecraft.class01894;
import minecraft.class04782;
import minecraft.class06584;

public class class04162 {
    private final class04782 N;
    private final class00311 y;
    private final Map<class01894, class10321> L;
    private final float u;

    public float L() {
        return this.u;
    }

    public class04162(class04782 class047822, class00311 class003112, Map<class01894, class10321> map, float f) {
        this.N = class047822;
        this.y = class003112;
        this.L = map;
        this.u = f;
    }

    public class00311 y() {
        return this.y;
    }

    public void N(class01894 class018942, Consumer<class06584> consumer) {
        class10321 class103212 = this.L.get(class018942);
        if (class103212 != null) {
            class103212.add(consumer);
        }
    }

    public class04782 N() {
        return this.N;
    }
}

