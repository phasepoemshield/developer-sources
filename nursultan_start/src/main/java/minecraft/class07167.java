/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class07047
 *  minecraft.class07055
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class04891;
import minecraft.class04909;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07145;
import minecraft.class07149;
import minecraft.class07156;
import org.jspecify.annotations.Nullable;

class class07167
extends class07145 {
    final /* synthetic */ class07149 N;

    @Override
    protected int M() {
        return 20;
    }

    class07167(class07149 class071492) {
        this.N = class071492;
        super(class071492);
    }

    @Override
    protected int Z() {
        return 340;
    }

    @Override
    protected void U() {
        this.N.method_6092(new class07055(class07047.m, 1200));
    }

    @Override
    protected @Nullable class04891 E() {
        return class04909.sz;
    }

    @Override
    public boolean N() {
        if (!super.N()) {
            return false;
        }
        return !this.N.method_6059(class07047.m);
    }

    @Override
    protected class07156 W() {
        return class07156.field_7382;
    }
}

