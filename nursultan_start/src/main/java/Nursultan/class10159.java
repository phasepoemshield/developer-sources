/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03196
 *  minecraft.class03223
 */
package Nursultan;

import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;
import minecraft.class03196;
import minecraft.class03223;

public class class10159
implements FlightRecorderListener {
    final /* synthetic */ class03223 N;

    public class10159(class03223 class032232) {
        this.N = class032232;
    }

    @Override
    public void recordingStateChanged(Recording recording) {
        switch (class03196.N[recording.getState().ordinal()]) {
            case 1: {
                this.N.N();
                break;
            }
        }
    }
}

