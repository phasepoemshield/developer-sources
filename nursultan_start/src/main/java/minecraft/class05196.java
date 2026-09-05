/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10413
 *  com.mojang.serialization.Codec
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class07536
 */
package minecraft;

import Nursultan.class10413;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class07536;

public class class05196 {
    public static final Codec<class05196> N = class05957.L.listOf().xmap(class05196::new, class051962 -> class051962.y);
    private final List<class05957> y;
    private final Predicate<class05908> L;

    class05196(List<class05957> list) {
        this.y = list;
        this.L = class07536.N(list);
    }

    public void N(class05561 class055612) {
        for (int i = 0; i < this.y.size(); ++i) {
            this.y.get(i).N(class055612.N((class04489)new class10413(i)));
        }
    }

    public static class05196 N(class05957 ... class05957Array) {
        return new class05196(List.of(class05957Array));
    }

    public boolean N(class05908 class059082) {
        return this.L.test(class059082);
    }
}

