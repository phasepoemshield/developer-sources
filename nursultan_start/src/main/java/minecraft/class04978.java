/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01008
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01008;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04782;
import minecraft.class04983;
import minecraft.class04985;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08713;

public abstract class class04978
extends class04985
implements class00873 {
    public class04978(class01362 class013622, class07211 class072112, class00494 class004942, boolean bl) {
        super(class013622, class072112, class004942, bl);
    }

    @Override
    protected class00891 u() {
        return this;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        Optional<class07209> var5 = this.N((class07290)class047822, class072092, class005002.i());
        if (var5.isPresent()) {
            class00500 class005003 = class047822.method_8320(var5.get());
            ((class04983)class005003.i()).N(class047822, class060692, var5.get(), class005003);
        }
    }

    private Optional<class07209> N(class07290 class072902, class07209 class072092, class00891 class008912) {
        return class01008.N((class07290)class072902, (class07209)class072092, (class00891)class008912, (class07211)this.y, (class00891)this.L());
    }

    protected boolean N(class00500 class005002, class06942 class069422) {
        boolean bl = super.N(class005002, class069422);
        if (bl && class069422.method_8041().N(this.L().B())) {
            return false;
        }
        return bl;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        Optional<class07209> var4 = this.N((class07290)class054872, class072092, class005002.i());
        return var4.isPresent() && this.L().E(class054872.method_8320(var4.get().method_10093(this.y)));
    }

    protected class00500 N(class00500 class005002, class00500 class005003) {
        return class005003;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == this.y.b() && !class005002.N(class054872, class072092)) {
            class087132.N(class072092, (class00891)this, 1);
        }
        class04983 class049832 = this.L();
        if (class072112 == this.y && !class005003.N((class00891)this) && !class005003.N((class00891)class049832)) {
            return this.N(class005002, class049832.y(class060692));
        }
        if (this.L) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)this.L());
    }

    protected abstract MapCodec<? extends class04978> N();
}

