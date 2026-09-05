/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class00529
 *  minecraft.class00549
 *  minecraft.class00751
 *  minecraft.class00753
 *  minecraft.class01042
 *  minecraft.class01296
 *  minecraft.class01607
 *  minecraft.class03167
 *  minecraft.class03179
 *  minecraft.class03530
 *  minecraft.class03532
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04748
 *  minecraft.class04890
 *  minecraft.class04932
 *  minecraft.class05934
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00529;
import minecraft.class00549;
import minecraft.class00751;
import minecraft.class00753;
import minecraft.class01042;
import minecraft.class01296;
import minecraft.class01607;
import minecraft.class03167;
import minecraft.class03179;
import minecraft.class03530;
import minecraft.class03532;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04748;
import minecraft.class04890;
import minecraft.class04932;
import minecraft.class05934;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public class class05324 {
    private final class07284 N;
    private final class05934 y;
    private final class03179 L;

    public class05324(class07284 class072842, class05934 class059342, class03179 class031792) {
        this.N = class072842;
        this.y = class059342;
        this.L = class031792;
    }

    public class01042 y() {
        return this.N.method_30349();
    }

    public Map<class04748, LongSet> y(class07209 class072092) {
        class01296 class012962 = class01296.N((class07209)class072092);
        return this.N.method_22342(class012962.N(), class012962.L(), class00549.i).B();
    }

    public class04932 y(class07209 class072092, class04748 class047482) {
        for (class04932 class049322 : this.N(class01296.N((class07209)class072092), class047482)) {
            if (!this.N(class072092, class049322)) continue;
            return class049322;
        }
        return class04932.y;
    }

    public boolean N(class07209 class072092, class04932 class049322) {
        Iterator var3 = class049322.Z().iterator();
        while (var3.hasNext()) {
            if (!((class04890)var3.next()).L().y((class00753)class072092)) continue;
            return true;
        }
        return false;
    }

    public class04932 N(class07209 class072092, Predicate<class03556<class04748>> predicate) {
        class00751 class007512 = this.y().L(class04227.yj);
        for (class04932 class049322 : this.N(new class07321(class072092), (class04748 class047482) -> class007512.L(class007512.N(class047482)).map(predicate::test).orElse(false))) {
            if (!this.N(class072092, class049322)) continue;
            return class049322;
        }
        return class04932.y;
    }

    public class04932 N(class07209 class072092, class03543<class04748> class035432) {
        return this.N(class072092, arg_0 -> class035432.N(arg_0));
    }

    public void N(class04932 class049322) {
        class049322.i();
        this.L.N(class049322.L(), class049322.B());
    }

    public class03167 N(class07321 class073212, class04748 class047482, class03532 class035322, boolean bl) {
        return this.L.N(class073212, class047482, class035322, bl);
    }

    public boolean N(class07209 class072092) {
        class01296 class012962 = class01296.N((class07209)class072092);
        return this.N.method_22342(class012962.N(), class012962.L(), class00549.i).G();
    }

    public @Nullable class04932 N(class01296 class012962, class04748 class047482, class00529 class005292) {
        return class005292.N(class047482);
    }

    public void N(class04748 class047482, LongSet longSet, Consumer<class04932> consumer) {
        LongIterator longIterator = longSet.iterator();
        while (longIterator.hasNext()) {
            long l = (Long)longIterator.next();
            class01296 class012962 = class01296.N((class07321)new class07321(l), (int)this.N.method_32891());
            class04932 class049322 = this.N(class012962, class047482, (class00529)this.N.method_22342(class012962.N(), class012962.L(), class00549.u));
            if (class049322 == null || !class049322.y()) continue;
            consumer.accept(class049322);
        }
    }

    public List<class04932> N(class01296 class012962, class04748 class047482) {
        LongSet longSet = this.N.method_22342(class012962.N(), class012962.L(), class00549.i).y(class047482);
        ImmutableList.Builder builder = ImmutableList.builder();
        this.N(class047482, longSet, arg_0 -> ((ImmutableList.Builder)builder).add(arg_0));
        return builder.build();
    }

    public List<class04932> N(class07321 class073212, Predicate<class04748> predicate) {
        Map var3 = this.N.method_22342(class073212.B, class073212.Z, class00549.i).B();
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Map.Entry entry : var3.entrySet()) {
            class04748 class047482 = (class04748)entry.getKey();
            if (!predicate.test(class047482)) continue;
            this.N(class047482, (LongSet)entry.getValue(), arg_0 -> ((ImmutableList.Builder)builder).add(arg_0));
        }
        return builder.build();
    }

    public class05324 N(class01607 class016072) {
        if (class016072.method_8410() != this.N) {
            throw new IllegalStateException("Using invalid structure manager (source level: " + String.valueOf(class016072.method_8410()) + ", region: " + String.valueOf(class016072));
        }
        return new class05324((class07284)class016072, this.y, this.L);
    }

    public class04932 N(class07209 class072092, class03530<class04748> class035302) {
        return this.N(class072092, (class03556<class04748> class035562) -> class035562.N(class035302));
    }

    public class04932 N(class07209 class072092, class04748 class047482) {
        for (class04932 class049322 : this.N(class01296.N((class07209)class072092), class047482)) {
            if (!class049322.N().y((class00753)class072092)) continue;
            return class049322;
        }
        return class04932.y;
    }

    public boolean N() {
        return this.y.u();
    }

    public void N(class01296 class012962, class04748 class047482, long l, class00529 class005292) {
        class005292.N(class047482, l);
    }

    public void N(class01296 class012962, class04748 class047482, class04932 class049322, class00529 class005292) {
        class005292.N(class047482, class049322);
    }
}

