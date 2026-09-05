/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class06695
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08044
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.transfer;

import minecraft.class00394;
import minecraft.class06695;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08044;
import org.jspecify.annotations.Nullable;

public final class DebugMessages {
    public static String forPlayer(class08036 class080362) {
        return String.valueOf(class080362.method_5476()) + "/" + class080362.method_5845();
    }

    public static String forGlobalPos(@Nullable class07299 class072992, class07209 class072092) {
        String string = class072992 != null ? class072992.method_40134().M() : "<no dimension>";
        return string + "@" + class072092.method_23854();
    }

    public static String forInventory(@Nullable class06695 class066952) {
        if (class066952 == null) {
            return "~~NULL~~";
        }
        if (class066952 instanceof class08044) {
            class08044 class080442 = (class08044)class066952;
            return DebugMessages.forPlayer(class080442.z);
        }
        Object object = class066952.toString();
        if (class066952 instanceof class00394) {
            class00394 class003942 = (class00394)class066952;
            object = (String)object + " (%s, %s)".formatted(new Object[]{class003942.w(), DebugMessages.forGlobalPos(class003942.G(), class003942.d())});
        }
        return object;
    }
}

