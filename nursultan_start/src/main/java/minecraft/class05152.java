/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class06633
 *  minecraft.class08774
 */
package minecraft;

import com.google.gson.JsonObject;
import java.io.File;
import java.util.Objects;
import minecraft.class05142;
import minecraft.class05151;
import minecraft.class05182;
import minecraft.class06633;
import minecraft.class08774;

public class class05152
extends class05182<class08774, class05142> {
    @Override
    protected String L(class08774 class087742) {
        return class087742.N().toString();
    }

    public class05152(File file, class06633 class066332) {
        super(file, class066332);
    }

    @Override
    public String[] y() {
        return (String[])this.i().stream().map(class05151::B).filter(Objects::nonNull).map(class08774::y).toArray(String[]::new);
    }

    public boolean y(class08774 class087742) {
        if (super.N(class087742)) {
            this.N.y(class087742);
            return true;
        }
        return false;
    }

    @Override
    protected class05151<class08774> N(JsonObject jsonObject) {
        return new class05142(jsonObject);
    }

    @Override
    public boolean N(class05142 class051422) {
        if (super.N(class051422)) {
            if (class051422.B() != null) {
                this.N.N((class08774)class051422.B());
            }
            return true;
        }
        return false;
    }

    @Override
    public void N() {
        for (class05142 class051422 : this.i()) {
            if (class051422.B() == null) continue;
            this.N.y((class08774)class051422.B());
        }
        super.N();
    }
}

