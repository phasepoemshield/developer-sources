/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.config.search;

public abstract class TextSource {
    private String text;
    private float score;
    private int resultIndex;

    public String getText() {
        if (this.text == null) {
            this.text = this.getTextFromSource();
        }
        return this.text;
    }

    public int getLength() {
        return this.getText().length();
    }

    public float getScore() {
        return this.score;
    }

    void setScore(float f) {
        this.score = f;
    }

    void invalidateText() {
        this.text = null;
    }

    protected abstract String getTextFromSource();

    public int getResultIndex() {
        return this.resultIndex;
    }

    public void setResultIndex(int n) {
        this.resultIndex = n;
    }
}

