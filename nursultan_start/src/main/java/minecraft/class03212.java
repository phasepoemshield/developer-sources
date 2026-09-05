/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;

class class03212
implements Iterator<RecordedEvent> {
    final /* synthetic */ RecordingFile N;

    class03212(RecordingFile recordingFile) {
        this.N = recordingFile;
    }

    @Override
    public boolean hasNext() {
        return this.N.hasMoreEvents();
    }

    @Override
    public RecordedEvent next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return this.N.readEvent();
        }
        catch (IOException iOException) {
            throw new UncheckedIOException(iOException);
        }
    }
}

