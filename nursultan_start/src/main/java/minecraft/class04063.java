/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class03530
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05543
 *  minecraft.class06069
 *  minecraft.class06667
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class08092
 *  minecraft.class08815
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Collection;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class03530;
import minecraft.class04065;
import minecraft.class04072;
import minecraft.class04076;
import minecraft.class04081;
import minecraft.class04083;
import minecraft.class04090;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05543;
import minecraft.class06069;
import minecraft.class06667;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class08092;
import minecraft.class08815;

public class class04063
extends class08815
implements class04065 {
    public static final MapCodec<class04063> i = class04063.y(class04063::new);
    private final class04090 R = new class04090(new class04081(this, class04090.N));
    private final class04090 M = new class04090(new class04081(this, class04072.field_37598));

    public class04063(class01362 class013622) {
        super(class013622);
    }

    public class04090 i() {
        return this.M;
    }

    public class04090 y() {
        return this.R;
    }

    private boolean N(class04076 class040762, class07284 class072842, class07209 class072092, class06069 class060692) {
        class00500 class005002 = class072842.method_8320(class072092);
        class03530<class00891> var6 = class040762.L();
        for (class07211 class072112 : class07211.N((class06069)class060692)) {
            class07209 class072093;
            class00500 class005003;
            if (!class04063.N((class00500)class005002, (class07211)class072112) || !(class005003 = class072842.method_8320(class072093 = class072092.method_10093(class072112))).N(var6)) continue;
            class00500 class005004 = class00869.bA.W();
            class072842.method_8652(class072093, class005004, 3);
            class00891.N_19((class00500)class005003, (class00500)class005004, (class07284)class072842, (class07209)class072093);
            class072842.method_8396(null, class072093, class04909.dX, class04911.field_15245, 1.0f, 1.0f);
            this.R.N(class005004, class072842, class072093, class040762.B());
            class07211 class072113 = class072112.b();
            for (class07211 class072114 : u) {
                class07209 class072094;
                class00500 class005005;
                if (class072114 == class072113 || !(class005005 = class072842.method_8320(class072094 = class072093.method_10093(class072114))).N((class00891)this)) continue;
                this.N(class072842, class005005, class072094, class060692);
            }
            return true;
        }
        return false;
    }

    public static boolean N(class07284 class072842, class00500 class005002, class07209 class072092) {
        if (!class005002.N(class00869.bf)) {
            return false;
        }
        for (class07211 class072112 : u) {
            if (!class04063.N((class00500)class005002, (class07211)class072112) || !class072842.method_8320(class072092.method_10093(class072112)).N(class01210.LB)) continue;
            return true;
        }
        return false;
    }

    public MapCodec<class04063> N() {
        return i;
    }

    @Override
    public int N(class04083 class040832, class07284 class072842, class07209 class072092, class06069 class060692, class04076 class040762, boolean bl) {
        if (bl && this.N(class040762, class072842, class040832.N(), class060692)) {
            return class040832.y() - 1;
        }
        return class060692.y(class040762.R()) == 0 ? class04995.y((float)((float)class040832.y() * 0.5f)) : class040832.y();
    }

    @Override
    public void N(class07284 class072842, class00500 class005002, class07209 class072092, class06069 class060692) {
        if (!class005002.N((class00891)this)) {
            return;
        }
        for (class07211 class072112 : u) {
            class06667 class066672 = class04063.y((class07211)class072112);
            if (!((Boolean)class005002.L((class08092)class066672)).booleanValue() || !class072842.method_8320(class072092.method_10093(class072112)).N(class00869.bA)) continue;
            class005002 = (class00500)class005002.y((class08092)class066672, (Comparable)Boolean.valueOf(false));
        }
        if (!class04063.T((class00500)class005002)) {
            class005002 = (class072842.method_8316(class072092).W() ? class00869.N : class00869.K).W();
        }
        class072842.method_8652(class072092, class005002, 3);
        class04065.super.N(class072842, class005002, class072092, class060692);
    }

    public static boolean N(class07284 class072842, class07209 class072092, class00500 class005002, Collection<class07211> collection) {
        boolean bl = false;
        class00500 class005003 = class00869.bf.W();
        for (class07211 class072112 : collection) {
            if (!class04063.N((class07290)class072842, (class07209)class072092, (class07211)class072112)) continue;
            class005003 = (class00500)class005003.y((class08092)class04063.y((class07211)class072112), (Comparable)Boolean.valueOf(true));
            bl = true;
        }
        if (!bl) {
            return false;
        }
        if (!class005002.Y().W()) {
            class005003 = (class00500)class005003.y((class08092)class05543.L, (Comparable)Boolean.valueOf(true));
        }
        class072842.method_8652(class072092, class005003, 3);
        return true;
    }
}

