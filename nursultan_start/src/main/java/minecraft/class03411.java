/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class03375
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class03375;
import org.slf4j.Logger;

class class03411
implements class03375 {
    private static final Logger L = LogUtils.getLogger();
    private int u;
    final /* synthetic */ int y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class03411(int n) {
        this.y = n;
    }

    public long y() {
        ++this.u;
        long l = Math.min(1L << this.u, (long)this.y);
        L.debug("Skipping for {} extra cycles", (Object)l);
        return l;
    }

    public long N() {
        this.u = 0;
        return 1L;
    }
}

