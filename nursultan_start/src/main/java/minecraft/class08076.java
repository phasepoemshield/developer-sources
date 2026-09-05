/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class00751
 *  minecraft.class01662
 *  minecraft.class02362
 *  minecraft.class02885
 *  minecraft.class02897
 *  minecraft.class03516
 *  minecraft.class05946
 */
package minecraft;

import java.util.Map;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class00751;
import minecraft.class01662;
import minecraft.class02362;
import minecraft.class02885;
import minecraft.class02897;
import minecraft.class03516;
import minecraft.class05946;

public class class08076
implements class00381<class01662> {
    public static final class02362<class00667, class08076> N = class00381.N(class08076::N, class08076::new);
    private final Map<class05946<? extends class00751<?>>, class03516> y;

    public class08076(Map<class05946<? extends class00751<?>>, class03516> map) {
        this.y = map;
    }

    private class08076(class00667 class006672) {
        this.y = class006672.N_17(class00667::b, class03516::y);
    }

    public Map<class05946<? extends class00751<?>>, class03516> N() {
        return this.y;
    }

    private void N(class00667 class006673) {
        class006673.N(this.y, class00667::y, (class006672, class035162) -> class035162.N(class006672));
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    public class02897<class08076> method_65080() {
        return class02885.W;
    }
}

