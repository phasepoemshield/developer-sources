/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Filters
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.Inlines;

class SilkLPState {
    final int[] In_LP_State = new int[2];
    int transition_frame_no = 0;
    int mode = 0;

    SilkLPState() {
    }

    /*
     * Unable to fully structure code
     */
    void silk_LP_variable_cutoff(short[] var1_1, int var2_2, int var3_3) {
        var4_4 = new int[3];
        var5_5 = new int[2];
        var6_6 = 0;
        var7_7 = 0;
        if (this.transition_frame_no < 0) ** GOTO lbl-1000
        if (this.transition_frame_no <= 256) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        Inlines.OpusAssert((boolean)v0);
        if (this.mode != 0) {
            var6_6 = Inlines.silk_LSHIFT((int)(256 - this.transition_frame_no), (int)10);
            var7_7 = Inlines.silk_RSHIFT((int)var6_6, (int)16);
            Inlines.OpusAssert((boolean)(var7_7 >= 0));
            Inlines.OpusAssert((boolean)(var7_7 < 5));
            Filters.silk_LP_interpolate_filter_taps((int[])var4_4, (int[])var5_5, (int)var7_7, (int)(var6_6 -= Inlines.silk_LSHIFT((int)var7_7, (int)16)));
            this.transition_frame_no = Inlines.silk_LIMIT((int)(this.transition_frame_no + this.mode), (int)0, (int)256);
            Inlines.OpusAssert((boolean)true);
            Filters.silk_biquad_alt((short[])var1_1, (int)var2_2, (int[])var4_4, (int[])var5_5, (int[])this.In_LP_State, (short[])var1_1, (int)var2_2, (int)var3_3, (int)1);
        }
    }

    void Reset() {
        this.In_LP_State[0] = 0;
        this.In_LP_State[1] = 0;
        this.transition_frame_no = 0;
        this.mode = 0;
    }
}

