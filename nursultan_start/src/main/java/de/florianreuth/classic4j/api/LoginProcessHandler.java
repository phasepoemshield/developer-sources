/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.florianreuth.classic4j.model.classicube.account.CCAccount
 */
package de.florianreuth.classic4j.api;

import de.florianreuth.classic4j.model.classicube.account.CCAccount;

public interface LoginProcessHandler {
    public void handleException(Throwable var1);

    public void handleMfa(CCAccount var1);

    public void handleSuccessfulLogin(CCAccount var1);
}

