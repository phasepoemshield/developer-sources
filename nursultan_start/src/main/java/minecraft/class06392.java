/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class01894
 *  minecraft.class04770
 *  minecraft.class04774
 *  minecraft.class04995
 *  minecraft.class06685
 *  minecraft.class06702
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class01894;
import minecraft.class04770;
import minecraft.class04774;
import minecraft.class04995;
import minecraft.class06425;
import minecraft.class06685;
import minecraft.class06702;

public class class06392
extends class04774 {
    private static final int B = 100;
    private final class01894 Z;
    private final Set<UUID> z = Sets.newHashSet();
    private int U;
    private int E = 100;

    public void L(class04770 class047702) {
        if (this.z.contains(class047702.method_5667())) {
            this.N(class047702);
        }
    }

    public class06392(class01894 class018942, class00392 class003922) {
        super(class003922, class06685.field_5786, class06702.field_5795);
        this.Z = class018942;
        this.N(0.0f);
    }

    public class01894 Z() {
        return this.Z;
    }

    public class06425 m() {
        return new class06425(this.y(), this.P(), this.U(), this.E(), this.u(), this.i(), this.R(), this.M(), this.B(), Set.copyOf(this.z));
    }

    public int U() {
        return this.U;
    }

    public void z() {
        super.z();
        this.z.clear();
    }

    public void u(class04770 class047702) {
        super.y(class047702);
    }

    public void y(int n) {
        this.E = n;
        this.N(class04995.N((float)((float)this.U / (float)n), (float)0.0f, (float)1.0f));
    }

    public void y(class04770 class047702) {
        super.y(class047702);
        this.z.remove(class047702.method_5667());
    }

    public int E() {
        return this.E;
    }

    public static class06392 N(class01894 class018942, class06425 class064252) {
        class06392 class063922 = new class06392(class018942, class064252.N());
        class063922.u(class064252.y());
        class063922.N(class064252.L());
        class063922.y(class064252.u());
        class063922.N(class064252.i());
        class063922.N(class064252.R());
        class063922.N(class064252.M());
        class063922.y(class064252.B());
        class063922.L(class064252.Z());
        class064252.z().forEach(class063922::N);
        return class063922;
    }

    public void N(class04770 class047702) {
        super.N(class047702);
        this.z.add(class047702.method_5667());
    }

    public void N(UUID uUID) {
        this.z.add(uUID);
    }

    public void N(int n) {
        this.U = n;
        this.N(class04995.N((float)((float)n / (float)this.E), (float)0.0f, (float)1.0f));
    }

    public boolean N(Collection<class04770> collection) {
        boolean bl;
        HashSet hashSet = Sets.newHashSet();
        HashSet hashSet2 = Sets.newHashSet();
        for (UUID uUID : this.z) {
            bl = false;
            for (class04770 class047702 : collection) {
                if (!class047702.method_5667().equals(uUID)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            hashSet.add(uUID);
        }
        for (class04770 class047703 : collection) {
            bl = false;
            for (UUID uUID : this.z) {
                if (!class047703.method_5667().equals(uUID)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            hashSet2.add(class047703);
        }
        for (UUID uUID : hashSet) {
            for (class04770 class047704 : this.s()) {
                if (!class047704.method_5667().equals(uUID)) continue;
                this.y(class047704);
                break;
            }
            this.z.remove(uUID);
        }
        for (class04770 class047705 : hashSet2) {
            this.N(class047705);
        }
        return !hashSet.isEmpty() || !hashSet2.isEmpty();
    }

    public final class00392 W() {
        return class00390.N((class00392)this.y()).N(class004052 -> class004052.N(this.u().N()).N((class00395)new class00401((class00392)class00392.y((String)this.Z().toString()))).N(this.Z().toString()));
    }
}

