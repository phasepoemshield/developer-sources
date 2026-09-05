/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Arrows
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.Arrows;
import Nursultan.class11034;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import java.util.Optional;
import minecraft.class07049;
import minecraft.class07438;

public class class11042<T extends class07438>
extends class11034<T> {
    public Object L_0;
    public Object L_1;

    @Override
    public int L() {
        this.B();
        return (Integer)((class11515)this.L_1).i();
    }

    public class11042(Arrows arrows, String string, boolean bl) {
        super(arrows, string, bl);
        this.B();
    }

    static {
        class11042.u();
    }

    private void B() {
    }

    private static void u() {
    }

    public void N(Arrows arrows) {
        String string = "living-radius";
        String string2 = "living-color";
        Optional.ofNullable((class11504)arrows.L(arrows.N_7(string).N())).ifPresentOrElse(class115042 -> {
            this.B();
            this.L_0 = (class11504)class115042.N(class115042.Z().or(class115362 -> this.U()));
        }, () -> {
            this.B();
            this.L_0 = (class11504)class11524.N((class11512)arrows, (String)string, (float)90.0f, (float)70.0f, (float)140.0f, (float)1.0f).N(class115362 -> this.U());
        });
        Optional.ofNullable((class11515)arrows.L(arrows.N_7(string2).N())).ifPresentOrElse(class115152 -> {
            this.B();
            this.L_1 = (class11515)class115152.N(class115152.Z().or(class115362 -> this.U()));
        }, () -> {
            this.B();
            this.L_1 = (class11515)class11524.N((class11512)arrows, (String)string2, (int)-1).N(class115362 -> this.U());
        });
    }

    @Override
    public float N() {
        this.B();
        return ((Float)((class11504)this.L_0).i()).floatValue();
    }

    public boolean test(class07049 class070492) {
        return class070492 instanceof class07438;
    }
}

