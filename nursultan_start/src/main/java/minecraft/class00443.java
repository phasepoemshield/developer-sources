/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02796
 *  minecraft.class05623
 *  minecraft.class06839
 *  minecraft.class07305
 *  minecraft.class07380
 *  minecraft.class07403
 *  minecraft.class07423
 *  minecraft.class07932
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class02796;
import minecraft.class05623;
import minecraft.class06839;
import minecraft.class07305;
import minecraft.class07380;
import minecraft.class07403;
import minecraft.class07423;
import minecraft.class07932;

public class class00443
implements class07380 {
    private final class05623 N;
    private final class07305 y;
    private final class07932 L;

    public class00443(class05623 class056232, class07932 class079322) {
        this.N = class056232;
        this.y = class056232.yn().m();
        this.L = class079322;
    }

    public <T> T N(class06839<T> class068392) {
        return (T)this.y.N(class068392);
    }

    public Stream<class06839<?>> N() {
        return this.y.N();
    }

    public <T> class07423<T> N(class06839<T> class068392, T t) {
        return new class07423(class068392, t);
    }

    public <T> class07423<T> N(class07423<T> class074232, class07403 class074032) {
        class06839 class068392 = class074232.N();
        Object object = this.y.N(class068392);
        Object object2 = class074232.y();
        this.y.N(class068392, object2, (class02796)this.N);
        this.L.N(class074032, "Game rule '{}' updated from '{}' to '{}'", new Object[]{class068392.N(), class068392.N(object), class068392.N(object2)});
        return class074232;
    }
}

