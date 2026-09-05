/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01317
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

public class class04856<T extends class07438>
extends class07952<T> {
    private boolean Z = true;

    public class04856(class04882 class048822, Class<T> clazz, int n, boolean bl, boolean bl2, @Nullable class01317 class013172) {
        super((class07079)class048822, clazz, n, bl, bl2, class013172);
    }

    public void N(boolean bl) {
        this.Z = bl;
    }

    public boolean N() {
        return this.Z && super.N();
    }
}

