/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class04983;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import org.jspecify.annotations.Nullable;

public abstract class class04985
extends class00891 {
    protected final class07211 y;
    protected final boolean L;
    protected final class00494 u;

    protected abstract class04983 L();

    public class04985(class01362 class013622, class07211 class072112, class00494 class004942, boolean bl) {
        super(class013622);
        this.y = class072112;
        this.u = class004942;
        this.L = bl;
    }

    protected boolean U(class00500 class005002) {
        return true;
    }

    protected abstract class00891 u();

    public class00500 y(class06069 class060692) {
        return this.W();
    }

    protected abstract MapCodec<? extends class04985> N();

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class005002.N((class05487)class047822, class072092)) {
            class047822.N(class072092, true);
        }
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037().method_10093(this.y));
        if (class005002.N((class00891)this.L()) || class005002.N(this.u())) {
            return this.u().W();
        }
        return this.y(class069422.method_8045().field_9229);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.u;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10093(this.y.b());
        class00500 class005003 = class054872.method_8320(class072093);
        if (!this.U(class005003)) {
            return false;
        }
        return class005003.N((class00891)this.L()) || class005003.N(this.u()) || class005003.L((class07290)class054872, class072093, this.y);
    }
}

