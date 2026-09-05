/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05671
 *  minecraft.class06241
 *  minecraft.class06584
 *  minecraft.class07508
 *  minecraft.class08044
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05671;
import minecraft.class05839;
import minecraft.class05856;
import minecraft.class05868;
import minecraft.class06241;
import minecraft.class06584;
import minecraft.class07508;
import minecraft.class08044;

public class class05876
extends class05671
implements class05868<class05856> {
    private static final int z = 4;
    private static final int U = 98;
    private static final class00392 E = class00392.L((String)"lectern.take_book");
    private final class05856 W;
    private final class07508 m = new class05839(this);

    private void L(int n) {
        ((class03443)this.field_22787.T_2).N(this.W.b, n);
    }

    protected void L() {
        this.L(1);
    }

    public class05876(class05856 class058562, class08044 class080442, class00392 class003922) {
        this.W = class058562;
    }

    @Override
    public class05856 E() {
        return this.W;
    }

    void U() {
        this.N(this.W.W());
    }

    void z() {
        class06584 class065842 = this.W.E();
        this.N(Objects.requireNonNullElse(class06241.N((class06584)class065842), class05671.u));
    }

    protected void u() {
        this.L(2);
    }

    protected boolean y(int n) {
        if (n != this.W.W()) {
            this.L(100 + n);
            return true;
        }
        return false;
    }

    protected void N() {
        if (((class04453)this.field_22787.T_4).method_7294()) {
            int n = this.i();
            int n2 = this.field_22789 / 2;
            this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> this.method_25419()).N(n2 - 98 - 2, n).N(98).N());
            this.method_37063((class04654)class05362.method_46430((class00392)E, class053622 -> this.L(3)).N(n2 + 2, n).N(98).N());
        } else {
            super.N();
        }
    }

    public void method_25426() {
        super.method_25426();
        this.W.N(this.m);
    }

    public void method_25432() {
        super.method_25432();
        this.W.y(this.m);
    }

    public void method_25419() {
        ((class04453)this.field_22787.T_4).method_7346();
        super.method_25419();
    }

    public boolean method_25421() {
        return false;
    }

    protected void R() {
        ((class04453)this.field_22787.T_4).method_7346();
    }
}

