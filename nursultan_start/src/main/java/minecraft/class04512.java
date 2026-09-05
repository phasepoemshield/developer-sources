/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01929
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class07001
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07269
 *  minecraft.class07299
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01929;
import minecraft.class04481;
import minecraft.class04485;
import minecraft.class04487;
import minecraft.class04488;
import minecraft.class04498;
import minecraft.class04502;
import minecraft.class04506;
import minecraft.class04514;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class07001;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;

public class class04512
extends class00394
implements class04498,
class04506 {
    private final class04485 N = this.M();

    public class04485 L() {
        return this.N;
    }

    private class04485 M() {
        class04514 class045142 = class07529.NB ? class04514.L : class04514.N;
        class04488 class044882 = class04488.N;
        return new class04485(class04502.R, this, class045142, class044882);
    }

    public class04512(class07209 class072092, class00500 class005002) {
        super(class00404.field_47352, class072092, class005002);
    }

    @Override
    public class04481 u() {
        if (!this.w().y((class08092)class06665.yO)) {
            return class04481.field_47383;
        }
        return (class04481)((Object)this.w().L((class08092)class06665.yO));
    }

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    @Override
    public void N(class07299 class072992, class04481 class044812) {
        this.method_5431();
        class072992.method_8501(this.U, (class00500)this.w().y((class08092)class06665.yO, (Comparable)((Object)class044812)));
    }

    @Override
    public void N(class07078<?> class070782, class06069 class060692) {
        if (this.z == null) {
            class07536.y((String)"Expected non-null level");
            return;
        }
        this.N.N(class070782, this.z);
        this.method_5431();
    }

    public class07001 N(class01929 class019292) {
        return this.N.B().N((class04481)((Object)this.w().L(class04487.y)));
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        this.N.N(class083292);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.N.N(class082992);
        if (this.z != null) {
            this.R();
        }
    }

    @Override
    public void R() {
        this.method_5431();
        if (this.z != null) {
            this.z.method_8413(this.U, this.w(), this.w(), 3);
        }
    }
}

