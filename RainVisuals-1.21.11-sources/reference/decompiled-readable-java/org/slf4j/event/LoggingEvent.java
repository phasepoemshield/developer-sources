/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.event;

import java.util.List;
import org.slf4j.Marker;
import org.slf4j.event.KeyValuePair;
import org.slf4j.event.Level;

public interface LoggingEvent {
    public List<KeyValuePair> getKeyValuePairs();

    public long getTimeStamp();

    public String getThreadName();

    public String getMessage();

    default public String getCallerBoundary() {
        return null;
    }

    public Level getLevel();

    public List<Marker> getMarkers();

    public List<Object> getArguments();

    public Object[] getArgumentArray();

    public Throwable getThrowable();

    public String getLoggerName();
}

