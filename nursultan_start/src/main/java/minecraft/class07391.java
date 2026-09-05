/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04770
 *  minecraft.class07536
 *  minecraft.class07947
 *  minecraft.class08774
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class04770;
import minecraft.class07393;
import minecraft.class07395;
import minecraft.class07403;
import minecraft.class07419;
import minecraft.class07536;
import minecraft.class07947;
import minecraft.class08774;

public class class07391 {
    private static final String N = "Management server";

    public static List<class07395> L(class07393 class073932, List<class07395> list, class07403 class074032) {
        Set set = ((List)class07536.L((List)list.stream().map(class073952 -> class073932.L().N(class073952.N().N(), class073952.N().y()).thenApply(optional -> optional.map(class073952::N))).toList()).join()).stream().flatMap(Optional::stream).collect(Collectors.toSet());
        Set set2 = class073932.y().N().stream().filter(class051572 -> class051572.B() != null).map(class07419::N).collect(Collectors.toSet());
        set2.stream().filter(class074192 -> !set.contains(class074192)).forEach(class074192 -> class073932.y().N(class074192.y(), class074032));
        set.stream().filter(class074192 -> !set2.contains(class074192)).forEach(class074192 -> {
            class073932.y().N(class074192.N(), class074032);
            class04770 class047702 = class073932.L().N(class074192.y().N());
            if (class047702 != null) {
                class047702.field_13987.method_52396((class00392)class00392.L((String)"multiplayer.disconnect.banned"));
            }
        });
        return class07391.N(class073932);
    }

    public static List<class07395> y(class07393 class073932, List<class07947> list, class07403 class074032) {
        for (Optional optional : (List)class07536.L((List)list.stream().map(class079472 -> class073932.L().N(class079472.N(), class079472.y())).toList()).join()) {
            if (optional.isEmpty()) continue;
            class073932.y().N((class08774)optional.get(), class074032);
        }
        return class07391.N(class073932);
    }

    public static List<class07395> N(class07393 class073932, class07403 class074032) {
        class073932.y().y(class074032);
        return class07391.N(class073932);
    }

    public static List<class07395> N(class07393 class073932, List<class07395> list, class07403 class074032) {
        for (Optional optional : (List)class07536.L((List)list.stream().map(class073952 -> class073932.L().N(class073952.N().N(), class073952.N().y()).thenApply(optional -> optional.map(class073952::N))).toList()).join()) {
            if (optional.isEmpty()) continue;
            class07419 class074192 = (class07419)((Object)optional.get());
            class073932.y().N(class074192.N(), class074032);
            class04770 class047702 = class073932.L().N(((class07419)((Object)optional.get())).y().N());
            if (class047702 == null) continue;
            class047702.field_13987.method_52396((class00392)class00392.L((String)"multiplayer.disconnect.banned"));
        }
        return class07391.N(class073932);
    }

    public static List<class07395> N(class07393 class073932) {
        return class073932.y().N().stream().filter(class051572 -> class051572.B() != null).map(class07419::N).map(class07395::N).toList();
    }
}

