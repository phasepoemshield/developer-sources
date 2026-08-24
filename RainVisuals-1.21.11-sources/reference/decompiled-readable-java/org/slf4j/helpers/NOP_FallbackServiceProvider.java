/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.helpers;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

public class NOP_FallbackServiceProvider
implements SLF4JServiceProvider {
    private final ILoggerFactory loggerFactory = new NOPLoggerFactory();
    private final MDCAdapter mdcAdapter;
    public static String REQUESTED_API_VERSION = "2.0.99";
    private final IMarkerFactory markerFactory = new BasicMarkerFactory();

    @Override
    public MDCAdapter getMDCAdapter() {
        return this.mdcAdapter;
    }

    public NOP_FallbackServiceProvider() {
        this.mdcAdapter = new NOPMDCAdapter();
    }

    @Override
    public String getRequestedApiVersion() {
        return REQUESTED_API_VERSION;
    }

    @Override
    public ILoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }

    @Override
    public void initialize() {
    }

    @Override
    public IMarkerFactory getMarkerFactory() {
        return this.markerFactory;
    }
}

