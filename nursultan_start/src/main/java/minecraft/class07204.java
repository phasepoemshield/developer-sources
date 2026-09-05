/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00701
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class02615
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06344
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00701;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class02615;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06344;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08713;

public abstract class class07204
extends class00891
implements class06344 {
    public class07204(class01362 class013622) {
        super(class013622);
    }

    public static boolean U(class00500 class005002) {
        return class005002.P() || class005002.N(class01210.Nh) || class005002.T() || class005002.d();
    }

    protected int y() {
        return 2;
    }

    protected void N(class00701 class007012) {
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class07209 class072093;
        if (class060692.y(16) == 0 && class07204.U(class072992.method_8320(class072093 = class072092.method_10074()))) {
            class02615.N((class07299)class072992, (class07209)class072092, (class06069)class060692, (class07126)new class07105(class07107.O, class005002));
        }
    }

    public abstract int N(class00500 var1, class07290 var2, class07209 var3);

    protected abstract MapCodec<? extends class07204> N();

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        class072992.N(class072092, (class00891)this, this.y());
    }

    public class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class087132.N(class072092, (class00891)this, this.y());
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class07204.U(class047822.method_8320(class072092.method_10074())) || class072092.method_10264() < class047822.method_31607()) {
            return;
        }
        class00701 class007012 = class00701.N((class07299)class047822, (class07209)class072092, (class00500)class005002);
        this.N(class007012);
    }
}

