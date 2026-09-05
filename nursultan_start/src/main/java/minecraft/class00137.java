/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00002
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05216
 *  minecraft.class06069
 *  minecraft.class06541
 *  minecraft.class07529
 *  minecraft.class09033
 *  minecraft.class09038
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import minecraft.class00002;
import minecraft.class00124;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05216;
import minecraft.class06069;
import minecraft.class06541;
import minecraft.class07529;
import minecraft.class09033;
import minecraft.class09038;
import org.jspecify.annotations.Nullable;

public class class00137
implements class00124<class00002> {
    private final List<class00124<class00002>> N = Lists.newArrayList();
    private final @Nullable class00392 y;

    public class00137(class01894 class018942, @Nullable String string) {
        if (class07529.Nq) {
            class05216 class052162 = class00392.y((String)class018942.N());
            if ("FOR THE DEBUG!".equals(string)) {
                class052162 = class052162.y((class00392)class00392.y((String)" missing").N(class06541.field_1061));
            }
            this.y = class052162;
        } else {
            this.y = string == null ? null : class00392.L((String)string);
        }
    }

    @Override
    public int i() {
        int n = 0;
        for (class00124<class00002> var3 : this.N) {
            n += var3.i();
        }
        return n;
    }

    public void N(class00124<class00002> class001242) {
        this.N.add(class001242);
    }

    @Override
    public void N(class09038 class090382) {
        Iterator<class00124<class00002>> var2 = this.N.iterator();
        while (var2.hasNext()) {
            var2.next().N(class090382);
        }
    }

    public @Nullable class00392 N() {
        return this.y;
    }

    @Override
    public class00002 y(class06069 class060692) {
        int n = this.i();
        if (this.N.isEmpty() || n == 0) {
            return class09033.y;
        }
        int n2 = class060692.y(n);
        for (class00124<class00002> var5 : this.N) {
            if ((n2 -= var5.i()) >= 0) continue;
            return var5.y(class060692);
        }
        return class09033.y;
    }
}

