/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10767
 *  Nursultan.class10772
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00780
 *  minecraft.class01042
 *  minecraft.class01905
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05517
 *  minecraft.class06889
 *  minecraft.class07299
 *  minecraft.class07376
 *  minecraft.class07529
 *  minecraft.class07587
 *  minecraft.class07594
 *  minecraft.class07603
 *  minecraft.class07609
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10767;
import Nursultan.class10772;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.LongSupplier;
import minecraft.class00594;
import minecraft.class00600;
import minecraft.class00602;
import minecraft.class00607;
import minecraft.class00611;
import minecraft.class00780;
import minecraft.class01042;
import minecraft.class01905;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05517;
import minecraft.class06889;
import minecraft.class07299;
import minecraft.class07376;
import minecraft.class07529;
import minecraft.class07587;
import minecraft.class07594;
import minecraft.class07603;
import minecraft.class07609;
import org.jspecify.annotations.Nullable;

public class class00616
implements class00611 {
    private final Map<class00607<?>, class00600<?>> y = new Reference2ObjectOpenHashMap();

    boolean L(class00607<?> class006072) {
        class00600<?> class006002 = this.u(class006072);
        return class006002 != null && class006002.y;
    }

    class00616(Map<class00607<?>, List<class07603<?>>> map) {
        map.forEach((class006072, list) -> this.y.put((class00607<?>)class006072, this.N((class00607)class006072, (List<? extends class07603<?>>)list)));
    }

    private <Value> @Nullable class00600<Value> u(class00607<Value> class006072) {
        return this.y.get(class006072);
    }

    public void y() {
        this.y.values().forEach(class00600::N);
    }

    <Value> Value y(class00607<Value> class006072) {
        class00600<Value> class006002 = this.u(class006072);
        return class006002 != null ? class006002.N : class006072.y();
    }

    private <Value> class00600<Value> N(class00607<Value> class006072, List<? extends class07603<?>> list) {
        Object object;
        ArrayList arrayList = new ArrayList(list);
        Object object2 = class006072.y();
        while (!arrayList.isEmpty() && (object = arrayList.getFirst()) instanceof class10772) {
            class10772 class107722 = (class10772)object;
            object2 = class107722.applyConstant(object2);
            arrayList.removeFirst();
        }
        boolean bl = arrayList.stream().anyMatch(class076032 -> class076032 instanceof class10767);
        return new class00600<Value>(class006072, object2, List.copyOf(arrayList), bl);
    }

    @Override
    public <Value> Value N(class00607<Value> class006072) {
        if (class07529.ND && class006072.i()) {
            throw new IllegalStateException("Position must always be provided for positional attribute " + String.valueOf(class006072));
        }
        class00600<Value> class006002 = this.u(class006072);
        if (class006002 == null) {
            return class006072.y();
        }
        return class006002.y();
    }

    private static <Value> void N(class00594 class005942, class00607<Value> class006072, class05517 class055172) {
        class005942.N(class006072, (object, class068892, class006022) -> {
            if (class006022 != null && class006072.R()) {
                return class006022.N(class006072, object);
            }
            return ((class00780)class055172.N(class068892.M, class068892.B, class068892.Z).N()).R().N(class006072, object);
        });
    }

    private static void N(class00594 class005942, class01905<class00780> class019052, class05517 class055172) {
        class019052.z().flatMap(class035292 -> ((class00780)class035292.N()).R().y().stream()).distinct().forEach(class006072 -> class00616.N(class005942, class006072, class055172));
    }

    private static void N(class00594 class005942, class07376 class073762) {
        class005942.N(class073762.s());
    }

    static void N(class00594 class005942, class07299 class072992) {
        class01042 class010422 = class072992.method_30349();
        class05517 class055172 = class072992.method_22385();
        LongSupplier longSupplier = () -> ((class07299)class072992).method_8532();
        class00616.N(class005942, class072992.method_8597());
        class00616.N(class005942, (class01905<class00780>)class010422.L(class04227.NA), class055172);
        class072992.method_8597().T().forEach(class035562 -> class005942.N((class03556<class07587>)class035562, longSupplier));
        if (class072992.method_63020()) {
            class07594.N((class00594)class005942, (class07609)class07609.N((class07299)class072992));
        }
    }

    @Override
    public <Value> Value N(class00607<Value> class006072, class06889 class068892, @Nullable class00602 class006022) {
        class00600<Value> class006002 = this.u(class006072);
        if (class006002 == null) {
            return class006072.y();
        }
        return class006002.N(class068892, class006022);
    }

    public static class00594 N() {
        return new class00594();
    }
}

