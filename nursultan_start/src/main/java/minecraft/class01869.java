/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class02243
 *  minecraft.class03556
 *  minecraft.class05096
 *  minecraft.class07709
 *  minecraft.class08781
 *  minecraft.class09036
 *  minecraft.class09037
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01866;
import minecraft.class01894;
import minecraft.class02243;
import minecraft.class03556;
import minecraft.class05096;
import minecraft.class07709;
import minecraft.class08781;
import minecraft.class09036;
import minecraft.class09037;
import org.jspecify.annotations.Nullable;

public abstract class class01869
implements class08781 {
    public final /* synthetic */ class01866 y;

    protected class01869(class01866 class018662) {
        this.y = class018662;
    }

    public class02243 N() {
        return this.y.o();
    }

    public void N(class01894 class018942, Optional<class07709> optional) {
        this.y.N((class00381<?>)new class09036(class018942, optional));
    }

    public void N(class03556<class09037> class035562, @Nullable class05096 class050962) {
        this.y.N(class035562, this, class050962);
    }

    public void N(class00392 class003922) {
        this.y.u.method_10747(class003922);
        this.y.u.method_10768();
    }
}

