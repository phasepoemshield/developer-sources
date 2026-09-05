/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.OpusBandwidth;

class OpusBandwidthHelpers {
    OpusBandwidthHelpers() {
    }

    static OpusBandwidth MIN(OpusBandwidth opusBandwidth, OpusBandwidth opusBandwidth2) {
        if (OpusBandwidthHelpers.GetOrdinal(opusBandwidth) < OpusBandwidthHelpers.GetOrdinal(opusBandwidth2)) {
            return opusBandwidth;
        }
        return opusBandwidth2;
    }

    static OpusBandwidth MAX(OpusBandwidth opusBandwidth, OpusBandwidth opusBandwidth2) {
        if (OpusBandwidthHelpers.GetOrdinal(opusBandwidth) > OpusBandwidthHelpers.GetOrdinal(opusBandwidth2)) {
            return opusBandwidth;
        }
        return opusBandwidth2;
    }

    static OpusBandwidth SUBTRACT(OpusBandwidth opusBandwidth, int n) {
        return OpusBandwidthHelpers.GetBandwidth(OpusBandwidthHelpers.GetOrdinal(opusBandwidth) - n);
    }

    static int GetOrdinal(OpusBandwidth opusBandwidth) {
        switch (opusBandwidth) {
            case OPUS_BANDWIDTH_NARROWBAND: {
                return 1;
            }
            case OPUS_BANDWIDTH_MEDIUMBAND: {
                return 2;
            }
            case OPUS_BANDWIDTH_WIDEBAND: {
                return 3;
            }
            case OPUS_BANDWIDTH_SUPERWIDEBAND: {
                return 4;
            }
            case OPUS_BANDWIDTH_FULLBAND: {
                return 5;
            }
        }
        return -1;
    }

    static OpusBandwidth GetBandwidth(int n) {
        switch (n) {
            case 1: {
                return OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND;
            }
            case 2: {
                return OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND;
            }
            case 3: {
                return OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND;
            }
            case 4: {
                return OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND;
            }
            case 5: {
                return OpusBandwidth.OPUS_BANDWIDTH_FULLBAND;
            }
        }
        return OpusBandwidth.OPUS_BANDWIDTH_AUTO;
    }
}

