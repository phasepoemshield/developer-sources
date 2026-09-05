/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07324
 *  minecraft.class07438
 *  minecraft.class08041
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05765;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07324;
import minecraft.class07438;
import minecraft.class08041;
import org.jspecify.annotations.Nullable;

public class class05780
extends class05765<class08041> {
    private static final int N = 900;
    private static final int y = 40;
    private @Nullable class06584 L;
    private final List<class06584> u = Lists.newArrayList();
    private int i;
    private int R;
    private int Z;

    @Override
    public void L(class04782 class047822, class08041 class080412, long l) {
        class07438 class074382 = this.u(class080412);
        this.N(class074382, class080412);
        if (!this.u.isEmpty()) {
            this.i(class080412);
        } else {
            class05780.L(class080412);
            this.Z = Math.min(this.Z, 40);
        }
        --this.Z;
    }

    private static void L(class08041 class080412) {
        class080412.method_5673(class07085.field_6173, class06584.E);
        class080412.N(class07085.field_6173, 0.085f);
    }

    public class05780(int n, int n2) {
        super((Map<class05378<?>, class05367>)ImmutableMap.of((Object)class05378.b, (Object)class05367.field_18456), n, n2);
    }

    private void i(class08041 class080412) {
        if (this.u.size() >= 2 && ++this.i >= 40) {
            ++this.R;
            this.i = 0;
            if (this.R > this.u.size() - 1) {
                this.R = 0;
            }
            class05780.N(class080412, this.u.get(this.R));
        }
    }

    private class07438 u(class08041 class080412) {
        class01289 var2 = class080412.method_18868();
        class07438 class074382 = (class07438)var2.L(class05378.b).get();
        var2.N(class05378.P, (Object)new class05751((class07049)class074382, true));
        return class074382;
    }

    @Override
    public void u(class04782 class047822, class08041 class080412, long l) {
        super.y(class047822, class080412, l);
        class080412.method_18868().y(class05378.b);
        class05780.L(class080412);
        this.L = null;
    }

    @Override
    public void y(class04782 class047822, class08041 class080412, long l) {
        super.u(class047822, class080412, l);
        this.u(class080412);
        this.i = 0;
        this.R = 0;
        this.Z = 40;
    }

    private void y(class08041 class080412) {
        for (class07324 class073242 : class080412.y()) {
            if (class073242.b() || !this.N(class073242)) continue;
            this.u.add(class073242.B());
        }
    }

    private boolean N(class07324 class073242) {
        return class06584.y((class06584)this.L, (class06584)class073242.y()) || class06584.y((class06584)this.L, (class06584)class073242.L());
    }

    @Override
    public boolean N(class04782 class047822, class08041 class080412) {
        class01289 var3 = class080412.method_18868();
        if (var3.L(class05378.b).isEmpty()) {
            return false;
        }
        class07438 class074382 = (class07438)var3.L(class05378.b).get();
        return class074382.method_5864() == class07078.Ly && class080412.method_5805() && class074382.method_5805() && !class080412.method_6109() && class080412.method_5858((class07049)class074382) <= 17.0;
    }

    private void N(class08041 class080412) {
        class05780.N(class080412, this.u.get(0));
    }

    private void N(class07438 class074382, class08041 class080412) {
        boolean bl = false;
        class06584 class065842 = class074382.method_6047();
        if (this.L == null || !class06584.y((class06584)this.L, (class06584)class065842)) {
            this.L = class065842;
            bl = true;
            this.u.clear();
        }
        if (bl && !this.L.R()) {
            this.y(class080412);
            if (!this.u.isEmpty()) {
                this.Z = 900;
                this.N(class080412);
            }
        }
    }

    private static void N(class08041 class080412, class06584 class065842) {
        class080412.method_5673(class07085.field_6173, class065842);
        class080412.N(class07085.field_6173, 0.0f);
    }

    @Override
    public boolean N(class04782 class047822, class08041 class080412, long l) {
        return this.N(class047822, class080412) && this.Z > 0 && class080412.method_18868().L(class05378.b).isPresent();
    }
}

