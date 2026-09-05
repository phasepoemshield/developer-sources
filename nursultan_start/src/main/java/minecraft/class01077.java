/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class05151
 *  minecraft.class05182
 *  minecraft.class06633
 *  minecraft.class08774
 */
package minecraft;

import com.google.gson.JsonObject;
import java.io.File;
import java.util.Objects;
import minecraft.class01087;
import minecraft.class05151;
import minecraft.class05182;
import minecraft.class06633;
import minecraft.class08774;

public class class01077
extends class05182<class08774, class01087> {
    protected String L(class08774 class087742) {
        return class087742.N().toString();
    }

    public class01077(File file, class06633 class066332) {
        super(file, class066332);
    }

    public boolean y(class08774 class087742) {
        class01087 class010872 = (class01087)this.L(class087742);
        if (class010872 != null) {
            return class010872.y();
        }
        return false;
    }

    public String[] y() {
        return (String[])this.i().stream().map(class05151::B).filter(Objects::nonNull).map(class08774::y).toArray(String[]::new);
    }

    protected class05151<class08774> N(JsonObject jsonObject) {
        return new class01087(jsonObject);
    }

    public boolean N(class01087 class010872) {
        if (super.N((class05151)class010872)) {
            if (class010872.B() != null) {
                this.N.N(class010872);
            }
            return true;
        }
        return false;
    }

    public void N() {
        for (class01087 class010872 : this.i()) {
            if (class010872.B() == null) continue;
            this.N.y(class010872);
        }
        super.N();
    }

    public boolean N(class08774 class087742) {
        class01087 class010872 = (class01087)this.L(class087742);
        if (super.N((Object)class087742)) {
            if (class010872 != null) {
                this.N.y(class010872);
            }
            return true;
        }
        return false;
    }
}

