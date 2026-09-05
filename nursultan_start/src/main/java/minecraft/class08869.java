/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02006
 *  minecraft.class02012
 *  minecraft.class02028
 *  minecraft.class02601
 *  minecraft.class08529
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02006;
import minecraft.class02012;
import minecraft.class02028;
import minecraft.class02601;
import minecraft.class08529;
import minecraft.class08877;

class class08869
implements class02028 {
    final /* synthetic */ class02601 N;
    final /* synthetic */ class02012 y;

    public class02012 L() {
        return this.y;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class08869(class02601 class026012, class02012 class020122) {
        this.N = class026012;
        this.y = class020122;
    }

    public class02601 y() {
        return this.N;
    }

    public <T> T N(class02006<T> class020062) {
        return (T)class020062.y((class02028)this);
    }

    public class08877 N() {
        throw new IllegalStateException();
    }

    public class08529 N(class01894 class018942) {
        throw new IllegalStateException("Missing model can't have dependencies, but asked for " + String.valueOf(class018942));
    }
}

