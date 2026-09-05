/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11910
 *  Nursultan.class11921
 *  minecraft.class00392
 *  minecraft.class01321
 *  minecraft.class01885
 *  minecraft.class02071
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class02570
 *  minecraft.class03255
 *  minecraft.class03420
 *  minecraft.class04230
 *  minecraft.class04568
 *  minecraft.class04705
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05763
 *  minecraft.class06202
 *  minecraft.class07536
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11910;
import Nursultan.class11921;
import java.net.URI;
import minecraft.class00392;
import minecraft.class01321;
import minecraft.class01885;
import minecraft.class02071;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class02570;
import minecraft.class03255;
import minecraft.class03420;
import minecraft.class04230;
import minecraft.class04568;
import minecraft.class04705;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05763;
import minecraft.class06202;
import minecraft.class07536;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05364
extends class05096 {
    private static final class00392 N = class00392.L((String)"gui.toMenu");
    private static final class00392 y = class00392.L((String)"gui.toTitle");
    private static final class00392 L = class00392.L((String)"gui.report_to_server");
    private static final class00392 u = class00392.L((String)"gui.open_report_dir");
    private final class05096 i;
    private final class02570 R;
    private final class00392 M;
    private final class01885 B = class01885.u();

    public class05364(class05096 class050962, class00392 class003922, class02570 class025702, class00392 class003923) {
        super(class003922);
        this.i = class050962;
        this.R = class025702;
        this.M = class003923;
    }

    public class05364(class05096 class050962, class00392 class003922, class02570 class025702) {
        this(class050962, class003922, class025702, N);
    }

    public class05364(class05096 class050962, class00392 class003922, class00392 class003923, class00392 class003924) {
        this(class050962, class003922, new class02570(class003923), class003924);
    }

    public class05364(class05096 class050962, class00392 class003922, class00392 class003923) {
        this(class050962, class003922, new class02570(class003923));
    }

    private void N(CallbackInfo callbackInfo) {
        class04568 class045682 = (class04568)class11910.N_6;
        if (class045682 == null || class045682.y == null || !this.field_22787.yM()) {
            return;
        }
        this.B.N((class02102)class05362.method_46430((class00392)class11921.N((String)"reconnect-button"), class053622 -> {
            class03420 class034202 = class03420.N((String)class045682.y);
            class053622.field_22763 = false;
            class05763.N(null, (class06202)this.field_22787, (class03420)class034202, (class04568)class045682, (boolean)true, null);
        }).N(200).N());
    }

    public void method_25426() {
        this.B.L().y().N(10);
        this.B.N((class02102)new class02071(this.field_22785, this.field_22793));
        this.B.N((class02102)new class04230(this.R.N(), this.field_22793).N(this.field_22789 - 50).N(true));
        this.B.L().N(2);
        this.R.L().ifPresent(uRI -> this.B.N((class02102)class05362.method_46430(L, class01321.y((class05096)this, (URI)uRI, (boolean)false)).N(200).N()));
        this.R.y().ifPresent(path -> this.B.N((class02102)class05362.method_46430(u, class053622 -> class07536.m().N(path.getParent())).N(200).N()));
        class05362 class053623 = this.field_22787.yM() ? class05362.method_46430(this.M, class053622 -> this.field_22787.N(this.i)).N(200).N() : class05362.method_46430(y, class053622 -> this.field_22787.N((class05096)new class04705())).N(200).N();
        this.B.N((class02102)class053623);
        this.N((CallbackInfo)null);
        this.B.N();
        this.B.method_48206(arg_0 -> ((class05364)this).method_37063(arg_0));
        this.method_48640();
    }

    public boolean method_25422() {
        return false;
    }

    public void method_48640() {
        class02077.N((class02102)this.B, (class03255)this.method_48202());
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{this.field_22785, this.R.N()});
    }
}

