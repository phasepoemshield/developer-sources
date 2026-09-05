/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.SilkNSQState;
import de.maxhenkel.voicechat.concentus.SilkNSQState$1;

class SilkNSQState$NSQ_sample_struct {
    int Q_Q10;
    int RD_Q10;
    int xq_Q14;
    int LF_AR_Q14;
    int sLTP_shp_Q14;
    int LPC_exc_Q14;
    final /* synthetic */ SilkNSQState this$0;

    private SilkNSQState$NSQ_sample_struct(SilkNSQState silkNSQState) {
        this.this$0 = silkNSQState;
    }

    /* synthetic */ SilkNSQState$NSQ_sample_struct(SilkNSQState silkNSQState, SilkNSQState$1 silkNSQState$1) {
        this(silkNSQState);
    }

    void Assign(SilkNSQState$NSQ_sample_struct silkNSQState$NSQ_sample_struct) {
        this.Q_Q10 = silkNSQState$NSQ_sample_struct.Q_Q10;
        this.RD_Q10 = silkNSQState$NSQ_sample_struct.RD_Q10;
        this.xq_Q14 = silkNSQState$NSQ_sample_struct.xq_Q14;
        this.LF_AR_Q14 = silkNSQState$NSQ_sample_struct.LF_AR_Q14;
        this.sLTP_shp_Q14 = silkNSQState$NSQ_sample_struct.sLTP_shp_Q14;
        this.LPC_exc_Q14 = silkNSQState$NSQ_sample_struct.LPC_exc_Q14;
    }
}

