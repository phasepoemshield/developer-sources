/*
 * Decompiled with CFR 0.152.
 */
package squeek.appleskin.shadowed.blue.endless.jankson.api;

public class SyntaxError
extends Exception {
    int startLine = -1;
    int startColumn = -1;
    int line = -1;
    int column = -1;

    public SyntaxError(String string) {
        super(string);
    }

    public void setStartParsing(int n, int n2) {
        this.startLine = n;
        this.startColumn = n2;
    }

    public void setEndParsing(int n, int n2) {
        this.line = n;
        this.column = n2;
    }

    public String getCompleteMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.startLine != -1 && this.startColumn != -1) {
            stringBuilder.append("Started at line ");
            stringBuilder.append(this.startLine + 1);
            stringBuilder.append(", column ");
            stringBuilder.append(this.startColumn + 1);
            stringBuilder.append("; ");
        }
        if (this.line != -1 && this.column != -1) {
            stringBuilder.append("Errored at line ");
            stringBuilder.append(this.line + 1);
            stringBuilder.append(", column ");
            stringBuilder.append(this.column + 1);
            stringBuilder.append("; ");
        }
        stringBuilder.append(super.getMessage());
        return stringBuilder.toString();
    }

    public String getLineMessage() {
        boolean bl;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = this.startLine != -1 && this.startColumn != -1;
        boolean bl3 = bl = this.line != -1 && this.column != -1;
        if (bl2) {
            stringBuilder.append("Started at line ");
            stringBuilder.append(this.startLine + 1);
            stringBuilder.append(", column ");
            stringBuilder.append(this.startColumn + 1);
        }
        if (bl2 && bl) {
            stringBuilder.append("; ");
        }
        if (bl) {
            stringBuilder.append("Errored at line ");
            stringBuilder.append(this.line + 1);
            stringBuilder.append(", column ");
            stringBuilder.append(this.column + 1);
        }
        return stringBuilder.toString();
    }
}

