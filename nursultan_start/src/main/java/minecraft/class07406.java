/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04770
 *  minecraft.class07947
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class04770;
import minecraft.class07384;
import minecraft.class07393;
import minecraft.class07403;
import minecraft.class07415;
import minecraft.class07947;
import org.jspecify.annotations.Nullable;

public class class07406 {
    private static final class00392 N = class00392.L((String)"multiplayer.disconnect.kicked");

    public static List<class07947> N(class07393 class073932) {
        return class073932.L().N().stream().map(class07947::N).toList();
    }

    private static @Nullable class04770 N(class07393 class073932, class07947 class079472) {
        if (class079472.N().isPresent()) {
            return class073932.L().N((UUID)class079472.N().get());
        }
        if (class079472.y().isPresent()) {
            return class073932.L().L((String)class079472.y().get());
        }
        return null;
    }

    public static List<class07947> N(class07393 class073932, List<class07384> list, class07403 class074032) {
        ArrayList<class07947> arrayList = new ArrayList<class07947>();
        for (class07384 class073842 : list) {
            class04770 class047702 = class07406.N(class073932, class073842.N());
            if (class047702 == null) continue;
            class073932.L().N(class047702, class074032);
            class047702.field_13987.method_52396(class073842.y().flatMap(class07415::N).orElse(N));
            arrayList.add(class073842.N());
        }
        return arrayList;
    }
}

