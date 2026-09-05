/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.SilkConstants;
import de.maxhenkel.voicechat.concentus.SilkNSQState;

class SilkNSQState$NSQ_del_dec_struct {
    final int[] sLPC_Q14 = new int[80 + SilkConstants.NSQ_LPC_BUF_LENGTH];
    final int[] RandState = new int[32];
    final int[] Q_Q10 = new int[32];
    final int[] Xq_Q14 = new int[32];
    final int[] Pred_Q15 = new int[32];
    final int[] Shape_Q14 = new int[32];
    int[] sAR2_Q14;
    int LF_AR_Q14 = 0;
    int Seed = 0;
    int SeedInit = 0;
    int RD_Q10 = 0;
    final /* synthetic */ SilkNSQState this$0;

    SilkNSQState$NSQ_del_dec_struct(SilkNSQState silkNSQState, int n) {
        this.this$0 = silkNSQState;
        this.sAR2_Q14 = new int[n];
    }

    void PartialCopyFrom(SilkNSQState$NSQ_del_dec_struct silkNSQState$NSQ_del_dec_struct, int n) {
        System.arraycopy(silkNSQState$NSQ_del_dec_struct.sLPC_Q14, n, this.sLPC_Q14, n, 80 + SilkConstants.NSQ_LPC_BUF_LENGTH - n);
        System.arraycopy(silkNSQState$NSQ_del_dec_struct.RandState, 0, this.RandState, 0, 32);
        System.arraycopy(silkNSQState$NSQ_del_dec_struct.Q_Q10, 0, this.Q_Q10, 0, 32);
        System.arraycopy(silkNSQState$NSQ_del_dec_struct.Xq_Q14, 0, this.Xq_Q14, 0, 32);
        System.arraycopy(silkNSQState$NSQ_del_dec_struct.Pred_Q15, 0, this.Pred_Q15, 0, 32);
        System.arraycopy(silkNSQState$NSQ_del_dec_struct.Shape_Q14, 0, this.Shape_Q14, 0, 32);
        System.arraycopy(silkNSQState$NSQ_del_dec_struct.sAR2_Q14, 0, this.sAR2_Q14, 0, this.sAR2_Q14.length);
        this.LF_AR_Q14 = silkNSQState$NSQ_del_dec_struct.LF_AR_Q14;
        this.Seed = silkNSQState$NSQ_del_dec_struct.Seed;
        this.SeedInit = silkNSQState$NSQ_del_dec_struct.SeedInit;
        this.RD_Q10 = silkNSQState$NSQ_del_dec_struct.RD_Q10;
    }

    void Assign(SilkNSQState$NSQ_del_dec_struct silkNSQState$NSQ_del_dec_struct) {
        this.PartialCopyFrom(silkNSQState$NSQ_del_dec_struct, 0);
    }
}

