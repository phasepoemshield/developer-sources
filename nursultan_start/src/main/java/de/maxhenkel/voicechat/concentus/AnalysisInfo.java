/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

class AnalysisInfo {
    boolean enabled = false;
    int valid = 0;
    float tonality = 0.0f;
    float tonality_slope = 0.0f;
    float noisiness = 0.0f;
    float activity = 0.0f;
    float music_prob = 0.0f;
    int bandwidth = 0;

    AnalysisInfo() {
    }

    void Reset() {
        this.valid = 0;
        this.tonality = 0.0f;
        this.tonality_slope = 0.0f;
        this.noisiness = 0.0f;
        this.activity = 0.0f;
        this.music_prob = 0.0f;
        this.bandwidth = 0;
    }

    void Assign(AnalysisInfo analysisInfo) {
        this.valid = analysisInfo.valid;
        this.tonality = analysisInfo.tonality;
        this.tonality_slope = analysisInfo.tonality_slope;
        this.noisiness = analysisInfo.noisiness;
        this.activity = analysisInfo.activity;
        this.music_prob = analysisInfo.music_prob;
        this.bandwidth = analysisInfo.bandwidth;
    }
}

