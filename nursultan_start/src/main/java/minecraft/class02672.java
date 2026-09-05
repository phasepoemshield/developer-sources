/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02201
 *  minecraft.class02510
 *  minecraft.class04530
 */
package minecraft;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import minecraft.class02201;
import minecraft.class02510;
import minecraft.class04530;

public class class02672 {
    public static final class02672 N = new class02672();
    private final WeakHashMap<class02510, Void> y = new WeakHashMap();

    private class02672() {
    }

    private static List<class04530> N(Map<String, List<class04530>> map) {
        return map.entrySet().stream().map(entry -> {
            String string = (String)entry.getKey();
            List list = (List)entry.getValue();
            return list.size() > 1 ? new class02201(string, list) : (class04530)list.get(0);
        }).collect(Collectors.toList());
    }

    public void N(class02510 class025102) {
        this.y.put(class025102, null);
    }

    public List<class04530> N() {
        return class02672.N(this.y.keySet().stream().flatMap(class025102 -> class025102.at_().stream()).collect(Collectors.groupingBy(class04530::u)));
    }
}

