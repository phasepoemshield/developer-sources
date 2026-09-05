/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01224
 *  minecraft.class03291
 *  minecraft.class03860
 *  minecraft.class04367
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class05173
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class07836
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import minecraft.class01224;
import minecraft.class03291;
import minecraft.class03860;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class05173;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class07836;

public class class01574
extends class04748 {
    public static final MapCodec<class01574> N = class01574.N(class01574::new);

    public class01574(class04758 class047582) {
        super(class047582);
    }

    public class04367<?> N() {
        return class04367.i;
    }

    public Optional<class04780> N(class04764 class047642) {
        return class01574.N((class04764)class047642, (class07830)class07830.field_13194, class032912 -> this.N((class03291)class032912, class047642));
    }

    private void N(class03291 class032912, class04764 class047642) {
        class07321 class073212 = class047642.B();
        class07836 class078362 = class047642.R();
        class07209 class072092 = new class07209(class073212.i(), 90, class073212.R());
        class06993 class069932 = class06993.N((class06069)class078362);
        class05173.N((class01224)class047642.i(), (class07209)class072092, (class06993)class069932, (class03860)class032912, (class06069)class078362);
    }
}

