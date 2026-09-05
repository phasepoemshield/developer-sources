/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;

class class04642 {
    long N;
    long y;
    final Map<String, class04642> L = Maps.newHashMap();

    class04642() {
    }

    public void N(Iterator<String> iterator, long l) {
        this.y += l;
        if (!iterator.hasNext()) {
            this.N += l;
        } else {
            this.L.computeIfAbsent(iterator.next(), string -> new class04642()).N(iterator, l);
        }
    }
}

