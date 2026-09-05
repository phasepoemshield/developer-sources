/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  minecraft.class00751
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class01794
 *  minecraft.class01905
 *  minecraft.class01929
 *  minecraft.class02055
 *  minecraft.class02061
 *  minecraft.class04105
 *  minecraft.class04144
 *  minecraft.class04206
 *  minecraft.class04227
 *  net.fabricmc.fabric.api.event.registry.DynamicRegistries
 */
package minecraft;

import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class00751;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class01794;
import minecraft.class01905;
import minecraft.class01929;
import minecraft.class02055;
import minecraft.class02061;
import minecraft.class04105;
import minecraft.class04144;
import minecraft.class04206;
import minecraft.class04227;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;

public class class03121 {
    private static List N() {
        return DynamicRegistries.getDynamicRegistries();
    }

    public static CompletableFuture<class04144> N(CompletableFuture<class01929> completableFuture, class02061 class020612) {
        return completableFuture.thenApply(class019292 -> {
            class01022 class010222 = class01042.N((class00751)class04206.NF);
            class01794 class017942 = new class01794();
            class03121.N().forEach(class029652 -> class029652.N((arg_0, arg_1) -> ((class01794)class017942).N(arg_0, arg_1)));
            class04144 class041442 = class020612.N((class01042)class010222, class019292, class017942);
            class01929 class019293 = class041442.N();
            Optional optional = class019293.method_46759(class04227.NA);
            Optional optional2 = class019293.method_46759(class04227.ys);
            if (optional.isPresent() || optional2.isPresent()) {
                class04105.N((class02055)((class02055)DataFixUtils.orElseGet((Optional)optional2, () -> class019292.y(class04227.ys))), (class01905)((class01905)DataFixUtils.orElseGet((Optional)optional, () -> class019292.y(class04227.NA))));
            }
            return class041442;
        });
    }
}

