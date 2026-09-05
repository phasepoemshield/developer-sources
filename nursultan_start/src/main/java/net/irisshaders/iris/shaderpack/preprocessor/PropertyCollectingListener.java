/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.anarres.cpp.DefaultPreprocessorListener
 *  org.anarres.cpp.LexerException
 *  org.anarres.cpp.Source
 */
package net.irisshaders.iris.shaderpack.preprocessor;

import org.anarres.cpp.DefaultPreprocessorListener;
import org.anarres.cpp.LexerException;
import org.anarres.cpp.Source;

public class PropertyCollectingListener
extends DefaultPreprocessorListener {
    public static final String PROPERTY_MARKER = "#warning IRIS_PASSTHROUGH ";
    private final StringBuilder builder = new StringBuilder();

    public void handleError(Source source, int n, int n2, String string) throws LexerException {
        if (string.contains("Unknown preprocessor directive") || string.contains("Preprocessor directive not a word")) {
            return;
        }
        super.handleError(source, n, n2, string);
    }

    public void handleWarning(Source source, int n, int n2, String string) throws LexerException {
        if (string.startsWith(PROPERTY_MARKER)) {
            this.builder.append(string.replace(PROPERTY_MARKER, ""));
            this.builder.append('\n');
        } else {
            super.handleWarning(source, n, n2, string);
        }
    }

    public String collectLines() {
        return this.builder.toString();
    }
}

