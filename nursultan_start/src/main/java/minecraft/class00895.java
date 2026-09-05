/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class01929
 *  minecraft.class03543
 *  minecraft.class06646
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00880;
import minecraft.class00891;
import minecraft.class01929;
import minecraft.class03543;
import minecraft.class06646;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

class class00895
implements class00880 {
    private final class03543<class00891> N;
    private final @Nullable class07001 y;
    private final Map<String, String> L;

    class00895(class03543<class00891> class035432, Map<String, String> map, @Nullable class07001 class070012) {
        this.N = class035432;
        this.L = map;
        this.y = class070012;
    }

    @Override
    public boolean test(class06646 class066462) {
        class00500 class005002 = class066462.N();
        if (!class005002.N(this.N)) {
            return false;
        }
        for (Map.Entry<String, String> entry : this.L.entrySet()) {
            class08092 var5 = class005002.i().E().N(entry.getKey());
            if (var5 == null) {
                return false;
            }
            Comparable comparable = var5.y(entry.getValue()).orElse(null);
            if (comparable == null) {
                return false;
            }
            if (class005002.L(var5) == comparable) continue;
            return false;
        }
        if (this.y != null) {
            class00394 class003942 = class066462.y();
            return class003942 != null && class07717.N((class07709)this.y, (class07709)class003942.y_2((class01929)class066462.L().method_30349()), (boolean)true);
        }
        return true;
    }

    @Override
    public boolean N() {
        return this.y != null;
    }
}

