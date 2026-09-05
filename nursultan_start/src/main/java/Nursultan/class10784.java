/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class04770
 *  minecraft.class06794
 *  minecraft.class07675
 *  minecraft.class07680
 *  minecraft.class07701
 *  minecraft.class08774
 */
package Nursultan;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import minecraft.class04770;
import minecraft.class06794;
import minecraft.class07675;
import minecraft.class07680;
import minecraft.class07701;
import minecraft.class08774;

public class class10784
implements class07675 {
    private final class06794 N;

    public class10784(class06794 class067942) {
        this.N = class067942;
    }

    public Collection<class08774> getNames(class07701 class077012) throws CommandSyntaxException {
        List var2 = this.N.u(class077012);
        if (var2.isEmpty()) {
            throw class07680.i.create();
        }
        ArrayList<class08774> arrayList = new ArrayList<class08774>();
        for (class04770 class047702 : var2) {
            arrayList.add(class047702.method_72498());
        }
        return arrayList;
    }
}

