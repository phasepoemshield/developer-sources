/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05672
 *  minecraft.class05744
 *  minecraft.class05765
 *  minecraft.class05779
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06772
 *  minecraft.class06918
 *  minecraft.class07049
 *  minecraft.class07075
 *  minecraft.class07208
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07305
 *  minecraft.class08041
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05672;
import minecraft.class05744;
import minecraft.class05765;
import minecraft.class05779;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06772;
import minecraft.class06918;
import minecraft.class07049;
import minecraft.class07075;
import minecraft.class07208;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07305;
import minecraft.class08041;
import org.jspecify.annotations.Nullable;

public class class06288
extends class05765<class08041> {
    private static final int y = 200;
    public static final float N = 0.5f;
    private @Nullable class07209 L;
    private long u;
    private int i;
    private final List<class07209> R = Lists.newArrayList();

    protected void L(class04782 class047822, class08041 class080412, long l) {
        if (this.L != null && !this.L.method_19769((class00737)class080412.method_73189(), 1.0)) {
            return;
        }
        if (this.L != null && l > this.u) {
            class00500 class005002 = class047822.method_8320(this.L);
            class00891 class008912 = class005002.i();
            class00891 class008913 = class047822.method_8320(this.L.method_10074()).i();
            if (class008912 instanceof class06772 && ((class06772)class008912).E(class005002)) {
                class047822.N(this.L, true, (class07049)class080412);
            }
            if (class005002.P() && class008913 instanceof class07208 && class080412.Q()) {
                class07075 class070752 = class080412.n();
                for (int i = 0; i < class070752.method_5439(); ++i) {
                    class06581 class065812;
                    class06584 class065842 = class070752.method_5438(i);
                    boolean bl = false;
                    if (!class065842.R() && class065842.N(class01226.LB) && (class065812 = class065842.B()) instanceof class06918) {
                        class065812 = ((class06918)class065812).L().W();
                        class047822.method_8501(this.L, (class00500)class065812);
                        class047822.N((class03556)class01194.Z, this.L, class01164.N((class07049)class080412, (class00500)class065812));
                        bl = true;
                    }
                    if (!bl) continue;
                    class047822.method_43128(null, (double)this.L.method_10263(), (double)this.L.method_10264(), (double)this.L.method_10260(), class04909.BV, class04911.field_15245, 1.0f, 1.0f);
                    class065842.B(1);
                    if (!class065842.R()) break;
                    class070752.method_5447(i, class06584.E);
                    break;
                }
            }
            if (class008912 instanceof class06772 && !((class06772)class008912).E(class005002)) {
                this.R.remove(this.L);
                this.L = this.N(class047822);
                if (this.L != null) {
                    this.u = l + 20L;
                    class080412.method_18868().N(class05378.m, (Object)new class05352((class05779)new class05744(this.L), 0.5f, 1));
                    class080412.method_18868().N(class05378.P, (Object)new class05744(this.L));
                }
            }
        }
        ++this.i;
    }

    public class06288() {
        super((Map)ImmutableMap.of((Object)class05378.P, (Object)class05367.field_18457, (Object)class05378.m, (Object)class05367.field_18457, (Object)class05378.R, (Object)class05367.field_18456));
    }

    protected boolean u(class04782 class047822, class08041 class080412, long l) {
        return this.i < 200;
    }

    protected void y(class04782 class047822, class08041 class080412, long l) {
        class080412.method_18868().y(class05378.P);
        class080412.method_18868().y(class05378.m);
        this.i = 0;
        this.u = l + 40L;
    }

    protected boolean N(class04782 class047822, class08041 class080412) {
        if (!((Boolean)class047822.method_64395().N(class07305.I)).booleanValue()) {
            return false;
        }
        if (!class080412.t().y().N(class05672.M)) {
            return false;
        }
        class07218 class072182 = class080412.method_24515().method_25503();
        this.R.clear();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    class072182.N(class080412.method_23317() + (double)i, class080412.method_23318() + (double)j, class080412.method_23321() + (double)k);
                    if (!this.N((class07209)class072182, class047822)) continue;
                    this.R.add(new class07209((class00753)class072182));
                }
            }
        }
        this.L = this.N(class047822);
        return this.L != null;
    }

    private boolean N(class07209 class072092, class04782 class047822) {
        class00500 class005002 = class047822.method_8320(class072092);
        class00891 class008912 = class005002.i();
        class00891 class008913 = class047822.method_8320(class072092.method_10074()).i();
        return class008912 instanceof class06772 && ((class06772)class008912).E(class005002) || class005002.P() && class008913 instanceof class07208;
    }

    private @Nullable class07209 N(class04782 class047822) {
        return this.R.isEmpty() ? null : this.R.get(class047822.method_8409().y(this.R.size()));
    }

    protected void N(class04782 class047822, class08041 class080412, long l) {
        if (l > this.u && this.L != null) {
            class080412.method_18868().N(class05378.P, (Object)new class05744(this.L));
            class080412.method_18868().N(class05378.m, (Object)new class05352((class05779)new class05744(this.L), 0.5f, 1));
        }
    }
}

