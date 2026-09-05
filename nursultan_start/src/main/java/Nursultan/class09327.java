/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11353
 *  Nursultan.class11364
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class09332;
import Nursultan.class09378;
import Nursultan.class11353;
import Nursultan.class11364;
import Nursultan.class11938;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class class09327 {
    public Object N_0;

    public boolean L(String string) {
        return ((Map)this.N_0).containsKey(string);
    }

    public Stream<String> L() {
        return ((Map)this.N_0).keySet().stream();
    }

    public class09327() {
        this.i();
        this.N_0 = new LinkedHashMap();
    }

    private void i() {
    }

    public List<class09332> y() {
        return List.copyOf(((Map)this.N_0).values());
    }

    public boolean y(String string) {
        class09332 class093322 = (class09332)((Object)((Map)this.N_0).remove(string));
        if (class093322 == null) {
            return false;
        }
        class11938.L().L((Object)class11353.y((class09332)class093322));
        class11938.L().L((Object)class11364.N((class09378)class09378.FRIENDS));
        return true;
    }

    public Optional<class09332> N(String string) {
        return Optional.ofNullable((class09332)((Object)((Map)this.N_0).get(string)));
    }

    public boolean N(String string, long l) {
        if (((Map)this.N_0).containsKey(string)) {
            return false;
        }
        class09332 class093322 = new class09332(string, l);
        ((Map)this.N_0).put(string, class093322);
        class11938.L().L((Object)class11353.N((class09332)class093322));
        class11938.L().L((Object)class11364.N((class09378)class09378.FRIENDS));
        return true;
    }

    public void N() {
        if (((Map)this.N_0).isEmpty()) {
            return;
        }
        ((Map)this.N_0).clear();
        class11938.L().L((Object)class11353.L());
        class11938.L().L((Object)class11364.N((class09378)class09378.FRIENDS));
    }
}

