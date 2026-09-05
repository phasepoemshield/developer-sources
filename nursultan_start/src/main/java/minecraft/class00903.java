/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class01042
 *  minecraft.class01929
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06646
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class08092
 *  minecraft.class08303
 *  minecraft.class08308
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01042;
import minecraft.class01929;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06646;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class08092;
import minecraft.class08303;
import minecraft.class08308;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00903
implements Predicate<class06646> {
    private static final Logger N = LogUtils.getLogger();
    private final class00500 y;
    private final Set<class08092<?>> L;
    private final @Nullable class07001 u;

    public class00903(class00500 class005002, Set<class08092<?>> set, @Nullable class07001 class070012) {
        this.y = class005002;
        this.L = set;
        this.u = class070012;
    }

    public Set<class08092<?>> y() {
        return this.L;
    }

    private class00500 N(class00500 class005002) {
        if (class005002 == this.y) {
            return class005002;
        }
        for (class08092<?> var3 : this.L) {
            class005002 = class00903.N(class005002, this.y, var3);
        }
        return class005002;
    }

    public class00500 N() {
        return this.y;
    }

    @Override
    public boolean test(class06646 class066462) {
        class00500 class005002 = class066462.N();
        if (!class005002.N(this.y.i())) {
            return false;
        }
        for (class08092<?> var4 : this.L) {
            if (class005002.L(var4) == this.y.L(var4)) continue;
            return false;
        }
        if (this.u != null) {
            class00394 class003942 = class066462.y();
            return class003942 != null && class07717.N((class07709)this.u, (class07709)class003942.y_2((class01929)class066462.L().method_30349()), (boolean)true);
        }
        return true;
    }

    public boolean N(class04782 class047822, class07209 class072092) {
        return this.test(new class06646((class05487)class047822, class072092, false));
    }

    public boolean N(class04782 class047822, class07209 class072092, int n) {
        class00394 class003942;
        class00500 class005002;
        class00500 class005003 = class005002 = (n & 0x10) != 0 ? this.y : class00891.a_(this.y, (class07284)class047822, class072092);
        if (class005002.P()) {
            class005002 = this.y;
        }
        class005002 = this.N(class005002);
        boolean bl = false;
        if (class047822.method_8652(class072092, class005002, n)) {
            bl = true;
        }
        if (this.u != null && (class003942 = class047822.method_8321(class072092)) != null) {
            try (class04495 class044952 = new class04495(N);){
                class01042 class010422 = class047822.method_30349();
                class04490 class044902 = class044952.N_46(class003942.J());
                class08303 class083032 = class08303.N((class04490)class044902.N_46(() -> "(before)"), (class01929)class010422);
                class003942.i((class08329)class083032);
                class07001 class070012 = class083032.y();
                class003942.y_1(class08308.N((class04490)class044952, (class01929)class010422, (class07001)this.u));
                class08303 class083033 = class08303.N((class04490)class044902.N_46(() -> "(after)"), (class01929)class010422);
                class003942.i((class08329)class083033);
                if (!class083033.y().equals((Object)class070012)) {
                    bl = true;
                    class003942.method_5431();
                    class047822.method_14178().N(class072092);
                }
            }
        }
        return bl;
    }

    private static <T extends Comparable<T>> class00500 N(class00500 class005002, class00500 class005003, class08092<T> class080922) {
        return (class00500)class005002.L(class080922, class005003.L(class080922));
    }
}

