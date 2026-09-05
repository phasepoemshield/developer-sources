/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer
 *  com.viaversion.viaversion.libs.mcstructs.text.utils.TextUtils
 */
package net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10.rewriter;

import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.objects.Object2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentSerializer;
import com.viaversion.viaversion.libs.mcstructs.text.utils.TextUtils;

public class TextRewriter {
    private static final Object2ObjectMap<String, String> TRANSLATIONS = new Object2ObjectOpenHashMap(86, 0.99f);

    public static String toClient(String text) {
        TextComponent component = TextComponentSerializer.V1_7.deserialize(text);
        TextUtils.iterateAll((TextComponent)component, c -> {
            TranslationComponent translationComponent;
            if (c instanceof TranslationComponent && TRANSLATIONS.containsKey((Object)(translationComponent = (TranslationComponent)c).getKey())) {
                translationComponent.setKey((String)TRANSLATIONS.get((Object)translationComponent.getKey()));
            }
        });
        return TextComponentSerializer.V1_7.serialize(component);
    }

    static {
        TRANSLATIONS.put((Object)"generator.amplified", (Object)"AMPLIFIED");
        TRANSLATIONS.put((Object)"$o", (Object)"Play Demo World");
        TRANSLATIONS.put((Object)"options.serverTextures", (Object)"Server Textures");
        TRANSLATIONS.put((Object)"mco.title", (Object)"Minecraft Realms");
        TRANSLATIONS.put((Object)"mco.terms.buttons.agree", (Object)"Agree");
        TRANSLATIONS.put((Object)"mco.terms.buttons.disagree", (Object)"Don't Agree");
        TRANSLATIONS.put((Object)"mco.terms.title", (Object)"Realms Terms of Service");
        TRANSLATIONS.put((Object)"mco.terms.sentence.1", (Object)"I agree to Minecraft Realms");
        TRANSLATIONS.put((Object)"mco.terms.sentence.2", (Object)"Terms of Service");
        TRANSLATIONS.put((Object)"mco.buy.realms.title", (Object)"Buy a Realm");
        TRANSLATIONS.put((Object)"mco.buy.realms.buy", (Object)"I want one!");
        TRANSLATIONS.put((Object)"mco.selectServer.play", (Object)"Play");
        TRANSLATIONS.put((Object)"mco.selectServer.configure", (Object)"Configure");
        TRANSLATIONS.put((Object)"mco.selectServer.leave", (Object)"Leave Realm");
        TRANSLATIONS.put((Object)"mco.selectServer.create", (Object)"Create Realm");
        TRANSLATIONS.put((Object)"mco.selectServer.buy", (Object)"Buy Realm");
        TRANSLATIONS.put((Object)"mco.selectServer.moreinfo", (Object)"More Info");
        TRANSLATIONS.put((Object)"mco.selectServer.expired", (Object)"Expired Server");
        TRANSLATIONS.put((Object)"mco.selectServer.open", (Object)"Open Server");
        TRANSLATIONS.put((Object)"mco.selectServer.closed", (Object)"Closed Server");
        TRANSLATIONS.put((Object)"mco.selectServer.locked", (Object)"Locked Server");
        TRANSLATIONS.put((Object)"mco.selectServer.expires.days", (Object)"Expires in %s days");
        TRANSLATIONS.put((Object)"mco.selectServer.expires.day", (Object)"Expires in a day");
        TRANSLATIONS.put((Object)"mco.selectServer.expires.soon", (Object)"Expires soon");
        TRANSLATIONS.put((Object)"mco.configure.world.edit.title", (Object)"Edit Realm");
        TRANSLATIONS.put((Object)"mco.configure.world.title", (Object)"Configure Realm");
        TRANSLATIONS.put((Object)"mco.configure.world.name", (Object)"Name");
        TRANSLATIONS.put((Object)"mco.configure.world.description", (Object)"Description");
        TRANSLATIONS.put((Object)"mco.configure.world.location", (Object)"Location");
        TRANSLATIONS.put((Object)"mco.configure.world.invited", (Object)"Invited");
        TRANSLATIONS.put((Object)"mco.configure.world.buttons.edit", (Object)"Edit");
        TRANSLATIONS.put((Object)"mco.configure.world.buttons.reset", (Object)"Reset Realm");
        TRANSLATIONS.put((Object)"mco.configure.world.buttons.done", (Object)"Done");
        TRANSLATIONS.put((Object)"mco.configure.world.buttons.delete", (Object)"Delete");
        TRANSLATIONS.put((Object)"mco.configure.world.buttons.open", (Object)"Open Realm");
        TRANSLATIONS.put((Object)"mco.configure.world.buttons.close", (Object)"Close Realm");
        TRANSLATIONS.put((Object)"mco.configure.world.buttons.invite", (Object)"Invite");
        TRANSLATIONS.put((Object)"mco.configure.world.buttons.uninvite", (Object)"Uninvite");
        TRANSLATIONS.put((Object)"mco.configure.world.buttons.backup", (Object)"Backups");
        TRANSLATIONS.put((Object)"mco.configure.world.buttons.subscription", (Object)"Subscription");
        TRANSLATIONS.put((Object)"mco.configure.world.invite.profile.name", (Object)"Name");
        TRANSLATIONS.put((Object)"mco.configure.world.uninvite.question", (Object)"Are you sure that you want to uninvite");
        TRANSLATIONS.put((Object)"mco.configure.world.status", (Object)"Status");
        TRANSLATIONS.put((Object)"mco.configure.world.subscription.title", (Object)"Subscription Info");
        TRANSLATIONS.put((Object)"mco.configure.world.subscription.daysleft", (Object)"Days Left");
        TRANSLATIONS.put((Object)"mco.configure.world.subscription.start", (Object)"Start Date");
        TRANSLATIONS.put((Object)"mco.configure.world.subscription.extend", (Object)"Extend Subscription");
        TRANSLATIONS.put((Object)"mco.create.world.location.title", (Object)"Locations");
        TRANSLATIONS.put((Object)"mco.create.world.location.warning", (Object)"You may not get the exact location you select");
        TRANSLATIONS.put((Object)"mco.create.world.wait", (Object)"Creating the realm...");
        TRANSLATIONS.put((Object)"mco.create.world.seed", (Object)"Seed (Optional)");
        TRANSLATIONS.put((Object)"mco.reset.world.title", (Object)"Reset Realm");
        TRANSLATIONS.put((Object)"mco.reset.world.warning", (Object)"This will permanently delete your realm!");
        TRANSLATIONS.put((Object)"mco.reset.world.seed", (Object)"Seed (Optional)");
        TRANSLATIONS.put((Object)"mco.reset.world.resetting.screen.title", (Object)"Resetting Realm...");
        TRANSLATIONS.put((Object)"mco.configure.world.close.question.line1", (Object)"Your realm will become unavailable.");
        TRANSLATIONS.put((Object)"mco.configure.world.close.question.line2", (Object)"Are you sure you want to do that?");
        TRANSLATIONS.put((Object)"mco.configure.world.leave.question.line1", (Object)"If you leave this realm you won't see it unless invited again");
        TRANSLATIONS.put((Object)"mco.configure.world.leave.question.line2", (Object)"Are you sure you want to do that?");
        TRANSLATIONS.put((Object)"mco.configure.world.reset.question.line1", (Object)"Your realm will be regenerated and your current realm will be lost");
        TRANSLATIONS.put((Object)"mco.configure.world.reset.question.line2", (Object)"Are you sure you want to do that?");
        TRANSLATIONS.put((Object)"mco.configure.world.restore.question.line1", (Object)"Your realm will be restored to date");
        TRANSLATIONS.put((Object)"mco.configure.world.restore.question.line2", (Object)"Are you sure you want to do that?");
        TRANSLATIONS.put((Object)"mco.configure.world.restore.download.question.line1", (Object)"You will be redirected to your default browser to download your world map.");
        TRANSLATIONS.put((Object)"mco.configure.world.restore.download.question.line2", (Object)"Do you want to continue?");
        TRANSLATIONS.put((Object)"mco.more.info.question.line1", (Object)"You will be redirected to your default browser to see the page.");
        TRANSLATIONS.put((Object)"mco.more.info.question.line2", (Object)"Do you want to continue?");
        TRANSLATIONS.put((Object)"mco.connect.connecting", (Object)"Connecting to the online server...");
        TRANSLATIONS.put((Object)"mco.connect.authorizing", (Object)"Logging in...");
        TRANSLATIONS.put((Object)"mco.connect.failed", (Object)"Failed to connect to the online server");
        TRANSLATIONS.put((Object)"mco.create.world", (Object)"Create");
        TRANSLATIONS.put((Object)"mco.client.outdated.title", (Object)"Client Outdated!");
        TRANSLATIONS.put((Object)"mco.client.outdated.msg", (Object)"Your client is outdated, please consider updating it to use Realms");
        TRANSLATIONS.put((Object)"mco.backup.title", (Object)"Backups");
        TRANSLATIONS.put((Object)"mco.backup.button.restore", (Object)"Restore");
        TRANSLATIONS.put((Object)"mco.backup.restoring", (Object)"Restoring your realm");
        TRANSLATIONS.put((Object)"mco.backup.button.download", (Object)"Download Latest");
        TRANSLATIONS.put((Object)"mco.template.title", (Object)"Realm Templates");
        TRANSLATIONS.put((Object)"mco.template.button.select", (Object)"Select");
        TRANSLATIONS.put((Object)"mco.template.default.name", (Object)"Select Template (Optional)");
        TRANSLATIONS.put((Object)"mco.template.name", (Object)"Template");
        TRANSLATIONS.put((Object)"mco.invites.button.accept", (Object)"Accept");
        TRANSLATIONS.put((Object)"mco.invites.button.reject", (Object)"Reject");
        TRANSLATIONS.put((Object)"mco.invites.title", (Object)"Pending Invitations");
        TRANSLATIONS.put((Object)"mco.invites.pending", (Object)"New invitations!");
        TRANSLATIONS.put((Object)"mco.invites.nopending", (Object)"No pending invitations!");
    }
}

