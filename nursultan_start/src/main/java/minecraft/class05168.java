/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05184
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06187
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07321
 *  minecraft.class08088
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05154;
import minecraft.class05163;
import minecraft.class05184;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06187;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07321;
import minecraft.class08088;

public class class05168
extends class05154 {
    private final List<class05163> y = Lists.newLinkedList();

    public class05168(int n, class06069 class060692, int n2, int n3, class06187 class061872) {
        super(class04878.L, n, class061872, new class05163(n2, 50, n3, n2 + 7 + class060692.y(6), 54 + class060692.y(6), n3 + 7 + class060692.y(6)));
        this.N = class061872;
    }

    public class05168(class07001 class070012) {
        super(class04878.L, class070012);
        this.y.addAll(class070012.N_15("Entrances", class05163.N.listOf()).orElse(List.of()));
    }

    public void N(int n, int n2, int n3) {
        super.N(n, n2, n3);
        Iterator<class05163> var4 = this.y.iterator();
        while (var4.hasNext()) {
            var4.next().N(n, n2, n3);
        }
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Entrances", class05163.N.listOf(), this.y);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        if (this.N((class07284)class059742, class051632)) {
            return;
        }
        this.N(class059742, class051632, this.k.B(), this.k.Z() + 1, this.k.z(), this.k.U(), Math.min(this.k.Z() + 3, this.k.E()), this.k.W(), w, w, false);
        for (class05163 class051633 : this.y) {
            this.N(class059742, class051632, class051633.B(), class051633.E() - 2, class051633.z(), class051633.U(), class051633.E(), class051633.W(), w, w, false);
        }
        this.N(class059742, class051632, this.k.B(), this.k.Z() + 4, this.k.z(), this.k.U(), this.k.E(), this.k.W(), w, false);
    }

    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        class05163 class051632;
        class05154 class051542;
        int n;
        int n2 = this.u();
        int n3 = this.k.i() - 3 - 1;
        if (n3 <= 0) {
            n3 = 1;
        }
        for (n = 0; n < this.k.u() && (n += class060692.y(this.k.u())) + 3 <= this.k.u(); n += 4) {
            class051542 = class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() + n), (int)(this.k.Z() + class060692.y(n3) + 1), (int)(this.k.z() - 1), (class07211)class07211.field_11043, (int)n2);
            if (class051542 == null) continue;
            class051632 = class051542.L();
            this.y.add(new class05163(class051632.B(), class051632.Z(), this.k.z(), class051632.U(), class051632.E(), this.k.z() + 1));
        }
        for (n = 0; n < this.k.u() && (n += class060692.y(this.k.u())) + 3 <= this.k.u(); n += 4) {
            class051542 = class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() + n), (int)(this.k.Z() + class060692.y(n3) + 1), (int)(this.k.W() + 1), (class07211)class07211.field_11035, (int)n2);
            if (class051542 == null) continue;
            class051632 = class051542.L();
            this.y.add(new class05163(class051632.B(), class051632.Z(), this.k.W() - 1, class051632.U(), class051632.E(), this.k.W()));
        }
        for (n = 0; n < this.k.R() && (n += class060692.y(this.k.R())) + 3 <= this.k.R(); n += 4) {
            class051542 = class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() - 1), (int)(this.k.Z() + class060692.y(n3) + 1), (int)(this.k.z() + n), (class07211)class07211.field_11039, (int)n2);
            if (class051542 == null) continue;
            class051632 = class051542.L();
            this.y.add(new class05163(this.k.B(), class051632.Z(), class051632.z(), this.k.B() + 1, class051632.E(), class051632.W()));
        }
        for (n = 0; n < this.k.R() && (n += class060692.y(this.k.R())) + 3 <= this.k.R(); n += 4) {
            class051542 = class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() + 1), (int)(this.k.Z() + class060692.y(n3) + 1), (int)(this.k.z() + n), (class07211)class07211.field_11034, (int)n2);
            if (class051542 == null) continue;
            class051632 = class051542.L();
            this.y.add(new class05163(this.k.U() - 1, class051632.Z(), class051632.z(), this.k.U(), class051632.E(), class051632.W()));
        }
    }
}

