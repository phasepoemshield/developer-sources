/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  Nursultan.class11364
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class11364;
import Nursultan.class11938;
import Nursultan.class11997;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class class11992 {
    public Object N_0;

    public List<class11997> L() {
        return List.copyOf(((Map)this.N_0).values());
    }

    public Optional<class11997> L(String string) {
        return Optional.ofNullable((class11997)((Object)((Map)this.N_0).get(string)));
    }

    public class11992() {
        this.R();
        this.N_0 = new LinkedHashMap();
    }

    public boolean y(String string) {
        return ((Map)this.N_0).containsKey(string);
    }

    public void y() {
        if (((Map)this.N_0).isEmpty()) {
            return;
        }
        ((Map)this.N_0).clear();
        class11938.L().L((Object)class11364.N((class09378)class09378.MACROS));
    }

    public boolean N(String string, String string2, int n) {
        if (((Map)this.N_0).containsKey(string)) {
            return false;
        }
        ((Map)this.N_0).put(string, new class11997(string, string2, n));
        class11938.L().L((Object)class11364.N((class09378)class09378.MACROS));
        return true;
    }

    public Stream<String> N() {
        return ((Map)this.N_0).keySet().stream();
    }

    public List<class11997> N(int n) {
        return ((Map)this.N_0).values().stream().filter(class119972 -> class119972.N() == n).toList();
    }

    public boolean N(String string) {
        boolean bl;
        boolean bl2 = bl = ((Map)this.N_0).remove(string) != null;
        if (bl) {
            class11938.L().L((Object)class11364.N((class09378)class09378.MACROS));
        }
        return bl;
    }

    private void R() {
    }
}

