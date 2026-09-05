/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00068
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.List;
import minecraft.class00068;
import minecraft.class08338;
import org.jspecify.annotations.Nullable;

public class class08311 {
    private final List<class00068> N = Lists.newArrayList();
    private boolean y;

    public synchronized @Nullable List<class00068> N() {
        if (this.y) {
            List<class00068> list = List.copyOf(this.N);
            this.y = false;
            return list;
        }
        return null;
    }

    public synchronized void N(String string, InetAddress inetAddress) {
        String string2 = class08338.N(string);
        Object object = class08338.y(string);
        if (object == null) {
            return;
        }
        object = inetAddress.getHostAddress() + ":" + (String)object;
        boolean bl = false;
        for (class00068 class000682 : this.N) {
            if (!class000682.y().equals(object)) continue;
            class000682.L();
            bl = true;
            break;
        }
        if (!bl) {
            this.N.add(new class00068(string2, (String)object));
            this.y = true;
        }
    }
}

