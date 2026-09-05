/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package minecraft;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import minecraft.class01894;
import minecraft.class04203;
import minecraft.class04205;
import minecraft.class04214;

class class04204
implements class04205 {
    final /* synthetic */ Map N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class04204(class04203 class042032, Map map) {
        this.N = map;
    }

    @Override
    public void N(class01894 class018942, class04214 class042142) {
        class04214 class042143 = this.N.put(class018942, class042142);
        if (class042143 != null) {
            class042143.N();
        }
    }

    @Override
    public void N(Predicate<class01894> predicate) {
        Iterator iterator = this.N.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            if (!predicate.test((class01894)entry.getKey())) continue;
            ((class04214)entry.getValue()).N();
            iterator.remove();
        }
    }
}

