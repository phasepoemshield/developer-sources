/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00500
 *  minecraft.class01587
 *  minecraft.class02572
 *  minecraft.class06898
 */
package minecraft;

import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import minecraft.class00500;
import minecraft.class01587;
import minecraft.class02572;
import minecraft.class06898;
import minecraft.class08281;

public class class08279 {
    static final int N = -1;
    private static final int y = 0;

    private static /* synthetic */ void N(Object2IntMap object2IntMap, int n, class00500 class005002) {
        object2IntMap.put((Object)class005002, n);
    }

    public static Object2IntMap<class00500> N(class01587 class015872, class02572 class025722) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        class025722.N().forEach((class005002, class088892) -> {
            List list = hashMap.computeIfAbsent(class005002.i(), class008912 -> List.copyOf(class015872.N(class008912)));
            class08281 class082813 = class08281.N(class005002, class088892, list);
            hashMap2.computeIfAbsent(class082813, class082812 -> Sets.newIdentityHashSet()).add(class005002);
        });
        int n = 1;
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        object2IntOpenHashMap.defaultReturnValue(-1);
        for (Set set : hashMap2.values()) {
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                class00500 class005003 = (class00500)iterator.next();
                if (class005003.b() == class06898.field_11458) continue;
                iterator.remove();
                object2IntOpenHashMap.put((Object)class005003, 0);
            }
            if (set.size() <= 1) continue;
            int n2 = n++;
            set.forEach(arg_0 -> class08279.N((Object2IntMap)object2IntOpenHashMap, n2, arg_0));
        }
        return object2IntOpenHashMap;
    }
}

