package fun.nexisdlc.client.utils.render.other;

import net.minecraft.text.Text;

public class SidebarEntry {
    public final Text name;
    public final Text score;
    public final int scoreWidth;

    public SidebarEntry(Text name, Text score, int scoreWidth) {
        this.name = name;
        this.score = score;
        this.scoreWidth = scoreWidth;
    }
}