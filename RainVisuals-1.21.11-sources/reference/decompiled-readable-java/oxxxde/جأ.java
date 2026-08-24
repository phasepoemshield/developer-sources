/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package oxxxde;

import lombok.Generated;

public class \u062c\u0623
extends RuntimeException {
    protected final String description;
    protected final String[] reasons;
    protected final String[] solutions;
    protected final String details;

    @Generated
    public String getDescription() {
        return this.description;
    }

    public \u062c\u0623(String description, String details, String[] reasons, String[] solutions) {
        this.description = description;
        this.details = details;
        this.reasons = reasons;
        this.solutions = solutions;
    }

    @Generated
    public String getDetails() {
        return this.details;
    }

    @Generated
    public String[] getSolutions() {
        return this.solutions;
    }

    @Generated
    public String[] getReasons() {
        return this.reasons;
    }
}

