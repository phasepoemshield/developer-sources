/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01202
 *  minecraft.class01590
 *  minecraft.class04357
 *  minecraft.class04370
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05914
 *  minecraft.class06202
 *  minecraft.class06318
 *  minecraft.class06478
 *  minecraft.class06744
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01202;
import minecraft.class01590;
import minecraft.class04357;
import minecraft.class04370;
import minecraft.class04992;
import minecraft.class05009;
import minecraft.class05014;
import minecraft.class05037;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05914;
import minecraft.class06202;
import minecraft.class06318;
import minecraft.class06478;
import minecraft.class06744;
import org.jspecify.annotations.Nullable;

public class class05002
extends class06318<class04992> {
    private static final int N = 310;
    private static final int y = 25;
    private final class05914 L;

    public void L(class04370<?> class043702) {
        for (class04992 class049922 : this.method_25396()) {
            if (!(class049922 instanceof class05009)) continue;
            for (class05037 class050372 : ((class05009)class049922).N) {
                class06478 class064782;
                if (class050372.y() != class043702 || !((class064782 = class050372.N()) instanceof class06744)) continue;
                ((class06744)class064782).N();
                return;
            }
        }
    }

    public class05002(class06202 class062022, int n, class05914 class059142) {
        super(class062022, n, class059142.field_49503.u(), class059142.field_49503.L(), 25);
        this.field_22744 = false;
        this.L = class059142;
    }

    public @Nullable class06478 y(class04370<?> class043702) {
        for (class04992 class049922 : this.method_25396()) {
            class06478 class064782;
            if (!(class049922 instanceof class05009) || (class064782 = ((class05009)class049922).N(class043702)) == null) continue;
            return class064782;
        }
        return null;
    }

    public void y() {
        for (class04992 class049922 : this.method_25396()) {
            if (!(class049922 instanceof class05009)) continue;
            for (class05037 class050372 : ((class05009)class049922).N) {
                class06478 class064782;
                if (class050372.y() == null || !((class064782 = class050372.N()) instanceof class04357)) continue;
                ((class04357)class064782).y();
            }
        }
    }

    public void N(class00392 class003922) {
        Objects.requireNonNull((class01590)this.field_22740.i_3);
        int n = 9;
        int n2 = this.method_25396().isEmpty() ? 0 : n * 2;
        this.method_73370((class01202)new class05014((class05096)this.L, class003922, n2), n2 + n + 4);
    }

    public void N(class06478 class064782, class04370<?> class043702, @Nullable class06478 class064783) {
        this.method_25321((class01202)class05009.N(class064782, class043702, class064783, (class05096)this.L));
    }

    public void N(class04370<?> ... class04370Array) {
        for (int i = 0; i < class04370Array.length; i += 2) {
            class04370<?> class043702 = i < class04370Array.length - 1 ? class04370Array[i + 1] : null;
            this.method_25321((class01202)class05009.N((class05630)this.field_22740.i_7, class04370Array[i], class043702, this.L));
        }
    }

    public void N(List<class06478> list) {
        for (int i = 0; i < list.size(); i += 2) {
            this.N(list.get(i), i < list.size() - 1 ? list.get(i + 1) : null);
        }
    }

    public void N(class06478 class064782, @Nullable class06478 class064783) {
        this.method_25321((class01202)class05009.N(class064782, class064783, (class05096)this.L));
    }

    public void N(class04370<?> class043702) {
        this.method_25321((class01202)class05009.N((class05630)this.field_22740.i_7, class043702, (class05096)this.L));
    }

    public int method_25322() {
        return 310;
    }
}

