/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class05971
 *  minecraft.class05973
 *  minecraft.class06202
 *  minecraft.class06683
 *  minecraft.class08394
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01244;
import minecraft.class01262;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class05971;
import minecraft.class05973;
import minecraft.class06202;
import minecraft.class06683;
import minecraft.class08394;

public class class01267
implements class01262,
class05971 {
    private static final class01894 N = class01894.y((String)"spectator/teleport_to_team");
    private static final class00392 y = class00392.L((String)"spectatorMenu.team_teleport");
    private static final class00392 L = class00392.L((String)"spectatorMenu.team_teleport.prompt");
    private final List<class01262> u;

    public class01267() {
        class06202 class062022 = class06202.Nq();
        this.u = class01267.N(class062022, ((class03448)class062022.T_3).method_8428());
    }

    public class00392 y() {
        return L;
    }

    private static List<class01262> N(class06202 class062022, class06683 class066832) {
        return class066832.i().stream().flatMap(class005022 -> class01244.N(class062022, class005022).stream()).toList();
    }

    @Override
    public void N(class01054 class010542, float f, float f2) {
        class010542.N(class08394.Na, N, 0, 0, 16, 16, class02566.N((float)f2, (float)f, (float)f, (float)f));
    }

    public List<class01262> N() {
        return this.u;
    }

    @Override
    public void N(class05973 class059732) {
        class059732.N((class05971)this);
    }

    @Override
    public class00392 aw_() {
        return y;
    }

    @Override
    public boolean ax_() {
        return !this.u.isEmpty();
    }
}

