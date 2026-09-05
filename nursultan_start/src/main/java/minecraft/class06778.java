/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02477
 *  minecraft.class02480
 *  minecraft.class02678
 *  minecraft.class03519
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07713
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02678;
import minecraft.class03519;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07713;

public class class06778 {
    private static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"arguments.item.overstacked", (Object[])new Object[]{object, object2}));
    private final class03556<class06581> y;
    private final class02678 L;

    public class06778(class03556<class06581> class035562, class02678 class026782) {
        this.y = class035562;
        this.L = class026782;
    }

    private String y() {
        return this.y.i().map(class05946::N).orElseGet(() -> "unknown[" + String.valueOf(this.y) + "]").toString();
    }

    private String y(class01929 class019292) {
        class03519 class035192 = class019292.N((DynamicOps)class07713.N);
        return this.L.y().stream().flatMap(arg_0 -> class06778.N((DynamicOps)class035192, arg_0)).collect(Collectors.joining(String.valueOf(',')));
    }

    public String N(class01929 class019292) {
        StringBuilder stringBuilder = new StringBuilder(this.y());
        String string = this.y(class019292);
        if (!string.isEmpty()) {
            stringBuilder.append('[');
            stringBuilder.append(string);
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    private static /* synthetic */ Stream N(DynamicOps dynamicOps, Map.Entry entry) {
        class02477 class024772 = (class02477)entry.getKey();
        class01894 class018942 = class04206.NW.y((Object)class024772);
        if (class018942 == null) {
            return Stream.empty();
        }
        Optional optional = (Optional)entry.getValue();
        if (optional.isPresent()) {
            return class02480.N((class02477)class024772, optional.get()).N(dynamicOps).result().stream().map(class077092 -> class018942.toString() + "=" + String.valueOf(class077092));
        }
        return Stream.of("!" + class018942.toString());
    }

    public class06581 N() {
        return (class06581)this.y.N();
    }

    public class06584 N(int n, boolean bl) throws CommandSyntaxException {
        class06584 class065842 = new class06584(this.y, n);
        class065842.y(this.L);
        if (bl && n > class065842.U()) {
            throw N.create((Object)this.y(), (Object)class065842.U());
        }
        return class065842;
    }
}

