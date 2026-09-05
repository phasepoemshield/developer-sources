/*
 * Decompiled with CFR 0.152.
 */
package baritone.process;

public enum ElytraProcess$State {
    LOCATE_JUMP("Finding spot to jump off"),
    PAUSE("Waiting for elytra path"),
    GET_TO_JUMP("Walking to takeoff"),
    START_FLYING("Begin flying"),
    FLYING("Flying"),
    LANDING("Landing");

    public final String description;

    private ElytraProcess$State(String string2) {
        this.description = string2;
    }
}

