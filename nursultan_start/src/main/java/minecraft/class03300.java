/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00753
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07709
 *  minecraft.class07741
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import minecraft.class00753;
import minecraft.class01894;
import minecraft.class03298;
import minecraft.class04206;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07709;
import minecraft.class07741;
import org.slf4j.Logger;

public final class class03300
extends Record {
    private final List<class04890> pieces;
    private static final Logger y = LogUtils.getLogger();
    private static final class01894 L = class01894.y((String)"jigsaw");
    private static final Map<class01894, class01894> u = ImmutableMap.builder().put((Object)class01894.y((String)"nvi"), (Object)L).put((Object)class01894.y((String)"pcp"), (Object)L).put((Object)class01894.y((String)"bastionremnant"), (Object)L).put((Object)class01894.y((String)"runtime"), (Object)L).build();

    public List<class04890> L() {
        return this.pieces;
    }

    public class03300(List<class04890> list) {
        this.pieces = List.copyOf(list);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03300.class, "pieces", "pieces"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03300.class, "pieces", "pieces"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03300.class, "pieces", "pieces"}, this);
    }

    public class05163 y() {
        return class04890.N(this.pieces.stream());
    }

    public class07709 N(class03298 class032982) {
        class07741 class077412 = new class07741();
        for (class04890 class048902 : this.pieces) {
            class077412.add((Object)class048902.N(class032982));
        }
        return class077412;
    }

    public boolean N() {
        return this.pieces.isEmpty();
    }

    public static class03300 N(class07741 class077412, class03298 class032982) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class077412.size(); ++i) {
            class07001 class070012 = class077412.y(i);
            class01894 class018942 = class01894.N((String)class070012.y("id", "").toLowerCase(Locale.ROOT));
            class01894 class018943 = u.getOrDefault(class018942, class018942);
            class04878 class048782 = (class04878)class04206.p.N(class018943);
            if (class048782 == null) {
                y.error("Unknown structure piece id: {}", (Object)class018943);
                continue;
            }
            try {
                class04890 class048902 = class048782.load(class032982, class070012);
                arrayList.add(class048902);
                continue;
            }
            catch (Exception exception) {
                y.error("Exception loading structure piece with id {}", (Object)class018943, (Object)exception);
            }
        }
        return new class03300(arrayList);
    }

    public boolean N(class07209 class072092) {
        Iterator<class04890> var2 = this.pieces.iterator();
        while (var2.hasNext()) {
            if (!var2.next().L().y((class00753)class072092)) continue;
            return true;
        }
        return false;
    }
}

