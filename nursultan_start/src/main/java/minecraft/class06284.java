/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class02484
 *  minecraft.class02813
 *  minecraft.class02827
 *  minecraft.class02835
 *  minecraft.class04782
 *  minecraft.class04877
 *  minecraft.class05765
 *  minecraft.class06069
 *  minecraft.class06563
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class08005
 *  minecraft.class08006
 *  minecraft.class08041
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Map;
import minecraft.class02484;
import minecraft.class02813;
import minecraft.class02827;
import minecraft.class02835;
import minecraft.class04782;
import minecraft.class04877;
import minecraft.class05765;
import minecraft.class06069;
import minecraft.class06286;
import minecraft.class06563;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class08005;
import minecraft.class08006;
import minecraft.class08041;
import org.jspecify.annotations.Nullable;

public class class06284
extends class05765<class08041> {
    private @Nullable class04877 N;

    protected void L(class04782 class047822, class08041 class080412, long l) {
        class06069 class060692 = class080412.method_59922();
        if (class060692.y(100) == 0) {
            class080412.NQ();
        }
        if (class060692.y(200) == 0 && class06286.N(class047822, (class07438)class080412, class080412.method_24515())) {
            class06563 class065632 = (class06563)class07536.N((Object[])class06563.values(), (class06069)class060692);
            int n = class060692.y(3);
            class06584 class065842 = this.N(class065632, n);
            class08005.N((class08005)new class08006(class080412.method_73183(), (class07049)class080412, class080412.method_23317(), class080412.method_23320(), class080412.method_23321(), class065842), (class04782)class047822, (class06584)class065842);
        }
    }

    public class06284(int n, int n2) {
        super((Map)ImmutableMap.of(), n, n2);
    }

    protected void y(class04782 class047822, class08041 class080412, long l) {
        this.N = null;
        class080412.method_18868().N(class047822.method_75728(), class047822.N(), class080412.method_73189());
    }

    private class06584 N(class06563 class065632, int n) {
        class06584 class065842 = new class06584((class07310)class06570.GJ);
        class065842.N(class02484.NT, (Object)new class02813((int)((byte)n), List.of(new class02827(class02835.field_7970, IntList.of((int)class065632.i()), IntList.of(), false, false))));
        return class065842;
    }

    protected boolean N(class04782 class047822, class08041 class080412) {
        class07209 class072092 = class080412.method_24515();
        this.N = class047822.method_19502(class072092);
        return this.N != null && this.N.i() && class06286.N(class047822, (class07438)class080412, class072092);
    }

    protected boolean N(class04782 class047822, class08041 class080412, long l) {
        return this.N != null && !this.N.u();
    }
}

