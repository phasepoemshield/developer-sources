/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.AnalysisInfo
 *  de.maxhenkel.voicechat.concentus.Arrays
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.AnalysisInfo;
import de.maxhenkel.voicechat.concentus.Arrays;

class TonalityAnalysisState {
    boolean enabled = false;
    final float[] angle = new float[240];
    final float[] d_angle = new float[240];
    final float[] d2_angle = new float[240];
    final int[] inmem = new int[720];
    int mem_fill;
    final float[] prev_band_tonality = new float[18];
    float prev_tonality;
    final float[][] E = Arrays.InitTwoDimensionalArrayFloat((int)8, (int)18);
    final float[] lowE = new float[18];
    final float[] highE = new float[18];
    final float[] meanE = new float[21];
    final float[] mem = new float[32];
    final float[] cmean = new float[8];
    final float[] std = new float[9];
    float music_prob;
    float Etracker;
    float lowECount;
    int E_count;
    int last_music;
    int last_transition;
    int count;
    final float[] subframe_mem = new float[3];
    int analysis_offset;
    final float[] pspeech = new float[200];
    final float[] pmusic = new float[200];
    float speech_confidence;
    float music_confidence;
    int speech_confidence_count;
    int music_confidence_count;
    int write_pos;
    int read_pos;
    int read_subframe;
    final AnalysisInfo[] info = new AnalysisInfo[200];

    TonalityAnalysisState() {
        for (int i = 0; i < 200; ++i) {
            this.info[i] = new AnalysisInfo();
        }
    }

    void Reset() {
        int n;
        Arrays.MemSet((float[])this.angle, (float)0.0f, (int)240);
        Arrays.MemSet((float[])this.d_angle, (float)0.0f, (int)240);
        Arrays.MemSet((float[])this.d2_angle, (float)0.0f, (int)240);
        Arrays.MemSet((int[])this.inmem, (int)0, (int)720);
        this.mem_fill = 0;
        Arrays.MemSet((float[])this.prev_band_tonality, (float)0.0f, (int)18);
        this.prev_tonality = 0.0f;
        for (n = 0; n < 8; ++n) {
            Arrays.MemSet((float[])this.E[n], (float)0.0f, (int)18);
        }
        Arrays.MemSet((float[])this.lowE, (float)0.0f, (int)18);
        Arrays.MemSet((float[])this.highE, (float)0.0f, (int)18);
        Arrays.MemSet((float[])this.meanE, (float)0.0f, (int)21);
        Arrays.MemSet((float[])this.mem, (float)0.0f, (int)32);
        Arrays.MemSet((float[])this.cmean, (float)0.0f, (int)8);
        Arrays.MemSet((float[])this.std, (float)0.0f, (int)9);
        this.music_prob = 0.0f;
        this.Etracker = 0.0f;
        this.lowECount = 0.0f;
        this.E_count = 0;
        this.last_music = 0;
        this.last_transition = 0;
        this.count = 0;
        Arrays.MemSet((float[])this.subframe_mem, (float)0.0f, (int)3);
        this.analysis_offset = 0;
        Arrays.MemSet((float[])this.pspeech, (float)0.0f, (int)200);
        Arrays.MemSet((float[])this.pmusic, (float)0.0f, (int)200);
        this.speech_confidence = 0.0f;
        this.music_confidence = 0.0f;
        this.speech_confidence_count = 0;
        this.music_confidence_count = 0;
        this.write_pos = 0;
        this.read_pos = 0;
        this.read_subframe = 0;
        for (n = 0; n < 200; ++n) {
            this.info[n].Reset();
        }
    }
}

