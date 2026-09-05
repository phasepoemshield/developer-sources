/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  org.anarres.cpp.LexerException
 *  org.anarres.cpp.PreprocessorListener$SourceChangeEvent
 *  org.anarres.cpp.Source
 */
package org.anarres.cpp;

import javax.annotation.Nonnull;
import org.anarres.cpp.LexerException;
import org.anarres.cpp.PreprocessorListener;
import org.anarres.cpp.Source;

public interface PreprocessorListener {
    public void handleError(@Nonnull Source var1, int var2, int var3, @Nonnull String var4) throws LexerException;

    public void handleWarning(@Nonnull Source var1, int var2, int var3, @Nonnull String var4) throws LexerException;

    public void handleSourceChange(@Nonnull Source var1, @Nonnull SourceChangeEvent var2);
}

