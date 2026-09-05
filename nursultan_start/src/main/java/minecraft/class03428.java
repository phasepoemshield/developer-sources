/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00392
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class00392;
import minecraft.class03447;
import minecraft.class03457;

public interface class03428 {
    public class03428 N();

    public void N(class03457 var1, class03447<?> var2);

    default public void N(class03457 class034572, class00392 ... class00392Array) {
        this.N(class034572, class03447.N((List<class00392>)ImmutableList.copyOf((Object[])class00392Array)));
    }

    default public void N(class03457 class034572, String string) {
        this.N(class034572, class03447.N(string));
    }

    default public void N(class03457 class034572, class00392 class003922) {
        this.N(class034572, class03447.N(class003922.getString()));
    }
}

