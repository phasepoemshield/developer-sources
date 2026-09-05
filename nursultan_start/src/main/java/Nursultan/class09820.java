/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09937
 *  Nursultan.class09962
 *  Nursultan.class09965
 *  Nursultan.class09968
 *  Nursultan.class09980
 *  Nursultan.class09982
 *  Nursultan.class09985
 *  Nursultan.class09989
 *  Nursultan.class10021
 *  java.lang.runtime.SwitchBootstraps
 */
package Nursultan;

import Nursultan.class09773;
import Nursultan.class09791;
import Nursultan.class09937;
import Nursultan.class09962;
import Nursultan.class09965;
import Nursultan.class09968;
import Nursultan.class09980;
import Nursultan.class09982;
import Nursultan.class09985;
import Nursultan.class09989;
import Nursultan.class10021;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class class09820 {
    private static final String N = "style.";

    private static String L(class09773 class097732) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : class097732.L().entrySet()) {
            if (!entry.getKey().startsWith(N)) continue;
            if (!stringBuilder.isEmpty()) {
                stringBuilder.append("  ");
            }
            stringBuilder.append(class09820.N(entry.getKey())).append('=').append(entry.getValue());
        }
        return stringBuilder.toString();
    }

    public static String L(class10021 class100212, class09791 class097912) {
        return class09820.y(class09820.N(class100212, class097912));
    }

    private class09820() {
    }

    public static String y(class10021 class100212, class09791 class097912) {
        return class09820.N(class09820.N(class100212, class097912));
    }

    public static String y(class09773 class097732) {
        StringBuilder stringBuilder = new StringBuilder();
        class09820.N(class097732, stringBuilder);
        return stringBuilder.toString();
    }

    private static String y(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length() + 2);
        stringBuilder.append('\"');
        block7: for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            switch (c) {
                case '\"': {
                    stringBuilder.append("\\\"");
                    continue block7;
                }
                case '\\': {
                    stringBuilder.append("\\\\");
                    continue block7;
                }
                case '\n': {
                    stringBuilder.append("\\n");
                    continue block7;
                }
                case '\r': {
                    stringBuilder.append("\\r");
                    continue block7;
                }
                case '\t': {
                    stringBuilder.append("\\t");
                    continue block7;
                }
                default: {
                    stringBuilder.append(c);
                }
            }
        }
        stringBuilder.append('\"');
        return stringBuilder.toString();
    }

    private static void y(class09773 class097732, class09773 class097733, String string, StringBuilder stringBuilder) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.addAll(class097732.L().keySet());
        linkedHashSet.addAll(class097733.L().keySet());
        for (String string2 : linkedHashSet) {
            String string3;
            String string4 = class097732.L().get(string2);
            if (Objects.equals(string4, string3 = class097733.L().get(string2))) continue;
            stringBuilder.append("~ ").append(string).append(' ').append(class09820.N(string2)).append(": ").append(string4 == null ? "-" : string4).append(" -> ").append(string3 == null ? "-" : string3).append('\n');
        }
    }

    private static String y(class10021 class100212) {
        String string = class100212.N();
        String string2 = class100212.y().name().toLowerCase();
        return string == null || string.isBlank() ? string2 : string2 + "#" + string;
    }

    private static void y(class10021 class100212, Map<String, String> map) {
        int n;
        String string = class09820.N(class100212);
        if (!string.isEmpty()) {
            map.put("dirty", string);
        }
        if ((n = class100212.q().Z()) > 0) {
            map.put("cachedDraws", String.valueOf(n));
        }
    }

    private static String N(class09962 class099622) {
        String string = class099622.u().name().toLowerCase();
        float f = switch (class099622.u()) {
            case class09982.FIXED, class09982.PERCENT -> class099622.M();
            default -> class099622.i();
        };
        return string + "(" + class09820.N(f) + ")";
    }

    private static String N(String string) {
        return string.startsWith(N) ? string.substring(N.length()) : string;
    }

    private static boolean N(class09985 class099852) {
        return class09820.N(class099852.L(), class099852.u()) && class09820.N(class099852.u(), class099852.i()) && class09820.N(class099852.i(), class099852.R());
    }

    private static class10021 N(class10021 class100212, String string) {
        if (string.equals(class100212.N())) {
            return class100212;
        }
        Iterator var2 = class100212.L().iterator();
        while (var2.hasNext()) {
            class10021 class100213 = class09820.N((class10021)var2.next(), string);
            if (class100213 == null) continue;
            return class100213;
        }
        return null;
    }

    public static class09773 N(class10021 class100212, class09791 class097912) {
        class10021 class100213;
        class09791 class097913 = class097912 == null ? class09791.N() : class097912;
        class10021 class100214 = class100213 = class097913.L() == null ? class100212 : class09820.N(class100212, class097913.L());
        if (class100213 == null) {
            return new class09773("missing", "(missing key: " + class097913.L() + ")", new LinkedHashMap<String, String>(), List.of());
        }
        return class09820.N(class100213, class097913, 0, 0);
    }

    private static String N(class10021 class100212, int n) {
        String string = class100212.N();
        if (string != null && !string.isBlank()) {
            return string;
        }
        return class100212.y().name().toLowerCase() + "[" + n + "]";
    }

    private static String N(class09989 class099892, Object object) {
        Object object2;
        Object object3 = object;
        int n = 0;
        block8: while (true) {
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{Float.class, Integer.class, class09962.class, class09965.class, class09985.class}, (Object)object3, (int)n)) {
                case -1: {
                    object2 = "null";
                    break block8;
                }
                case 0: {
                    object2 = class09820.N(((Float)object3).floatValue());
                    break block8;
                }
                case 1: {
                    Integer n2 = (Integer)object3;
                    if (!class099892.name().contains("COLOR")) {
                        n = 2;
                        continue block8;
                    }
                    object2 = class09820.N(n2);
                    break block8;
                }
                case 2: {
                    object2 = class09820.N((class09962)object3);
                    break block8;
                }
                case 3: {
                    class09965 class099652 = (class09965)object3;
                    if (class099652.L()) {
                        object2 = class09820.N(class099652.u());
                        break block8;
                    }
                    object2 = class09820.N(class099652.u()) + "/" + class09820.N(class099652.i()) + "/" + class09820.N(class099652.R()) + "/" + class09820.N(class099652.M());
                    break block8;
                }
                case 4: {
                    class09985 class099852 = (class09985)object3;
                    if (class09820.N(class099852)) {
                        object2 = class09820.N(class099852.L());
                        break block8;
                    }
                    object2 = class09820.N(class099852.L()) + "/" + class09820.N(class099852.u()) + "/" + class09820.N(class099852.i()) + "/" + class09820.N(class099852.R());
                    break block8;
                }
                default: {
                    object2 = String.valueOf(object);
                    break block8;
                }
            }
            break;
        }
        return object2;
    }

    public static String N(class09773 class097732, class09773 class097733) {
        StringBuilder stringBuilder = new StringBuilder();
        class09820.N(class097732, class097733, "", stringBuilder);
        return stringBuilder.isEmpty() ? "(no differences)\n" : stringBuilder.toString();
    }

    private static boolean N(float f, float f2) {
        return Float.floatToIntBits(f) == Float.floatToIntBits(f2);
    }

    private static String N(String string, int n) {
        String string2 = string.replace('\n', ' ').replace('\r', ' ');
        return string2.length() <= n ? string2 : string2.substring(0, n) + "...";
    }

    private static String N(int n) {
        return String.format("#%08X", n);
    }

    private static String N(float f) {
        if ((double)f == Math.rint(f) && !Float.isInfinite(f)) {
            return Integer.toString((int)f);
        }
        return String.format(Locale.ROOT, "%.2f", Float.valueOf(f));
    }

    private static String N(float f, float f2, float f3, float f4) {
        return "(" + class09820.N(f) + "," + class09820.N(f2) + " " + class09820.N(f3) + "x" + class09820.N(f4) + ")";
    }

    private static void N(class09980 class099802, boolean bl, Map<String, String> map) {
        class09980 class099803 = class09968.N();
        for (class09989 class099892 : class09989.values()) {
            if (!bl && !class099892.N(class099803, class099802)) continue;
            map.put(N + class099892.name().toLowerCase(), class09820.N(class099892, class099892.N(class099802)));
        }
    }

    private static void N(StringBuilder stringBuilder, class09773 class097732) {
        for (Map.Entry<String, String> entry : class097732.L().entrySet()) {
            if (entry.getKey().startsWith(N)) continue;
            stringBuilder.append(' ').append(entry.getKey()).append('=').append(entry.getValue());
        }
    }

    private static void N(class09773 class097732, int n, StringBuilder stringBuilder) {
        String string = "  ".repeat(n);
        stringBuilder.append(string).append(class097732.y());
        class09820.N(stringBuilder, class097732);
        stringBuilder.append('\n');
        String string2 = class09820.L(class097732);
        if (!string2.isEmpty()) {
            stringBuilder.append(string).append("    style ").append(string2).append('\n');
        }
        Iterator<class09773> var5 = class097732.u().iterator();
        while (var5.hasNext()) {
            class09820.N(var5.next(), n + 1, stringBuilder);
        }
    }

    public static String N(class09773 class097732) {
        StringBuilder stringBuilder = new StringBuilder();
        class09820.N(class097732, 0, stringBuilder);
        return stringBuilder.toString();
    }

    private static String N(class10021 class100212) {
        StringBuilder stringBuilder = new StringBuilder();
        class09820.N(stringBuilder, class100212, 2, "LAYOUT");
        class09820.N(stringBuilder, class100212, 4, "POSITION");
        class09820.N(stringBuilder, class100212, 8, "SCROLL");
        class09820.N(stringBuilder, class100212, 1, "DRAW");
        return stringBuilder.toString();
    }

    private static void N(StringBuilder stringBuilder, class10021 class100212, int n, String string) {
        if (class100212.M(n)) {
            if (!stringBuilder.isEmpty()) {
                stringBuilder.append('|');
            }
            stringBuilder.append(string);
        }
    }

    private static Map<String, class09773> N(List<class09773> list) {
        LinkedHashMap<String, class09773> linkedHashMap = new LinkedHashMap<String, class09773>();
        for (int i = 0; i < list.size(); ++i) {
            class09773 class097732 = list.get(i);
            String string = class097732.N();
            String string2 = linkedHashMap.containsKey(string) ? string + "#" + i : string;
            linkedHashMap.put(string2, class097732);
        }
        return linkedHashMap;
    }

    private static class09773 N(class10021 class100212, class09791 class097912, int n, int n2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        class09820.N(class100212, linkedHashMap);
        class09820.N(class100212.c(), linkedHashMap);
        class09820.N(class100212.o(), class097912.u(), linkedHashMap);
        class09820.y(class100212, linkedHashMap);
        ArrayList<class09773> arrayList = new ArrayList<class09773>();
        List var6 = class100212.L();
        if (n >= class097912.y() && !var6.isEmpty()) {
            linkedHashMap.put("childrenElided", String.valueOf(var6.size()));
        } else {
            for (int i = 0; i < var6.size(); ++i) {
                arrayList.add(class09820.N((class10021)var6.get(i), class097912, n + 1, i));
            }
        }
        return new class09773(class09820.N(class100212, n2), class09820.y(class100212), linkedHashMap, arrayList);
    }

    private static void N(class09773 class097732, class09773 class097733, String string, StringBuilder stringBuilder) {
        String string2 = string.isEmpty() ? class097733.N() : string + "/" + class097733.N();
        class09820.y(class097732, class097733, string2, stringBuilder);
        Map<String, class09773> var5 = class09820.N(class097732.u());
        Map<String, class09773> var6 = class09820.N(class097733.u());
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.addAll(var5.keySet());
        linkedHashSet.addAll(var6.keySet());
        for (String string3 : linkedHashSet) {
            class09773 class097734 = var5.get(string3);
            class09773 class097735 = var6.get(string3);
            if (class097734 == null) {
                stringBuilder.append("+ ").append(string2).append('/').append(class097735.N()).append("  ").append(class097735.y()).append('\n');
                continue;
            }
            if (class097735 == null) {
                stringBuilder.append("- ").append(string2).append('/').append(class097734.N()).append("  ").append(class097734.y()).append('\n');
                continue;
            }
            class09820.N(class097734, class097735, string2, stringBuilder);
        }
    }

    private static void N(class10021 class100212, Map<String, String> map) {
        String string;
        String string2;
        String string3 = class100212.B();
        if (string3 != null && !string3.isEmpty()) {
            map.put("text", "\"" + class09820.N(string3, 60) + "\"");
        }
        if ((string2 = class100212.Z()) != null && !string2.isEmpty()) {
            map.put("placeholder", "\"" + class09820.N(string2, 60) + "\"");
        }
        if ((string = class100212.z()) != null && !string.isEmpty()) {
            map.put("texture", string);
        }
        if (class100212.U() != null) {
            map.put("canvas", "yes");
        }
    }

    private static void N(class09773 class097732, StringBuilder stringBuilder) {
        stringBuilder.append("{\"id\":").append(class09820.y(class097732.N()));
        stringBuilder.append(",\"label\":").append(class09820.y(class097732.y()));
        stringBuilder.append(",\"fields\":{");
        boolean bl = true;
        for (Map.Entry<String, String> entry : class097732.L().entrySet()) {
            if (!bl) {
                stringBuilder.append(',');
            }
            bl = false;
            stringBuilder.append(class09820.y(entry.getKey())).append(':').append(class09820.y(entry.getValue()));
        }
        stringBuilder.append("},\"children\":[");
        List<class09773> var3 = class097732.u();
        for (int i = 0; i < var3.size(); ++i) {
            if (i > 0) {
                stringBuilder.append(',');
            }
            class09820.N(var3.get(i), stringBuilder);
        }
        stringBuilder.append("]}");
    }

    private static void N(class09937 class099372, Map<String, String> map) {
        map.put("box", class09820.N(class099372.y(), class099372.L(), class099372.u(), class099372.i()));
        if (!class09820.N(class099372.t(), class099372.u()) || !class09820.N(class099372.G(), class099372.i())) {
            map.put("raw", class09820.N(class099372.t()) + "x" + class09820.N(class099372.G()));
        }
        map.put("content", class09820.N(class099372.R(), class099372.M(), class099372.B(), class099372.Z()));
        if (class099372.P() > 0.0f || class099372.m() != 0.0f) {
            map.put("scrollY", class09820.N(class099372.m()) + "/" + class09820.N(class099372.P()));
        }
        if (class099372.z() != 0) {
            map.put("z", String.valueOf(class099372.z()));
        }
    }
}

