/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01202
 *  minecraft.class01590
 *  minecraft.class01827
 *  minecraft.class05216
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06318
 *  minecraft.class06384
 *  minecraft.class06428
 *  org.apache.commons.lang3.ArrayUtils
 *  page.langeweile.ok_zoomer.mixin.common.key_binds.KeyBindsListAccessor
 */
package minecraft;

import java.util.Arrays;
import minecraft.class00392;
import minecraft.class01202;
import minecraft.class01388;
import minecraft.class01409;
import minecraft.class01411;
import minecraft.class01590;
import minecraft.class01827;
import minecraft.class05216;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06318;
import minecraft.class06384;
import minecraft.class06428;
import org.apache.commons.lang3.ArrayUtils;
import page.langeweile.ok_zoomer.mixin.common.key_binds.KeyBindsListAccessor;

public class class01402
extends class06318<class01388>
implements KeyBindsListAccessor {
    private static final int y = 20;
    final class01827 N;
    private int L;

    static /* synthetic */ int L(class01402 class014022) {
        return class014022.method_65507();
    }

    public void L() {
        this.method_25396().forEach(class01388::N);
    }

    public class01402(class01827 class018272, class06202 class062022) {
        super(class062022, class018272.field_22789, class018272.field_49503.u(), class018272.field_49503.L(), 20);
        this.N = class018272;
        Object[] objectArray = (class06428[])ArrayUtils.clone((Object[])((class05630)class062022.i_7).Nn);
        Arrays.sort(objectArray);
        class06384 class063842 = null;
        for (Object object : objectArray) {
            class05216 class052162;
            int n;
            class06384 class063843 = object.M();
            if (class063843 != class063842) {
                class063842 = class063843;
                this.method_25321((class01202)new class01411(this, class063843));
            }
            if ((n = ((class01590)class062022.i_3).N((class05936)(class052162 = class00392.L((String)object.U())))) > this.L) {
                this.L = n;
            }
            this.method_25321((class01202)new class01409(this, (class06428)object, (class00392)class052162));
        }
    }

    static /* synthetic */ class06202 i(class01402 class014022) {
        return class014022.field_22740;
    }

    static /* synthetic */ class06202 u(class01402 class014022) {
        return class014022.field_22740;
    }

    static /* synthetic */ int y(class01402 class014022) {
        return class014022.field_22758;
    }

    public void y() {
        class06428.i();
        this.L();
    }

    static /* synthetic */ class06202 N(class01402 class014022) {
        return class014022.field_22740;
    }

    static /* synthetic */ class06202 R(class01402 class014022) {
        return class014022.field_22740;
    }

    public int method_25322() {
        return 340;
    }

    public /* synthetic */ class01827 getKeyBindsScreen() {
        return this.N;
    }
}

