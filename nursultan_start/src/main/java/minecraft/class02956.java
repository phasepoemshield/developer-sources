/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class04782
 *  minecraft.class05765
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class02976;
import minecraft.class04782;
import minecraft.class05765;

public class class02956
extends class05765<class02976> {
    private final int N;

    public class02956(int n) {
        super((Map)ImmutableMap.of());
        this.N = n * 20;
    }

    protected boolean N(class04782 class047822, class02976 class029762) {
        return !class029762.method_5799() && class029762.yB() >= (long)this.N && !class029762.g_() && class029762.method_24828() && !class029762.method_42148() && class029762.yN();
    }

    protected void u(class04782 class047822, class02976 class029762, long l) {
        if (class029762.yy()) {
            class029762.yR();
        } else if (!class029762.Nk()) {
            class029762.yi();
        }
    }
}

