/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11728;
import Nursultan.class11749;
import Nursultan.class11768;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class class11775
extends LinkedHashMap<class11768, List<class11728>> {
    public Object N_0;

    public class11775(class11749 class117492, int n, float f, boolean bl) {
        super(n, f, bl);
        this.N();
        this.N_0 = class117492;
    }

    private void N() {
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<class11768, List<class11728>> entry) {
        return this.size() > 512;
    }
}

