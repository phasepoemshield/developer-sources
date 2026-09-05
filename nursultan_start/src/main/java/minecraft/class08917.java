/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class06333
 *  minecraft.class08373
 *  minecraft.class08386
 *  minecraft.class08544
 *  minecraft.class08901
 *  minecraft.class08902
 *  minecraft.class08903
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class01894;
import minecraft.class06333;
import minecraft.class08373;
import minecraft.class08386;
import minecraft.class08544;
import minecraft.class08901;
import minecraft.class08902;
import minecraft.class08903;
import minecraft.class08907;
import minecraft.class08909;
import minecraft.class08914;
import minecraft.class08925;
import minecraft.class08929;
import minecraft.class08933;
import minecraft.class08935;
import minecraft.class08941;

public class class08917 {
    public static final class06333<class01894, MapCodec<? extends class08909>> N = new class06333();
    public static final MapCodec<class08909> y = N.N(class01894.N).dispatchMap("property", class08909::N, mapCodec -> mapCodec);

    public static void N() {
        N.N((Object)class01894.y((String)"custom_model_data"), class08907.N);
        N.N((Object)class01894.y((String)"using_item"), class08914.N);
        N.N((Object)class01894.y((String)"broken"), class08941.N);
        N.N((Object)class01894.y((String)"damaged"), class08925.N);
        N.N((Object)class01894.y((String)"fishing_rod/cast"), (Object)class08901.N);
        N.N((Object)class01894.y((String)"has_component"), (Object)class08902.N);
        N.N((Object)class01894.y((String)"bundle/has_selected_item"), class08929.N);
        N.N((Object)class01894.y((String)"selected"), class08935.N);
        N.N((Object)class01894.y((String)"carried"), class08933.N);
        N.N((Object)class01894.y((String)"extended_view"), (Object)class08903.N);
        N.N((Object)class01894.y((String)"keybind_down"), (Object)class08373.N);
        N.N((Object)class01894.y((String)"view_entity"), (Object)class08386.N);
        N.N((Object)class01894.y((String)"component"), (Object)class08544.N);
    }
}

