/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.KeyValuePair;
import org.slf4j.event.Level;
import org.slf4j.event.LoggingEvent;

public class DefaultLoggingEvent
implements LoggingEvent {
    List<Marker> markers;
    Logger logger;
    Level level;
    List<Object> arguments;
    String threadName;
    List<KeyValuePair> keyValuePairs;
    String callerBoundary;
    long timeStamp;
    Throwable throwable;
    String message;

    @Override
    public List<Marker> getMarkers() {
        return this.markers;
    }

    @Override
    public List<KeyValuePair> getKeyValuePairs() {
        return this.keyValuePairs;
    }

    @Override
    public List<Object> getArguments() {
        return this.arguments;
    }

    public void addKeyValue(String key, Object value) {
        this.getNonnullKeyValuePairs().add(new KeyValuePair(key, value));
    }

    @Override
    public String getLoggerName() {
        return this.logger.getName();
    }

    @Override
    public long getTimeStamp() {
        return this.timeStamp;
    }

    @Override
    public Throwable getThrowable() {
        return this.throwable;
    }

    private List<Object> getNonNullArguments() {
        if (this.arguments == null) {
            this.arguments = new ArrayList<Object>(3);
        }
        return this.arguments;
    }

    public void setThrowable(Throwable cause) {
        this.throwable = cause;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }

    private List<KeyValuePair> getNonnullKeyValuePairs() {
        if (this.keyValuePairs == null) {
            this.keyValuePairs = new ArrayList<KeyValuePair>(4);
        }
        return this.keyValuePairs;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setCallerBoundary(String fqcn) {
        this.callerBoundary = fqcn;
    }

    @Override
    public String getCallerBoundary() {
        return this.callerBoundary;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void addArguments(Object ... args2) {
        this.getNonNullArguments().addAll(Arrays.asList(args2));
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addArgument(Object p) {
        this.getNonNullArguments().add(p);
    }

    @Override
    public Object[] getArgumentArray() {
        if (this.arguments == null) {
            return null;
        }
        return this.arguments.toArray();
    }

    public void addMarker(Marker marker) {
        if (this.markers == null) {
            this.markers = new ArrayList<Marker>(2);
        }
        this.markers.add(marker);
    }

    @Override
    public String getThreadName() {
        return this.threadName;
    }

    public DefaultLoggingEvent(Level level, Logger logger) {
        this.logger = logger;
        this.level = level;
    }
}

