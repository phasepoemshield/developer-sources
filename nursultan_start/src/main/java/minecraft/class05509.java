/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.viaversion.viafabricplus.injection.access.networking.packet_handling.IGameTestBlockHighlightRenderer
 *  minecraft.class00753
 *  minecraft.class06715
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.Maps;
import com.viaversion.viafabricplus.injection.access.networking.packet_handling.IGameTestBlockHighlightRenderer;
import java.util.Map;
import minecraft.class00753;
import minecraft.class05535;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07536;

public class class05509
implements IGameTestBlockHighlightRenderer {
    private static final int N = 10000;
    private static final float y = 0.02f;
    private final Map<class07209, class05535> L = Maps.newHashMap();

    public void y() {
        long l = class07536.L();
        this.L.entrySet().removeIf(entry -> l > ((class05535)((Object)((Object)entry.getValue()))).L());
        this.L.forEach((class072092, class055352) -> this.N((class07209)class072092, (class05535)((Object)class055352)));
    }

    private void N(class07209 class072092, class05535 class055352) {
        class06724.N((class07209)class072092, (float)0.02f, (class06747)class06747.y((int)class055352.N()));
        if (!class055352.y().isEmpty()) {
            class06724.N((String)class055352.y(), (class06889)class06889.N((class00753)class072092, (double)0.5, (double)1.2, (double)0.5), (class06715)class06715.N().N(0.16f)).N();
        }
    }

    public void N() {
        this.L.clear();
    }

    public void N(class07209 class072092, class07209 class072093) {
        String string = class072093.method_23854();
        this.L.put(class072092, new class05535(0x6000FF00, string, class07536.L() + 10000L));
    }

    public void viaFabricPlus$addMarker(class07209 class072092, int n, String string, int n2) {
        this.L.put(class072092, new class05535(n, string, class07536.L() + (long)n2));
    }
}

