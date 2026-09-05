/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class00381
 *  minecraft.class00455
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06265
 *  minecraft.class07049
 *  minecraft.class07280
 *  minecraft.class07321
 *  minecraft.class08036
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00455;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06265;
import minecraft.class07049;
import minecraft.class07280;
import minecraft.class07321;
import minecraft.class08036;

public abstract class class06968<T> {
    protected final class00455<T> N;
    private final Set<UUID> y = new ObjectOpenHashSet();

    public class06968(class00455<T> class004552) {
        this.N = class004552;
    }

    protected void y(class04782 class047822) {
    }

    protected void y(class04770 class047702, class07321 class073212) {
    }

    protected void y(class04770 class047702, class07049 class070492) {
    }

    protected final void N(class04782 class047822, class07049 class070492, class00381<? super class07280> class003812) {
        class047822.method_14178().L.N(class070492, class003812, class047702 -> this.y.contains(class047702.method_5667()));
    }

    protected final void N(class04782 class047822, class07321 class073212, class00381<? super class07280> class003812) {
        class06265 class062652 = class047822.method_14178().L;
        for (UUID uUID : this.y) {
            class04770 class047702;
            class08036 class080362 = class047822.N(uUID);
            if (!(class080362 instanceof class04770) || !class062652.N(class047702 = (class04770)class080362, class073212.B, class073212.Z)) continue;
            class047702.field_13987.method_14364(class003812);
        }
    }

    private void N(class04770 class047702) {
        this.y.add(class047702.method_5667());
        class047702.method_52372().N(class073212 -> {
            if (!class047702.field_13987.field_45026.N(class073212.y())) {
                this.N(class047702, (class07321)class073212);
            }
        });
        class047702.method_51469().method_14178().L.N(class047702, (T class070492) -> this.N(class047702, (class07049)class070492));
    }

    public final void N(class04782 class047822) {
        for (class04770 class047702 : class047822.method_18456()) {
            boolean bl = this.y.contains(class047702.method_5667());
            boolean bl2 = class047702.method_74538().contains(this.N);
            if (bl2 == bl) continue;
            if (bl2) {
                this.N(class047702);
                continue;
            }
            this.y.remove(class047702.method_5667());
        }
        this.y.removeIf(uUID -> class047822.N(uUID) == null);
        if (!this.y.isEmpty()) {
            this.y(class047822);
        }
    }

    public final void N(class04770 class047702, class07321 class073212) {
        if (this.y.contains(class047702.method_5667())) {
            this.y(class047702, class073212);
        }
    }

    public final void N(class04770 class047702, class07049 class070492) {
        if (this.y.contains(class047702.method_5667())) {
            this.y(class047702, class070492);
        }
    }

    protected void N() {
    }
}

