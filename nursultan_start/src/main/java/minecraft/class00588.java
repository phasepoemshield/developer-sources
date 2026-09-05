/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02584
 *  minecraft.class04206
 *  minecraft.class05359
 *  minecraft.class06024
 *  minecraft.class06338
 *  minecraft.class06731
 *  minecraft.class06750
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class08165
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import minecraft.class00586;
import minecraft.class00610;
import minecraft.class00619;
import minecraft.class00621;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02584;
import minecraft.class04206;
import minecraft.class05359;
import minecraft.class06024;
import minecraft.class06338;
import minecraft.class06731;
import minecraft.class06750;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class08165;

public interface class00588 {
    public static final class06750<Boolean> N = class00588.N("boolean", class06750.N((Codec)Codec.BOOL, class00619.N));
    public static final class06750<class02584> y = class00588.N("tri_state", class06750.N((Codec)class02584.field_64315));
    public static final class06750<Float> L = class00588.N("float", class06750.N((Codec)Codec.FLOAT, class00619.y, class00610.N()));
    public static final class06750<Float> u = class00588.N("angle_degrees", class06750.N((Codec)Codec.FLOAT, class00619.y, class00610.N(), class00610.N(90.0f)));
    public static final class06750<Integer> i = class00588.N("rgb_color", class06750.N((Codec)class06338.m, class00619.L, class00610.L()));
    public static final class06750<Integer> R = class00588.N("argb_color", class06750.N((Codec)class06338.P, class00619.u, class00610.L()));
    public static final class06750<class08165> M = class00588.N("moon_phase", class06750.N((Codec)class08165.field_64378));
    public static final class06750<class05359> B = class00588.N("activity", class06750.N((Codec)class04206.Q.T()));
    public static final class06750<class00586> Z = class00588.N("bed_rule", class06750.N(class00586.L));
    public static final class06750<class07126> z = class00588.N("particle", class06750.N((Codec)class07107.yE));
    public static final class06750<List<class06024>> U = class00588.N("ambient_particles", class06750.N((Codec)class06024.N.listOf()));
    public static final class06750<class00621> E = class00588.N("background_music", class06750.N(class00621.L));
    public static final class06750<class06731> W = class00588.N("ambient_sounds", class06750.N((Codec)class06731.L));
    public static final Codec<class06750<?>> m = class04206.NX.T();

    public static <Value> class06750<Value> N(String string, class06750<Value> class067502) {
        class00751.N((class00751)class04206.NX, (class01894)class01894.y((String)string), class067502);
        return class067502;
    }

    public static class06750<?> N(class00751<class06750<?>> class007512) {
        return N;
    }
}

