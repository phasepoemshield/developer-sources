/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11651
 *  Nursultan.class11652
 *  Nursultan.class11654
 *  minecraft.class05913
 */
package minecraft;

import Nursultan.class11651;
import Nursultan.class11652;
import Nursultan.class11654;
import java.util.HashMap;
import java.util.Map;
import minecraft.class05913;
import minecraft.class08814;

public class class08823 {
    private final Map<String, class11652> N = new HashMap<String, class11652>();

    public class08814 N() {
        if (this.N.isEmpty()) {
            return class08814.y;
        }
        return new class08814(Map.copyOf(this.N));
    }

    public class08823 N(String string, class05913 class059132) {
        this.N.put(string, (class11652)new class11651(class059132));
        return this;
    }

    public class08823 N(String string, String string2) {
        this.N.put(string, (class11652)new class11654(string2));
        return this;
    }
}

