/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00143
 *  minecraft.class00753
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00143;
import minecraft.class00753;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05475;
import minecraft.class05751;
import minecraft.class05765;
import minecraft.class05779;
import minecraft.class06889;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class05738
extends class05765<class07079> {
    private static final int N = 40;
    private int y;
    private @Nullable class00143 L;
    private @Nullable class07209 u;
    private float i;

    @Override
    protected void L(class04782 class047822, class07079 class070792, long l) {
        class070792.method_18868().N(class05378.n, (Object)this.L);
        class070792.f().N(this.L, (double)this.i);
    }

    public class05738() {
        this(150, 250);
    }

    public class05738(int n, int n2) {
        super((Map<class05378<?>, class05367>)ImmutableMap.of((Object)class05378.I, (Object)class05367.field_18458, (Object)class05378.n, (Object)class05367.field_18457, (Object)class05378.m, (Object)class05367.field_18456), n, n2);
    }

    @Override
    protected void u(class04782 class047822, class07079 class070792, long l) {
        class00143 class001432 = class070792.f().Z();
        class01289 var6 = class070792.method_18868();
        if (this.L != class001432) {
            this.L = class001432;
            var6.N(class05378.n, (Object)class001432);
        }
        if (class001432 == null || this.u == null) {
            return;
        }
        class05352 class053522 = (class05352)var6.L(class05378.m).get();
        if (class053522.N().y().method_10262((class00753)this.u) > 4.0 && this.N(class070792, class053522, class047822.N())) {
            this.u = class053522.N().y();
            this.L(class047822, class070792, l);
        }
    }

    @Override
    protected void y(class04782 class047822, class07079 class070792, long l) {
        if (class070792.method_18868().N(class05378.m) && !this.N(class070792, (class05352)class070792.method_18868().L(class05378.m).get()) && class070792.f().b()) {
            this.y = class047822.method_8409().y(40);
        }
        class070792.f().W();
        class070792.method_18868().y(class05378.m);
        class070792.method_18868().y(class05378.n);
        this.L = null;
    }

    @Override
    protected boolean N(class04782 class047822, class07079 class070792) {
        if (this.y > 0) {
            --this.y;
            return false;
        }
        class01289 var3 = class070792.method_18868();
        class05352 class053522 = (class05352)var3.L(class05378.m).get();
        boolean bl = this.N(class070792, class053522);
        if (!bl && this.N(class070792, class053522, class047822.N())) {
            this.u = class053522.N().y();
            return true;
        }
        var3.y(class05378.m);
        if (bl) {
            var3.y(class05378.I);
        }
        return false;
    }

    private boolean N(class07079 class070792, class05352 class053522, long l) {
        class07209 class072092 = class053522.N().y();
        this.L = class070792.f().N(class072092, 0);
        this.i = class053522.y();
        class01289 var6 = class070792.method_18868();
        if (this.N(class070792, class053522)) {
            var6.y(class05378.I);
        } else {
            if (this.L != null && this.L.z()) {
                var6.y(class05378.I);
            } else if (!var6.N(class05378.I)) {
                var6.N(class05378.I, (Object)l);
            }
            if (this.L != null) {
                return true;
            }
            class06889 class068892 = class05475.N((class07475)((class07475)class070792), (int)10, (int)7, (class06889)class06889.L((class00753)class072092), (double)1.5707963705062866);
            if (class068892 != null) {
                this.L = class070792.f().N(class068892.M, class068892.B, class068892.Z, 0);
                return this.L != null;
            }
        }
        return false;
    }

    @Override
    protected boolean N(class04782 class047822, class07079 class070792, long l) {
        if (this.L == null || this.u == null) {
            return false;
        }
        Optional var5 = class070792.method_18868().L(class05378.m);
        boolean bl = var5.map(class05738::N).orElse(false);
        return !class070792.f().U() && var5.isPresent() && !this.N(class070792, (class05352)var5.get()) && !bl;
    }

    private boolean N(class07079 class070792, class05352 class053522) {
        return class053522.N().y().method_19455((class00753)class070792.method_24515()) <= class053522.L();
    }

    private static boolean N(class05352 class053522) {
        class05779 class057792 = class053522.N();
        if (class057792 instanceof class05751) {
            return ((class05751)class057792).L().method_7325();
        }
        return false;
    }
}

