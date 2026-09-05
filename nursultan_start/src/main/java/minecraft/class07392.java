/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.InetAddresses
 *  minecraft.class00392
 *  minecraft.class04770
 */
package minecraft;

import com.google.common.net.InetAddresses;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class04770;
import minecraft.class07385;
import minecraft.class07390;
import minecraft.class07393;
import minecraft.class07403;
import minecraft.class07407;

public class class07392 {
    private static final String N = "Management server";

    public static List<class07385> L(class07393 class073932, List<class07385> list, class07403 class074032) {
        Set set = list.stream().filter(class073852 -> InetAddresses.isInetAddress((String)class073852.N())).map(class07385::i).collect(Collectors.toSet());
        Set set2 = class073932.y().y().stream().map(class07407::N).collect(Collectors.toSet());
        set2.stream().filter(class074072 -> !set.contains(class074072)).forEach(class074072 -> class073932.y().N(class074072.y(), class074032));
        set.stream().filter(class074072 -> !set2.contains(class074072)).forEach(class074072 -> class073932.y().N(class074072.N(), class074032));
        set.stream().filter(class074072 -> !set2.contains(class074072)).flatMap(class074072 -> class073932.L().y(class074072.y()).stream()).forEach(class047702 -> class047702.field_13987.method_52396((class00392)class00392.L((String)"multiplayer.disconnect.ip_banned")));
        return class07392.N(class073932);
    }

    public static List<class07385> y(class07393 class073932, List<String> list, class07403 class074032) {
        list.forEach(string -> class073932.y().N((String)string, class074032));
        return class07392.N(class073932);
    }

    private static List<class04770> N(class07393 class073932, class07407 class074072, class07403 class074032) {
        class073932.y().N(class074072.N(), class074032);
        return class073932.L().y(class074072.y());
    }

    private static List<class04770> N(class07393 class073932, class07390 class073902, class07403 class074032) {
        Optional<class04770> var4;
        class07407 class074072 = class073902.N();
        if (class074072 != null) {
            return class07392.N(class073932, class074072, class074032);
        }
        if (class073902.y().isPresent() && (var4 = class073932.L().y(class073902.y().get().N(), class073902.y().get().y())).isPresent()) {
            return class07392.N(class073932, class073902.N(var4.get()), class074032);
        }
        return List.of();
    }

    public static List<class07385> N(class07393 class073932, List<class07390> list, class07403 class074032) {
        list.stream().map(class073902 -> class07392.N(class073932, class073902, class074032)).flatMap(Collection::stream).forEach(class047702 -> class047702.field_13987.method_52396((class00392)class00392.L((String)"multiplayer.disconnect.ip_banned")));
        return class07392.N(class073932);
    }

    public static List<class07385> N(class07393 class073932) {
        return class073932.y().y().stream().map(class07407::N).map(class07385::N).toList();
    }

    public static List<class07385> N(class07393 class073932, class07403 class074032) {
        class073932.y().N(class074032);
        return class07392.N(class073932);
    }
}

