/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00295
 *  minecraft.class00311
 *  minecraft.class00329
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01756
 *  minecraft.class01894
 *  minecraft.class02422
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class05096
 *  minecraft.class05305
 *  minecraft.class05313
 *  minecraft.class05317
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06584
 *  minecraft.class06595
 *  minecraft.class08394
 */
package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class00295;
import minecraft.class00311;
import minecraft.class00329;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01756;
import minecraft.class01894;
import minecraft.class02422;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05287;
import minecraft.class05305;
import minecraft.class05313;
import minecraft.class05317;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06584;
import minecraft.class06595;
import minecraft.class08394;

public class class05294
extends class06478 {
    private static final class01894 N = class01894.y((String)"recipe_book/slot_many_craftable");
    private static final class01894 y = class01894.y((String)"recipe_book/slot_craftable");
    private static final class01894 L = class01894.y((String)"recipe_book/slot_many_uncraftable");
    private static final class01894 u = class01894.y((String)"recipe_book/slot_uncraftable");
    private static final float i = 15.0f;
    private static final int R = 25;
    private static final class00392 M = class00392.L((String)"gui.recipebook.moreRecipes");
    private class05287 B = class05287.N;
    private List<class05305> Z = List.of();
    private boolean z;
    private final class02422 U;
    private float E;

    public boolean L() {
        return this.Z.size() == 1;
    }

    public class05294(class02422 class024222) {
        super(0, 0, 25, 25, class05220.N);
        this.U = class024222;
    }

    public class06584 i() {
        int n = this.U.currentIndex();
        int n2 = this.Z.size();
        int n3 = n / n2;
        int n4 = n - n2 * n3;
        return this.Z.get(n4).N(n3);
    }

    public class00329 u() {
        int n = this.U.currentIndex() % this.Z.size();
        return this.Z.get(n).N();
    }

    public class05287 y() {
        return this.B;
    }

    public List<class00392> N(class06584 class065842) {
        ArrayList<class00392> arrayList = new ArrayList<class00392>(class05096.method_25408((class06202)class06202.Nq(), (class06584)class065842));
        if (this.R()) {
            arrayList.add(M);
        }
        return arrayList;
    }

    public void N(class05287 class052872, boolean bl, class05313 class053132, class00311 class003112) {
        this.B = class052872;
        List<class00295> var5 = class052872.N(bl ? class05317.field_52848 : class05317.field_52847);
        this.Z = var5.stream().map(class002952 -> new class05305(class002952.N(), class002952.N(class003112))).toList();
        this.z = class05294.N(this.Z);
        List list = var5.stream().map(class00295::N).filter(arg_0 -> ((class01756)class053132.u()).y(arg_0)).toList();
        if (!list.isEmpty()) {
            list.forEach(arg_0 -> ((class05313)class053132).N(arg_0));
            this.E = 15.0f;
        }
    }

    private static boolean N(List<class05305> list) {
        Iterator iterator = list.stream().flatMap(class053052 -> class053052.y().stream()).iterator();
        if (!iterator.hasNext()) {
            return true;
        }
        class06584 class065842 = (class06584)iterator.next();
        while (iterator.hasNext()) {
            class06584 class065843 = (class06584)iterator.next();
            if (class06584.L((class06584)class065842, (class06584)class065843)) continue;
            return false;
        }
        return true;
    }

    private boolean R() {
        return this.Z.size() > 1;
    }

    public int method_25368() {
        return 25;
    }

    public boolean method_25351(class06595 class065952) {
        return class065952.v() == 0 || class065952.v() == 1;
    }

    public void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, (class00392)class00392.N((String)"narration.recipe", (Object[])new Object[]{this.i().d()}));
        if (this.R()) {
            class034282.N(class03457.field_33791, new class00392[]{class00392.L((String)"narration.button.usage.hovered"), class00392.L((String)"narration.recipe.usage.more")});
        } else {
            class034282.N(class03457.field_33791, (class00392)class00392.L((String)"narration.button.usage.hovered"));
        }
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        boolean bl;
        class01894 class018942 = this.B.N() ? (this.R() ? N : y) : (this.R() ? L : u);
        boolean bl2 = bl = this.E > 0.0f;
        if (bl) {
            float f2 = 1.0f + 0.1f * (float)Math.sin(this.E / 15.0f * (float)Math.PI);
            class010542.i().pushMatrix();
            class010542.i().translate((float)(this.method_46426() + 8), (float)(this.method_46427() + 12));
            class010542.i().scale(f2, f2);
            class010542.i().translate((float)(-(this.method_46426() + 8)), (float)(-(this.method_46427() + 12)));
            this.E -= f;
        }
        class010542.N(class08394.Na, class018942, this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
        class06584 class065842 = this.i();
        int n3 = 4;
        if (this.R() && this.z) {
            class010542.N(class065842, this.method_46426() + n3 + 1, this.method_46427() + n3 + 1, 0);
            --n3;
        }
        class010542.y(class065842, this.method_46426() + n3, this.method_46427() + n3);
        if (bl) {
            class010542.i().popMatrix();
        }
    }
}

