/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class02006
 *  minecraft.class02028
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class02006;
import minecraft.class02028;
import minecraft.class08855;
import minecraft.class08866;
import minecraft.class08875;
import minecraft.class08880;
import minecraft.class08887;

class class08873
implements class02006<class08875> {
    final /* synthetic */ class08855 N;

    class08873(class08855 class088552) {
        this.N = class088552;
    }

    public class08875 y(class02028 class020282) {
        ImmutableList.Builder builder = ImmutableList.builderWithExpectedSize((int)this.N.N.size());
        for (class08866<class08880> var4 : this.N.N) {
            builder.add(var4.N(var4.y().method_68521(class020282)));
        }
        return new class08875((List<class08866<class08887>>)builder.build());
    }
}

