/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00423
 *  minecraft.class00501
 *  minecraft.class00642
 *  minecraft.class03041
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00423;
import minecraft.class00501;
import minecraft.class00642;
import minecraft.class03041;
import org.slf4j.Logger;

public class class01025
extends class00642 {
    private static final Logger N = LogUtils.getLogger();
    private static final class00392 y = class00392.L((String)"disconnect.exceeded_packet_rate");
    private final int L;

    public class01025(int n) {
        super(class00423.field_11941);
        this.L = n;
    }

    protected void method_30615() {
        super.method_30615();
        float f = this.method_10762();
        if (f > (float)this.L) {
            N.warn("Player exceeded rate-limit (sent {} packets per second)", (Object)Float.valueOf(f));
            this.method_10752((class00381)new class00501(y), class03041.N(() -> this.method_10747(y)));
            this.method_10757();
        }
    }
}

