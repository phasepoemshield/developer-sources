/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09362
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class06759
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07327
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import Nursultan.class09362;
import minecraft.class00384;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class06759;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07327;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;

public class class00402
extends class00394 {
    private static final boolean N = false;
    private static final boolean y = false;
    private static final boolean L = false;
    private boolean u = false;
    private boolean i = false;
    private boolean R = false;
    private final class07327 M = new class09362(this);

    public boolean L() {
        return this.u;
    }

    public boolean M() {
        return this.R;
    }

    public class00402(class07209 class072092, class00500 class005002) {
        super(class00404.field_11904, class072092, class005002);
    }

    public boolean B() {
        this.R = true;
        if (this.z()) {
            class00394 class003942;
            class07209 class072092 = this.U.method_10093(((class07211)this.z.method_8320(this.U).L((class08092)class06759.y)).b());
            this.R = this.z.method_8320(class072092).i() instanceof class06759 ? (class003942 = this.z.method_8321(class072092)) instanceof class00402 && ((class00402)class003942).N().y() > 0 : false;
        }
        return this.R;
    }

    public class00384 Z() {
        class00500 class005002 = this.w();
        if (class005002.N(class00869.MQ)) {
            return class00384.field_11924;
        }
        if (class005002.N(class00869.EQ)) {
            return class00384.field_11923;
        }
        if (class005002.N(class00869.EO)) {
            return class00384.field_11922;
        }
        return class00384.field_11924;
    }

    private void U() {
        class00891 class008912 = this.w().i();
        if (class008912 instanceof class06759) {
            this.B();
            this.z.N(this.U, class008912, 1);
        }
    }

    public boolean z() {
        class00500 class005002 = this.z.method_8320(this.d());
        if (class005002.i() instanceof class06759) {
            return (Boolean)class005002.L((class08092)class06759.L);
        }
        return false;
    }

    public boolean u() {
        return this.i;
    }

    @Override
    public void y(class08329 class083292) {
        super.y(class083292);
        class083292.L("CustomName");
        class083292.L("conditionMet");
        class083292.L("powered");
    }

    public void y(boolean bl) {
        boolean bl2 = this.i;
        this.i = bl;
        if (!bl2 && bl && !this.u && this.z != null && this.Z() != class00384.field_11922) {
            this.U();
        }
    }

    @Override
    protected void N(class08329 class083292) {
        super.N(class083292);
        this.M.N(class083292);
        class083292.N("powered", this.L());
        class083292.N("conditionMet", this.M());
        class083292.N("auto", this.u());
    }

    @Override
    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        this.M.N((class00392)class026662.method_58694(class02484.B));
    }

    @Override
    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.B, (Object)this.M.R());
    }

    public void N(boolean bl) {
        this.u = bl;
    }

    public class07327 N() {
        return this.M;
    }

    @Override
    protected void N(class08299 class082992) {
        super.N(class082992);
        this.M.N(class082992);
        this.u = class082992.N("powered", false);
        this.R = class082992.N("conditionMet", false);
        this.y(class082992.N("auto", false));
    }

    public void R() {
        if (this.Z() == class00384.field_11923 && (this.u || this.i) && this.z != null) {
            this.U();
        }
    }
}

