/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class01737
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import minecraft.class01737;

public class class00106 {
    public static final Codec<class00106> N = Codec.STRING.comapFlatMap(class00106::N, class001062 -> class001062.L);
    public static final Codec<String> y = Codec.STRING.validate(string -> class01737.y((String)string) ? DataResult.success((Object)string) : DataResult.error(() -> string + " is not a valid input name"));
    private final String L;
    private final class01737 u;

    private class00106(String string, class01737 class017372) {
        this.L = string;
        this.u = class017372;
    }

    private static DataResult<class00106> N(String string) {
        class01737 class017372;
        try {
            class017372 = class01737.N((String)string);
        }
        catch (Exception exception) {
            return DataResult.error(() -> "Failed to parse template " + string + ": " + exception.getMessage());
        }
        return DataResult.success((Object)new class00106(string, class017372));
    }

    public String N(Map<String, String> map) {
        List list = this.u.y().stream().map(string -> map.getOrDefault(string, "")).toList();
        return this.u.N(list);
    }
}

