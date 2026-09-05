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

public class PropertiesCommentListener
extends DefaultPreprocessorListener {
    private static final String UNKNOWN_PREPROCESSOR_DIRECTIVE = "Unknown preprocessor directive";
    private static final String NOT_A_WORD = "Preprocessor directive not a word";

    public void handleError(Source source, int n, int n2, String string) throws LexerException {
        if (string.contains(UNKNOWN_PREPROCESSOR_DIRECTIVE) || string.contains(NOT_A_WORD)) {
            return;
        }
        super.handleError(source, n, n2, string);
    }
}

