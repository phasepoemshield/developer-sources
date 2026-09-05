/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class04782
 *  minecraft.class06889
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00690;
import minecraft.class00692;
import minecraft.class00702;
import minecraft.class04782;
import minecraft.class06889;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00708
extends class00692 {
    private static final Logger y = LogUtils.getLogger();
    private static final int L = 10;
    private @Nullable class06889 u;
    private int i;

    @Override
    public void L() {
        this.u = null;
        this.i = 0;
    }

    public class00708(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00708> B() {
        return class00702.Z;
    }

    @Override
    public float i() {
        return 3.0f;
    }

    public void N(class06889 class068892) {
        this.u = class068892;
    }

    @Override
    public void N(class04782 class047822) {
        if (this.u == null) {
            y.warn("Aborting charge player as no target was set.");
            this.N.W().N(class00702.N);
            return;
        }
        if (this.i > 0 && this.i++ >= 10) {
            this.N.W().N(class00702.N);
            return;
        }
        double d = this.u.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
        if (d < 100.0 || d > 22500.0 || this.N.field_5976 || this.N.field_5992) {
            ++this.i;
        }
    }

    @Override
    public @Nullable class06889 R() {
        return this.u;
    }
}

