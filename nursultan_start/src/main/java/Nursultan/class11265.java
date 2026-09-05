/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class11232;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class07438;

public class class11265 {
    public Object N_0;
    public Object N_1;

    public class11265(class07438 class074382) {
        this.u();
        this.N_0 = new ArrayList();
        this.N_1 = class074382;
    }

    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class11265 class112652 = (class11265)object;
        return Objects.equals(((class07438)this.N_1).method_5628(), ((class07438)class112652.N_1).method_5628());
    }

    public int hashCode() {
        return Objects.hashCode(((class07438)this.N_1).method_5628());
    }

    private void u() {
    }

    public class07438 y() {
        return (class07438)this.N_1;
    }

    public List<class11232> N() {
        return (List)this.N_0;
    }
}

