/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class03458
 *  minecraft.class05956
 *  minecraft.class05971
 *  minecraft.class05973
 *  minecraft.class06202
 *  minecraft.class07282
 *  minecraft.class08394
 */
package minecraft;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01262;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class03458;
import minecraft.class05956;
import minecraft.class05971;
import minecraft.class05973;
import minecraft.class06202;
import minecraft.class07282;
import minecraft.class08394;

public class class01264
implements class01262,
class05971 {
    private static final class01894 N = class01894.y((String)"spectator/teleport_to_player");
    private static final Comparator<class03458> y = Comparator.comparing(class034582 -> class034582.N().id());
    private static final class00392 L = class00392.L((String)"spectatorMenu.teleport");
    private static final class00392 u = class00392.L((String)"spectatorMenu.teleport.prompt");
    private final List<class01262> i;

    public class01264() {
        this(class06202.Nq().NE().B());
    }

    public class01264(Collection<class03458> collection) {
        this.i = collection.stream().filter(class034582 -> class034582.i() != class07282.field_9219).sorted(y).map(class05956::new).collect(Collectors.toUnmodifiableList());
    }

    public class00392 y() {
        return u;
    }

    @Override
    public void N(class01054 class010542, float f, float f2) {
        class010542.N(class08394.Na, N, 0, 0, 16, 16, class02566.N((float)f2, (float)f, (float)f, (float)f));
    }

    public List<class01262> N() {
        return this.i;
    }

    @Override
    public void N(class05973 class059732) {
        class059732.N((class05971)this);
    }

    @Override
    public class00392 aw_() {
        return L;
    }

    @Override
    public boolean ax_() {
        return !this.i.isEmpty();
    }
}

