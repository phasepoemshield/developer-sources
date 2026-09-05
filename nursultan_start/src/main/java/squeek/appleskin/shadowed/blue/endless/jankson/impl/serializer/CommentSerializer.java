/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonGrammar
 */
package squeek.appleskin.shadowed.blue.endless.jankson.impl.serializer;

import java.io.IOException;
import java.io.Writer;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonGrammar;

public class CommentSerializer {
    public static void print(StringBuilder stringBuilder, String string, int n, boolean bl, boolean bl2) {
        if (!bl) {
            return;
        }
        if (string == null || string.trim().isEmpty()) {
            return;
        }
        if (bl2) {
            if (string.contains("\n")) {
                int n2;
                stringBuilder.append("/* ");
                String[] stringArray = string.split("\\n");
                for (n2 = 0; n2 < stringArray.length; ++n2) {
                    String string2 = stringArray[n2];
                    if (n2 != 0) {
                        stringBuilder.append("   ");
                    }
                    stringBuilder.append(string2);
                    stringBuilder.append('\n');
                    for (int i = 0; i < n + 1; ++i) {
                        stringBuilder.append('\t');
                    }
                }
                stringBuilder.append("*/\n");
                for (n2 = 0; n2 < n + 1; ++n2) {
                    stringBuilder.append('\t');
                }
            } else {
                stringBuilder.append("// ");
                stringBuilder.append(string);
                stringBuilder.append('\n');
                for (int i = 0; i < n + 1; ++i) {
                    stringBuilder.append('\t');
                }
            }
        } else if (string.contains("\n")) {
            String[] stringArray = string.split("\\n");
            for (int i = 0; i < stringArray.length; ++i) {
                String string3 = stringArray[i];
                stringBuilder.append("/* ");
                stringBuilder.append(string3);
                stringBuilder.append(" */ ");
            }
        } else {
            stringBuilder.append("/* ");
            stringBuilder.append(string);
            stringBuilder.append(" */ ");
        }
    }

    public static void print(StringBuilder stringBuilder, String string, int n, JsonGrammar jsonGrammar) {
        boolean bl = jsonGrammar.hasComments();
        boolean bl2 = jsonGrammar.shouldOutputWhitespace();
        CommentSerializer.print(stringBuilder, string, n, bl, bl2);
    }

    public static void print(Writer writer, String string, int n, JsonGrammar jsonGrammar) throws IOException {
        if (string == null || string.trim().isEmpty()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length());
        CommentSerializer.print(stringBuilder, string, n, jsonGrammar);
        writer.append(stringBuilder);
    }
}

