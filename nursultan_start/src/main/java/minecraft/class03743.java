/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02071
 *  minecraft.class02102
 *  minecraft.class03409
 *  minecraft.class03943
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06613
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class02071;
import minecraft.class02102;
import minecraft.class03409;
import minecraft.class03709;
import minecraft.class03725;
import minecraft.class03732;
import minecraft.class03740;
import minecraft.class03943;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06613;
import org.jspecify.annotations.Nullable;

public class class03743
extends class03709<class03740> {
    private static final class00392 m = class00392.L((String)"gui.abuseReport.name.title");
    private static final class00392 P = class00392.L((String)"gui.abuseReport.name.comment_box_label");
    private @Nullable class03943 s;

    public class03743(class05096 class050962, class03409 class034092, class03732 class037322) {
        this(class050962, class034092, new class03740(class037322, class034092.N().y()));
    }

    public class03743(class05096 class050962, class03409 class034092, UUID uUID, String string) {
        this(class050962, class034092, new class03740(uUID, string, class034092.N().y()));
    }

    private class03743(class05096 class050962, class03409 class034092, class03740 class037402) {
        super(m, class050962, class034092, class037402);
    }

    @Override
    protected void N() {
        class05216 class052162 = class00392.y((String)((class03732)((class03740)this.E).i()).N()).N(class06541.field_1054);
        this.U.N((class02102)new class02071((class00392)class00392.N((String)"gui.abuseReport.name.reporting", (Object[])new Object[]{class052162}), this.field_22793), class020722 -> class020722.y().N(0, 8));
        Objects.requireNonNull(this.field_22793);
        this.s = this.N(280, 72, string -> {
            ((class03740)this.E).N((String)string);
            this.y();
        });
        this.U.N((class02102)class03725.N(this.field_22793, (class02102)this.s, P, class020722 -> class020722.i(12)));
    }

    public boolean method_25406(class06613 class066132) {
        if (super.method_25406(class066132)) {
            return true;
        }
        if (this.s != null) {
            return this.s.method_25406(class066132);
        }
        return false;
    }
}

