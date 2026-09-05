/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.logging.LogUtils
 *  minecraft.class01622
 *  minecraft.class07074
 *  minecraft.class07080
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import minecraft.class01622;
import minecraft.class03424;
import minecraft.class03438;
import minecraft.class03440;
import minecraft.class07074;
import minecraft.class07080;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03465 {
    private static final Logger N = LogUtils.getLogger();
    private @Nullable class03440 y;
    private int L;

    public void N() {
        if (this.y == null) {
            N.warn("Trying to finish reload, but nothing was started");
        } else {
            this.y.y = true;
        }
    }

    public void N(class07080 class070802) {
        class07074 class070742 = class070802.N("Last reload");
        class070742.N("Reload number", (Object)this.L);
        if (this.y != null) {
            this.y.N(class070742);
        }
    }

    public void N(class03424 class034242, List<class01622> list) {
        ++this.L;
        if (this.y != null && !this.y.y) {
            N.warn("Reload already ongoing, replacing");
        }
        this.y = new class03440(class034242, (List)list.stream().map(class01622::method_14409).collect(ImmutableList.toImmutableList()));
    }

    public void N(Throwable throwable) {
        if (this.y == null) {
            N.warn("Trying to signal reload recovery, but nothing was started");
            this.y = new class03440(class03424.field_33704, (List<String>)ImmutableList.of());
        }
        this.y.N = new class03438(throwable);
    }
}

