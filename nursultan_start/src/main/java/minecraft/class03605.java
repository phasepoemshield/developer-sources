/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00392
 *  minecraft.class01321
 *  minecraft.class04719
 *  minecraft.class05096
 *  minecraft.class05361
 *  minecraft.class05362
 */
package minecraft;

import com.google.gson.JsonObject;
import minecraft.class00392;
import minecraft.class01321;
import minecraft.class03576;
import minecraft.class03596;
import minecraft.class04719;
import minecraft.class05096;
import minecraft.class05361;
import minecraft.class05362;

public class class03605
extends class03576 {
    private static final String M = "url";
    private static final String B = "buttonText";
    private static final String Z = "message";
    private final String z;
    private final class03596 U;
    private final class03596 E;

    private class03605(class03576 class035762, String string, class03596 class035962, class03596 class035963) {
        super(class035762.L, class035762.u, class035762.i, class035762.R);
        this.z = string;
        this.U = class035962;
        this.E = class035963;
    }

    public class00392 u() {
        return this.E.N((class00392)class00392.L((String)"mco.notification.visitUrl.message.default"));
    }

    public static class03605 N(class03576 class035762, JsonObject jsonObject) {
        String string = class04719.N((String)M, (JsonObject)jsonObject);
        class03596 class035962 = (class03596)class04719.N((String)B, (JsonObject)jsonObject, class03596::N);
        class03596 class035963 = (class03596)class04719.N((String)Z, (JsonObject)jsonObject, class03596::N);
        return new class03605(class035762, string, class035962, class035963);
    }

    public class05362 N(class05096 class050962) {
        return class05362.method_46430((class00392)this.U.N(class03576.y), (class05361)class01321.y((class05096)class050962, (String)this.z)).N();
    }
}

