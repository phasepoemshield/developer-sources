/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnegative
 *  javax.annotation.Nonnull
 *  org.anarres.cpp.LexerException
 *  org.anarres.cpp.PreprocessorListener$SourceChangeEvent
 *  org.anarres.cpp.Source
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package org.anarres.cpp;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import org.anarres.cpp.LexerException;
import org.anarres.cpp.PreprocessorListener;
import org.anarres.cpp.Source;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultPreprocessorListener
implements PreprocessorListener {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultPreprocessorListener.class);
    private int errors;
    private int warnings;

    public void handleError(Source source, int line, int column, String msg) throws LexerException {
        ++this.errors;
        this.print(source.getName() + ":" + line + ":" + column + ": error: " + msg);
    }

    public DefaultPreprocessorListener() {
        this.clear();
    }

    public void clear() {
        this.errors = 0;
        this.warnings = 0;
    }

    protected void print(@Nonnull String msg) {
        LOG.info(msg);
    }

    @Nonnegative
    public int getErrors() {
        return this.errors;
    }

    public void handleWarning(Source source, int line, int column, String msg) throws LexerException {
        ++this.warnings;
        this.print(source.getName() + ":" + line + ":" + column + ": warning: " + msg);
    }

    public void handleSourceChange(Source source, PreprocessorListener.SourceChangeEvent event) {
    }

    @Nonnegative
    public int getWarnings() {
        return this.warnings;
    }
}

