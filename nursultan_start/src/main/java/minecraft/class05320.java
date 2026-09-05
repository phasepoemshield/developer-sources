/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class07433
 *  minecraft.class07468
 *  minecraft.class07469
 *  minecraft.class07471
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.Multimap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class05308;
import minecraft.class07433;
import minecraft.class07468;
import minecraft.class07469;
import minecraft.class07471;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05320 {
    private final Map<class03556<class07468>, class07469> N = new Object2ObjectOpenHashMap();
    private Set<class07469> y = new ObjectOpenHashSet();
    private Set<class07469> L = new ObjectOpenHashSet();
    private final class05308 u;

    public void L(class05320 class053202) {
        class053202.N.values().forEach(class074692 -> {
            class07469 class074693 = this.N((class03556<class07468>)class074692.N());
            if (class074693 != null) {
                class074693.N((Collection)class074692.u());
            }
        });
    }

    public double L(class03556<class07468> class035562) {
        class07469 class074692 = this.N.get(class035562);
        return class074692 != null ? class074692.M() : this.u.N(class035562);
    }

    public Collection<class07469> L() {
        return this.N.values().stream().filter(class074692 -> ((class07468)class074692.N().N()).y()).collect(Collectors.toList());
    }

    public class05320(class05308 class053082) {
        this.u = class053082;
        this.N(class053082, null);
    }

    public boolean i(class03556<class07468> class035562) {
        if (!this.u.L(class035562)) {
            return false;
        }
        class07469 class074692 = this.N.get(class035562);
        if (class074692 != null) {
            class074692.N(this.u.y(class035562));
        }
        return true;
    }

    public double u(class03556<class07468> class035562) {
        class07469 class074692 = this.N.get(class035562);
        return class074692 != null ? class074692.y() : this.u.y(class035562);
    }

    public List<class07433> u() {
        ArrayList<class07433> arrayList = new ArrayList<class07433>(this.N.values().size());
        for (class07469 class074692 : this.N.values()) {
            arrayList.add(class074692.B());
        }
        return arrayList;
    }

    public void y(Multimap<class03556<class07468>, class07471> multimap) {
        multimap.asMap().forEach((class035562, collection) -> {
            class07469 class074692 = this.N.get(class035562);
            if (class074692 != null) {
                collection.forEach(class074712 -> class074692.L(class074712.N()));
            }
        });
    }

    public void y(class05320 class053202) {
        class053202.N.values().forEach(class074692 -> {
            class07469 class074693 = this.N((class03556<class07468>)class074692.N());
            if (class074693 != null) {
                class074693.N(class074692.y());
            }
        });
    }

    public boolean y(class03556<class07468> class035562) {
        return this.N.get(class035562) != null || this.u.L(class035562);
    }

    public double y(class03556<class07468> class035562, class01894 class018942) {
        class07469 class074692 = this.N.get(class035562);
        return class074692 != null ? class074692.N(class018942).y() : this.u.N(class035562, class018942);
    }

    public Set<class07469> y() {
        return this.L;
    }

    public Set<class07469> N() {
        return this.y;
    }

    private void N(class07469 class074692) {
        this.L.add(class074692);
        if (((class07468)class074692.N().N()).y()) {
            this.y.add(class074692);
        }
    }

    private void N(class05308 class053082, CallbackInfo callbackInfo) {
        this.L = new ReferenceOpenHashSet(0);
        this.y = new ReferenceOpenHashSet(0);
    }

    public boolean N(class03556<class07468> class035562, class01894 class018942) {
        class07469 class074692 = this.N.get(class035562);
        return class074692 != null ? class074692.N(class018942) != null : this.u.y(class035562, class018942);
    }

    public void N(Multimap<class03556<class07468>, class07471> multimap) {
        multimap.forEach((class035562, class074712) -> {
            class07469 class074692 = this.N((class03556<class07468>)class035562);
            if (class074692 != null) {
                class074692.L(class074712.N());
                class074692.y(class074712);
            }
        });
    }

    public void N(List<class07433> list) {
        for (class07433 class074332 : list) {
            class07469 class074692 = this.N((class03556<class07468>)class074332.N());
            if (class074692 == null) continue;
            class074692.N(class074332);
        }
    }

    public @Nullable class07469 N(class03556<class07468> class035563) {
        return this.N.computeIfAbsent(class035563, class035562 -> this.u.N(this::N, (class03556<class07468>)class035562));
    }

    public void N(class05320 class053202) {
        class053202.N.values().forEach(class074692 -> {
            class07469 class074693 = this.N((class03556<class07468>)class074692.N());
            if (class074693 != null) {
                class074693.N(class074692);
            }
        });
    }
}

