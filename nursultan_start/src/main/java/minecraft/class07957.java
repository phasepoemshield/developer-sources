/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05456
 *  minecraft.class06889
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class05456;
import minecraft.class06889;
import minecraft.class07475;
import minecraft.class07978;
import org.jspecify.annotations.Nullable;

public class class07957
extends class07978 {
    public static final float Z = 0.001f;
    protected final float z;

    @Override
    protected @Nullable class06889 M() {
        if (this.y.method_5799()) {
            class06889 class068892 = class05456.N((class07475)this.y, (int)15, (int)7);
            return class068892 == null ? super.M() : class068892;
        }
        if (this.y.method_59922().z() >= this.z) {
            return class05456.N((class07475)this.y, (int)10, (int)7);
        }
        return super.M();
    }

    public class07957(class07475 class074752, double d, float f) {
        super(class074752, d);
        this.z = f;
    }

    public class07957(class07475 class074752, double d) {
        this(class074752, d, 0.001f);
    }
}

