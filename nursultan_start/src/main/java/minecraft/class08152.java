/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07569
 */
package minecraft;

import minecraft.class07569;
import minecraft.class08159;

public interface class08152 {
    public static final class08152 M = class081592 -> false;
    public static final class08152 B = class081592 -> true;

    default public class08152 N(class08152 class081522) {
        if (class081522 instanceof class07569) {
            return class081522.N(this);
        }
        return new class07569(this, class081522);
    }

    public boolean hasPermission(class08159 var1);
}

