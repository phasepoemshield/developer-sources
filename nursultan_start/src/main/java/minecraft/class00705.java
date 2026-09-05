/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00473
 *  minecraft.class00753
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06403
 *  minecraft.class06889
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07830
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00473;
import minecraft.class00690;
import minecraft.class00692;
import minecraft.class00702;
import minecraft.class00753;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06403;
import minecraft.class06889;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07830;
import org.jspecify.annotations.Nullable;

public class class00705
extends class00692 {
    private @Nullable class06889 y;

    @Override
    public void L() {
        this.y = null;
    }

    @Override
    public float M() {
        float f = (float)this.N.method_18798().Z() + 1.0f;
        return Math.min(f, 40.0f) / f;
    }

    public class00705(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00705> B() {
        return class00702.u;
    }

    @Override
    public float i() {
        return 1.5f;
    }

    @Override
    public void y() {
        class06889 class068892 = this.N.u(1.0f).u();
        class068892.y(-0.7853982f);
        double d = this.N.L.method_23317();
        double d2 = this.N.L.method_23323(0.5);
        double d3 = this.N.L.method_23321();
        for (int i = 0; i < 8; ++i) {
            class06069 class060692 = this.N.method_59922();
            double d4 = d + class060692.E() / 2.0;
            double d5 = d2 + class060692.E() / 2.0;
            double d6 = d3 + class060692.E() / 2.0;
            class06889 class068893 = this.N.method_18798();
            this.N.method_73183().method_8406((class07126)class00473.N((class07103)class07107.Z, (float)1.0f), d4, d5, d6, -class068892.M * (double)0.08f + class068893.M, -class068892.B * (double)0.3f + class068893.B, -class068892.Z * (double)0.08f + class068893.Z);
            class068892.y(0.19634955f);
        }
    }

    @Override
    public void N(class04782 class047822) {
        if (this.y == null) {
            this.y = class06889.L((class00753)class047822.N(class07830.field_13203, class06403.N((class07209)this.N.M())));
        }
        if (this.y.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321()) < 1.0) {
            this.N.W().y(class00702.R).Z();
            this.N.W().N(class00702.M);
        }
    }

    @Override
    public @Nullable class06889 R() {
        return this.y;
    }
}

