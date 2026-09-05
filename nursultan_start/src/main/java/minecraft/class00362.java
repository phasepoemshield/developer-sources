/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class06333
 *  minecraft.class06572
 *  minecraft.class08897
 *  minecraft.class08911
 *  minecraft.class08916
 *  minecraft.class08921
 *  minecraft.class08926
 *  minecraft.class08936
 *  minecraft.class08942
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00334;
import minecraft.class00347;
import minecraft.class00350;
import minecraft.class01894;
import minecraft.class06333;
import minecraft.class06572;
import minecraft.class08897;
import minecraft.class08911;
import minecraft.class08916;
import minecraft.class08921;
import minecraft.class08926;
import minecraft.class08936;
import minecraft.class08942;

public class class00362 {
    public static final class06333<class01894, MapCodec<? extends class06572>> N = new class06333();
    public static final MapCodec<class06572> y = N.N(class01894.N).dispatchMap("property", class06572::N, mapCodec -> mapCodec);

    public static void N() {
        N.N((Object)class01894.y((String)"custom_model_data"), (Object)class08926.N);
        N.N((Object)class01894.y((String)"bundle/fullness"), (Object)class08921.N);
        N.N((Object)class01894.y((String)"damage"), (Object)class08936.N);
        N.N((Object)class01894.y((String)"cooldown"), (Object)class08911.N);
        N.N((Object)class01894.y((String)"time"), class00347.N);
        N.N((Object)class01894.y((String)"compass"), (Object)class08916.N);
        N.N((Object)class01894.y((String)"crossbow/pull"), (Object)class08897.N);
        N.N((Object)class01894.y((String)"use_cycle"), class00350.N);
        N.N((Object)class01894.y((String)"use_duration"), class00334.N);
        N.N((Object)class01894.y((String)"count"), (Object)class08942.N);
    }
}

