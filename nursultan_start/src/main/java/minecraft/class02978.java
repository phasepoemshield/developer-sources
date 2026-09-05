/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class02142
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05744
 *  minecraft.class05765
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07079
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class02142;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05744;
import minecraft.class05765;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07079;

public class class02978
extends class05765<class07079> {
    private final class02142 N;
    private final float y;
    private final float L;
    private final float u;

    public class02978(class02142 class021422, float f, float f2, float f3) {
        super((Map)ImmutableMap.of((Object)class05378.P, (Object)class05367.field_18457, (Object)class05378.F, (Object)class05367.field_18457));
        if (f2 > f3) {
            throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + f2 + " > " + f3);
        }
        this.N = class021422;
        this.y = f;
        this.L = f2;
        this.u = f3 - f2;
    }

    protected void u(class04782 class047822, class07079 class070792, long l) {
        class06069 class060692 = class070792.method_59922();
        float f = class04995.N((float)(class060692.z() * this.u + this.L), (float)-90.0f, (float)90.0f);
        float f2 = class04995.R((float)(class070792.method_36454() + 2.0f * class060692.z() * this.y - this.y));
        class06889 class068892 = class06889.N((float)f, (float)f2);
        class070792.method_18868().N(class05378.P, (Object)new class05744(class070792.method_33571().i(class068892)));
        class070792.method_18868().N(class05378.F, (Object)this.N.N(class060692));
    }
}

