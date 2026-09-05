/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01206
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class04643
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06687
 *  minecraft.class06702
 *  minecraft.class07254
 *  minecraft.class07262
 *  minecraft.class08394
 *  minecraft.class08700
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01206;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04643;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06481;
import minecraft.class06687;
import minecraft.class06702;
import minecraft.class07254;
import minecraft.class07262;
import minecraft.class08394;
import minecraft.class08700;

public class class06455 {
    private static final int y = 182;
    private static final int L = 5;
    private static final class01894[] u = new class01894[]{class01894.y((String)"boss_bar/pink_background"), class01894.y((String)"boss_bar/blue_background"), class01894.y((String)"boss_bar/red_background"), class01894.y((String)"boss_bar/green_background"), class01894.y((String)"boss_bar/yellow_background"), class01894.y((String)"boss_bar/purple_background"), class01894.y((String)"boss_bar/white_background")};
    private static final class01894[] i = new class01894[]{class01894.y((String)"boss_bar/pink_progress"), class01894.y((String)"boss_bar/blue_progress"), class01894.y((String)"boss_bar/red_progress"), class01894.y((String)"boss_bar/green_progress"), class01894.y((String)"boss_bar/yellow_progress"), class01894.y((String)"boss_bar/purple_progress"), class01894.y((String)"boss_bar/white_progress")};
    private static final class01894[] R = new class01894[]{class01894.y((String)"boss_bar/notched_6_background"), class01894.y((String)"boss_bar/notched_10_background"), class01894.y((String)"boss_bar/notched_12_background"), class01894.y((String)"boss_bar/notched_20_background")};
    private static final class01894[] M = new class01894[]{class01894.y((String)"boss_bar/notched_6_progress"), class01894.y((String)"boss_bar/notched_10_progress"), class01894.y((String)"boss_bar/notched_12_progress"), class01894.y((String)"boss_bar/notched_20_progress")};
    private final class06202 B;
    final Map<UUID, class01206> N = Maps.newLinkedHashMap();

    public boolean L() {
        if (!this.N.isEmpty()) {
            Iterator<class01206> var1 = this.N.values().iterator();
            while (var1.hasNext()) {
                if (!((class06687)var1.next()).R()) continue;
                return true;
            }
        }
        return false;
    }

    public class06455(class06202 class062022) {
        this.B = class062022;
    }

    public boolean u() {
        if (!this.N.isEmpty()) {
            Iterator<class01206> var1 = this.N.values().iterator();
            while (var1.hasNext()) {
                if (!((class06687)var1.next()).B()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean y() {
        if (!this.N.isEmpty()) {
            Iterator<class01206> var1 = this.N.values().iterator();
            while (var1.hasNext()) {
                if (!((class06687)var1.next()).M()) continue;
                return true;
            }
        }
        return false;
    }

    public void N() {
        this.N.clear();
    }

    public void N(class01054 class010542) {
        if (this.N.isEmpty()) {
            return;
        }
        class010542.L();
        class04643 class046432 = class08700.N();
        class046432.N("bossHealth");
        int n = class010542.N();
        int n2 = 12;
        for (class01206 class012062 : this.N.values()) {
            int n3 = n / 2 - 91;
            int n4 = n2;
            this.N(class010542, n3, n4, (class06687)class012062);
            class00392 class003922 = class012062.y();
            int n5 = ((class01590)this.B.i_3).N((class05936)class003922);
            int n6 = n / 2 - n5 / 2;
            int n7 = n4 - 9;
            class010542.y((class01590)this.B.i_3, class003922, n6, n7, -1);
            Objects.requireNonNull((class01590)this.B.i_3);
            if ((n2 += 10 + 9) < class010542.y() / 3) continue;
            break;
        }
        class046432.L();
    }

    private void N(class01054 class010542, int n, int n2, class06687 class066872, int n3, class01894[] class01894Array, class01894[] class01894Array2) {
        class010542.N(class08394.Na, class01894Array[class066872.u().ordinal()], 182, 5, 0, 0, n, n2, n3, 5);
        if (class066872.i() != class06702.field_5795) {
            class010542.N(class08394.Na, class01894Array2[class066872.i().ordinal() - 1], 182, 5, 0, 0, n, n2, n3, 5);
        }
    }

    private void N(class01054 class010542, int n, int n2, class06687 class066872) {
        this.N(class010542, n, n2, class066872, 182, u, R);
        int n3 = class04995.y((float)class066872.L(), (int)0, (int)182);
        if (n3 > 0) {
            this.N(class010542, n, n2, class066872, n3, i, M);
        }
    }

    public void N(class07254 class072542) {
        class072542.N((class07262)new class06481(this));
    }
}

