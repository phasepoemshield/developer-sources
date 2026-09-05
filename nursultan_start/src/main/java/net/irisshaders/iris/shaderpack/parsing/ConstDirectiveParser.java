/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.parsing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser$ConstDirective;
import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser$Type;

public class ConstDirectiveParser {
    private static boolean isWord(String string) {
        if (string.isEmpty()) {
            return false;
        }
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c) || Character.isAlphabetic(c) || c == '_') continue;
            return false;
        }
        return true;
    }

    public static List<ConstDirectiveParser$ConstDirective> findDirectives(String string) {
        ArrayList<ConstDirectiveParser$ConstDirective> arrayList = new ArrayList<ConstDirectiveParser$ConstDirective>();
        for (String string2 : string.split("\\R")) {
            ConstDirectiveParser.findDirectiveInLine(string2).ifPresent(arrayList::add);
        }
        return arrayList;
    }

    private static boolean startsWithWhitespace(String string) {
        return !string.isEmpty() && Character.isWhitespace(string.charAt(0));
    }

    public static Optional<ConstDirectiveParser$ConstDirective> findDirectiveInLine(String string) {
        ConstDirectiveParser$Type constDirectiveParser$Type;
        if (!(string.contains("const") && string.contains("=") && string.contains(";"))) {
            return Optional.empty();
        }
        if (!(string = string.trim()).startsWith("const")) {
            return Optional.empty();
        }
        if (!ConstDirectiveParser.startsWithWhitespace(string = string.substring("const".length()))) {
            return Optional.empty();
        }
        if ((string = string.trim()).startsWith("int")) {
            constDirectiveParser$Type = ConstDirectiveParser$Type.INT;
            string = string.substring("int".length());
        } else if (string.startsWith("float")) {
            constDirectiveParser$Type = ConstDirectiveParser$Type.FLOAT;
            string = string.substring("float".length());
        } else if (string.startsWith("vec2")) {
            constDirectiveParser$Type = ConstDirectiveParser$Type.VEC2;
            string = string.substring("vec2".length());
        } else if (string.startsWith("ivec3")) {
            constDirectiveParser$Type = ConstDirectiveParser$Type.IVEC3;
            string = string.substring("ivec3".length());
        } else if (string.startsWith("vec4")) {
            constDirectiveParser$Type = ConstDirectiveParser$Type.VEC4;
            string = string.substring("vec4".length());
        } else if (string.startsWith("bool")) {
            constDirectiveParser$Type = ConstDirectiveParser$Type.BOOL;
            string = string.substring("bool".length());
        } else {
            return Optional.empty();
        }
        if (!ConstDirectiveParser.startsWithWhitespace(string)) {
            return Optional.empty();
        }
        int n = string.indexOf(61);
        if (n == -1) {
            return Optional.empty();
        }
        String string2 = string.substring(0, n).trim();
        if (!ConstDirectiveParser.isWord(string2)) {
            return Optional.empty();
        }
        String string3 = string.substring(n + 1);
        int n2 = string3.indexOf(59);
        if (n2 == -1) {
            return Optional.empty();
        }
        String string4 = string3.substring(0, n2).trim();
        return Optional.of(new ConstDirectiveParser$ConstDirective(constDirectiveParser$Type, string2, string4));
    }
}

