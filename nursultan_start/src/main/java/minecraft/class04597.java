/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class01235
 *  minecraft.class01894
 *  minecraft.class04907
 *  minecraft.class05724
 *  minecraft.class06202
 *  minecraft.class08392
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01235;
import minecraft.class01894;
import minecraft.class04610;
import minecraft.class04616;
import minecraft.class04907;
import minecraft.class05724;
import minecraft.class06202;
import minecraft.class08392;

class class04597
extends class05724<class04616> {
    final /* synthetic */ class04610 N;

    public class04597(class04610 class046102, class06202 class062022) {
        this.N = class046102;
        super(class062022, class046102.field_22789, class046102.M.u(), 33, 14);
        ObjectArrayList objectArrayList = new ObjectArrayList(class01235.Z.iterator());
        objectArrayList.sort(Comparator.comparing(class049072 -> class08392.N((String)class04610.N((class04907<class01894>)class049072), (Object[])new Object[0])));
        for (class04907 class049073 : objectArrayList) {
            this.method_25321((class01202)new class04616(this, class049073));
        }
    }

    public int method_25322() {
        return 280;
    }

    protected void method_57715(class01054 class010542) {
    }

    protected void method_57713(class01054 class010542) {
    }
}

