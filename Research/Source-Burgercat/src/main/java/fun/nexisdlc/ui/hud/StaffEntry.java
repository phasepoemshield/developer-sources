package fun.nexisdlc.ui.hud;

import net.minecraft.text.Text;

/**
 * @author Sterford
 * @since 26.04.2026
 */
public final class StaffEntry {
    public final String name;
    public final Text displayText;
    public final boolean online;

    public StaffEntry(String name, Text displayText, boolean online) {
        this.name = name;
        this.displayText = displayText == null ? Text.literal(name) : displayText;
        this.online = online;
    }
}