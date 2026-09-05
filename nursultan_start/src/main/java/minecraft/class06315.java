/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01210
 *  minecraft.class04782
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class01210;
import minecraft.class04782;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public class class06315
extends class05765<class07079> {
    private static final int N = 100;
    private static final int y = 3;
    private static final int L = 6;
    private static final int u = 5;
    private final float i;
    private @Nullable class07209 R;
    private int Z;
    private int z;
    private int U;

    protected boolean L(class04782 class047822, class07079 class070792, long l) {
        return class070792.method_6109() && this.R != null && this.N(class047822, this.R) && !this.i(class047822, class070792) && !this.R(class047822, class070792);
    }

    private boolean L(class04782 class047822, class07079 class070792) {
        class07209 class072092 = class070792.method_24515();
        class07209 class072093 = class072092.method_10074();
        return this.N(class047822, class072092) || this.N(class047822, class072093);
    }

    public class06315(float f) {
        super((Map)ImmutableMap.of((Object)class05378.l, (Object)class05367.field_18456, (Object)class05378.m, (Object)class05367.field_18457));
        this.i = f;
    }

    private boolean i(class04782 class047822, class07079 class070792) {
        return !this.L(class047822, class070792) && this.Z <= 0;
    }

    private boolean u(class04782 class047822, class07079 class070792) {
        return this.N(class047822, class070792.method_24515());
    }

    protected void u(class04782 class047822, class07079 class070792, long l) {
        if (!this.L(class047822, class070792)) {
            --this.Z;
            return;
        }
        if (this.U > 0) {
            --this.U;
            return;
        }
        if (this.u(class047822, class070792)) {
            class070792.A().y();
            --this.z;
            this.U = 5;
        }
    }

    protected void y(class04782 class047822, class07079 class070792, long l) {
        super.y(class047822, (class07438)class070792, l);
        this.R = null;
        this.Z = 0;
        this.z = 0;
        this.U = 0;
    }

    private boolean y(class04782 class047822, class07079 class070792) {
        return this.L(class047822, class070792) || this.N(class070792).isPresent();
    }

    protected boolean N(class04782 class047822, class07079 class070792) {
        return class070792.method_6109() && this.y(class047822, class070792);
    }

    protected void N(class04782 class047822, class07079 class070792, long l) {
        super.u(class047822, (class07438)class070792, l);
        this.N(class070792).ifPresent(class072092 -> {
            this.R = class072092;
            this.Z = 100;
            this.z = 3 + class047822.field_9229.y(4);
            this.U = 0;
            this.N(class070792, (class07209)class072092);
        });
    }

    private void N(class07079 class070792, class07209 class072092) {
        class070792.method_18868().N(class05378.m, (Object)new class05352(class072092, this.i, 0));
    }

    protected boolean N(long l) {
        return false;
    }

    private boolean N(class04782 class047822, class07209 class072092) {
        return class047822.method_8320(class072092).N(class01210.F);
    }

    private Optional<class07209> N(class07079 class070792) {
        return class070792.method_18868().L(class05378.l);
    }

    private boolean R(class04782 class047822, class07079 class070792) {
        return this.L(class047822, class070792) && this.z <= 0;
    }
}

