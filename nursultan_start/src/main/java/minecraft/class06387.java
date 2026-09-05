/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01224
 *  minecraft.class03291
 *  minecraft.class04367
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class05160
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class01224;
import minecraft.class03291;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class05160;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;

public class class06387
extends class04748 {
    public static final MapCodec<class06387> N = class06387.N(class06387::new);

    public class06387(class04758 class047582) {
        super(class047582);
    }

    public class04367<?> N() {
        return class04367.L;
    }

    public Optional<class04780> N(class04764 class047642) {
        class06993 class069932 = class06993.N((class06069)class047642.R());
        class07209 class072092 = this.N(class047642, class069932);
        if (class072092.method_10264() < 60) {
            return Optional.empty();
        }
        return Optional.of(new class04780(class072092, class032912 -> this.N((class03291)class032912, class072092, class069932, class047642)));
    }

    private void N(class03291 class032912, class07209 class072092, class06993 class069932, class04764 class047642) {
        ArrayList arrayList = Lists.newArrayList();
        class05160.N((class01224)class047642.i(), (class07209)class072092, (class06993)class069932, (List)arrayList, (class06069)class047642.R());
        arrayList.forEach(arg_0 -> ((class03291)class032912).N(arg_0));
    }
}

