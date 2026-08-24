/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.spi;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.spi.MDCAdapter;

public interface SLF4JServiceProvider {
    public void initialize();

    public String getRequestedApiVersion();

    public IMarkerFactory getMarkerFactory();

    public MDCAdapter getMDCAdapter();

    public ILoggerFactory getLoggerFactory();
}

