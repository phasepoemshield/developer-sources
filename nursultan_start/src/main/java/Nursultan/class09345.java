/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11372
 *  Nursultan.class11472
 *  Nursultan.class11938
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 */
package Nursultan;

import Nursultan.class09295;
import Nursultan.class09309;
import Nursultan.class11372;
import Nursultan.class11472;
import Nursultan.class11938;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import org.joml.Vector3d;
import org.joml.Vector3dc;

public class class09345 {
    public Object N_0;
    public Object N_1;

    public void L() {
        if (((Map)this.N_0).isEmpty() && ((Set)this.N_1).isEmpty()) {
            return;
        }
        ((Map)this.N_0).clear();
        ((Set)this.N_1).clear();
        class11938.L().L((Object)class11372.N());
    }

    public class09345() {
        this.B();
        this.N_0 = new LinkedHashMap();
        this.N_1 = new LinkedHashSet();
    }

    private void B() {
    }

    public Collection<class09295> i() {
        return Collections.unmodifiableCollection(((Map)this.N_0).values());
    }

    public boolean u() {
        return ((Map)this.N_0).isEmpty();
    }

    public boolean y(String string) {
        class09295 class092952 = (class09295)((Object)((Map)this.N_0).get(string));
        return class092952 != null && !class092952.y().equals(((class11472)class11938.L_2).Z());
    }

    public Stream<String> y() {
        return ((Map)this.N_0).keySet().stream();
    }

    public void N(String string, String string2, double d, double d2, double d3) {
        for (class09309 class093092 : (Set)this.N_1) {
            if (!((String)class093092.N_0).equals(string)) continue;
            ((Vector3d)class093092.N_3).set((Vector3dc)((Vector3d)class093092.N_4));
            ((Vector3d)class093092.N_4).set(d, d2, d3);
            class093092.N(System.currentTimeMillis());
            return;
        }
        ((Set)this.N_1).add(new class09309(string, string2, new Vector3d(d, d2, d3)));
    }

    public void N(long l, long l2) {
        ((Set)this.N_1).removeIf(class093092 -> l2 - (Long)class093092.N_2 > l);
    }

    public void N(class09295[] class09295Array) {
        if (class09295Array.length == 0) {
            this.L();
            return;
        }
        ((Map)this.N_0).clear();
        ((Set)this.N_1).clear();
        for (class09295 class092952 : class09295Array) {
            ((Map)this.N_0).put(class092952.N(), class092952);
        }
        class11938.L().L((Object)class11372.N((class09295[])class09295Array));
    }

    public Collection<class09309> N() {
        return Collections.unmodifiableCollection((Set)this.N_1);
    }

    public boolean N(String string) {
        return ((Map)this.N_0).containsKey(string);
    }
}

