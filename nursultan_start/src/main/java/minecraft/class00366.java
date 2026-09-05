/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00223
 *  minecraft.class01894
 *  minecraft.class06333
 *  minecraft.class08351
 *  minecraft.class08356
 *  minecraft.class08378
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00223;
import minecraft.class00336;
import minecraft.class00345;
import minecraft.class00356;
import minecraft.class00363;
import minecraft.class00365;
import minecraft.class00371;
import minecraft.class00374;
import minecraft.class01894;
import minecraft.class06333;
import minecraft.class08351;
import minecraft.class08356;
import minecraft.class08378;

public class class00366 {
    public static final class06333<class01894, class00336<?, ?>> N = new class06333();
    public static final Codec<class00336<?, ?>> y = N.N(class01894.N);

    public static void N() {
        N.N((Object)class01894.y((String)"custom_model_data"), class00371.y);
        N.N((Object)class01894.y((String)"main_hand"), class00374.y);
        N.N((Object)class01894.y((String)"charge_type"), class00345.y);
        N.N((Object)class01894.y((String)"trim_material"), class00365.y);
        N.N((Object)class01894.y((String)"block_state"), class00363.y);
        N.N((Object)class01894.y((String)"display_context"), class00356.y);
        N.N((Object)class01894.y((String)"local_time"), (Object)class08351.L);
        N.N((Object)class01894.y((String)"context_entity_type"), (Object)class08356.y);
        N.N((Object)class01894.y((String)"context_dimension"), (Object)class08378.y);
        N.N((Object)class01894.y((String)"component"), (Object)class00223.L());
    }
}

