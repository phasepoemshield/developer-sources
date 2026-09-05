/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class03965
 *  minecraft.class04891
 *  minecraft.class06237
 *  minecraft.class06584
 *  minecraft.class06952
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.OptionalInt;
import minecraft.class00392;
import minecraft.class03965;
import minecraft.class04891;
import minecraft.class06237;
import minecraft.class06584;
import minecraft.class06952;
import minecraft.class07316;
import minecraft.class07324;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public interface class07288 {
    public boolean L();

    public boolean i();

    default public boolean m() {
        return false;
    }

    public int u();

    public class07316 y();

    public boolean y(class08036 var1);

    default public void N(class08036 class080363, class00392 class003922, int n2) {
        class07316 class073162;
        OptionalInt optionalInt = class080363.method_17355((class06237)new class03965((n, class080442, class080362) -> new class06952(n, class080442, this), class003922));
        if (optionalInt.isPresent() && !(class073162 = this.y()).isEmpty()) {
            class080363.method_17354(optionalInt.getAsInt(), class073162, n2, this.u(), this.i(), this.m());
        }
    }

    public void N(class07324 var1);

    public void N(class07316 var1);

    public @Nullable class08036 N();

    public void N(@Nullable class08036 var1);

    public void N(int var1);

    public class04891 R();

    public void d_(class06584 var1);
}

