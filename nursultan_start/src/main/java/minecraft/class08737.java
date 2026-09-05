/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class07709
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class07709;
import minecraft.class08754;
import minecraft.class08769;

public interface class08737 {
    public class07709 y();

    public static class08737 N(Supplier<String> supplier) {
        return new class08769(supplier);
    }

    public static class08737 N(String string) {
        return new class08754(string);
    }

    public static Map<String, String> N(Map<String, class08737> map) {
        return Maps.transformValues(map, class08737::N);
    }

    public String N();
}

