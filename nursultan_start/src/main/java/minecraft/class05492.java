/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import minecraft.class05493;
import minecraft.class05513;
import minecraft.class05520;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05492 {
    public static final class05492 N = new class05492();
    private static final Logger y = LogUtils.getLogger();
    private final Collection<class05513> L = Lists.newCopyOnWriteArrayList();
    private @Nullable class05520 u;
    private class05493 i = class05493.field_57042;

    private class05492() {
    }

    public void y() {
        if (this.u == null) {
            return;
        }
        this.i = class05493.field_57043;
        this.L.forEach(class055132 -> class055132.N(this.u));
        this.L.removeIf(class05513::U);
        class05493 class054932 = this.i;
        this.i = class05493.field_57042;
        if (class054932 == class05493.field_57044) {
            this.N();
        }
    }

    public void N(class05520 class055202) {
        if (this.u != null) {
            class07536.y((String)"The runner was already set in GameTestTicker");
        }
        this.u = class055202;
    }

    public void N() {
        if (this.i != class05493.field_57042) {
            this.i = class05493.field_57044;
            return;
        }
        this.L.clear();
        if (this.u != null) {
            this.u.L();
            this.u = null;
        }
    }

    public void N(class05513 class055132) {
        this.L.add(class055132);
    }
}

