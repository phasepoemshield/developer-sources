/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class06183
 *  minecraft.class06501
 *  minecraft.class06573
 *  minecraft.class06584
 *  minecraft.class06913
 *  minecraft.class06918
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04799;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class06183;
import minecraft.class06501;
import minecraft.class06573;
import minecraft.class06584;
import minecraft.class06913;
import minecraft.class06918;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class04810
extends class06918
implements class04799 {
    private final class04891 N;

    public class04810(class00891 class008912, class04891 class048912, class06573 class065732) {
        super(class008912, class065732);
        this.N = class048912;
    }

    @Override
    public boolean N(@Nullable class07438 class074382, class07299 class072992, class07209 class072092, @Nullable class06183 class061832) {
        if (class072992.method_24794(class072092) && class072992.R(class072092)) {
            if (!class072992.method_8608()) {
                class072992.method_8652(class072092, this.L().W(), 3);
            }
            class072992.N((class07049)class074382, (class03556)class01194.w, class072092);
            class072992.method_8396((class07049)class074382, class072092, this.N, class04911.field_15245, 1.0f, 1.0f);
            return true;
        }
        return false;
    }

    protected class04891 N(class00500 class005002) {
        return this.N;
    }

    public class07082 N(class06501 class065012) {
        class07082 class070822 = super.N(class065012);
        class08036 class080362 = class065012.method_8036();
        if (class070822.N() && class080362 != null) {
            class080362.method_6122(class065012.method_20287(), class06913.y((class06584)class065012.method_8041(), (class08036)class080362));
        }
        return class070822;
    }
}

