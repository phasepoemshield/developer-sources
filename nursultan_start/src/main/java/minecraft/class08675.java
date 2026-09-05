/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08647
 *  minecraft.class08650
 *  minecraft.class08652
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class08647;
import minecraft.class08650;
import minecraft.class08652;
import minecraft.class08669;
import org.jspecify.annotations.Nullable;

class class08675 {
    public final @Nullable class08675 N;
    public @Nullable class08675 y;
    public @Nullable List<class08669> L;
    public @Nullable List<class08669> u;
    public @Nullable List<class08650> i;
    public @Nullable List<class08652> R;
    public @Nullable List<class08647> M;

    class08675(@Nullable class08675 class086752) {
        this.N = class086752;
    }

    public void y(class08669 class086692) {
        if (this.u == null) {
            this.u = new ArrayList<class08669>();
        }
        this.u.add(class086692);
    }

    public void N(class08647 class086472) {
        if (this.M == null) {
            this.M = new ArrayList<class08647>();
        }
        this.M.add(class086472);
    }

    public void N(class08669 class086692) {
        if (this.L == null) {
            this.L = new ArrayList<class08669>();
        }
        this.L.add(class086692);
    }

    public void N(class08650 class086502) {
        if (this.i == null) {
            this.i = new ArrayList<class08650>();
        }
        this.i.add(class086502);
    }

    public void N(class08652 class086522) {
        if (this.R == null) {
            this.R = new ArrayList<class08652>();
        }
        this.R.add(class086522);
    }
}

