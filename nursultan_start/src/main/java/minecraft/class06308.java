/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class01054
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class06202
 *  minecraft.class06466
 *  minecraft.class06601
 *  minecraft.class06611
 *  minecraft.class06613
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class01054;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class06202;
import minecraft.class06466;
import minecraft.class06601;
import minecraft.class06611;
import minecraft.class06613;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public abstract class class06308
extends class06466 {
    protected static final int field_43050 = 2;
    private static final class01883 field_45339 = new class01883(class01894.y((String)"widget/button"), class01894.y((String)"widget/button_disabled"), class01894.y((String)"widget/button_highlighted"));
    private @Nullable Supplier<Boolean> field_64534;

    public class06308(int n, int n2, int n3, int n4, class00392 class003922) {
        super(n, n2, n3, n4, class003922);
    }

    public boolean method_25404(class06601 class066012) {
        if (!this.method_37303()) {
            return false;
        }
        if (class066012.L()) {
            this.method_25354(class06202.Nq().Nr());
            this.method_25306((class06611)class066012);
            return true;
        }
        return false;
    }

    public abstract void method_25306(class06611 var1);

    public void method_76613(Supplier<Boolean> supplier) {
        this.field_64534 = supplier;
    }

    protected abstract void method_75752(class01054 var1, int var2, int var3, float var4);

    public void method_75793(class00580 class005802) {
        this.method_75799(class005802, this.method_25369(), 2);
    }

    protected final void method_75794(class01054 class010542) {
        class010542.N(class08394.Na, field_45339.N(this.field_22763, this.field_64534 != null ? this.field_64534.get().booleanValue() : this.method_25367()), this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), class02566.y((float)this.field_22765));
    }

    public void method_25348(class06613 class066132, boolean bl) {
        this.method_25306((class06611)class066132);
    }

    protected final void method_48579(class01054 class010542, int n, int n2, float f) {
        this.method_75752(class010542, n, n2, f);
        this.method_76256(class010542);
    }
}

