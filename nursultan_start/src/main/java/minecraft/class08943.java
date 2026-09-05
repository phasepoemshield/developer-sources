/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  minecraft.class00183
 *  minecraft.class01894
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08898
 *  net.irisshaders.iris.mixinterface.ItemContextState
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import java.util.function.Function;
import minecraft.class00183;
import minecraft.class01894;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08898;
import minecraft.class08906;
import minecraft.class08910;
import minecraft.class08961;
import net.irisshaders.iris.mixinterface.ItemContextState;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08943 {
    private final Function<class01894, class08910> N = arg_0 -> ((class00183)class001832).N(arg_0);
    private final Function<class01894, class08906> y = arg_0 -> ((class00183)class001832).y(arg_0);
    private static final class01894 L;
    private int u;

    public class08943(class00183 class001832) {
    }

    public void y(class08898 class088982, class06584 class065842, class03662 class036622, @Nullable class07299 class072992, @Nullable class08961 class089612, int n) {
        this.N(class088982, class065842, class036622, class072992, class089612, n, null);
        class02477 class024772 = class02484.E;
        class06584 class065843 = class065842;
        class01894 class018942 = (class01894)this.N(class065843, class024772);
        if (class018942 == null) {
            return;
        }
        class088982.N(this.y.apply(class018942).y());
        this.N.apply(class018942).method_65584(class088982, class065842, this, class036622, class072992 instanceof class03448 ? (class03448)class072992 : null, class089612, n);
    }

    public float y(class06584 class065842) {
        class01894 class018942 = (class01894)class065842.method_58694(class02484.E);
        if (class018942 == null) {
            return 1.0f;
        }
        return this.y.apply(class018942).L();
    }

    private Object N(class06584 class065842, class02477 class024772) {
        if (VisualSettings.INSTANCE.replacePetrifiedOakSlab.isEnabled() && class065842.N(class06570.iY)) {
            return L;
        }
        return class065842.method_58694(class024772);
    }

    private void N(class08898 class088982, class06584 class065842, class03662 class036622, class07299 class072992, class08961 class089612, int n, CallbackInfo callbackInfo) {
        if (class065842 != null) {
            ((ItemContextState)class088982).setDisplayItem(class065842.B(), (class01894)class065842.method_58694(class02484.E));
        } else {
            ((ItemContextState)class088982).setDisplayItem(null, null);
        }
    }

    public boolean N(class06584 class065842) {
        class01894 class018942 = (class01894)class065842.method_58694(class02484.E);
        if (class018942 == null) {
            return true;
        }
        return this.y.apply(class018942).N();
    }

    public void N(class08898 class088982, class06584 class065842, class03662 class036622, class07049 class070492) {
        this.N(class088982, class065842, class036622, class070492.method_73183(), null, class070492.method_5628());
    }

    public void N(class08898 class088982, class06584 class065842, class03662 class036622, class07438 class074382) {
        this.N(class088982, class065842, class036622, class074382.method_73183(), (class08961)class074382, class074382.method_5628() + class036622.ordinal());
    }

    public void N(class08898 class088982, class06584 class065842, class03662 class036622, @Nullable class07299 class072992, @Nullable class08961 class089612, int n) {
        class088982.y();
        if (!class065842.R()) {
            class088982.N = class036622;
            this.y(class088982, class065842, class036622, class072992, class089612, n);
        }
    }
}

