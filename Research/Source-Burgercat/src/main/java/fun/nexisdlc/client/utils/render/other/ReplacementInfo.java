package fun.nexisdlc.client.utils.render.other;

public class ReplacementInfo {
    public final int origStart;
    public final int origEnd;
    public final String newText;

    public ReplacementInfo(int origStart, int origEnd, String newText) {
        this.origStart = origStart;
        this.origEnd = origEnd;
        this.newText = newText;
    }
}