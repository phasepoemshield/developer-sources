/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class04353;
import minecraft.class04373;

public class class04381 {
    private final float N;
    private final Map<String, List<class04373>> y = Maps.newHashMap();
    private boolean L;

    private class04381(float f) {
        this.N = f;
    }

    public class04353 y() {
        return new class04353(this.N, this.L, this.y);
    }

    public class04381 N(String string2, class04373 class043732) {
        this.y.computeIfAbsent(string2, string -> new ArrayList()).add(class043732);
        return this;
    }

    public class04381 N() {
        this.L = true;
        return this;
    }

    public static class04381 N(float f) {
        return new class04381(f);
    }
}

