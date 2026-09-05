/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11651
 *  Nursultan.class11652
 *  Nursultan.class11654
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMaps
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class05913
 *  minecraft.class08512
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class11651;
import Nursultan.class11652;
import Nursultan.class11654;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import minecraft.class05913;
import minecraft.class08512;
import minecraft.class08814;
import minecraft.class08838;
import org.slf4j.Logger;

public class class08812 {
    private static final Logger N = LogUtils.getLogger();
    private final List<class08814> y = new ArrayList<class08814>();

    public class08812 y(class08814 class088142) {
        this.y.addFirst((Object)class088142);
        return this;
    }

    public class08838 N(class08512 class085122) {
        if (this.y.isEmpty()) {
            return class08838.N;
        }
        Object2ObjectArrayMap object2ObjectArrayMap = new Object2ObjectArrayMap();
        Object2ObjectArrayMap object2ObjectArrayMap2 = new Object2ObjectArrayMap();
        for (class08814 class088142 : Lists.reverse(this.y)) {
            class088142.N().forEach((arg_0, arg_1) -> class08812.N((Object2ObjectMap)object2ObjectArrayMap2, (Object2ObjectMap)object2ObjectArrayMap, arg_0, arg_1));
        }
        if (object2ObjectArrayMap2.isEmpty()) {
            return new class08838((Map<String, class05913>)object2ObjectArrayMap);
        }
        boolean bl = true;
        while (bl) {
            class08814 class088142;
            bl = false;
            class088142 = Object2ObjectMaps.fastIterator((Object2ObjectMap)object2ObjectArrayMap2);
            while (class088142.hasNext()) {
                Object2ObjectMap.Entry entry2 = (Object2ObjectMap.Entry)class088142.next();
                class05913 class059132 = (class05913)object2ObjectArrayMap.get((Object)((class11654)entry2.getValue()).N());
                if (class059132 == null) continue;
                object2ObjectArrayMap.put((Object)((String)entry2.getKey()), (Object)class059132);
                class088142.remove();
                bl = true;
            }
        }
        if (!object2ObjectArrayMap2.isEmpty()) {
            N.warn("Unresolved texture references in {}:\n{}", (Object)class085122.L(), (Object)object2ObjectArrayMap2.entrySet().stream().map(entry -> "\t#" + (String)entry.getKey() + "-> #" + ((class11654)entry.getValue()).N() + "\n").collect(Collectors.joining()));
        }
        return new class08838((Map<String, class05913>)object2ObjectArrayMap);
    }

    private static /* synthetic */ void N(Object2ObjectMap object2ObjectMap, Object2ObjectMap object2ObjectMap2, String string, class11652 class116522) {
        class11652 class116523 = class116522;
        Objects.requireNonNull(class116523);
        class11652 class116524 = class116523;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11651.class, class11654.class}, (Object)class116524, (int)n)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                class11651 class116512 = (class11651)class116524;
                object2ObjectMap.remove((Object)string);
                object2ObjectMap2.put((Object)string, (Object)class116512.N());
                break;
            }
            case 1: {
                class11654 class116542 = (class11654)class116524;
                object2ObjectMap2.remove((Object)string);
                object2ObjectMap.put((Object)string, (Object)class116542);
            }
        }
    }

    public class08812 N(class08814 class088142) {
        this.y.addLast((Object)class088142);
        return this;
    }
}

