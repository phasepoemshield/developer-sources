/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00828
 *  minecraft.class01929
 *  minecraft.class01997
 *  minecraft.class03711
 *  minecraft.class03719
 *  minecraft.class04476
 *  minecraft.class05544
 *  minecraft.class05946
 *  minecraft.class06516
 *  minecraft.class06521
 *  minecraft.class07135
 *  minecraft.class07151
 *  minecraft.class07165
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import minecraft.class00828;
import minecraft.class01929;
import minecraft.class01997;
import minecraft.class03711;
import minecraft.class03719;
import minecraft.class04476;
import minecraft.class05544;
import minecraft.class05946;
import minecraft.class06516;
import minecraft.class06521;
import minecraft.class06880;
import minecraft.class06912;
import minecraft.class07135;
import minecraft.class07151;
import minecraft.class07165;
import org.jspecify.annotations.Nullable;

class class06872
implements class03719 {
    final /* synthetic */ Set N;
    final /* synthetic */ List y;
    final /* synthetic */ class04476 L;
    final /* synthetic */ class01929 u;
    final /* synthetic */ class01997 i;
    final /* synthetic */ class01997 R;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class06872(class06880 class068802, Set set, List list, class04476 class044762, class01929 class019292, class01997 class019972, class01997 class019973) {
        this.N = set;
        this.y = list;
        this.L = class044762;
        this.u = class019292;
        this.i = class019972;
        this.R = class019973;
    }

    private void N(class05946<class06521<?>> class059462, class06521<?> class065212) {
        this.y.add(class07135.N((class04476)this.L, (class01929)this.u, (Codec)class06521.R, class065212, (Path)this.i.N(class059462.N())));
    }

    private void N(class03711 class037112) {
        this.y.add(class07135.N((class04476)this.L, (class01929)this.u, (Codec)class07151.N, (Object)class037112.y(), (Path)this.R.N(class037112.N())));
    }

    public void method_62738() {
        class03711 class037112 = class07165.y().N("impossible", class06912.y.N((class06516)new class00828())).y(class05544.N);
        this.N(class037112);
    }

    public class07165 method_53818() {
        return class07165.y().N(class05544.N);
    }

    public void method_53819(class05946<class06521<?>> class059462, class06521<?> class065212, @Nullable class03711 class037112) {
        if (!this.N.add(class059462)) {
            throw new IllegalStateException("Duplicate recipe " + String.valueOf(class059462.N()));
        }
        this.N(class059462, class065212);
        if (class037112 != null) {
            this.N(class037112);
        }
    }
}

