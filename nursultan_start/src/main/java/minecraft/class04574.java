/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  oshi.SystemInfo
 *  oshi.hardware.CentralProcessor
 */
package minecraft;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

class class04574 {
    private final SystemInfo y = new SystemInfo();
    private final CentralProcessor L = this.y.getHardware().getProcessor();
    public final int N = this.L.getLogicalProcessorCount();
    private long[][] u = this.L.getProcessorCpuLoadTicks();
    private double[] i = this.L.getProcessorCpuLoadBetweenTicks(this.u);
    private long R;

    class04574() {
    }

    public double N(int n) {
        long l = System.currentTimeMillis();
        if (this.R == 0L || this.R + 501L < l) {
            this.i = this.L.getProcessorCpuLoadBetweenTicks(this.u);
            this.u = this.L.getProcessorCpuLoadTicks();
            this.R = l;
        }
        return this.i[n] * 100.0;
    }
}

