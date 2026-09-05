/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class01089
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class05660
 *  minecraft.class05666
 *  minecraft.class05672
 *  minecraft.class05946
 *  minecraft.class06078
 *  minecraft.class06264
 *  minecraft.class07536
 *  minecraft.class08246
 *  minecraft.class08476
 *  minecraft.class08923
 */
package minecraft;

import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import minecraft.class01089;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class05660;
import minecraft.class05666;
import minecraft.class05672;
import minecraft.class05946;
import minecraft.class06078;
import minecraft.class06202;
import minecraft.class06243;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06264;
import minecraft.class07536;
import minecraft.class08246;
import minecraft.class08476;
import minecraft.class08923;

public class class06247<S extends class08476, M extends class06078<S>>
extends class06249<S, M> {
    private static final Int2ObjectMap<class01894> N = (Int2ObjectMap)class07536.N((Object)new Int2ObjectOpenHashMap(), int2ObjectOpenHashMap -> {
        int2ObjectOpenHashMap.put(1, (Object)class01894.y((String)"stone"));
        int2ObjectOpenHashMap.put(2, (Object)class01894.y((String)"iron"));
        int2ObjectOpenHashMap.put(3, (Object)class01894.y((String)"gold"));
        int2ObjectOpenHashMap.put(4, (Object)class01894.y((String)"emerald"));
        int2ObjectOpenHashMap.put(5, (Object)class01894.y((String)"diamond"));
    });
    private final Object2ObjectMap<class05946<class05660>, class06243> y = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<class05946<class05672>, class06243> L = new Object2ObjectOpenHashMap();
    private final class01089 u;
    private final String i;
    private final M R;
    private final M M;

    public class06247(class06252<S, M> class062522, class01089 class010892, String string, M m, M m2) {
        super(class062522);
        this.u = class010892;
        this.i = string;
        this.R = m;
        this.M = m2;
    }

    private class03556 N(class05666 class056662) {
        if (((Boolean)VisualSettings.INSTANCE.hideVillagerProfession.getValue()).booleanValue()) {
            return class06202.Nq().NE().j().i(class05672.y);
        }
        return class056662.y();
    }

    @Override
    public void N(class01421 class014212, class01237 class012372, int n, S s, float f, float f2) {
        if (((class08476)s).v) {
            return;
        }
        class05666 class056662 = ((class08246)s).N();
        if (class056662 == null) {
            return;
        }
        class03556 var8 = class056662.N();
        class05666 class056663 = class056662;
        class03556 class035562 = this.N(class056663);
        class06243 class062432 = this.N(this.y, "type", var8);
        class06243 class062433 = this.N(this.L, "profession", class035562);
        Object m = this.u();
        class01894 class018942 = this.N("type", var8);
        boolean bl = class062433 == class06243.field_17160 || class062433 == class06243.field_17161 && class062432 != class06243.field_17162;
        M m2 = ((class08476)s).NB ? this.M : this.R;
        class06247.y(bl ? m : m2, class018942, class014212, class012372, n, s, -1, 1);
        if (!class035562.N(class05672.y) && !((class08476)s).NB) {
            class01894 class018943 = this.N("profession", class035562);
            class06247.y(m, class018943, class014212, class012372, n, s, -1, 2);
            if (!class035562.N(class05672.W)) {
                class01894 class018944 = this.N("profession_level", (class01894)N.get(class04995.N((int)class056662.L(), (int)1, (int)N.size())));
                class06247.y(m, class018944, class014212, class012372, n, s, -1, 3);
            }
        }
    }

    private class01894 N(String string, class01894 class018942) {
        return class018942.N(string2 -> "textures/entity/" + this.i + "/" + string + "/" + string2 + ".png");
    }

    private class01894 N(String string, class03556<?> class035562) {
        return class035562.i().map(class059462 -> this.N(string, class059462.N())).orElse(class08923.L());
    }

    public <K> class06243 N(Object2ObjectMap<class05946<K>, class06243> object2ObjectMap, String string, class03556<K> class035562) {
        class05946 class059462 = class035562.i().orElse(null);
        if (class059462 == null) {
            return class06243.field_17160;
        }
        return (class06243)((Object)object2ObjectMap.computeIfAbsent((Object)class059462, object -> this.u.method_14486(this.N(string, class059462.N())).flatMap(class010792 -> {
            try {
                return class010792.method_14481().N(class06264.y).map(class06264::N);
            }
            catch (IOException iOException) {
                return Optional.empty();
            }
        }).orElse(class06243.field_17160)));
    }
}

