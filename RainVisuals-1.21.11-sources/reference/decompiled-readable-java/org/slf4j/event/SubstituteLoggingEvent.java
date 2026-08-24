/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Marker;
import org.slf4j.event.KeyValuePair;
import org.slf4j.event.Level;
import org.slf4j.event.LoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class SubstituteLoggingEvent
implements LoggingEvent {
    String threadName;
    Object[] argArray;
    Throwable throwable;
    Level level;
    List<KeyValuePair> keyValuePairList;
    SubstituteLogger logger;
    long timeStamp;
    List<Marker> markers;
    String message;
    String loggerName;

    public void setArgumentArray(Object[] argArray) {
        this.argArray = argArray;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public Throwable getThrowable() {
        return this.throwable;
    }

    @Override
    public String getLoggerName() {
        return this.loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    @Override
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public List<KeyValuePair> getKeyValuePairs() {
        return this.keyValuePairList;
    }

    public void addMarker(Marker marker) {
        if (marker == null) {
            return;
        }
        if (this.markers == null) {
            this.markers = new ArrayList<Marker>(2);
        }
        this.markers.add(marker);
    }

    @Override
    public Level getLevel() {
        return this.level;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    public void setLogger(SubstituteLogger logger) {
        this.logger = logger;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public SubstituteLogger getLogger() {
        return this.logger;
    }

    @Override
    public Object[] getArgumentArray() {
        return this.argArray;
    }

    @Override
    public String getThreadName() {
        return this.threadName;
    }

    @Override
    public List<Object> getArguments() {
        if (this.argArray == null) {
            return null;
        }
        return Arrays.asList(this.argArray);
    }

    @Override
    public List<Marker> getMarkers() {
        return this.markers;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

