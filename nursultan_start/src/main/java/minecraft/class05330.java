/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00242
 *  minecraft.class00295
 *  minecraft.class01054
 *  minecraft.class01756
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class04897
 *  minecraft.class05287
 *  minecraft.class08394
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import minecraft.class00242;
import minecraft.class00295;
import minecraft.class01054;
import minecraft.class01756;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class04897;
import minecraft.class05287;
import minecraft.class05317;
import minecraft.class05322;
import minecraft.class05361;
import minecraft.class08394;

public class class05330
extends class04897 {
    private static final class01883 L = new class01883(class01894.y((String)"recipe_book/tab"), class01894.y((String)"recipe_book/tab_selected"));
    public static final int N = 35;
    public static final int y = 27;
    private final class05322 u;
    private static final float i = 15.0f;
    private float R;
    private boolean M = false;

    public void L() {
        this.M = true;
    }

    public class05330(int n, int n2, class05322 class053222, class05361 class053612) {
        super(n, n2, 35, 27, L, class053612);
        this.u = class053222;
    }

    public void u() {
        this.M = false;
    }

    public class00242 y() {
        return this.u.L();
    }

    public boolean N(class01756 class017562) {
        List var2 = class017562.N(this.u.L());
        this.field_22764 = false;
        Iterator var3 = var2.iterator();
        while (var3.hasNext()) {
            if (!((class05287)var3.next()).y()) continue;
            this.field_22764 = true;
            break;
        }
        return this.field_22764;
    }

    public void N(class01756 class017562, boolean bl) {
        class05317 class053172 = bl ? class05317.field_52848 : class05317.field_52847;
        Iterator var5 = class017562.N(this.u.L()).iterator();
        while (var5.hasNext()) {
            for (class00295 class002952 : ((class05287)var5.next()).N(class053172)) {
                if (!class017562.y(class002952.N())) continue;
                this.R = 15.0f;
                return;
            }
        }
    }

    private void N(class01054 class010542) {
        int n;
        int n2 = n = this.M ? -2 : 0;
        if (this.u.y().isPresent()) {
            class010542.y(this.u.N(), this.method_46426() + 3 + n, this.method_46427() + 5);
            class010542.y(this.u.y().get(), this.method_46426() + 14 + n, this.method_46427() + 5);
        } else {
            class010542.y(this.u.N(), this.method_46426() + 9 + n, this.method_46427() + 5);
        }
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        if (this.R > 0.0f) {
            float f2 = 1.0f + 0.1f * (float)Math.sin(this.R / 15.0f * (float)Math.PI);
            class010542.i().pushMatrix();
            class010542.i().translate((float)(this.method_46426() + 8), (float)(this.method_46427() + 12));
            class010542.i().scale(1.0f, f2);
            class010542.i().translate((float)(-(this.method_46426() + 8)), (float)(-(this.method_46427() + 12)));
        }
        class01894 class018942 = this.field_45356.N(true, this.M);
        int n3 = this.method_46426();
        if (this.M) {
            n3 -= 2;
        }
        class010542.N(class08394.Na, class018942, n3, this.method_46427(), this.field_22758, this.field_22759);
        this.N(class010542);
        if (this.R > 0.0f) {
            class010542.i().popMatrix();
            this.R -= f;
        }
    }

    protected void method_76256(class01054 class010542) {
        if (!this.M) {
            super.method_76256(class010542);
        }
    }
}

