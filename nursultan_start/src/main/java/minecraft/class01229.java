/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class03556
 *  minecraft.class05946
 *  minecraft.class07099
 */
package minecraft;

import java.util.Optional;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class03556;
import minecraft.class05946;
import minecraft.class07099;

public interface class01229<T> {
    public Optional<? extends T> get(class01894 var1, boolean var2);

    private static /* synthetic */ Optional N(class02055 class020552, class07099 class070992, class01894 class018942, boolean bl) {
        return (bl ? class020552 : class070992).N(class05946.N((class05946)class070992.i(), (class01894)class018942));
    }

    public static <T> class01229<class03556<T>> N(class07099<T> class070992) {
        return (arg_0, arg_1) -> class01229.N(class070992.s(), class070992, arg_0, arg_1);
    }

    public static <T> class01229<? extends class03556<T>> N(class00751<T> class007512) {
        return (class018942, bl) -> class007512.L(class018942);
    }
}

