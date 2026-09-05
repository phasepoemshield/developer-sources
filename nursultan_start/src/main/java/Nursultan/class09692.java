/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09994
 */
package Nursultan;

import Nursultan.class09668;
import Nursultan.class09713;
import Nursultan.class09728;
import Nursultan.class09736;
import Nursultan.class09743;
import Nursultan.class09759;
import Nursultan.class09994;
import java.util.EnumMap;

public final class class09692 {
    private static void L(EnumMap<class09736, class09743> enumMap, class09743 class097432) {
        enumMap.put(class09736.VISUAL_TRANSLATE_X, class097432);
        enumMap.put(class09736.VISUAL_TRANSLATE_Y, class097432);
    }

    private class09692() {
    }

    private static void y(EnumMap<class09736, class09743> enumMap, class09743 class097432) {
        enumMap.put(class09736.POSITION_OFFSET_X, class097432);
        enumMap.put(class09736.POSITION_OFFSET_Y, class097432);
    }

    private static void N(EnumMap<class09736, class09743> enumMap, class09743 class097432) {
        enumMap.put(class09736.PADDING_LEFT, class097432);
        enumMap.put(class09736.PADDING_RIGHT, class097432);
        enumMap.put(class09736.PADDING_TOP, class097432);
        enumMap.put(class09736.PADDING_BOTTOM, class097432);
    }

    public static class09713 N(float f, class09759 class097592) {
        EnumMap<class09736, class09743> enumMap = new EnumMap<class09736, class09743>(class09736.class);
        class09728 class097282 = new class09728(Math.max(0.0f, f) / 1000.0f, class097592);
        if (!class097282.u()) {
            return class09713.N;
        }
        for (class09736 class097362 : class09736.values()) {
            enumMap.put(class097362, class097282);
        }
        return new class09713(enumMap);
    }

    public static class09713 N(class09994 ... class09994Array) {
        if (class09994Array == null || class09994Array.length == 0) {
            return class09713.N;
        }
        EnumMap<class09736, class09743> enumMap = new EnumMap<class09736, class09743>(class09736.class);
        for (class09994 class099942 : class09994Array) {
            if (class099942 == null || class099942.y() == null || !class099942.y().u()) continue;
            class09736 class097362 = class099942.N();
            if (class097362 == null && class099942.L() == class09668.PADDING) {
                class09692.N(enumMap, class099942.y());
                continue;
            }
            if (class097362 == null && class099942.L() == class09668.POSITION_OFFSET) {
                class09692.y(enumMap, class099942.y());
                continue;
            }
            if (class097362 == null && class099942.L() == class09668.VISUAL_TRANSLATE) {
                class09692.L(enumMap, class099942.y());
                continue;
            }
            if (class097362 == null) continue;
            enumMap.put(class097362, class099942.y());
        }
        return new class09713(enumMap);
    }
}

