/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01317
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class06165
 *  minecraft.class07079
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07952
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Iterator;
import minecraft.class01317;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class06165;
import minecraft.class07079;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07952;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;

class class06136
extends class07952<class07438> {
    private @Nullable class07438 z;
    private @Nullable class07438 U;
    private int E;
    final /* synthetic */ class06165 Z;

    public void L() {
        this.N(this.z);
        this.L = this.z;
        if (this.U != null) {
            this.E = this.U.method_6117();
        }
        this.Z.method_5783(class04909.Uf, 1.0f, 1.0f);
        this.Z.B(true);
        this.Z.w();
        super.L();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class06136(class06165 class061652, Class clazz, boolean bl, @Nullable boolean bl2, class01317 class013172) {
        this.Z = class061652;
        super((class07079)class061652, clazz, 10, bl, bl2, class013172);
    }

    public boolean N() {
        if (this.y > 0 && this.i.method_59922().y(this.y) != 0) {
            return false;
        }
        class04782 class047822 = class06136.N_18((class07299)this.Z.method_73183());
        Iterator var2 = this.Z.m().toList().iterator();
        while (var2.hasNext()) {
            class07438 class074382 = (class07438)((class08372)var2.next()).N((class07299)class047822, class07438.class);
            if (class074382 == null) continue;
            this.U = class074382;
            this.z = class074382.method_6065();
            return class074382.method_6117() != this.E && this.N(this.z, this.u);
        }
        return false;
    }
}

