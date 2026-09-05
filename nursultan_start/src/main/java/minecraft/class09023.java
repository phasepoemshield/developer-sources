/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class00002
 *  minecraft.class00012
 *  minecraft.class00022
 *  minecraft.class00124
 *  minecraft.class00137
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class02857
 *  minecraft.class09033
 *  minecraft.class09038
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class00002;
import minecraft.class00012;
import minecraft.class00022;
import minecraft.class00124;
import minecraft.class00137;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class02857;
import minecraft.class08996;
import minecraft.class09033;
import minecraft.class09038;

public class class09023 {
    final Map<class01894, class00137> N = Maps.newHashMap();
    private Map<class01894, class01079> y = Map.of();

    protected class09023() {
    }

    public void N(Map<class01894, class00137> map, Map<class01894, class01079> map2, class09038 class090382) {
        map.clear();
        map2.clear();
        map2.putAll(this.y);
        for (Map.Entry<class01894, class00137> entry : this.N.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
            entry.getValue().N(class090382);
        }
    }

    void N(class01894 class018942, class00012 class000122) {
        boolean bl;
        class00137 class001372 = this.N.get(class018942);
        boolean bl2 = bl = class001372 == null;
        if (bl || class000122.y()) {
            if (!bl) {
                class09033.R.debug("Replaced sound event location {}", (Object)class018942);
            }
            class001372 = new class00137(class018942, class000122.L());
            this.N.put(class018942, class001372);
        }
        class02857 class028572 = class02857.N(this.y);
        block4: for (class00002 class000022 : class000122.N()) {
            class01894 class018943 = class000022.N();
            class001372.N((class00124)(switch (class000022.R()) {
                case class00022.field_5474 -> {
                    if (!class09033.N((class00002)class000022, (class01894)class018942, (class02857)class028572)) continue block4;
                    yield class000022;
                }
                case class00022.field_5473 -> new class08996(this, class018943, class000022);
                default -> throw new IllegalStateException("Unknown SoundEventRegistration type: " + String.valueOf(class000022.R()));
            }));
        }
    }

    void N(class01089 class010892) {
        this.y = class00002.N.N(class010892);
    }
}

