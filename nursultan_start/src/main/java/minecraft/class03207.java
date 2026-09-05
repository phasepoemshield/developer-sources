/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import jdk.jfr.FlightRecorder;
import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;
import minecraft.class03223;
import minecraft.class03237;

class class03207
implements FlightRecorderListener {
    final class03237 N = new class03237(() -> {
        this.y.R = null;
    });
    final /* synthetic */ class03223 y;

    class03207(class03223 class032232) {
        this.y = class032232;
    }

    @Override
    public void recordingStateChanged(Recording recording) {
        if (recording != this.y.R) {
            return;
        }
        switch (recording.getState()) {
            case STOPPED: {
                this.N.N(recording.getDestination());
                FlightRecorder.removeListener(this);
                break;
            }
        }
    }
}

