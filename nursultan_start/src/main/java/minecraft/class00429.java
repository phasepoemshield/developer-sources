/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02733
 *  minecraft.class04206
 *  minecraft.class04247
 *  minecraft.class06244
 *  minecraft.class07209
 */
package minecraft;

import java.util.List;
import minecraft.class00431;
import minecraft.class00432;
import minecraft.class00433;
import minecraft.class00434;
import minecraft.class00435;
import minecraft.class00447;
import minecraft.class00450;
import minecraft.class00454;
import minecraft.class00455;
import minecraft.class00464;
import minecraft.class00465;
import minecraft.class00466;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02733;
import minecraft.class04206;
import minecraft.class04247;
import minecraft.class06244;
import minecraft.class07209;

public class class00429<T> {
    public static final class00455<?> N = class00429.N("dedicated_server_tick_time");
    public static final class00455<class00433> y = class00429.N("bees", class00433.N);
    public static final class00455<class00434> L = class00429.N("brains", class00434.N);
    public static final class00455<class00464> u = class00429.N("breezes", class00464.N);
    public static final class00455<class00432> i = class00429.N("goal_selectors", class00432.N);
    public static final class00455<class00450> R = class00429.N("entity_paths", class00450.N);
    public static final class00455<class00466> M = class00429.N("entity_block_intersections", class00466.field_62850, 100);
    public static final class00455<class00447> B = class00429.N("bee_hives", class00447.N);
    public static final class00455<class00465> Z = class00429.N("pois", class00465.N);
    public static final class00455<class02733> z = class00429.N("redstone_wire_orientations", class02733.N, 200);
    public static final class00455<class06244> U = class00429.N("village_sections", class06244.field_55626);
    public static final class00455<List<class07209>> E = class00429.N("raids", class07209.field_48404.N_33(class02389.N()));
    public static final class00455<List<class00431>> W = class00429.N("structures", class00431.N.N_33(class02389.N()));
    public static final class00455<class00454> m = class00429.N("game_event_listeners", class00454.N);
    public static final class00455<class07209> P = class00429.N("neighbor_updates", class07209.field_48404, 200);
    public static final class00455<class00435> s = class00429.N("game_events", class00435.N, 60);

    private static <T> class00455<T> N(String string, class02362<? super class04247, T> class023622) {
        return (class00455)class00751.N((class00751)class04206.R, (class01894)class01894.y((String)string), new class00455<T>(class023622));
    }

    private static <T> class00455<T> N(String string, class02362<? super class04247, T> class023622, int n) {
        return (class00455)class00751.N((class00751)class04206.R, (class01894)class01894.y((String)string), new class00455<T>(class023622, n));
    }

    public static class00455<?> N(class00751<class00455<?>> class007512) {
        return N;
    }

    private static class00455<?> N(String string) {
        return (class00455)class00751.N((class00751)class04206.R, (class01894)class01894.y((String)string), new class00455(null));
    }
}

