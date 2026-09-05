/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class04782
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05744
 *  minecraft.class05765
 *  minecraft.class05779
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06772
 *  minecraft.class06944
 *  minecraft.class07075
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08041
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class04782;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05744;
import minecraft.class05765;
import minecraft.class05779;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06772;
import minecraft.class06944;
import minecraft.class07075;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08041;

public class class01334
extends class05765<class08041> {
    private static final int N = 80;
    private long y;
    private long L;
    private int u;
    private Optional<class07209> i = Optional.empty();

    protected void L(class04782 class047822, class08041 class080412, long l) {
        class080412.method_5673(class07085.field_6173, class06584.E);
        this.L = class080412.field_6012;
    }

    public class01334() {
        super((Map)ImmutableMap.of((Object)class05378.P, (Object)class05367.field_18457, (Object)class05378.m, (Object)class05367.field_18457));
    }

    protected void u(class04782 class047822, class08041 class080412, long l) {
        class07209 class072092 = this.i.get();
        if (l < this.y || !class072092.method_19769((class00737)class080412.method_73189(), 1.0)) {
            return;
        }
        class06584 class065842 = class06584.E;
        class07075 class070752 = class080412.n();
        int n = class070752.method_5439();
        for (int i = 0; i < n; ++i) {
            class06584 class065843 = class070752.method_5438(i);
            if (!class065843.N(class06570.vQ)) continue;
            class065842 = class065843;
            break;
        }
        if (!class065842.R() && class06944.N((class06584)class065842, (class07299)class047822, (class07209)class072092)) {
            class047822.N(1505, class072092, 15);
            this.i = this.y(class047822, class080412);
            this.N(class080412);
            this.y = l + 40L;
        }
        ++this.u;
    }

    private Optional<class07209> y(class04782 class047822, class08041 class080412) {
        class07218 class072182 = new class07218();
        Optional<class07209> optional = Optional.empty();
        int n = 0;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    class072182.N((class00753)class080412.method_24515(), i, j, k);
                    if (!this.N((class07209)class072182, class047822) || class047822.field_9229.y(++n) != 0) continue;
                    optional = Optional.of(class072182.method_10062());
                }
            }
        }
        return optional;
    }

    protected void y(class04782 class047822, class08041 class080412, long l) {
        this.N(class080412);
        class080412.method_5673(class07085.field_6173, new class06584((class07310)class06570.vQ));
        this.y = l;
        this.u = 0;
    }

    protected boolean N(class04782 class047822, class08041 class080412) {
        if (class080412.field_6012 % 10 != 0 || this.L != 0L && this.L + 160L > (long)class080412.field_6012) {
            return false;
        }
        if (class080412.n().N_61(class06570.vQ) <= 0) {
            return false;
        }
        this.i = this.y(class047822, class080412);
        return this.i.isPresent();
    }

    private boolean N(class07209 class072092, class04782 class047822) {
        class00500 class005002 = class047822.method_8320(class072092);
        class00891 class008912 = class005002.i();
        return class008912 instanceof class06772 && !((class06772)class008912).E(class005002);
    }

    private void N(class08041 class080412) {
        this.i.ifPresent(class072092 -> {
            class05744 class057442 = new class05744(class072092);
            class080412.method_18868().N(class05378.P, class057442);
            class080412.method_18868().N(class05378.m, new class05352((class05779)class057442, 0.5f, 1));
        });
    }

    protected boolean N(class04782 class047822, class08041 class080412, long l) {
        return this.u < 80 && this.i.isPresent();
    }
}

