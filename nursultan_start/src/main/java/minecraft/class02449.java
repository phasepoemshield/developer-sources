/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  minecraft.class00507
 *  minecraft.class00522
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Splitter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import minecraft.class00507;
import minecraft.class00522;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class02449 {
    private static final Splitter N = Splitter.on((char)',');
    private static final Splitter y = Splitter.on((char)'=').limit(2);

    public static <O, S extends class00522<O, S>> Predicate<class00522<O, S>> N(class00507<O, S> class005072, String string) {
        HashMap hashMap = new HashMap();
        for (String string2 : N.split((CharSequence)string)) {
            Iterator var5 = y.split((CharSequence)string2).iterator();
            if (!var5.hasNext()) continue;
            String string3 = (String)var5.next();
            class08092 var7 = class005072.N(string3);
            if (var7 != null && var5.hasNext()) {
                String string4 = (String)var5.next();
                Object t = class02449.N(var7, string4);
                if (t != null) {
                    hashMap.put(var7, t);
                    continue;
                }
                throw new RuntimeException("Unknown value: '" + string4 + "' for blockstate property: '" + string3 + "' " + String.valueOf(var7.N()));
            }
            if (string3.isEmpty()) continue;
            throw new RuntimeException("Unknown blockstate property: '" + string3 + "'");
        }
        return class005222 -> {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (Objects.equals(class005222.L((class08092)entry.getKey()), entry.getValue())) continue;
                return false;
            }
            return true;
        };
    }

    private static <T extends Comparable<T>> @Nullable T N(class08092<T> class080922, String string) {
        return (T)((Comparable)class080922.y(string).orElse(null));
    }
}

