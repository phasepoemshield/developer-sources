package sky.core.module;

import net.minecraft.util.Identifier;

public enum Category {
    COMBAT,
    MOVEMENT,
    VISUALS,
    PLAYER,
    MISC;

    public String getDisplayName() {
        String lower = this.name().toLowerCase();
        return Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
    }

    public Identifier getTexture() {
        return Identifier.of("skycore", "textures/clickgui/" + this.name().toLowerCase() + ".png");
    }
}
