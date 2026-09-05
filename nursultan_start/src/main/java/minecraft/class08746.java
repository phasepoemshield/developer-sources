/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class04680
 *  minecraft.class06090
 *  minecraft.class06128
 *  minecraft.class06202
 *  minecraft.class08966
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01590;
import minecraft.class04680;
import minecraft.class06090;
import minecraft.class06128;
import minecraft.class06202;
import minecraft.class08762;
import minecraft.class08764;
import minecraft.class08966;
import org.jspecify.annotations.Nullable;

public class class08746
implements class08762 {
    private static final int N = 600;
    private static final class00392 y = class00392.L((String)"tutorial.open_inventory.title");
    private static final class00392 L = class00392.N((String)"tutorial.open_inventory.description", (Object[])new Object[]{class08764.N("inventory")});
    private final class08764 u;
    private @Nullable class06128 i;
    private int R;

    @Override
    public void L() {
        this.u.N(class08966.field_5655);
    }

    public class08746(class08764 class087642) {
        this.u = class087642;
    }

    @Override
    public void y() {
        if (this.i != null) {
            this.i.B();
            this.i = null;
        }
    }

    @Override
    public void N() {
        ++this.R;
        if (!this.u.R()) {
            this.u.N(class08966.field_5653);
            return;
        }
        if (this.R >= 600 && this.i == null) {
            class06202 class062022 = this.u.i();
            this.i = new class06128((class01590)class062022.i_3, class06090.field_2233, y, L, false);
            class062022.m().N((class04680)this.i);
        }
    }
}

