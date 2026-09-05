/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import minecraft.class07387;
import minecraft.class07393;
import minecraft.class07397;
import minecraft.class07403;
import minecraft.class07536;
import minecraft.class07947;
import minecraft.class08774;

public class class07417 {
    public static List<class07397> L(class07393 class073932, List<class07397> list, class07403 class074032) {
        Set set = ((List)class07536.L((List)list.stream().map(class073972 -> class073932.L().N(class073972.N().N(), class073972.N().y()).thenApply(optional -> optional.map(class087742 -> new class07387((class08774)class087742, class073972.y(), class073972.L())))).toList()).join()).stream().flatMap(Optional::stream).collect(Collectors.toSet());
        Set set2 = class073932.i().N().stream().filter(class010872 -> class010872.B() != null).map(class010872 -> new class07387((class08774)class010872.B(), Optional.of(class010872.N().N()), Optional.of(class010872.y()))).collect(Collectors.toSet());
        set2.stream().filter(class073872 -> !set.contains(class073872)).forEach(class073872 -> class073932.i().y(class073872.N(), class074032));
        set.stream().filter(class073872 -> !set2.contains(class073872)).forEach(class073872 -> class073932.i().N(class073872.N(), class073872.y(), class073872.L(), class074032));
        return class07417.N(class073932);
    }

    public static List<class07397> y(class07393 class073932, List<class07397> list, class07403 class074032) {
        Iterator iterator = ((List)class07536.L((List)list.stream().map(class073972 -> class073932.L().N(class073972.N().N(), class073972.N().y()).thenApply(optional -> optional.map(class087742 -> new class07387((class08774)class087742, class073972.y(), class073972.L())))).toList()).join()).iterator();
        while (iterator.hasNext()) {
            ((Optional)iterator.next()).ifPresent(class073872 -> class073932.i().N(class073872.N(), class073872.y(), class073872.L(), class074032));
        }
        return class07417.N(class073932);
    }

    public static List<class07397> N(class07393 class073932, List<class07947> list, class07403 class074032) {
        Iterator iterator = ((List)class07536.L((List)list.stream().map(class079472 -> class073932.L().N(class079472.N(), class079472.y())).toList()).join()).iterator();
        while (iterator.hasNext()) {
            ((Optional)iterator.next()).ifPresent(class087742 -> class073932.i().y((class08774)class087742, class074032));
        }
        return class07417.N(class073932);
    }

    public static List<class07397> N(class07393 class073932, class07403 class074032) {
        class073932.i().N(class074032);
        return class07417.N(class073932);
    }

    public static List<class07397> N(class07393 class073932) {
        return class073932.i().N().stream().filter(class010872 -> class010872.B() != null).map(class07397::N).toList();
    }
}

