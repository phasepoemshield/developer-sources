/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09445
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01224
 *  minecraft.class03291
 *  minecraft.class03300
 *  minecraft.class04367
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class08088
 */
package minecraft;

import Nursultan.class09445;
import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01224;
import minecraft.class03291;
import minecraft.class03300;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class08088;

public class class04761
extends class04748 {
    public static final MapCodec<class04761> N = class04761.N(class04761::new);

    public class04761(class04758 class047582) {
        super(class047582);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class03300 class033002) {
        class07218 class072182 = new class07218();
        int n = class059742.method_31607();
        class05163 class051633 = class033002.y();
        int n2 = class051633.Z();
        for (int i = class051632.B(); i <= class051632.U(); ++i) {
            block1: for (int j = class051632.z(); j <= class051632.W(); ++j) {
                class072182.N(i, n2, j);
                if (class059742.R((class07209)class072182) || !class051633.y((class00753)class072182) || !class033002.N((class07209)class072182)) continue;
                for (int k = n2 - 1; k > n; --k) {
                    class072182.method_10099(k);
                    if (!class059742.R((class07209)class072182) && !class059742.method_8320((class07209)class072182).T()) continue block1;
                    class059742.method_8652((class07209)class072182, class00869.W.W(), 2);
                }
            }
        }
    }

    @Override
    public class04367<?> N() {
        return class04367.s;
    }

    @Override
    public Optional<class04780> N(class04764 class047642) {
        class06993 class069932 = class06993.N((class06069)class047642.R());
        class07209 class072092 = this.N(class047642, class069932);
        if (class072092.method_10264() < 60) {
            return Optional.empty();
        }
        return Optional.of(new class04780(class072092, class032912 -> this.N((class03291)class032912, class047642, class072092, class069932)));
    }

    private void N(class03291 class032912, class04764 class047642, class07209 class072092, class06993 class069932) {
        LinkedList linkedList = Lists.newLinkedList();
        class09445.N((class01224)class047642.i(), (class07209)class072092, (class06993)class069932, (List)linkedList, (class06069)class047642.R());
        linkedList.forEach(arg_0 -> ((class03291)class032912).N(arg_0));
    }
}

