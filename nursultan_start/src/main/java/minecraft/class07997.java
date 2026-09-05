/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01317
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07453
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01317;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07453;
import minecraft.class07952;
import org.jspecify.annotations.Nullable;

public class class07997<T extends class07438>
extends class07952<T> {
    private final class07453 Z;

    public class07997(class07453 class074532, Class<T> clazz, boolean bl, @Nullable class01317 class013172) {
        super((class07079)class074532, clazz, 10, bl, false, class013172);
        this.Z = class074532;
    }

    @Override
    public boolean y() {
        if (this.u != null) {
            return this.u.N(class07997.N((class07049)this.i), (class07438)this.i, this.L);
        }
        return super.y();
    }

    @Override
    public boolean N() {
        return !this.Z.NQ() && super.N();
    }
}

