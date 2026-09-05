/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class00225
 *  minecraft.class03556
 *  minecraft.class04251
 *  minecraft.class04782
 *  minecraft.class04797
 *  minecraft.class07536
 *  minecraft.class08610
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import minecraft.class00225;
import minecraft.class03556;
import minecraft.class04251;
import minecraft.class04782;
import minecraft.class04797;
import minecraft.class05492;
import minecraft.class05494;
import minecraft.class05498;
import minecraft.class05508;
import minecraft.class05513;
import minecraft.class05514;
import minecraft.class05516;
import minecraft.class05531;
import minecraft.class05532;
import minecraft.class07536;
import minecraft.class08610;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05520 {
    public static final int N = 8;
    private static final Logger i = LogUtils.getLogger();
    final class04782 y;
    private final class05492 R;
    private final List<class05513> M;
    private ImmutableList<class05531> B;
    final List<class04251> L = Lists.newArrayList();
    private final List<class05513> Z = Lists.newArrayList();
    private final class05498 z;
    private boolean U = true;
    private @Nullable class03556<class00225> E;
    private final class05516 W;
    private final class05516 m;
    final boolean u;
    private final boolean P;

    public void L() {
        this.U = true;
        if (this.E != null) {
            this.u();
        }
    }

    protected class05520(class05498 class054982, Collection<class05531> collection, class04782 class047822, class05492 class054922, class05516 class055162, class05516 class055163, boolean bl, boolean bl2) {
        this.y = class047822;
        this.R = class054922;
        this.z = class054982;
        this.W = class055162;
        this.m = class055163;
        this.B = ImmutableList.copyOf(collection);
        this.u = bl;
        this.P = bl2;
        this.M = (List)this.B.stream().flatMap(class055312 -> class055312.y().stream()).collect(class07536.y());
        class054922.N(this);
        this.M.forEach(class055132 -> class055132.N((class05532)new class04797()));
    }

    private void i() {
        if (!this.Z.isEmpty()) {
            i.info("Starting re-run of tests: {}", (Object)this.Z.stream().map(class055132 -> class055132.y().toString()).collect(Collectors.joining(", ")));
            this.B = ImmutableList.copyOf(this.z.batch(this.Z));
            this.Z.clear();
            this.U = false;
            this.N(0);
        } else {
            this.B = ImmutableList.of();
            this.U = true;
        }
    }

    void u() {
        if (this.E != null) {
            ((class00225)this.E.N()).y(this.y);
            this.E = null;
        }
    }

    private Optional<class05513> y(class05513 class055132) {
        if (class055132.L() == null) {
            return this.m.spawnStructure(class055132);
        }
        return this.W.spawnStructure(class055132);
    }

    public void y() {
        this.U = false;
        this.N(0);
    }

    private Collection<class05513> N(Collection<class05513> collection) {
        return collection.stream().map(this::y).flatMap(Optional::stream).toList();
    }

    public void N(class05513 class055132) {
        class05513 class055133 = class055132.O();
        class055132.Q().forEach(class055322 -> class055322.N(class055132, class055133, this));
        this.M.add(class055133);
        this.Z.add(class055133);
        if (this.U) {
            this.i();
        }
    }

    void N(int n) {
        class05531 class055312;
        if (n >= this.B.size()) {
            this.u();
            this.i();
            return;
        }
        if (n > 0 && this.P) {
            class055312 = (class05531)((Object)this.B.get(n - 1));
            class055312.y().forEach(class055132 -> {
                class08610 class086102 = class055132.R();
                class05514.N(class086102.u(), this.y);
                this.y.N(class086102.d(), false);
            });
        }
        class055312 = (class05531)((Object)this.B.get(n));
        this.W.N(this.y);
        this.m.N(this.y);
        Collection<class05513> var3 = this.N(class055312.y());
        i.info("Running test environment '{}' batch {} ({} tests)...", new Object[]{class055312.L().M(), class055312.N(), var3.size()});
        this.u();
        this.E = class055312.L();
        ((class00225)this.E.N()).N(this.y);
        this.L.forEach(class042512 -> class042512.N(class055312));
        class05494 class054942 = new class05494();
        var3.forEach(class054942::N);
        class054942.N(new class05508(this, class054942, class055312, n));
        var3.forEach(this.R::N);
    }

    public void N(class04251 class042512) {
        this.L.add(class042512);
    }

    public List<class05513> N() {
        return this.M;
    }
}

