/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 *  minecraft.class07469
 *  minecraft.class08085
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;
import minecraft.class07469;
import minecraft.class08085;

public class class08056
implements class00381<class07280> {
    public static final class02362<class04247, class08056> N = class02362.N((class02362)class02389.B, class08056::N, (class02362)class08085.y.N_33(class02389.N()), class08056::y, class08056::new);
    private final int y;
    private final List<class08085> L;

    public class08056(int n, Collection<class07469> collection) {
        this.y = n;
        this.L = Lists.newArrayList();
        for (class07469 class074692 : collection) {
            this.L.add(new class08085(class074692.N(), class074692.y(), (Collection)class074692.L()));
        }
    }

    private class08056(int n, List<class08085> list) {
        this.y = n;
        this.L = list;
    }

    public List<class08085> y() {
        return this.L;
    }

    public int N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class08056> method_65080() {
        return class04248.yE;
    }
}

