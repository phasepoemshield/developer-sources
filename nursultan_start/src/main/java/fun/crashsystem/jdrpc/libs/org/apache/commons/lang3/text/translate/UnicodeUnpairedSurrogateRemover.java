/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate;

import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.CodePointTranslator;
import java.io.IOException;
import java.io.Writer;

@Deprecated
public class UnicodeUnpairedSurrogateRemover
extends CodePointTranslator {
    @Override
    public boolean translate(int codePoint, Writer out) throws IOException {
        return codePoint >= 55296 && codePoint <= 57343;
    }
}

