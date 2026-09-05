/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00753
 *  minecraft.class04782
 *  minecraft.class05074
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05672
 *  minecraft.class05765
 *  minecraft.class05946
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08041
 *  net.fabricmc.fabric.mixin.content.registry.GiveGiftToHeroAccessor
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00753;
import minecraft.class04782;
import minecraft.class05074;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05672;
import minecraft.class05765;
import minecraft.class05946;
import minecraft.class06273;
import minecraft.class06293;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08041;
import net.fabricmc.fabric.mixin.content.registry.GiveGiftToHeroAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06285
extends class05765<class08041>
implements GiveGiftToHeroAccessor {
    private static final int N = 5;
    private static final int y = 600;
    private static final int L = 6600;
    private static final int u = 20;
    private static Map<class05946<class05672>, class05946<class05074>> i = ImmutableMap.builder().put((Object)class05672.L, class06273.Nb).put((Object)class05672.u, class06273.Nj).put((Object)class05672.i, class06273.Nv).put((Object)class05672.R, class06273.Nn).put((Object)class05672.M, class06273.Nt).put((Object)class05672.B, class06273.NG).put((Object)class05672.Z, class06273.Nl).put((Object)class05672.z, class06273.Nd).put((Object)class05672.U, class06273.Nw).put((Object)class05672.E, class06273.Nk).put((Object)class05672.m, class06273.NY).put((Object)class05672.P, class06273.NQ).put((Object)class05672.s, class06273.NO).build();
    private static final float R = 0.5f;
    private int Z = 600;
    private boolean z;
    private long U;

    private Optional<class08036> L(class08041 class080412) {
        return class080412.method_18868().L(class05378.U).filter(this::N);
    }

    protected void L(class04782 class047822, class08041 class080412, long l) {
        class08036 class080362 = this.L(class080412).get();
        class06293.N((class07438)class080412, (class07438)class080362);
        if (this.N(class080412, class080362)) {
            if (l - this.U > 20L) {
                this.N(class047822, class080412, (class07438)class080362);
                this.z = true;
            }
        } else {
            class06293.N((class07438)class080412, (class07049)class080362, 0.5f, 5);
        }
    }

    public class06285(int n) {
        super((Map)ImmutableMap.of((Object)class05378.m, (Object)class05367.field_18458, (Object)class05378.P, (Object)class05367.field_18458, (Object)class05378.b, (Object)class05367.field_18458, (Object)class05378.U, (Object)class05367.field_18456), n);
    }

    static {
        class06285.N(null);
    }

    protected void u(class04782 class047822, class08041 class080412, long l) {
        this.Z = class06285.N(class047822);
        class080412.method_18868().y(class05378.b);
        class080412.method_18868().y(class05378.m);
        class080412.method_18868().y(class05378.P);
    }

    private boolean y(class08041 class080412) {
        return this.L(class080412).isPresent();
    }

    protected boolean y(class04782 class047822, class08041 class080412, long l) {
        return this.y(class080412) && !this.z;
    }

    private static void N(CallbackInfo callbackInfo) {
        i = new HashMap<class05946<class05672>, class05946<class05074>>(i);
    }

    public static /* synthetic */ Map N() {
        return i;
    }

    private static class05946<class05074> N(class08041 class080412) {
        if (class080412.method_6109()) {
            return class06273.NI;
        }
        Optional var1 = class080412.t().y().i();
        if (var1.isEmpty()) {
            return class06273.Ng;
        }
        return i.getOrDefault(var1.get(), class06273.Ng);
    }

    private void N(class04782 class047823, class08041 class080412, class07438 class074382) {
        class080412.method_64169(class047823, class06285.N(class080412), (class047822, class065842) -> class06293.N((class07438)class080412, class065842, class074382.method_73189()));
    }

    protected void N(class04782 class047822, class08041 class080412, long l) {
        this.z = false;
        this.U = l;
        class08036 class080362 = this.L(class080412).get();
        class080412.method_18868().N(class05378.b, (Object)class080362);
        class06293.N((class07438)class080412, (class07438)class080362);
    }

    protected boolean N(class04782 class047822, class08041 class080412) {
        if (!this.y(class080412)) {
            return false;
        }
        if (this.Z > 0) {
            --this.Z;
            return false;
        }
        return true;
    }

    private static int N(class04782 class047822) {
        return 600 + class047822.field_9229.y(6001);
    }

    private boolean N(class08041 class080412, class08036 class080362) {
        class07209 class072092 = class080362.method_24515();
        return class080412.method_24515().method_19771((class00753)class072092, 5.0);
    }

    private boolean N(class08036 class080362) {
        return class080362.method_6059(class07047.I);
    }
}

