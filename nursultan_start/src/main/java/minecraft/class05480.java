/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class01683
 *  minecraft.class03047
 *  minecraft.class03407
 *  minecraft.class03412
 *  minecraft.class03458
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06318
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01683;
import minecraft.class03047;
import minecraft.class03407;
import minecraft.class03412;
import minecraft.class03458;
import minecraft.class04453;
import minecraft.class05451;
import minecraft.class05470;
import minecraft.class05472;
import minecraft.class06202;
import minecraft.class06318;
import org.jspecify.annotations.Nullable;

public class class05480
extends class06318<class05472> {
    private final class05470 N;
    private final List<class05472> y = Lists.newArrayList();
    private @Nullable String L;

    public void L() {
        this.y.forEach(class054722 -> class054722.N(this.field_22740.R()));
    }

    public class05480(class05470 class054702, class06202 class062022, int n, int n2, int n3, int n4) {
        super(class062022, n, n2, n3, n4);
        this.N = class054702;
    }

    private void i() {
        if (this.L != null) {
            this.y.removeIf(class054722 -> !class054722.N().toLowerCase(Locale.ROOT).contains(this.L));
            this.method_25314(this.y);
        }
    }

    private void u() {
        this.y.sort(Comparator.comparing(class054722 -> {
            if (this.field_22740.y(class054722.y())) {
                return 0;
            }
            if (this.field_22740.R().N(class054722.y())) {
                return 1;
            }
            if (class054722.y().version() == 2) {
                return 4;
            }
            if (class054722.i()) {
                return 2;
            }
            return 3;
        }).thenComparing(class054722 -> {
            int n;
            if (!class054722.N().isBlank() && ((n = class054722.N().codePointAt(0)) == 95 || n >= 97 && n <= 122 || n >= 65 && n <= 90 || n >= 48 && n <= 57)) {
                return 0;
            }
            return 1;
        }).thenComparing(class05472::N, String::compareToIgnoreCase));
    }

    public boolean y() {
        return this.y.isEmpty();
    }

    public void N(UUID uUID) {
        for (class05472 class054722 : this.y) {
            if (!class054722.y().equals(uUID)) continue;
            class054722.N(true);
            return;
        }
    }

    public void N(class03458 class034582, class05451 class054512) {
        UUID uUID = class034582.N().id();
        for (class05472 class054722 : this.y) {
            if (!class054722.y().equals(uUID)) continue;
            class054722.N(false);
            return;
        }
        if ((class054512 == class05451.field_26890 || this.field_22740.yv().L(uUID)) && (Strings.isNullOrEmpty((String)this.L) || class034582.N().name().toLowerCase(Locale.ROOT).contains(this.L))) {
            class05472 class054722;
            boolean bl = class034582.u();
            class054722 = new class05472(this.field_22740, this.N, class034582.N().id(), class034582.N().name(), () -> ((class03458)class034582).M(), bl);
            this.method_25321((class01202)class054722);
            this.y.add(class054722);
        }
    }

    public void N(Collection<UUID> collection, double d, boolean bl) {
        HashMap<UUID, class05472> hashMap = new HashMap<UUID, class05472>();
        this.N(collection, hashMap);
        if (bl) {
            this.N(hashMap);
        }
        this.N(hashMap, bl);
        this.N(hashMap.values(), d);
    }

    private static Map<UUID, GameProfile> N(class03407 class034072) {
        Object2ObjectLinkedOpenHashMap object2ObjectLinkedOpenHashMap = new Object2ObjectLinkedOpenHashMap();
        for (int i = class034072.y(); i >= class034072.N(); --i) {
            class03412 class034122;
            class03047 class030472 = class034072.y(i);
            if (!(class030472 instanceof class03412) || !(class034122 = (class03412)class030472).M().Z()) continue;
            object2ObjectLinkedOpenHashMap.put(class034122.u(), class034122.R());
        }
        return object2ObjectLinkedOpenHashMap;
    }

    private void N(Collection<UUID> collection, Map<UUID, class05472> map) {
        class01683 class016832 = (class01683)((class04453)this.field_22740.T_4).y_0;
        for (UUID uUID : collection) {
            class03458 class034582 = class016832.N(uUID);
            if (class034582 == null) continue;
            class05472 class054722 = this.N(uUID, class034582);
            map.put(uUID, class054722);
        }
    }

    private void N(Map<UUID, class05472> map, boolean bl) {
        class05480.N(this.field_22740.R().y()).forEach((uUID2, gameProfile) -> {
            class05472 class054722;
            if (bl) {
                class054722 = map.computeIfAbsent((UUID)uUID2, uUID -> {
                    class05472 class054722 = new class05472(this.field_22740, this.N, gameProfile.id(), gameProfile.name(), this.field_22740.yP().N(gameProfile, true), true);
                    class054722.N(true);
                    return class054722;
                });
            } else {
                class054722 = (class05472)((Object)((Object)map.get(uUID2)));
                if (class054722 == null) {
                    return;
                }
            }
            class054722.y(true);
        });
    }

    private class05472 N(UUID uUID, class03458 class034582) {
        return new class05472(this.field_22740, this.N, uUID, class034582.N().name(), () -> ((class03458)class034582).M(), class034582.u());
    }

    private void N(Map<UUID, class05472> map) {
        for (Map.Entry entry : ((class01683)((class04453)this.field_22740.T_4).y_0).U().entrySet()) {
            map.computeIfAbsent((UUID)entry.getKey(), uUID -> {
                class05472 class054722 = this.N((UUID)uUID, (class03458)entry.getValue());
                class054722.N(true);
                return class054722;
            });
        }
    }

    private void N(Collection<class05472> collection, double d) {
        this.y.clear();
        this.y.addAll(collection);
        this.u();
        this.i();
        this.method_25314(this.y);
        this.method_44382(d);
    }

    public void N(String string) {
        this.L = string;
    }

    protected void method_49603(class01054 class010542) {
        class010542.L(this.method_46426(), this.method_46427() + 4, this.method_55442(), this.method_55443());
    }

    protected void method_57715(class01054 class010542) {
    }

    protected void method_57713(class01054 class010542) {
    }
}

