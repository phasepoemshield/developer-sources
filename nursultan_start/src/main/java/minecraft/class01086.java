/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class05151
 *  minecraft.class05182
 *  minecraft.class06633
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;
import minecraft.class01072;
import minecraft.class05151;
import minecraft.class05182;
import minecraft.class06633;
import org.jspecify.annotations.Nullable;

public class class01086
extends class05182<String, class01072> {
    private String L(SocketAddress socketAddress) {
        String string = socketAddress.toString();
        if (string.contains("/")) {
            string = string.substring(string.indexOf(47) + 1);
        }
        if (string.contains(":")) {
            string = string.substring(0, string.indexOf(58));
        }
        return string;
    }

    public class01086(File file, class06633 class066332) {
        super(file, class066332);
    }

    public boolean y(String string) {
        if (super.N((Object)string)) {
            this.N.N(string);
            return true;
        }
        return false;
    }

    public @Nullable class01072 y(SocketAddress socketAddress) {
        String string = this.L(socketAddress);
        return (class01072)this.L(string);
    }

    public void N() {
        for (class01072 class010722 : this.i()) {
            if (class010722.B() == null) continue;
            this.N.N((String)class010722.B());
        }
        super.N();
    }

    public boolean N(SocketAddress socketAddress) {
        String string = this.L(socketAddress);
        return this.u(string);
    }

    protected class05151<String> N(JsonObject jsonObject) {
        return new class01072(jsonObject);
    }

    public boolean N(class01072 class010722) {
        if (super.N((class05151)class010722)) {
            if (class010722.B() != null) {
                this.N.N(class010722);
            }
            return true;
        }
        return false;
    }
}

