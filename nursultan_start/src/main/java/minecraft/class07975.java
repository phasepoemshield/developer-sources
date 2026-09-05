/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07625
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import java.util.List;
import minecraft.class00734;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07625;
import minecraft.class07953;
import minecraft.class08036;
import minecraft.class08041;
import org.jspecify.annotations.Nullable;

public class class07975
extends class07953 {
    private final class07625 N;
    private @Nullable class07438 y;
    private final class01328 L = class01328.N().N(64.0);

    @Override
    public void L() {
        this.N.y(this.y);
        super.L();
    }

    public class07975(class07625 class076252) {
        super((class07079)class076252, false, true);
        this.N = class076252;
        this.N_71(EnumSet.of(class07430.field_18408));
    }

    public boolean N() {
        class08036 class080362;
        class07438 class0743822;
        class00734 class007342 = this.N.method_5829().L(10.0, 8.0, 10.0);
        class04782 class047822 = class07975.N((class07049)this.N);
        List var3 = class047822.N(class08041.class, this.L, (class07438)this.N, class007342);
        List var4 = class047822.N(this.L, (class07438)this.N, class007342);
        for (class07438 class0743822 : var3) {
            class08041 class080412 = (class08041)class0743822;
            for (class08036 class080363 : var4) {
                if (class080412.u(class080363) > -100) continue;
                this.y = class080363;
            }
        }
        if (this.y == null) {
            return false;
        }
        class0743822 = this.y;
        return !(class0743822 instanceof class08036) || !(class080362 = (class08036)class0743822).method_7325() && !class080362.method_68878();
    }
}

