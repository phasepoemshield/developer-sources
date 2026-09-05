/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class07079
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class01328;
import minecraft.class07079;
import minecraft.class07475;
import minecraft.class07953;
import minecraft.class08042;

class class08015
extends class07953 {
    private final class01328 y;
    final /* synthetic */ class08042 N;

    @Override
    public void L() {
        class07079 class070792 = this.N.z();
        this.N.y(class070792 != null ? class070792.T() : null);
        super.L();
    }

    public class08015(class08042 class080422, class07475 class074752) {
        this.N = class080422;
        super((class07079)class074752, false);
        this.y = class01328.y().u().i();
    }

    public boolean N() {
        class07079 class070792 = this.N.z();
        return class070792 != null && class070792.T() != null && this.N(class070792.T(), this.y);
    }
}

