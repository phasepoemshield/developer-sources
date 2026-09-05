/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  minecraft.class00299
 *  minecraft.class00311
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02422
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06937
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import minecraft.class00299;
import minecraft.class00311;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02422;
import minecraft.class02444;
import minecraft.class02484;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06937;
import org.jspecify.annotations.Nullable;

public class class02429 {
    private final Reference2ObjectMap<class06937, class02444> N = new Reference2ObjectArrayMap();
    private final class02422 y;

    public class02429(class02422 class024222) {
        this.y = class024222;
    }

    protected void y(class06937 class069372, class00311 class003112, class00299 class002992) {
        this.N(class069372, class003112, class002992, true);
    }

    public void N(class01054 class010542, class06202 class062022, int n, int n2, @Nullable class06937 class069372) {
        if (class069372 == null) {
            return;
        }
        class02444 class024442 = (class02444)((Object)this.N.get((Object)class069372));
        if (class024442 != null) {
            class06584 class065842 = class024442.N(this.y.currentIndex());
            class010542.N((class01590)class062022.i_3, class05096.method_25408((class06202)class062022, (class06584)class065842), n, n2, (class01894)class065842.method_58694(class02484.V));
        }
    }

    public void N(class01054 class010542, class06202 class062022, boolean bl) {
        this.N.forEach((class069372, class024442) -> {
            int n = class069372.i;
            int n2 = class069372.R;
            if (class024442.y() && bl) {
                class010542.N(n - 4, n2 - 4, n + 20, n2 + 20, 0x30FF0000);
            } else {
                class010542.N(n, n2, n + 16, n2 + 16, 0x30FF0000);
            }
            class06584 class065842 = class024442.N(this.y.currentIndex());
            class010542.y(class065842, n, n2);
            class010542.N(n, n2, n + 16, n2 + 16, 0x30FFFFFF);
            if (class024442.y()) {
                class010542.N((class01590)class062022.i_3, class065842, n, n2);
            }
        });
    }

    public void N() {
        this.N.clear();
    }

    protected void N(class06937 class069372, class00311 class003112, class00299 class002992) {
        this.N(class069372, class003112, class002992, false);
    }

    private void N(class06937 class069372, class00311 class003112, class00299 class002992, boolean bl) {
        List var5 = class002992.N(class003112);
        if (!var5.isEmpty()) {
            this.N.put((Object)class069372, (Object)new class02444(var5, bl));
        }
    }
}

