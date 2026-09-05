/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class06889
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00690;
import minecraft.class00692;
import minecraft.class00702;
import minecraft.class04782;
import minecraft.class06889;
import org.jspecify.annotations.Nullable;

public class class00689
extends class00692 {
    private @Nullable class06889 y;

    @Override
    public void L() {
        this.y = null;
    }

    public class00689(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00689> B() {
        return class00702.U;
    }

    @Override
    public float i() {
        return 1.0f;
    }

    @Override
    public void N(class04782 class047822) {
        if (this.y == null) {
            this.y = this.N.method_73189();
        }
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public @Nullable class06889 R() {
        return this.y;
    }
}

