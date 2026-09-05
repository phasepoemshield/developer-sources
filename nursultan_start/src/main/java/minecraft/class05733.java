/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.bedrock.IConfirmScreen
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00392
 *  minecraft.class01885
 *  minecraft.class02071
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class04230
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06601
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.viaversion.viafabricplus.injection.access.base.bedrock.IConfirmScreen;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import minecraft.class00392;
import minecraft.class01885;
import minecraft.class02071;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class04230;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06601;
import org.jspecify.annotations.Nullable;

public class class05733
extends class05096
implements IConfirmScreen {
    private final class00392 field_2401;
    protected class01885 field_61001 = class01885.u().N(8);
    protected class00392 field_2402;
    protected class00392 field_2399;
    protected @Nullable class05362 field_61002;
    protected @Nullable class05362 field_61003;
    private int field_2400;
    protected final BooleanConsumer field_2403;

    public class05733(BooleanConsumer booleanConsumer, class00392 class003922, class00392 class003923) {
        this(booleanConsumer, class003922, class003923, class05220.R, class05220.M);
    }

    public class05733(BooleanConsumer booleanConsumer, class00392 class003922, class00392 class003923, class00392 class003924, class00392 class003925) {
        super(class003922);
        this.field_2403 = booleanConsumer;
        this.field_2401 = class003923;
        this.field_2402 = class003924;
        this.field_2399 = class003925;
    }

    public void method_25426() {
        super.method_25426();
        this.field_61001.L().y();
        this.field_61001.N((class02102)new class02071(this.field_22785, this.field_22793));
        this.field_61001.N((class02102)new class04230(this.field_2401, this.field_22793).N(this.field_22789 - 50).y(15).N(true));
        this.method_72128();
        class01885 class018852 = (class01885)this.field_61001.N((class02102)class01885.i().N(4));
        class018852.L().L(16);
        this.method_37051(class018852);
        this.field_61001.method_48206(arg_0 -> ((class05733)this).method_37063(arg_0));
        this.method_48640();
    }

    public boolean method_25422() {
        return false;
    }

    public boolean method_25404(class06601 class066012) {
        if (this.field_2400 <= 0 && class066012.v() == 256) {
            this.field_2403.accept(false);
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_48640() {
        this.field_61001.N();
        class02077.N((class02102)this.field_61001, (class03255)this.method_48202());
    }

    public void method_25393() {
        super.method_25393();
        if (--this.field_2400 == 0) {
            this.field_61002.field_22763 = true;
            this.field_61003.field_22763 = true;
        }
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), this.field_2401});
    }

    protected void method_37051(class01885 class018852) {
        this.field_61002 = (class05362)class018852.N((class02102)class05362.method_46430((class00392)this.field_2402, class053622 -> this.field_2403.accept(true)).N());
        this.field_61003 = (class05362)class018852.N((class02102)class05362.method_46430((class00392)this.field_2399, class053622 -> this.field_2403.accept(false)).N());
    }

    protected void method_72128() {
    }

    public void method_2125(int n) {
        this.field_2400 = n;
        this.field_61002.field_22763 = false;
        this.field_61003.field_22763 = false;
    }

    public void viaFabricPlus$updateMessage(class00392 class003922) {
        for (class04654 class046542 : this.method_25396()) {
            if (!(class046542 instanceof class04230)) continue;
            ((class04230)class046542).method_25355(class003922);
            this.method_48640();
        }
    }
}

