/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.logging.LogUtils
 *  minecraft.class01711
 *  minecraft.class01747
 *  minecraft.class01752
 *  minecraft.class01878
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class03102
 *  minecraft.class04643
 *  minecraft.class05961
 *  minecraft.class06984
 *  minecraft.class07684
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08152
 *  minecraft.class08700
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import minecraft.class01711;
import minecraft.class01747;
import minecraft.class01752;
import minecraft.class01878;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class03102;
import minecraft.class04643;
import minecraft.class05961;
import minecraft.class06984;
import minecraft.class07684;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08152;
import minecraft.class08700;
import org.slf4j.Logger;

public class class03800 {
    private static final Logger N = LogUtils.getLogger();
    private static final class01894 y = class01894.y((String)"tick");
    private static final class01894 L = class01894.y((String)"load");
    private final class02796 u;
    private List<class07684<class07701>> i = ImmutableList.of();
    private boolean R;
    private class05961 M;

    public class07701 L() {
        return this.u.yu().N((class08152)class06984.L).y();
    }

    public class03800(class02796 class027962, class05961 class059612) {
        this.u = class027962;
        this.M = class059612;
        this.y(class059612);
    }

    public Iterable<class01894> i() {
        return this.M.y();
    }

    public Iterable<class01894> u() {
        return this.M.N().keySet();
    }

    public List<class07684<class07701>> y(class01894 class018942) {
        return this.M.y(class018942);
    }

    public void y() {
        if (!this.u.yW().Z()) {
            return;
        }
        if (this.R) {
            this.R = false;
            List var1 = this.M.y(L);
            this.N(var1, L);
        }
        this.N(this.i, y);
    }

    private void y(class05961 class059612) {
        this.i = List.copyOf(class059612.y(y));
        this.R = true;
    }

    private void N(Collection<class07684<class07701>> collection, class01894 class018942) {
        class08700.N().N(() -> ((class01894)class018942).toString());
        for (class07684<class07701> class076842 : collection) {
            this.N(class076842, this.L());
        }
        class08700.N().L();
    }

    public Optional<class07684<class07701>> N(class01894 class018942) {
        return this.M.N(class018942);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(class07684<class07701> class076842, class07701 class077012) {
        class04643 class046432 = class08700.N();
        class046432.N(() -> "function " + String.valueOf(class076842.N()));
        try {
            class01747 class017472 = class076842.N(null, this.N());
            class07686.N((class07701)class077012, class017522 -> class01752.N((class01752)class017522, (class01747)class017472, (class01711)class077012, (class03102)class03102.N));
        }
        catch (class01878 class018782) {
        }
        catch (Exception exception) {
            N.warn("Failed to execute function {}", (Object)class076842.N(), (Object)exception);
        }
        finally {
            class046432.L();
        }
    }

    public void N(class05961 class059612) {
        this.M = class059612;
        this.y(class059612);
    }

    public CommandDispatcher<class07701> N() {
        return this.u.yL().N();
    }
}

