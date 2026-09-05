/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05142
 *  minecraft.class05151
 *  minecraft.class07536
 *  minecraft.class07947
 *  minecraft.class08774
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class05142;
import minecraft.class05151;
import minecraft.class07393;
import minecraft.class07403;
import minecraft.class07536;
import minecraft.class07947;
import minecraft.class08774;

public class class07413 {
    public static List<class07947> L(class07393 class073932, List<class07947> list, class07403 class074032) {
        Set set = ((List)class07536.L((List)list.stream().map(class079472 -> class073932.L().N(class079472.N(), class079472.y())).toList()).join()).stream().flatMap(Optional::stream).collect(Collectors.toSet());
        Set set2 = class073932.N().N().stream().map(class05151::B).collect(Collectors.toSet());
        set2.stream().filter(class087742 -> !set.contains(class087742)).forEach(class087742 -> class073932.N().N((class08774)class087742, class074032));
        set.stream().filter(class087742 -> !set2.contains(class087742)).forEach(class087742 -> class073932.N().N(new class05142(class087742), class074032));
        class073932.N().y(class074032);
        return class07413.N(class073932);
    }

    public static List<class07947> y(class07393 class073932, List<class07947> list, class07403 class074032) {
        Iterator iterator = ((List)class07536.L((List)list.stream().map(class079472 -> class073932.L().N(class079472.N(), class079472.y())).toList()).join()).iterator();
        while (iterator.hasNext()) {
            ((Optional)iterator.next()).ifPresent(class087742 -> class073932.N().N((class08774)class087742, class074032));
        }
        class073932.N().y(class074032);
        return class07413.N(class073932);
    }

    public static List<class07947> N(class07393 class073932, class07403 class074032) {
        class073932.N().N(class074032);
        return class07413.N(class073932);
    }

    public static List<class07947> N(class07393 class073932, List<class07947> list, class07403 class074032) {
        Iterator iterator = ((List)class07536.L((List)list.stream().map(class079472 -> class073932.L().N(class079472.N(), class079472.y())).toList()).join()).iterator();
        while (iterator.hasNext()) {
            ((Optional)iterator.next()).ifPresent(class087742 -> class073932.N().N(new class05142(class087742), class074032));
        }
        return class07413.N(class073932);
    }

    public static List<class07947> N(class07393 class073932) {
        return class073932.N().N().stream().filter(class051422 -> class051422.B() != null).map(class051422 -> class07947.N((class08774)((class08774)class051422.B()))).toList();
    }
}

