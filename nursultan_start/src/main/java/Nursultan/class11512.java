/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 *  com.google.common.collect.Maps
 */
package Nursultan;

import Nursultan.class11536;
import Nursultan.class12018;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class class11512 {
    public Object E_0;

    public LinkedHashMap<String, class11536<?>> w() {
        return Maps.newLinkedHashMap((Map)((Map)this.E_0));
    }

    public <T extends class11536<?>> T L(String string) {
        return (T)((class11536)((Map)this.E_0).get(string));
    }

    public class11512() {
        this.u();
        this.E_0 = new LinkedHashMap();
    }

    private void u() {
    }

    public class11536<?> N(class11536<?> class115362) {
        if (((Map)this.E_0).containsKey(class115362.P().N())) {
            throw new IllegalArgumentException(String.format("Setting with key %s already registered", class115362.P()));
        }
        ((Map)this.E_0).put(class115362.P().N(), class115362);
        return class115362;
    }

    public abstract class12018 N_7(String var1);
}

