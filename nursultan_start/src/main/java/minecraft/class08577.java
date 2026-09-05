/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01001
 *  minecraft.class01042
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class05946
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import java.util.Optional;
import minecraft.class00751;
import minecraft.class01001;
import minecraft.class01042;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class05946;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08578;
import minecraft.class08579;

public class class08577 {
    public static final String N = "variant";

    public static <T> class03556<T> y(class01042 class010422, class05946<? extends class00751<T>> class059462) {
        return (class03556)class010422.L(class059462).N().orElseThrow();
    }

    public static <T extends class08578<class08579, ?>> Optional<class03529<T>> N(class08579 class085792, class05946<class00751<T>> class059462) {
        class01001 class010012 = class085792.y();
        return class08578.N(class010012.method_30349().L(class059462).z(), class03556::N, class010012.method_8409(), class085792);
    }

    public static <T> Optional<class03556<T>> N(class08299 class082992, class05946<? extends class00751<T>> class059462) {
        return class082992.N(N, class01894.N).map(class018942 -> class05946.N((class05946)class059462, (class01894)class018942)).flatMap(arg_0 -> ((class01929)class082992.N()).u(arg_0));
    }

    public static <T> void N(class08329 class083292, class03556<T> class035562) {
        class035562.i().ifPresent(class059462 -> class083292.N(N, class01894.N, (Object)class059462.N()));
    }

    public static <T> class03556<T> N(class01042 class010422, class05946<T> class059462) {
        class00751 class007512 = class010422.L(class059462.L());
        return (class03556)class007512.N(class059462).or(() -> ((class00751)class007512).N()).orElseThrow();
    }
}

