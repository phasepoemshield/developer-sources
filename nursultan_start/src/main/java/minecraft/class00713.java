/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class04782
 *  minecraft.class06403
 *  minecraft.class06889
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07830
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00690;
import minecraft.class00692;
import minecraft.class00702;
import minecraft.class00753;
import minecraft.class04782;
import minecraft.class06403;
import minecraft.class06889;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07830;
import org.jspecify.annotations.Nullable;

public class class00713
extends class00692 {
    private @Nullable class06889 y;
    private int L;

    @Override
    public void L() {
        this.y = null;
        this.L = 0;
    }

    public class00713(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00713> B() {
        return class00702.z;
    }

    @Override
    public float i() {
        return 3.0f;
    }

    @Override
    public void y() {
        if (this.L++ % 10 == 0) {
            float f = (this.N.method_59922().z() - 0.5f) * 8.0f;
            float f2 = (this.N.method_59922().z() - 0.5f) * 4.0f;
            float f3 = (this.N.method_59922().z() - 0.5f) * 8.0f;
            this.N.method_73183().method_8406((class07126)class07107.G, this.N.method_23317() + (double)f, this.N.method_23318() + 2.0 + (double)f2, this.N.method_23321() + (double)f3, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void N(class04782 class047822) {
        double d;
        ++this.L;
        if (this.y == null) {
            class07209 class072092 = class047822.N(class07830.field_13197, class06403.N((class07209)this.N.M()));
            this.y = class06889.L((class00753)class072092);
        }
        if ((d = this.y.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321())) < 100.0 || d > 22500.0 || this.N.field_5976 || this.N.field_5992) {
            this.N.method_6033(0.0f);
        } else {
            this.N.method_6033(1.0f);
        }
    }

    @Override
    public @Nullable class06889 R() {
        return this.y;
    }
}

