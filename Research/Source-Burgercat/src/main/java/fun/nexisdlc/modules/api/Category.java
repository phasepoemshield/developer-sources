package fun.nexisdlc.modules.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Category {
    Combat("Combat", "F"),
    Movement("Movement", "E"),
    Render("Render", "G"),
    Player("Player", "H"),
    Utilities("Utilities", "D");

    final String display;
    final String icon;

}
