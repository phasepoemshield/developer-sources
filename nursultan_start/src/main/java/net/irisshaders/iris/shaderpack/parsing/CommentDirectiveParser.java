/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.parsing;

import java.util.Optional;
import net.irisshaders.iris.shaderpack.parsing.CommentDirective;
import net.irisshaders.iris.shaderpack.parsing.CommentDirective$Type;

public class CommentDirectiveParser {
    private CommentDirectiveParser() {
    }

    public static Optional<CommentDirective> findDirective(String string, CommentDirective$Type commentDirective$Type) {
        String string2 = commentDirective$Type.name();
        String string3 = string2 + ":";
        String string4 = "*/";
        int n = string.lastIndexOf(string3);
        if (n == -1) {
            return Optional.empty();
        }
        String string5 = string.substring(0, n).trim();
        if (!string5.endsWith("/*")) {
            return Optional.empty();
        }
        int n2 = (string = string.substring(n + string3.length())).indexOf(string4);
        if (n2 == -1) {
            return Optional.empty();
        }
        string = string.substring(0, n2).trim();
        return Optional.of(new CommentDirective(CommentDirective$Type.valueOf(string2), string, n));
    }
}

