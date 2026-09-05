/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00305
 *  minecraft.class02934
 *  minecraft.class05838
 *  minecraft.class06222
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06521
 *  minecraft.class06584
 *  minecraft.class07299
 */
package minecraft;

import java.util.Optional;
import minecraft.class00305;
import minecraft.class02934;
import minecraft.class05838;
import minecraft.class06222;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06521;
import minecraft.class06584;
import minecraft.class07299;

public interface class03278
extends class06521<class02934> {
    public class06510 M();

    public Optional<class06510> B();

    default public class00305 i() {
        return class06222.E;
    }

    default public class05838<class03278> u() {
        return class05838.M;
    }

    default public boolean method_8115(class02934 class029342, class07299 class072992) {
        return class06510.method_61676(this.R(), (class06584)class029342.L()) && this.M().method_8093(class029342.u()) && class06510.method_61676(this.B(), (class06584)class029342.i());
    }

    public class06514<? extends class03278> method_8119();

    public Optional<class06510> R();
}

