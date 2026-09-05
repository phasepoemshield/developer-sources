/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  Nursultan.class10419
 *  minecraft.class02063
 *  minecraft.class05196
 *  minecraft.class05561
 *  minecraft.class06925
 *  minecraft.class06929
 */
package minecraft;

import Nursultan.class10416;
import Nursultan.class10419;
import java.util.List;
import java.util.Optional;
import minecraft.class02063;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class05196;
import minecraft.class05561;
import minecraft.class06925;
import minecraft.class06929;

public class class04492 {
    private final class04490 N;
    private final class02063 y;

    public class04492(class04490 class044902, class02063 class020632) {
        this.N = class044902;
        this.y = class020632;
    }

    public void N(class05196 class051962, class06929 class069292, String string) {
        class051962.N(new class05561(this.N.N_46((class04489)new class10419(string)), class069292, this.y));
    }

    public void N(List<class05196> list, class06929 class069292, String string) {
        for (int i = 0; i < list.size(); ++i) {
            list.get(i).N(new class05561(this.N.N_46((class04489)new class10416(string, i)), class069292, this.y));
        }
    }

    public void N(class05196 class051962, String string) {
        this.N(class051962, class06925.P, string);
    }

    public void N(List<class05196> list, String string) {
        this.N(list, class06925.P, string);
    }

    public void N(Optional<class05196> optional, String string) {
        optional.ifPresent(class051962 -> this.N((class05196)class051962, string));
    }
}

