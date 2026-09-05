/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05444
 *  minecraft.class05445
 *  minecraft.class06889
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class05444;
import minecraft.class05445;
import minecraft.class06889;
import minecraft.class07475;
import minecraft.class07957;
import org.jspecify.annotations.Nullable;

public class class07977
extends class07957 {
    @Override
    protected @Nullable class06889 M() {
        class06889 class068892 = this.y.method_5828(0.0f);
        int n = 8;
        class06889 class068893 = class05445.N((class07475)this.y, (int)8, (int)7, (double)class068892.M, (double)class068892.Z, (float)1.5707964f, (int)3, (int)1);
        if (class068893 != null) {
            return class068893;
        }
        return class05444.N((class07475)this.y, (int)8, (int)4, (int)-2, (double)class068892.M, (double)class068892.Z, (double)1.5707963705062866);
    }

    public class07977(class07475 class074752, double d) {
        super(class074752, d);
    }
}

