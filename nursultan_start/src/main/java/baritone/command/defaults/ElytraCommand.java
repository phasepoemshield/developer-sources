/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.IBaritoneChatControl
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.command.helpers.TabCompleteHelper
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.process.ICustomGoalProcess
 *  baritone.api.process.IElytraProcess
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class04568
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07299
 */
package baritone.command.defaults;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.pathing.goals.Goal;
import baritone.api.process.ICustomGoalProcess;
import baritone.api.process.IElytraProcess;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class04568;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07299;

public class ElytraCommand
extends Command {
    private static final long OLD_2B2T_SEED = -4100785268875389365L;
    private static final long NEW_2B2T_SEED = 146008555100680L;

    public ElytraCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"elytra"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        String string2;
        ICustomGoalProcess iCustomGoalProcess = this.baritone.getCustomGoalProcess();
        IElytraProcess iElytraProcess = this.baritone.getElytraProcess();
        if (iArgConsumer.hasExactlyOne() && iArgConsumer.peekString().equals("supported")) {
            this.logDirect(iElytraProcess.isLoaded() ? "yes" : ElytraCommand.unsupportedSystemMessage());
            return;
        }
        if (!iElytraProcess.isLoaded()) {
            throw new CommandInvalidStateException(ElytraCommand.unsupportedSystemMessage());
        }
        if (!iArgConsumer.hasAny()) {
            Goal goal;
            if (((Boolean)Baritone.settings().elytraTermsAccepted.value).booleanValue()) {
                if (this.detectOn2b2t()) {
                    this.warn2b2t();
                }
            } else {
                this.gatekeep();
            }
            if ((goal = iCustomGoalProcess.mostRecentGoal()) == null) {
                throw new CommandInvalidStateException("No goal has been set");
            }
            if (this.ctx.world().method_27983() != class07299.field_25180) {
                throw new CommandInvalidStateException("Only works in the nether");
            }
            try {
                iElytraProcess.pathTo(goal);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new CommandInvalidStateException(illegalArgumentException.getMessage());
            }
            return;
        }
        switch (string2 = iArgConsumer.getString()) {
            case "reset": {
                iElytraProcess.resetState();
                this.logDirect("Reset state but still flying to same goal");
                break;
            }
            case "repack": {
                iElytraProcess.repackChunks();
                this.logDirect("Queued all loaded chunks for repacking");
                break;
            }
            default: {
                throw new CommandInvalidStateException("Invalid action");
            }
        }
    }

    private void warn2b2t() {
        long l;
        if (((Boolean)Baritone.settings().elytraPredictTerrain.value).booleanValue() && (l = ((Long)Baritone.settings().elytraNetherSeed.value).longValue()) != 146008555100680L && l != -4100785268875389365L) {
            this.logDirect(new class00392[]{class00392.y((String)"It looks like you're on 2b2t, but elytraNetherSeed is incorrect.")});
            this.logDirect(new class00392[]{this.suggest2b2tSeeds()});
        }
    }

    private void gatekeep() {
        class05216 class052162 = class00392.y((String)"");
        class052162.i("To disable this message, enable the setting elytraTermsAccepted\n");
        class052162.i("Baritone Elytra is an experimental feature. It is only intended for long distance travel in the Nether using fireworks for vanilla boost. It will not work with any other mods (\"hacks\") for non-vanilla boost. ");
        class05216 class052163 = class00392.y((String)"If you want Baritone to attempt to take off from the ground for you, you can enable the elytraAutoJump setting (not advisable on laggy servers!). ");
        class052163.y(class052163.method_10866().N((class00395)new class00401((class00392)class00392.y((String)((String)Baritone.settings().prefix.value + "set elytraAutoJump true")))));
        class052162.y((class00392)class052163);
        class05216 class052164 = class00392.y((String)"If you want Baritone to go slower, enable the elytraConserveFireworks setting and/or decrease the elytraFireworkSpeed setting. ");
        class052164.y(class052164.method_10866().N((class00395)new class00401((class00392)class00392.y((String)((String)Baritone.settings().prefix.value + "set elytraConserveFireworks true\n" + (String)Baritone.settings().prefix.value + "set elytraFireworkSpeed 0.6\n(the 0.6 number is just an example, tweak to your liking)")))));
        class052162.y((class00392)class052164);
        class05216 class052165 = class00392.y((String)"Baritone Elytra ");
        class05216 class052166 = class00392.y((String)"wants to know the seed");
        class052166.y(class052166.method_10866().N(class06541.field_1061).L(Boolean.valueOf(true)).N(Boolean.valueOf(true)));
        class052165.y((class00392)class052166);
        class052165.i(" of the world you are in. If it doesn't have the correct seed, it will frequently backtrack. It uses the seed to generate terrain far beyond what you can see, since terrain obstacles in the Nether can be much larger than your render distance. ");
        class052162.y((class00392)class052165);
        class052162.i("\n");
        if (this.detectOn2b2t()) {
            class05216 class052167 = class00392.y((String)"It looks like you're on 2b2t. ");
            class052167.y(this.suggest2b2tSeeds());
            if (!((Boolean)Baritone.settings().elytraPredictTerrain.value).booleanValue()) {
                class052167.i((String)Baritone.settings().prefix.value + "elytraPredictTerrain is currently disabled. ");
            } else if ((Long)Baritone.settings().elytraNetherSeed.value == 146008555100680L) {
                class052167.i("You are using the newer seed. ");
            } else if ((Long)Baritone.settings().elytraNetherSeed.value == -4100785268875389365L) {
                class052167.i("You are using the older seed. ");
            } else {
                class052167.i("Defaulting to the newer seed. ");
                Baritone.settings().elytraNetherSeed.value = 146008555100680L;
            }
            class052162.y((class00392)class052167);
        } else if ((Long)Baritone.settings().elytraNetherSeed.value == 146008555100680L) {
            class05216 class052168 = class00392.y((String)("Baritone doesn't know the seed of your world. Set it with: " + (String)Baritone.settings().prefix.value + "set elytraNetherSeed seedgoeshere\n"));
            class052168.i("For the time being, elytraPredictTerrain is defaulting to false since the seed is unknown.");
            class052162.y((class00392)class052168);
            Baritone.settings().elytraPredictTerrain.value = false;
        } else if (((Boolean)Baritone.settings().elytraPredictTerrain.value).booleanValue()) {
            class05216 class052169 = class00392.y((String)("Baritone Elytra is predicting terrain assuming that " + String.valueOf(Baritone.settings().elytraNetherSeed.value) + " is the correct seed. Change that with " + (String)Baritone.settings().prefix.value + "set elytraNetherSeed seedgoeshere, or disable it with " + (String)Baritone.settings().prefix.value + "set elytraPredictTerrain false"));
            class052162.y((class00392)class052169);
        } else {
            class05216 class0521610 = class00392.y((String)("Baritone Elytra is not predicting terrain. If you don't know the seed, this is the correct thing to do. If you do know the seed, input it with " + (String)Baritone.settings().prefix.value + "set elytraNetherSeed seedgoeshere, and then enable it with " + (String)Baritone.settings().prefix.value + "set elytraPredictTerrain true"));
            class052162.y((class00392)class0521610);
        }
        this.logDirect(new class00392[]{class052162});
    }

    public String getShortDesc() {
        return "elytra time";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The elytra command tells baritone to, in the nether, automatically fly to the current goal.", "", "Usage:", "> elytra - fly to the current goal", "> elytra reset - Resets the state of the process, but will try to keep flying to the same goal.", "> elytra repack - Queues all of the chunks in render distance to be given to the native library.", "> elytra supported - Tells you if baritone ships a native library that is compatible with your PC.");
    }

    private class00392 suggest2b2tSeeds() {
        class05216 class052162 = class00392.y((String)"");
        class052162.i("Within a few hundred blocks of spawn/axis/highways/etc, the terrain is too fragmented to be predictable. Baritone Elytra will still work, just with backtracking. ");
        class052162.i("However, once you get more than a few thousand blocks out, you should try ");
        class05216 class052163 = class00392.y((String)"the older seed (click here)");
        class052163.y(class052163.method_10866().L(Boolean.valueOf(true)).N(Boolean.valueOf(true)).N((class00395)new class00401((class00392)class00392.y((String)((String)Baritone.settings().prefix.value + "set elytraNetherSeed -4100785268875389365")))).N((class00647)new class00625(IBaritoneChatControl.FORCE_COMMAND_PREFIX + "set elytraNetherSeed -4100785268875389365")));
        class052162.y((class00392)class052163);
        class052162.i(". Once you're further out into newer terrain generation (this includes everything up through 1.12), you should try ");
        class05216 class052164 = class00392.y((String)"the newer seed (click here)");
        class052164.y(class052164.method_10866().L(Boolean.valueOf(true)).N(Boolean.valueOf(true)).N((class00395)new class00401((class00392)class00392.y((String)((String)Baritone.settings().prefix.value + "set elytraNetherSeed 146008555100680")))).N((class00647)new class00625(IBaritoneChatControl.FORCE_COMMAND_PREFIX + "set elytraNetherSeed 146008555100680")));
        class052162.y((class00392)class052164);
        class052162.i(". Once you get into 1.19 terrain, the terrain becomes unpredictable again, due to custom non-vanilla generation, and you should set #elytraPredictTerrain to false. ");
        return class052162;
    }

    private boolean detectOn2b2t() {
        class04568 class045682 = this.ctx.minecraft().yN();
        return class045682 != null && class045682.y.toLowerCase().contains("2b2t.org");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        TabCompleteHelper tabCompleteHelper = new TabCompleteHelper();
        if (iArgConsumer.hasExactlyOne()) {
            tabCompleteHelper.append(new String[]{"reset", "repack", "supported"});
        }
        return tabCompleteHelper.filterPrefix(iArgConsumer.getString()).stream();
    }

    private static String unsupportedSystemMessage() {
        String string = System.getProperty("os.arch");
        String string2 = System.getProperty("os.name");
        return String.format("Failed loading native library. Your CPU is %s and your operating system is %s. Supported architectures are 64 bit x86, and 64 bit ARM. Supported operating systems are Windows, Linux, and Mac", string, string2);
    }
}

