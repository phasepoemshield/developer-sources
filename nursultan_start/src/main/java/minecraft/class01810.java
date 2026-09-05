/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class01296
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07709
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class01296;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07709;
import org.jspecify.annotations.Nullable;

class class01810 {
    public static final class02362<class04247, class01810> N = class02362.N_34(class01810::N, class01810::new);
    public static final class02362<class04247, List<class01810>> y = N.N_33(class02389.N());
    final int L;
    final int u;
    final class00404<?> i;
    final @Nullable class07001 R;

    private class01810(int n, int n2, class00404<?> class004042, @Nullable class07001 class070012) {
        this.L = n;
        this.u = n2;
        this.i = class004042;
        this.R = class070012;
    }

    private class01810(class04247 class042472) {
        this.L = class042472.readByte();
        this.u = class042472.readShort();
        this.i = (class00404)class02389.N((class05946)class04227.i).decode((Object)class042472);
        this.R = class042472.P();
    }

    static class01810 N(class00394 class003942) {
        class07001 class070012 = class003942.N((class01929)class003942.G().method_30349());
        class07209 class072092 = class003942.d();
        int n = class01296.y((int)class072092.method_10263()) << 4 | class01296.y((int)class072092.method_10260());
        return new class01810(n, class072092.method_10264(), class003942.O(), class070012.z() ? null : class070012);
    }

    private void N(class04247 class042472) {
        class042472.writeByte(this.L);
        class042472.writeShort(this.u);
        class02389.N((class05946)class04227.i).encode((Object)class042472, this.i);
        class042472.N((class07709)this.R);
    }
}

