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
import minecraft.class05151;
import minecraft.class05157;
import minecraft.class05182;
import minecraft.class06633;
import minecraft.class08774;

public class class05170
extends class05182<class08774, class05157> {
    @Override
    public boolean L(class08774 class087742) {
        if (super.N(class087742)) {
            this.N.L(class087742);
            return true;
        }
        return false;
    }

    public class05170(File file, class06633 class066332) {
        super(file, class066332);
    }

    @Override
    protected String y(class08774 class087742) {
        return class087742.N().toString();
    }

    @Override
    public String[] y() {
        return (String[])this.i().stream().map(class05151::B).filter(Objects::nonNull).map(class08774::y).toArray(String[]::new);
    }

    @Override
    public boolean N(class05157 class051572) {
        if (super.N(class051572)) {
            if (class051572.B() != null) {
                this.N.N(class051572);
            }
            return true;
        }
        return false;
    }

    @Override
    protected class05151<class08774> N(JsonObject jsonObject) {
        return new class05157(jsonObject);
    }

    @Override
    public void N() {
        for (class05157 class051572 : this.i()) {
            if (class051572.B() == null) continue;
            this.N.L((class08774)class051572.B());
        }
        super.N();
    }
}

