/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02477
 *  minecraft.class02523
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07085
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02477;
import minecraft.class02523;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07085;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class02932
extends class06937 {
    private final class07438 N;
    private final class07085 y;
    private final @Nullable class01894 M;

    public @Nullable class01894 L() {
        return this.M;
    }

    public class02932(class06695 class066952, class07438 class074382, class07085 class070852, int n, int n2, int n3, @Nullable class01894 class018942) {
        super(class066952, n, n2, n3);
        this.N = class074382;
        this.y = class070852;
        this.M = class018942;
    }

    public int y() {
        return 1;
    }

    public boolean N(class06584 class065842) {
        return this.N.method_63623(class065842, this.y);
    }

    public boolean N(class08036 class080362) {
        class06584 class065842 = this.i();
        if (!class065842.R() && !class080362.method_68878() && class07323.N((class06584)class065842, (class02477)class02523.I)) {
            return false;
        }
        return super.N(class080362);
    }

    public boolean N() {
        return this.N.method_56991(this.y);
    }

    public void N(class06584 class065842, class06584 class065843) {
        this.N.method_6116(this.y, class065843, class065842);
        super.N(class065842, class065843);
    }
}

