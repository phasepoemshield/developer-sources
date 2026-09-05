/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class06647
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00507;
import minecraft.class00522;
import minecraft.class06647;
import minecraft.class08092;

public class class00517<O, S extends class00522<O, S>> {
    private final O N;
    private final Map<String, class08092<?>> y = Maps.newHashMap();

    public class00517(O o) {
        this.N = o;
    }

    public class00507<O, S> N(Function<O, S> function, class06647<O, S> class066472) {
        return new class00507<O, S>(function, this.N, class066472, this.y);
    }

    private <T extends Comparable<T>> void N(class08092<T> class080922) {
        String string = class080922.R();
        if (!class00507.N.matcher(string).matches()) {
            throw new IllegalArgumentException(String.valueOf(this.N) + " has invalidly named property: " + string);
        }
        List list = class080922.N();
        if (list.size() <= 1) {
            throw new IllegalArgumentException(String.valueOf(this.N) + " attempted use property " + string + " with <= 1 possible values");
        }
        for (Comparable comparable : list) {
            String string2 = class080922.y(comparable);
            if (class00507.N.matcher(string2).matches()) continue;
            throw new IllegalArgumentException(String.valueOf(this.N) + " has property: " + string + " with invalidly named value: " + string2);
        }
        if (this.y.containsKey(string)) {
            throw new IllegalArgumentException(String.valueOf(this.N) + " has duplicate property: " + string);
        }
    }

    public class00517<O, S> N(class08092<?> ... class08092Array) {
        for (class08092<?> class080922 : class08092Array) {
            this.N((class08092<T>)((class08092)class080922));
            this.y.put(class080922.R(), class080922);
        }
        return this;
    }
}

