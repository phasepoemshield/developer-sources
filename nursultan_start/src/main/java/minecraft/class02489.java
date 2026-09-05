/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 */
package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class02463;
import minecraft.class02491;

public interface class02489 {
    public static final MapCodec<class02489> N = class02489.N(Integer.MAX_VALUE);

    public static MapCodec<class02489> N(int n) {
        return class02491.field_49860.dispatchMap("mode", class02489::N, class024912 -> class024912.field_49863).validate(class024892 -> {
            int n2;
            class02463 class024632;
            if (class024892 instanceof class02463 && (class024632 = (class02463)class024892).L().isPresent() && (n2 = class024632.L().get().intValue()) > n) {
                return DataResult.error(() -> "Size value too large: " + n2 + ", max size is " + n);
            }
            return DataResult.success((Object)class024892);
        });
    }

    public <T> List<T> N(List<T> var1, List<T> var2, int var3);

    default public <T> List<T> N(List<T> list, List<T> list2) {
        return this.N(list, list2, Integer.MAX_VALUE);
    }

    public class02491 N();
}

