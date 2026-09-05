/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00068
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04568
 *  minecraft.class04585
 *  minecraft.class05220
 *  minecraft.class05304
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 */
package minecraft;

import minecraft.class00068;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04568;
import minecraft.class04585;
import minecraft.class05220;
import minecraft.class05304;
import minecraft.class05630;
import minecraft.class05681;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;

public class class05697
extends class05681 {
    private static final int L = 32;
    private static final class00392 u = class00392.L((String)"lanServer.title");
    private static final class00392 i = class00392.L((String)"selectServer.hiddenAddress");
    private final class05304 R;
    protected final class06202 N;
    protected final class00068 y;

    protected class05697(class05304 class053042, class00068 class000682) {
        this.R = class053042;
        this.y = class000682;
        this.N = class06202.Nq();
    }

    public class00392 y() {
        return class00392.i().y(u).y(class05220.l).i(this.y.N());
    }

    @Override
    public void N() {
        this.R.N(new class04568(this.y.N(), this.y.y(), class04585.field_45609));
    }

    @Override
    boolean N(class05681 class056812) {
        return class056812 instanceof class05697 && ((class05697)class056812).y == this.y;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.L()) {
            this.N();
            return true;
        }
        return super.method_25404(class066012);
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        if (bl) {
            this.N();
        }
        return super.method_25402(class066132, bl);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class010542.y((class01590)this.N.i_3, u, this.method_73380() + 32 + 3, this.method_73382() + 1, -1);
        class010542.y((class01590)this.N.i_3, this.y.N(), this.method_73380() + 32 + 3, this.method_73382() + 12, -8355712);
        if (((class05630)this.N.i_7).E) {
            class010542.y((class01590)this.N.i_3, i, this.method_73380() + 32 + 3, this.method_73382() + 12 + 11, -8355712);
        } else {
            class010542.y((class01590)this.N.i_3, this.y.y(), this.method_73380() + 32 + 3, this.method_73382() + 12 + 11, -8355712);
        }
    }

    @Override
    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{this.y()});
    }
}

