/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00743
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class02854
 *  minecraft.class03529
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07269
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08303
 *  minecraft.class08329
 *  net.fabricmc.fabric.impl.transfer.item.SpecialLogicAccess
 *  net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class02854;
import minecraft.class03529;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08303;
import minecraft.class08329;
import minecraft.class08961;
import minecraft.class08968;
import minecraft.class08974;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicAccess;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08951
extends class00394
implements class08961,
class08974,
SpecialLogicAccess,
SpecialLogicInventory {
    public static final int N = 3;
    private static final Logger u = LogUtils.getLogger();
    private static final String i = "align_items_to_bottom";
    private final class00743<class06584> R = class00743.method_10213((int)3, (Object)class06584.E);
    private boolean M;
    boolean y;

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    @Override
    public float method_73188() {
        return ((class07211)this.w().L(class08968.L)).b().U();
    }

    @Override
    public class07299 method_73183() {
        return this.z;
    }

    @Override
    public class06889 method_73189() {
        return this.d().method_46558();
    }

    public class08951(class07209 class072092, class00500 class005002) {
        super(class00404.field_61437, class072092, class005002);
    }

    public boolean u() {
        return this.M;
    }

    public class06584 y(int n, class06584 class065842) {
        class06584 class065843 = this.method_5441(n);
        this.N(n, class065842);
        return class065843;
    }

    public void y(class08329 class083292) {
        class083292.L("Items");
    }

    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.NG, (Object)class02854.N(this.R));
    }

    @Override
    public class00743<class06584> N() {
        return this.R;
    }

    public class07001 N(class01929 class019292) {
        try (class04495 class044952 = new class04495(this.J(), u);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class019292);
            class06686.N((class08329)class083032, this.R, (boolean)true);
            class083032.N(i, this.M);
            class07001 class070012 = class083032.y();
            return class070012;
        }
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class06686.N((class08329)class083292, this.R, (boolean)true);
        class083292.N(i, this.M);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.R.clear();
        class06686.N((class08299)class082992, this.R);
        this.M = class082992.N(i, false);
    }

    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        ((class02854)class026662.a_(class02484.NG, (Object)class02854.N)).N(this.R);
    }

    public void N(@Nullable class03529<class01194> class035292) {
        super.method_5431();
        if (this.z != null) {
            if (class035292 != null) {
                this.z.N(class035292, this.U, class01164.N((class00500)this.w()));
            }
            this.G().method_8413(this.d(), this.w(), this.w(), 3);
        }
    }

    public boolean method_5443(class08036 class080362) {
        return class06695.N((class00394)this, (class08036)class080362);
    }

    public void method_5431() {
        this.N((class03529<class01194>)class01194.N);
    }

    public void fabric_onFinalCommit(int n, class06584 class065842, class06584 class065843) {
    }

    public void fabric_setSuppress(boolean bl) {
        this.y = bl;
    }

    public boolean fabric_shouldSuppressSpecialLogic() {
        return this.y;
    }
}

