/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.command.ICommandSystem
 *  baritone.api.command.argparser.IArgParserManager
 */
package baritone.command;

import baritone.api.command.ICommandSystem;
import baritone.api.command.argparser.IArgParserManager;
import baritone.command.argparser.ArgParserManager;

public enum CommandSystem implements ICommandSystem
{
    INSTANCE;


    public IArgParserManager getParserManager() {
        return ArgParserManager.INSTANCE;
    }
}

