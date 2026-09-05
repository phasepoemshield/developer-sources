/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11923
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01056
 *  minecraft.class01962
 *  minecraft.class03054
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06390
 *  minecraft.class06451
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11287;
import Nursultan.class11293;
import Nursultan.class11295;
import Nursultan.class11923;
import java.lang.runtime.SwitchBootstraps;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01056;
import minecraft.class01962;
import minecraft.class03054;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06390;
import minecraft.class06451;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11303 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    private static class00392 L(Object object) {
        Object object2 = object;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00392.class}, (Object)object2, (int)n)) {
            case 0 -> (class00392)object2;
            case -1 -> class00392.y((String)"null");
            default -> class00392.N((String)object.toString());
        };
    }

    private class11303() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11303.y();
        N_0 = LogManager.getLogger(String.class);
        N_1 = class06202.Nq();
        N_2 = new class03054(0xFFFFFF, null, class00392.N((String)"Nursultan message"), "Nursultan message");
    }

    public static void y(Object object) {
        class11303.N((class11287)class11293.N_0, class11303.L(object));
    }

    private static void y() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
    }

    public static void N(class11287 class112872, Object object) {
        class11303.N(class112872, class11303.L(object));
    }

    public static void N(Object object) {
        class11303.N((class11287)class11295.N_0, class11303.L(object));
    }

    private static void N(class06390 class063902) {
        String string = class063902.y().getString().replaceAll("\r", "\\r").replaceAll("\n", "\\n");
        String string2 = (String)class01962.N((Object)class063902.u(), class03054::B);
        if (string2 != null) {
            ((Logger)N_0).info("[{}] [CHAT] {}", (Object)string2, (Object)string);
            return;
        }
        ((Logger)N_0).info("[CHAT] {}", (Object)string);
    }

    public static void N(class11287 class112872, class00392 class003922) {
        class11923.N(() -> {
            class05216 class052162 = class00392.i().L().y(class00405.N).y((class00392)class112872.N()).y(class003922);
            class06390 class063902 = new class06390(((class01056)((class06202)class11303.N_1).i_6).R(), (class00392)class052162, null, (class03054)N_2);
            class11303.N(class063902);
            class06451 class064512 = ((class01056)((class06202)class11303.N_1).i_6).i();
            class064512.N(class063902);
            class064512.y(class063902);
        });
    }
}

