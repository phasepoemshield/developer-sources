/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class02252
 *  minecraft.class03434
 *  minecraft.class04601
 *  minecraft.class04654
 *  minecraft.class04708
 *  minecraft.class04740
 *  minecraft.class04948
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05729
 *  minecraft.class05936
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class02252;
import minecraft.class03434;
import minecraft.class04601;
import minecraft.class04654;
import minecraft.class04708;
import minecraft.class04740;
import minecraft.class04948;
import minecraft.class05092;
import minecraft.class05094;
import minecraft.class05096;
import minecraft.class05112;
import minecraft.class05129;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05729;
import minecraft.class05936;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;

class class05091
extends class05729<class05091> {
    private static final int y = 2;
    private final class04948 L;
    private @Nullable class05362 u;
    private @Nullable class05362 i;
    private final List<class06478> R = new ArrayList<class06478>();
    final /* synthetic */ class05094 N;

    public class05091(class05094 class050942, class04948 class049482) {
        this.N = class050942;
        this.L = class049482;
        this.N(class049482);
        if (!class049482.R.isEmpty()) {
            this.i = class05362.method_46430((class00392)class05094.L, class053622 -> class05094.Z(this.N).N((class05096)((Object)((Object)((Object)new class05112((class05096)((Object)((Object)((Object)this.N))), this.L)))))).N(8 + class05094.y(class050942).N((class05936)class05094.L)).N(this::N).N();
            this.R.add((class06478)this.i);
        }
        if (!class050942.z.U) {
            this.u = class05362.method_46430((class00392)class05094.y, class053622 -> this.N()).N(8 + class05094.L(class050942).N((class05936)class05094.L)).N(this::N).N();
            this.R.add((class06478)this.u);
        }
    }

    private class05216 N(Supplier<class05216> supplier) {
        return class05220.N((class00392[])new class00392[]{class00392.N((String)"mco.backup.narration", (Object[])new Object[]{class05094.u.format(this.L.N())}), (class00392)supplier.get()});
    }

    private void N() {
        class00392 class003922 = class04601.N((Instant)this.L.y);
        String string = class05094.u.format(this.L.N());
        class05216 class052162 = class00392.N((String)"mco.configure.world.restore.question.line1", (Object[])new Object[]{string, class003922});
        class05094.u(this.N).N((class05096)class02252.y((class05096)((Object)this.N), (class00392)class052162, class037232 -> {
            class05092 class050922 = this.N.i.Z();
            class05094.B(this.N).N((class05096)new class04708((class05096)((Object)((Object)((Object)class050922))), new class05129[]{new class04740(this.L, this.N.z.y, class050922)}));
        }));
    }

    private void N(String string) {
        if (string.contains("uploaded")) {
            String string2 = class05094.u.format(this.L.N());
            this.L.R.put(string, string2);
            this.L.u = true;
        } else {
            this.L.R.put(string, (String)this.L.i.get(string));
        }
    }

    private void N(class04948 class049482) {
        int n = this.N.R.indexOf(class049482);
        if (n == this.N.R.size() - 1) {
            return;
        }
        class04948 class049483 = this.N.R.get(n + 1);
        for (String string : class049482.i.keySet()) {
            if (!string.contains("uploaded") && class049483.i.containsKey(string)) {
                if (((String)class049482.i.get(string)).equals(class049483.i.get(string))) continue;
                this.N(string);
                continue;
            }
            this.N(string);
        }
    }

    public List<? extends class04654> method_25396() {
        return this.R;
    }

    public List<? extends class03434> method_37025() {
        return this.R;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = this.method_73385();
        Objects.requireNonNull(class05094.i(this.N));
        int n4 = n3 - 9 - 2;
        int n5 = n3 + 2;
        int n6 = this.L.u ? -8388737 : -1;
        class010542.y(class05094.R(this.N), (class00392)class00392.N((String)"mco.backup.entry", (Object[])new Object[]{class04601.N((Instant)this.L.y)}), this.method_73380(), n4, n6);
        class010542.y(class05094.M(this.N), class05094.u.format(this.L.N()), this.method_73380(), n5, -11776948);
        int n7 = 0;
        int n8 = this.method_73385() - 10;
        if (this.u != null) {
            this.u.method_46421(this.method_73389() - (n7 += this.u.method_25368() + 8));
            this.u.method_46419(n8);
            this.u.method_25394(class010542, n, n2, f);
        }
        if (this.i != null) {
            this.i.method_46421(this.method_73389() - (n7 += this.i.method_25368() + 8));
            this.i.method_46419(n8);
            this.i.method_25394(class010542, n, n2, f);
        }
    }
}

