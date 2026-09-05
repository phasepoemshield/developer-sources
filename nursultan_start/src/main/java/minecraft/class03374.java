/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03401
 *  minecraft.class03416
 */
package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class03377;
import minecraft.class03401;
import minecraft.class03416;

public class class03374 {
    private final List<class03401<?>> y = new ArrayList();
    final /* synthetic */ class03377 N;

    public void L() {
        Iterator<class03401<?>> var1 = this.y.iterator();
        while (var1.hasNext()) {
            var1.next().L();
        }
    }

    public class03374(class03377 class033772) {
        this.N = class033772;
    }

    public void y() {
        Iterator<class03401<?>> var1 = this.y.iterator();
        while (var1.hasNext()) {
            var1.next().N(this.N.u.get(this.N.L));
        }
    }

    public <T> void N(class03416<T> class034162, Consumer<T> consumer) {
        class03401 class034012 = new class03401(this.N, class034162, consumer);
        this.y.add(class034012);
        class034012.N();
    }

    public void N() {
        Iterator<class03401<?>> var1 = this.y.iterator();
        while (var1.hasNext()) {
            var1.next().y();
        }
    }
}

