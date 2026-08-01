package fun.nexisdlc.modules.api;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.utils.client.SoundUtil;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.impl.combat.*;
import fun.nexisdlc.modules.impl.movement.*;
import fun.nexisdlc.modules.impl.player.*;
import fun.nexisdlc.modules.impl.render.*;
import fun.nexisdlc.modules.impl.utils.*;
import lombok.Getter;
import net.minecraft.client.util.InputUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

@Getter
public class FunctionManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(FunctionManager.class);
    final List<Function> functions = new CopyOnWriteArrayList<>();

    Interface anInterface;
    NoRender noRender;
    CameraTweaks cameraTweaks;
    PlayerUtilsFunction playerUtilsFunction;
    ThrowableHelper throwableHelper;
    ClickAction clickAction;
    ServerAssistant serverAssistant;
    AuraModule auraModule;
    ThrowableAim throwableAim;
    AutoTotem autoTotem;
    AutoCrystal autoCrystal;
    NoVelocity noVelocity;
    AutoSwap autoSwap;
    TargetPearl targetPearl;
    NoFriendDamage noFriendDamage;
    TriggerBot triggerBot;
    ServerCrasher crasher;
    StreamerMode streamerMode;
    ItemScroller itemScroller;
    Notifications notifications;
    StructureInfo structureInfo;
    HitSounds hitSounds;
    SoundFX soundFX;
    AutoSprint autoSprint;
    GuiMove guiMove;
    NoSlow noSlow;
    Spider spider;
    AirStuck airStuck;
    WaterWalk waterWalk;
    Scaffold scaffold;
    Strafe strafe;
    FreeLook freeLook;
    TargetESP targetESP;
    Ambience ambience;
    Particles particles;
    ChorusRadius chorusRadius;
    ItemRadius itemRadius;
    BlockOverlay blockOverlay;
    HitBoxESP hitBoxESP;
    OutlineChams outlineChams;
    NoServerDesync noServerDesync;
    IRC irc;
    Globals globals;
    SwingAnimations swingAnimations;
    ViewModel viewModel;
    HandGlow handGlow;
    ShaderHands shaderHands;
    NameTags nameTags;
    Tweaks tweaks;
    Arrows arrows;
    Brightness brightness;
    Beautifully beautifully;
    FreeCamera freeCamera;
    FakePlayer fakePlayer;
    ChestStealer chestStealer;
    AutoWarden autoWarden;
    SkyShader skyShader;
    AutoTool autoTool;
    AutoMine autoMine;
    AutoEat autoEat;
    AutoSell autoSell;
    AutoInvis autoInvis;
    AntiAFK antiAFK;
    NBTViewer nbtViewer;
    RpSpoofer rpSpoofer;
    SpookyJoin spookyJoin;
    ClientHide clientHide;
    ProxyServer proxyServer;
    AutoTP autoTP;
    Blink blink;
    PingSpoof pingSpoof;
    ClanUpgrade clanUpgrade;
    ClanInvest clanInvest;
    AutoLeave autoLeave;
    FixHP fixHP;
    Tracker tracker;
    ElytraFunctional elytraFunctional;
    ElytraMotion elytraMotion;
    ElytraSwap elytraSwap;
    FastExp fastExp;
    FastLeave fastLeave;
    DanjTags danjTags;
    AuctionHelper auctionHelper;
    AutoArmor autoArmor;
    RotationRecorderModule rotationRecorderModule;
    AimBot aimBot;
    NoEffects noEffects;
    SeeInvisibles seeInvisibles;
    AntiSpamModule antiSpamModule;
    ThrowPrediction throwPrediction;
    FastFall fastFall;
    BlockESP blockESP;
    JumpCircle jumpCircle;
    ArmorDurability armorDurability;
    ClickGui clickGui;
    RotationRender rotationRender;
    Crosshair crosshair;

    public void init() {
        registerAll(
                clickGui = new ClickGui(),
                anInterface = new Interface(),
                noRender = new NoRender(),
                danjTags = new DanjTags(),
                blockESP = new BlockESP(),
                crosshair = new Crosshair(),
                armorDurability = new ArmorDurability(),
                cameraTweaks = new CameraTweaks(),
                auctionHelper = new AuctionHelper(),
                fastFall = new FastFall(),
                jumpCircle = new JumpCircle(),
                rotationRender = new RotationRender(),
                arrows = new Arrows(),
                brightness = new Brightness(),
                beautifully = new Beautifully(),
                rotationRecorderModule = new RotationRecorderModule(),
                playerUtilsFunction = new PlayerUtilsFunction(),
                clickAction = new ClickAction(),
                serverAssistant = new ServerAssistant(),
                auraModule = new AuraModule(),
                autoSwap = new AutoSwap(),
                throwPrediction = new ThrowPrediction(),
                noEffects = new NoEffects(),
                targetPearl = new TargetPearl(),
                noFriendDamage = new NoFriendDamage(),
                autoTotem = new AutoTotem(),
                autoCrystal = new AutoCrystal(),
                throwableAim = new ThrowableAim(),
                crasher = new ServerCrasher(),
                noVelocity = new NoVelocity(),
                streamerMode = new StreamerMode(),
                itemScroller = new ItemScroller(),
                notifications = new Notifications(),
                structureInfo = new StructureInfo(),
                hitSounds = new HitSounds(),
                soundFX = new SoundFX(),
                throwableHelper = new ThrowableHelper(),
                autoSprint = new AutoSprint(),
                guiMove = new GuiMove(),
                noSlow = new NoSlow(),
                spider = new Spider(),
                airStuck = new AirStuck(),
                waterWalk = new WaterWalk(),
                scaffold = new Scaffold(),
                strafe = new Strafe(),
                freeLook = new FreeLook(),
                targetESP = new TargetESP(),
                ambience = new Ambience(),
                particles = new Particles(),
                chorusRadius = new ChorusRadius(),
                itemRadius = new ItemRadius(),
                blockOverlay = new BlockOverlay(),
                skyShader = new SkyShader(),
                new ProjectilePrediction(),
                new ItemReplacer(),
                hitBoxESP = new HitBoxESP(),
                outlineChams = new OutlineChams(),
                noServerDesync = new NoServerDesync(),
                irc = new IRC(),
                globals = new Globals(),
                swingAnimations = new SwingAnimations(),
                viewModel = new ViewModel(),
                handGlow = new HandGlow(),
                shaderHands = new ShaderHands(),
                nameTags = new NameTags(),
                tweaks = new Tweaks(),
                freeCamera = new FreeCamera(),
                fakePlayer = new FakePlayer(),
                chestStealer = new ChestStealer(),
                autoWarden = new AutoWarden(),
                autoTool = new AutoTool(),
                autoMine = new AutoMine(),
                autoEat = new AutoEat(),
                autoSell = new AutoSell(),
                autoInvis = new AutoInvis(),
                antiAFK = new AntiAFK(),
                nbtViewer = new NBTViewer(),
                rpSpoofer = new RpSpoofer(),
                spookyJoin = new SpookyJoin(),
                clientHide = new ClientHide(),
                proxyServer = new ProxyServer(),
                autoTP = new AutoTP(),
                blink = new Blink(),
                pingSpoof = new PingSpoof(),
                clanUpgrade = new ClanUpgrade(),
                clanInvest = new ClanInvest(),
                autoLeave = new AutoLeave(),
                fixHP = new FixHP(),
                tracker = new Tracker(),
                elytraFunctional = new ElytraFunctional(),
                elytraMotion = new ElytraMotion(),
                elytraSwap = new ElytraSwap(),
                fastExp = new FastExp(),
                fastLeave = new FastLeave(),
                autoArmor = new AutoArmor(),
                aimBot = new AimBot(),
                triggerBot = new TriggerBot(),
                seeInvisibles = new SeeInvisibles(),
                antiSpamModule = new AntiSpamModule()
        );

        Nexis.getEventBus().subscribe(DanjTags.getInstance());
        NexisClient.getEventBus().subscribe(this);
    }

    private void registerAll(Function... features) {
        Arrays.sort(features, Comparator.comparing(Function::getAlias));
        this.functions.addAll(List.of(features));
    }

    public IRC getIRC() {
        return irc;
    }

    @EventHandler
    public void onKey(EventKey e) {
        if (ClientContainer.isHide()) {
            return;
        }

        if (e.getType() != InputUtil.Type.MOUSE && e.getKey() == -1)
            return;

        for (Function function : functions) {
            if (!function.isVisible()) continue;
            if (e.getAction() == 1 && e.isKeyDown(function.getBind())) {
                function.toggle();
            }
        }

        // Тоггл BooleanSetting по бинду (только action==1 = PRESS)
        if (e.getAction() == 1) {
            for (Function function : functions) {
                if (!function.isVisible()) continue;
                for (fun.nexisdlc.modules.api.settings.api.Setting<?> setting : function.getSettings()) {
                    if (!(setting instanceof BooleanSetting boolSetting)) continue;
                    if (!boolSetting.isBound()) continue;
                    if (!e.isKeyDown(boolSetting.getBind())) continue;
                    boolean newVal = !boolSetting.get();
                    boolSetting.set(newVal);

                    SoundFX sounds = soundFX;
                    if (sounds != null && sounds.isState()) {
                        String fileName = sounds.getFileName(newVal);
                        float volume = sounds.volume.get();
                        SoundUtil.playSound("functions/" + fileName, volume, false);
                    }
                }
            }
        }
    }

    public List<Function> getFunctionsByCategory(Category category) {
        return functions.stream()
                .filter(function -> function.getCategory() == category && function.isVisible())
                .collect(Collectors.toList());
    }

    public Function getFunctionByName(String name) {
        if (name == null || name.isEmpty()) return null;
        String lower = name.toLowerCase(Locale.US);
        return functions.stream()
                .filter(f -> f.isVisible() && f.getName().toLowerCase(Locale.US).equals(lower))
                .findFirst()
                .orElse(null);
    }

    public Function getFunction(String name) {
        return getFunctionByName(name);
    }

    public AuraModule getAttackAura() {
        return auraModule;
    }

    public AimBot getAimBot() {
        return aimBot;
    }

    public RotationRender getRotationRender() {
        return rotationRender;
    }

    public List<Function> getVisibleFunctions() {
        return functions.stream()
                .filter(Function::isVisible)
                .collect(Collectors.toList());
    }
}
