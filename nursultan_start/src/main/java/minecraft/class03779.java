/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class02060
 *  minecraft.class02071
 *  minecraft.class02072
 *  minecraft.class02077
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class04230
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06478
 */
package minecraft;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class02060;
import minecraft.class02071;
import minecraft.class02072;
import minecraft.class02077;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03790;
import minecraft.class04230;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06478;

public class class03779
extends class05096 {
    private static final class00392 y = class00392.L((String)"selectWorld.experimental.title");
    private static final class00392 L = class00392.L((String)"selectWorld.experimental.message");
    private static final class00392 u = class00392.L((String)"selectWorld.experimental.details");
    private static final int i = 10;
    private static final int R = 100;
    private final BooleanConsumer M;
    final Collection<class01055> N;
    private final class02060 B = new class02060().N(10).y(20);

    public class03779(Collection<class01055> collection, BooleanConsumer booleanConsumer) {
        super(y);
        this.N = collection;
        this.M = booleanConsumer;
    }

    public void method_25426() {
        super.method_25426();
        class02080 class020802 = this.B.u(2);
        class02072 class020722 = class020802.y().y();
        class020802.N((class02102)new class02071(this.field_22785, this.field_22793), 2, class020722);
        ((class04230)class020802.N((class02102)new class04230(L, this.field_22793).N(true), 2, class020722)).N(310);
        class020802.N((class02102)class05362.method_46430((class00392)u, class053622 -> this.field_22787.N((class05096)new class03790(this))).N(100).N(), 2, class020722);
        class020802.N((class02102)class05362.method_46430((class00392)class05220.Z, class053622 -> this.M.accept(true)).N());
        class020802.N((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.M.accept(false)).N());
        this.B.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.B.N();
        this.method_48640();
    }

    public void method_48640() {
        class02077.N((class02102)this.B, (int)0, (int)0, (int)this.field_22789, (int)this.field_22790, (float)0.5f, (float)0.5f);
    }

    public void method_25419() {
        this.M.accept(false);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), L});
    }
}

