/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00577
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01590
 *  minecraft.class02566
 *  minecraft.class05936
 *  minecraft.class08652
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00577;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01590;
import minecraft.class02566;
import minecraft.class05936;
import minecraft.class08652;
import org.jspecify.annotations.Nullable;

class class01074
implements class00580,
Consumer<class00405> {
    private class00577 u;
    private final class01065 i;
    private final @Nullable Consumer<class00405> R;
    final /* synthetic */ class01054 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01074(class01054 class010542, class00577 class005772, @Nullable class01065 class010652, Consumer consumer) {
        this.L = class010542;
        this.u = class005772;
        this.i = class010652;
        this.R = consumer;
    }

    @Override
    public void accept(class00405 class004052) {
        if (this.i.field_63853 && class004052.z() != null) {
            this.L.R = class004052;
        }
        if (this.i.field_63854 && class004052.Z() != null) {
            this.L.M = class004052;
        }
        if (this.R != null) {
            this.R.accept(class004052);
        }
    }

    public void N(class00392 class003922, int n, int n2, int n3, int n4, int n5, class00577 class005772) {
        int n6 = ((class01590)this.L.N.i_3).N((class05936)class003922);
        Objects.requireNonNull((class01590)this.L.N.i_3);
        int n7 = 9;
        this.N(class003922, n, n2, n3, n4, n5, n6, n7, class005772);
    }

    public void N(class00937 class009372, int n, int n2, class00577 class005772, class01028 class010282) {
        boolean bl = this.i.field_63854 || this.i.field_63853 || this.R != null;
        int n3 = class009372.N(n, (class01590)this.L.N.i_3, class010282);
        class08652 class086522 = new class08652((class01590)this.L.N.i_3, class010282, class005772.N(), n3, n2, class02566.y((float)class005772.y()), 0, true, bl, class005772.L());
        if (class02566.u((float)class005772.y()) != 0) {
            this.L.L.N(class086522);
        }
        if (bl) {
            class00580.N((class08652)class086522, (float)this.L.u, (float)this.L.i, (Consumer)this);
        }
    }

    public class00577 N() {
        return this.u;
    }

    public void N(class00577 class005772) {
        this.u = class005772;
    }
}

