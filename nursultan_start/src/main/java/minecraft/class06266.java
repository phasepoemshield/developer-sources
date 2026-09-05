/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01317
 *  minecraft.class04882
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07952
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01317;
import minecraft.class04882;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07952;
import org.jspecify.annotations.Nullable;

public class class06266<T extends class07438>
extends class07952<T> {
    private static final int Z = 200;
    private int z = 0;

    public void L() {
        this.z = class06266.y((int)200);
        super.L();
    }

    public class06266(class04882 class048822, Class<T> clazz, boolean bl, @Nullable class01317 class013172) {
        super((class07079)class048822, clazz, 500, bl, false, class013172);
    }

    public int U() {
        return this.z;
    }

    public void E() {
        --this.z;
    }

    public boolean N() {
        if (this.z > 0 || !this.i.method_59922().Z()) {
            return false;
        }
        if (!((class04882)this.i).NQ()) {
            return false;
        }
        this.M();
        return this.L != null;
    }
}

