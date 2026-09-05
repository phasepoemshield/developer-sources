/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class01262
 *  minecraft.class01264
 *  minecraft.class01267
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class00392;
import minecraft.class01262;
import minecraft.class01264;
import minecraft.class01267;
import minecraft.class05971;

public class class05938
implements class05971 {
    private static final class00392 N = class00392.L((String)"spectatorMenu.root.prompt");
    private final List<class01262> y = Lists.newArrayList();

    public class05938() {
        this.y.add((class01262)new class01264());
        this.y.add((class01262)new class01267());
    }

    @Override
    public class00392 y() {
        return N;
    }

    @Override
    public List<class01262> N() {
        return this.y;
    }
}

