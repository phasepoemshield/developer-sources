/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class02073
 *  minecraft.class02102
 *  minecraft.class03380
 *  minecraft.class03399
 *  minecraft.class03406
 *  minecraft.class03409
 *  minecraft.class03417
 *  minecraft.class03418
 *  minecraft.class03709
 *  minecraft.class03725
 *  minecraft.class03752
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class06613
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02073;
import minecraft.class02102;
import minecraft.class03380;
import minecraft.class03399;
import minecraft.class03406;
import minecraft.class03409;
import minecraft.class03417;
import minecraft.class03418;
import minecraft.class03709;
import minecraft.class03725;
import minecraft.class03752;
import minecraft.class03943;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class06613;

public class class03948
extends class03709<class03399> {
    private static final class00392 m = class00392.L((String)"gui.chatReport.title");
    private static final class00392 P = class00392.L((String)"gui.chatReport.select_chat");
    private class03943 s;
    private class05362 T;
    private class05362 b;

    public class03948(class05096 class050962, class03409 class034092, class03406 class034062) {
        this(class050962, class034092, new class03399(class034062, class034092.N().y()));
    }

    public class03948(class05096 class050962, class03409 class034092, UUID uUID) {
        this(class050962, class034092, new class03399(uUID, class034092.N().y()));
    }

    private class03948(class05096 class050962, class03409 class034092, class03399 class033992) {
        super(m, class050962, class034092, (class02073)class033992);
    }

    protected void y() {
        IntSet intSet = ((class03399)this.E).N();
        if (intSet.isEmpty()) {
            this.T.method_25355(P);
        } else {
            this.T.method_25355((class00392)class00392.N((String)"gui.chatReport.selected_chat", (Object[])new Object[]{intSet.size()}));
        }
        class03380 class033802 = ((class03399)this.E).Z();
        if (class033802 != null) {
            this.b.method_25355(class033802.y());
        } else {
            this.b.method_25355(L);
        }
        super.y();
    }

    protected void N() {
        this.T = (class05362)this.U.N((class02102)class05362.method_46430((class00392)P, class053622 -> this.field_22787.N((class05096)new class03417((class05096)this, this.z, (class03399)this.E, class033992 -> {
            this.E = class033992;
            this.y();
        }))).N(280).N());
        this.b = class05362.method_46430((class00392)L, class053622 -> this.field_22787.N((class05096)new class03418((class05096)this, ((class03399)this.E).Z(), class03752.field_46064, class033802 -> {
            ((class03399)this.E).N(class033802);
            this.y();
        }))).N(280).N();
        this.U.N((class02102)class03725.N((class01590)this.field_22793, (class02102)this.b, (class00392)y));
        Objects.requireNonNull(this.field_22793);
        this.s = this.N(280, 72, string -> {
            ((class03399)this.E).N(string);
            this.y();
        });
        this.U.N((class02102)class03725.N((class01590)this.field_22793, (class02102)this.s, (class00392)u, class020722 -> class020722.i(12)));
    }

    public boolean method_25406(class06613 class066132) {
        if (super.method_25406(class066132)) {
            return true;
        }
        return this.s.method_25406(class066132);
    }
}

