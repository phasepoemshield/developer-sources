/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class01054
 *  minecraft.class03434
 *  minecraft.class04370
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05914
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class01054;
import minecraft.class03434;
import minecraft.class04370;
import minecraft.class04654;
import minecraft.class04992;
import minecraft.class05037;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05914;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;

public class class05009
extends class04992 {
    final List<class05037> N;
    private final class05096 y;
    private static final int L = 160;

    private class05009(List<class05037> list, class05096 class050962) {
        this.N = list;
        this.y = class050962;
    }

    public static class05009 N(class06478 class064782, class04370<?> class043702, @Nullable class06478 class064783, class05096 class050962) {
        if (class064783 == null) {
            return new class05009(List.of(new class05037(class064782, class043702)), class050962);
        }
        return new class05009(List.of(new class05037(class064782, class043702), new class05037(class064783)), class050962);
    }

    public static class05009 N(class05630 class056302, class04370<?> class043702, @Nullable class04370<?> class043703, class05914 class059142) {
        class06478 class064782 = class043702.method_57701(class056302);
        if (class043703 == null) {
            return new class05009(List.of(new class05037(class064782, class043702)), (class05096)class059142);
        }
        return new class05009(List.of(new class05037(class064782, class043702), new class05037(class043703.method_57701(class056302), class043703)), (class05096)class059142);
    }

    public @Nullable class06478 N(class04370<?> class043702) {
        for (class05037 class050372 : this.N) {
            if (class050372.y() != class043702) continue;
            return class050372.N();
        }
        return null;
    }

    public static class05009 N(class05630 class056302, class04370<?> class043702, class05096 class050962) {
        return new class05009(List.of(new class05037(class043702.method_18520(class056302, 0, 0, 310), class043702)), class050962);
    }

    public static class05009 N(class06478 class064782, @Nullable class06478 class064783, class05096 class050962) {
        if (class064783 == null) {
            return new class05009(List.of(new class05037(class064782)), class050962);
        }
        return new class05009(List.of(new class05037(class064782), new class05037(class064783)), class050962);
    }

    public List<? extends class04654> method_25396() {
        return Lists.transform(this.N, class05037::N);
    }

    public List<? extends class03434> method_37025() {
        return Lists.transform(this.N, class05037::N);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = 0;
        int n4 = this.y.field_22789 / 2 - 155;
        for (class05037 class050372 : this.N) {
            class050372.N().y(n4 + n3, this.method_73382());
            class050372.N().method_25394(class010542, n, n2, f);
            n3 += 160;
        }
    }
}

