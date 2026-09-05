/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01202
 *  minecraft.class01627
 *  minecraft.class06541
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01202;
import minecraft.class01627;
import minecraft.class05724;
import minecraft.class05734;
import minecraft.class05737;
import minecraft.class05749;
import minecraft.class05762;
import minecraft.class06541;
import org.jspecify.annotations.Nullable;

class class05732
extends class05724<class05762> {
    static final class00392 N = class00392.L((String)"createWorld.customize.flat.tile").N(class06541.field_1073);
    static final class00392 y = class00392.L((String)"createWorld.customize.flat.height").N(class06541.field_1073);
    final /* synthetic */ class05737 L;

    private void L() {
        class05734 class057342 = new class05734(this.L.field_22793);
        Objects.requireNonNull(this.L.field_22793);
        this.method_73370(class057342, (int)(9.0 * 1.5));
        List var1 = this.L.L.i().reversed();
        for (int i = 0; i < var1.size(); ++i) {
            this.method_25321(new class05749(this, (class01627)var1.get(i), i));
        }
    }

    public class05732(class05737 class057372) {
        this.L = class057372;
        super(class057372.field_22787, class057372.field_22789, class057372.field_22790 - 103, 43, 24);
        this.L();
    }

    public void y() {
        int n = this.method_25396().indexOf(this.method_25334());
        this.method_25339();
        this.L();
        List var2 = this.method_25396();
        if (n >= 0 && n < var2.size()) {
            this.method_25313((class05762)((Object)var2.get(n)));
        }
    }

    public void method_25313(@Nullable class05762 class057622) {
        super.method_25313((class01202)class057622);
        this.L.y();
    }

    void N(class05749 class057492) {
        List var2 = this.L.L.i();
        int n = this.method_25396().indexOf((Object)class057492);
        this.method_25330(class057492);
        var2.remove(class057492.N);
        this.method_25313(var2.isEmpty() ? null : (class05762)((Object)this.method_25396().get(Math.min(n, var2.size()))));
        this.L.L.M();
        this.y();
        this.L.y();
    }
}

