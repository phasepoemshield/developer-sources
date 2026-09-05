/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class10021;
import Nursultan.class10054;
import Nursultan.class10060;
import java.util.LinkedHashMap;
import java.util.Map;

class class10031
extends LinkedHashMap<class10021, class10060> {
    final /* synthetic */ class10054 N;

    class10031(class10054 class100542, int n, float f, boolean bl) {
        this.N = class100542;
        super(n, f, bl);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<class10021, class10060> entry) {
        return this.size() > 8192;
    }
}

