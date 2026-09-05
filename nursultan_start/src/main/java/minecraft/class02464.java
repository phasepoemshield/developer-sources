/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 *  minecraft.class04247
 */
package minecraft;

import minecraft.class02362;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class04247;

class class02464
implements class02362<class04247, class02480<?>> {
    class02464() {
    }

    private static <T> void y(class04247 class042472, class02480<T> class024802) {
        class02477.y.encode((Object)class042472, class024802.N());
        class024802.N().R().encode((Object)class042472, class024802.y());
    }

    public void encode(class04247 class042472, class02480<?> class024802) {
        class02464.y(class042472, class024802);
    }

    private static <T> class02480<T> N(class04247 class042472, class02477<T> class024772) {
        return new class02480<Object>(class024772, class024772.R().decode((Object)class042472));
    }

    public class02480<?> decode(class04247 class042472) {
        class02477 var2 = (class02477)class02477.y.decode((Object)class042472);
        return class02464.N(class042472, var2);
    }
}

