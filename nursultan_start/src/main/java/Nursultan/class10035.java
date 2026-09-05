/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class10026;
import Nursultan.class10060;
import java.util.LinkedHashMap;
import java.util.Map;

class class10035
extends LinkedHashMap<Integer, class10026> {
    final /* synthetic */ class10060 N;

    class10035(class10060 class100602, int n, float f, boolean bl) {
        this.N = class100602;
        super(n, f, bl);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, class10026> entry) {
        return this.size() > 8;
    }
}

