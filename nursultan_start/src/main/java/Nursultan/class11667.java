/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09173
 */
package Nursultan;

import Nursultan.class09173;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class class11667 {
    public Object N_0;

    public class11667() {
        this.u();
        this.N_0 = new LinkedHashMap();
    }

    private void u() {
    }

    public Collection<class09173> N() {
        return ((Map)this.N_0).values();
    }

    public Optional<class09173> N(String string) {
        return Optional.ofNullable((class09173)((Map)this.N_0).get(string));
    }

    public void N(class09173 class091732) {
        if (class091732.L() != null) {
            ((Map)this.N_0).put(class091732.L(), class091732);
        }
    }
}

