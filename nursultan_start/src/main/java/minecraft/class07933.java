/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00392
 *  minecraft.class01871
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03695
 *  minecraft.class04430
 *  minecraft.class04563
 *  minecraft.class04568
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05763
 *  minecraft.class06541
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import minecraft.class00392;
import minecraft.class01871;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03695;
import minecraft.class04430;
import minecraft.class04563;
import minecraft.class04568;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05763;
import minecraft.class06541;
import org.jspecify.annotations.Nullable;

public class class07933
extends class04430 {
    private static final class00392 y = class00392.L((String)"multiplayer.codeOfConduct.title").N(class06541.field_1067);
    private static final class00392 L = class00392.L((String)"multiplayer.codeOfConduct.check");
    private final @Nullable class04568 u;
    private final String i;
    private final BooleanConsumer R;
    private final class05096 M;

    private class07933(@Nullable class04568 class045682, class05096 class050962, class00392 class003922, String string, BooleanConsumer booleanConsumer) {
        super(y, class003922, L, (class00392)y.L().i("\n").y(class003922));
        this.u = class045682;
        this.M = class050962;
        this.i = string;
        this.R = booleanConsumer;
    }

    public class07933(@Nullable class04568 class045682, class05096 class050962, String string, BooleanConsumer booleanConsumer) {
        this(class045682, class050962, (class00392)class00392.y((String)string), string, booleanConsumer);
    }

    private void N(boolean bl) {
        this.R.accept(bl);
        if (this.u != null) {
            if (bl && this.N.y()) {
                this.u.y(this.i);
            } else {
                this.u.M();
            }
            class04563.y((class04568)this.u);
        }
    }

    protected class03695 N() {
        class01885 class018852 = class01885.i().N(8);
        class018852.N((class02102)class05362.method_46430((class00392)class05220.W, class053622 -> this.N(true)).N());
        class018852.N((class02102)class05362.method_46430((class00392)class05220.T, class053622 -> this.N(false)).N());
        return class018852;
    }

    public boolean method_25422() {
        return false;
    }

    public void method_25393() {
        super.method_25393();
        if (this.M instanceof class05763 || this.M instanceof class01871) {
            this.M.method_25393();
        }
    }
}

