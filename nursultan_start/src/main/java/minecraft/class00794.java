/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class05338
 *  minecraft.class05919
 *  minecraft.class05952
 *  minecraft.class05957
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class00805;
import minecraft.class05338;
import minecraft.class05919;
import minecraft.class05952;
import minecraft.class05957;

public class class00794
implements class05952 {
    private final ImmutableMap.Builder<String, class05338> N = ImmutableMap.builder();
    private final class05919 y;

    public class00794(class05919 class059192) {
        this.y = class059192;
    }

    public class05957 build() {
        return new class00805((Map<String, class05338>)this.N.build(), this.y);
    }

    public class00794 N(String string, class05338 class053382) {
        this.N.put((Object)string, (Object)class053382);
        return this;
    }
}

