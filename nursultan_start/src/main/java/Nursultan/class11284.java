/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11938
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class05216
 *  minecraft.class05341
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class06478
 *  minecraft.class06611
 *  minecraft.class06613
 */
package Nursultan;

import Nursultan.class11938;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class05216;
import minecraft.class05341;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class06478;
import minecraft.class06611;
import minecraft.class06613;

public class class11284
extends class05362 {
    public Object N_0;
    public Object N_1;
    public Object N_2;

    public int L() {
        this.U();
        return (Integer)this.N_2;
    }

    public class11284(int n, int n2, int n3, int n4, class05216 class052162, class05361 class053612, class05341 class053412, Consumer<class05362> consumer, Consumer<class05362> consumer2) {
        super(n, n2, n3, n4, (class00392)class052162, class053612, class053412);
        this.U();
        this.N_0 = consumer;
        this.N_1 = consumer2;
        this.N_2 = 0;
    }

    public Consumer<class05362> i() {
        this.U();
        return (Consumer)this.N_1;
    }

    private void U() {
        this.N_2 = 0;
    }

    public static /* synthetic */ class05341 u() {
        return field_40754;
    }

    public Consumer<class05362> y() {
        this.U();
        return (Consumer)this.N_0;
    }

    public void N() {
        this.U();
        if (!this.field_22763) {
            return;
        }
        if ((Integer)this.N_2 != 0 && (Integer)this.N_2 + 2 < class11938.j().y()) {
            ((Consumer)this.N_0).accept(this);
        }
    }

    public void method_25306(class06611 class066112) {
        this.U();
        super.method_25306(class066112);
        this.N_2 = class11938.j().y();
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        this.method_75794(class010542);
        this.method_75793(class010542.N((class06478)this, class01065.field_63850));
    }

    public void method_25357(class06613 class066132) {
        this.U();
        super.method_25357(class066132);
        if ((Integer)this.N_2 + 2 >= class11938.j().y()) {
            ((Consumer)this.N_1).accept(this);
        }
        this.N_2 = 0;
    }
}

