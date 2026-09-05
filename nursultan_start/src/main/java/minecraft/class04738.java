/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class04950
 *  minecraft.class04981
 *  minecraft.class06202
 *  minecraft.class06318
 */
package minecraft;

import java.util.Objects;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class04710;
import minecraft.class04718;
import minecraft.class04726;
import minecraft.class04730;
import minecraft.class04950;
import minecraft.class04981;
import minecraft.class06202;
import minecraft.class06318;

class class04738
extends class06318<class04718> {
    private static final int y = 36;
    final /* synthetic */ class04710 N;

    public class04738(class04710 class047102, int n, int n2) {
        this.N = class047102;
        super(class06202.Nq(), n, n2, class047102.u.y(), 36);
    }

    private void y(class04981 class049812) {
        class04726 class047262 = new class04726(this.N);
        Objects.requireNonNull(this.N.R);
        this.method_73370((class01202)class047262, class047262.N(9));
        for (class04730 class047302 : class049812.Z.stream().map(class049502 -> new class04730(this.N, (class04950)class049502)).toList()) {
            this.method_25321((class01202)class047302);
        }
    }

    void N(class04981 class049812) {
        this.method_25339();
        this.y(class049812);
    }

    public int method_25322() {
        return 300;
    }

    protected void method_57715(class01054 class010542) {
    }

    protected void method_57713(class01054 class010542) {
    }
}

