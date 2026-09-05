/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00737
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class06289
 *  minecraft.class08041
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00737;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05744;
import minecraft.class05765;
import minecraft.class06289;
import minecraft.class08041;

public class class05735
extends class05765<class08041> {
    private static final int N = 300;
    private static final double y = 1.73;
    private long L;

    public class05735() {
        super((Map<class05378<?>, class05367>)ImmutableMap.of((Object)class05378.L, (Object)class05367.field_18456, (Object)class05378.P, (Object)class05367.field_18458));
    }

    protected void y(class04782 class047822, class08041 class080412) {
    }

    @Override
    protected boolean N(class04782 class047822, class08041 class080412, long l) {
        Optional var5 = class080412.method_18868().L(class05378.L);
        if (var5.isEmpty()) {
            return false;
        }
        class06289 class062892 = (class06289)var5.get();
        return class062892.N() == class047822.method_27983() && class062892.y().method_19769((class00737)class080412.method_73189(), 1.73);
    }

    @Override
    protected boolean N(class04782 class047822, class08041 class080412) {
        if (class047822.N() - this.L < 300L) {
            return false;
        }
        if (class047822.field_9229.y(2) != 0) {
            return false;
        }
        this.L = class047822.N();
        class06289 class062892 = (class06289)class080412.method_18868().L(class05378.L).get();
        return class062892.N() == class047822.method_27983() && class062892.y().method_19769((class00737)class080412.method_73189(), 1.73);
    }

    @Override
    protected void u(class04782 class047822, class08041 class080412, long l) {
        class01289 var5 = class080412.method_18868();
        var5.N(class05378.V, (Object)l);
        var5.L(class05378.L).ifPresent(class062892 -> var5.N(class05378.P, (Object)new class05744(class062892.y())));
        class080412.l();
        this.y(class047822, class080412);
        if (class080412.u(class047822)) {
            class080412.v();
        }
    }
}

