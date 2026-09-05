/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00892
 *  minecraft.class00904
 *  minecraft.class01219
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class01905
 *  minecraft.class04227
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00892;
import minecraft.class00904;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class01905;
import minecraft.class04227;
import minecraft.class05235;
import minecraft.class05487;
import minecraft.class07209;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05255
extends class01219 {
    private static final Logger L = LogUtils.getLogger();
    public static final MapCodec<class05255> N = MapCodec.unit(() -> y);
    public static final class05255 y = new class05255();

    private class05255() {
    }

    public @Nullable class01228 N(class05487 class054872, class07209 class072092, class07209 class072093, class01228 class012282, class01228 class012283, class01233 class012332) {
        class00500 class005002;
        if (!class012283.y().N(class00869.sr) || class07529.x) {
            return class012283;
        }
        if (class012283.L() == null) {
            L.warn("Jigsaw block at {} is missing nbt, will not replace", (Object)class072092);
            return class012283;
        }
        String string = class012283.L().y("final_state", "minecraft:air");
        try {
            class00904 class009042 = class00892.N((class01905)class054872.N_51(class04227.Z), (String)string, (boolean)true);
            class005002 = class009042.N();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            L.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{string, class072092, commandSyntaxException.getMessage()});
            return null;
        }
        if (class005002.N(class00869.EK)) {
            return null;
        }
        return new class01228(class012283.N(), class005002, null);
    }

    protected class05235<?> N() {
        return class05235.B;
    }
}

