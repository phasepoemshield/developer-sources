/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00654
 */
package eu.pb4.placeholders.api.node.parent;

import minecraft.class00654;

@Deprecated(forRemoval=true)
public record ClickActionNode$Action(class00654 vanillaType) {
    public static final ClickActionNode$Action OPEN_URL = new ClickActionNode$Action(class00654.field_11749);
    public static final ClickActionNode$Action CHANGE_PAGE = new ClickActionNode$Action(class00654.field_11748);
    public static final ClickActionNode$Action OPEN_FILE = new ClickActionNode$Action(class00654.field_11746);
    public static final ClickActionNode$Action RUN_COMMAND = new ClickActionNode$Action(class00654.field_11750);
    public static final ClickActionNode$Action SUGGEST_COMMAND = new ClickActionNode$Action(class00654.field_11745);
    public static final ClickActionNode$Action COPY_TO_CLIPBOARD = new ClickActionNode$Action(class00654.field_21462);
    public static final ClickActionNode$Action SHOW_DIALOG = new ClickActionNode$Action(class00654.field_60821);
    public static final ClickActionNode$Action CUSTOM = new ClickActionNode$Action(class00654.field_60822);
}

