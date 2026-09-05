/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Helper
 *  baritone.api.utils.NotificationHelper
 *  baritone.api.utils.gui.BaritoneToast
 *  minecraft.class00392
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01056
 *  minecraft.class03054
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06993
 *  minecraft.class07111
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package baritone.api;

import baritone.api.Settings$JavaOnly;
import baritone.api.Settings$Setting;
import baritone.api.utils.Helper;
import baritone.api.utils.NotificationHelper;
import baritone.api.utils.gui.BaritoneToast;
import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01056;
import minecraft.class03054;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06993;
import minecraft.class07111;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Settings {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Baritone");
    public final Settings$Setting<Boolean> allowBreak = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<List<class00891>> allowBreakAnyway = new Settings$Setting(this, new ArrayList());
    public final Settings$Setting<Boolean> allowSprint = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> allowPlace = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> allowPlaceInFluidsSource = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> allowPlaceInFluidsFlow = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> allowInventory = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Integer> ticksBetweenInventoryMoves = new Settings$Setting<Integer>(this, 1);
    public final Settings$Setting<Boolean> inventoryMoveOnlyIfStationary = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> assumeExternalAutoTool = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> autoTool = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Double> blockPlacementPenalty = new Settings$Setting<Double>(this, 20.0);
    public final Settings$Setting<Double> blockBreakAdditionalPenalty = new Settings$Setting<Double>(this, 2.0);
    public final Settings$Setting<Double> jumpPenalty = new Settings$Setting<Double>(this, 2.0);
    public final Settings$Setting<Double> walkOnWaterOnePenalty = new Settings$Setting<Double>(this, 3.0);
    public final Settings$Setting<Boolean> strictLiquidCheck = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> allowWaterBucketFall = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> assumeWalkOnWater = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> assumeWalkOnLava = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> assumeStep = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> assumeSafeWalk = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> allowJumpAtBuildLimit = new Settings$Setting<Boolean>(this, false);
    @Deprecated
    @Settings$JavaOnly
    public final Settings$Setting<Boolean> allowJumpAt256 = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> allowParkourAscend = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> allowDiagonalDescend = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> allowDiagonalAscend = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> allowDownward = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<List<class06581>> acceptableThrowawayItems = new Settings$Setting<ArrayList<class06581>>(this, new ArrayList<class06581>(Arrays.asList(class00869.z.B(), class00869.W.B(), class00869.id.B(), class00869.y.B())));
    public final Settings$Setting<List<class00891>> blocksToAvoid = new Settings$Setting<ArrayList<class00891>>(this, new ArrayList<class00891>(List.of(class00869.Ml)));
    public final Settings$Setting<List<class00891>> blocksToDisallowBreaking = new Settings$Setting(this, new ArrayList());
    public final Settings$Setting<List<class00891>> blocksToAvoidBreaking = new Settings$Setting<ArrayList<class00891>>(this, new ArrayList<class00891>(Arrays.asList(class00869.LD, class00869.uN, class00869.LA, class00869.BH)));
    public final Settings$Setting<Double> avoidBreakingMultiplier = new Settings$Setting<Double>(this, 0.1);
    public final Settings$Setting<List<class00891>> buildIgnoreBlocks = new Settings$Setting<ArrayList<class00891>>(this, new ArrayList<class00891>(Arrays.asList(new class00891[0])));
    public final Settings$Setting<List<class00891>> buildSkipBlocks = new Settings$Setting<ArrayList<class00891>>(this, new ArrayList<class00891>(Arrays.asList(new class00891[0])));
    public final Settings$Setting<Map<class00891, List<class00891>>> buildValidSubstitutes = new Settings$Setting(this, new HashMap());
    public final Settings$Setting<Map<class00891, List<class00891>>> buildSubstitutes = new Settings$Setting(this, new HashMap());
    public final Settings$Setting<List<class00891>> okIfAir = new Settings$Setting<ArrayList<class00891>>(this, new ArrayList<class00891>(Arrays.asList(new class00891[0])));
    public final Settings$Setting<Boolean> buildIgnoreExisting = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> buildIgnoreDirection = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<List<String>> buildIgnoreProperties = new Settings$Setting<ArrayList<String>>(this, new ArrayList<String>(Arrays.asList(new String[0])));
    public final Settings$Setting<Boolean> avoidUpdatingFallingBlocks = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> allowVines = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> allowWalkOnBottomSlab = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> allowParkour = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> allowParkourPlace = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> considerPotionEffects = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> sprintAscends = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> overshootTraverse = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> pauseMiningForFallingBlocks = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Integer> rightClickSpeed = new Settings$Setting<Integer>(this, 4);
    public final Settings$Setting<Double> randomLooking113 = new Settings$Setting<Double>(this, 2.0);
    public final Settings$Setting<Float> blockReachDistance = new Settings$Setting<Float>(this, Float.valueOf(4.5f));
    public final Settings$Setting<Integer> blockBreakSpeed = new Settings$Setting<Integer>(this, 6);
    public final Settings$Setting<Double> randomLooking = new Settings$Setting<Double>(this, 0.01);
    public final Settings$Setting<Double> costHeuristic = new Settings$Setting<Double>(this, 3.563);
    public final Settings$Setting<Integer> pathingMaxChunkBorderFetch = new Settings$Setting<Integer>(this, 50);
    public final Settings$Setting<Double> backtrackCostFavoringCoefficient = new Settings$Setting<Double>(this, 0.5);
    public final Settings$Setting<Boolean> avoidance = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Double> mobSpawnerAvoidanceCoefficient = new Settings$Setting<Double>(this, 2.0);
    public final Settings$Setting<Integer> mobSpawnerAvoidanceRadius = new Settings$Setting<Integer>(this, 16);
    public final Settings$Setting<Double> mobAvoidanceCoefficient = new Settings$Setting<Double>(this, 1.5);
    public final Settings$Setting<Integer> mobAvoidanceRadius = new Settings$Setting<Integer>(this, 8);
    public final Settings$Setting<Boolean> rightClickContainerOnArrival = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> enterPortal = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> minimumImprovementRepropagation = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> cutoffAtLoadBoundary = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Double> maxCostIncrease = new Settings$Setting<Double>(this, 10.0);
    public final Settings$Setting<Integer> costVerificationLookahead = new Settings$Setting<Integer>(this, 5);
    public final Settings$Setting<Double> pathCutoffFactor = new Settings$Setting<Double>(this, 0.9);
    public final Settings$Setting<Integer> pathCutoffMinimumLength = new Settings$Setting<Integer>(this, 30);
    public final Settings$Setting<Integer> planningTickLookahead = new Settings$Setting<Integer>(this, 150);
    public final Settings$Setting<Integer> pathingMapDefaultSize = new Settings$Setting<Integer>(this, 1024);
    public final Settings$Setting<Float> pathingMapLoadFactor = new Settings$Setting<Float>(this, Float.valueOf(0.75f));
    public final Settings$Setting<Integer> maxFallHeightNoWater = new Settings$Setting<Integer>(this, 3);
    public final Settings$Setting<Integer> maxFallHeightBucket = new Settings$Setting<Integer>(this, 20);
    public final Settings$Setting<Boolean> allowOvershootDiagonalDescend = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> simplifyUnloadedYCoord = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> repackOnAnyBlockChange = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Integer> movementTimeoutTicks = new Settings$Setting<Integer>(this, 100);
    public final Settings$Setting<Long> primaryTimeoutMS = new Settings$Setting<Long>(this, 500L);
    public final Settings$Setting<Long> failureTimeoutMS = new Settings$Setting<Long>(this, 2000L);
    public final Settings$Setting<Long> planAheadPrimaryTimeoutMS = new Settings$Setting<Long>(this, 4000L);
    public final Settings$Setting<Long> planAheadFailureTimeoutMS = new Settings$Setting<Long>(this, 5000L);
    public final Settings$Setting<Boolean> slowPath = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Long> slowPathTimeDelayMS = new Settings$Setting<Long>(this, 100L);
    public final Settings$Setting<Long> slowPathTimeoutMS = new Settings$Setting<Long>(this, 40000L);
    public final Settings$Setting<Boolean> doBedWaypoints = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> doDeathWaypoints = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> chunkCaching = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> pruneRegionsFromRAM = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Integer> chunkPackerQueueMaxSize = new Settings$Setting<Integer>(this, 2000);
    public final Settings$Setting<Boolean> backfill = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> logAsToast = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> chatDebug = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> chatControl = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> chatControlAnyway = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> renderPath = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> renderPathAsLine = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> renderGoal = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> renderGoalAnimated = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> renderSelectionBoxes = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> renderGoalIgnoreDepth = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> renderGoalXZBeacon = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> renderSelectionBoxesIgnoreDepth = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> renderPathIgnoreDepth = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Float> pathRenderLineWidthPixels = new Settings$Setting<Float>(this, Float.valueOf(5.0f));
    public final Settings$Setting<Float> goalRenderLineWidthPixels = new Settings$Setting<Float>(this, Float.valueOf(3.0f));
    public final Settings$Setting<Boolean> fadePath = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> freeLook = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> blockFreeLook = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> elytraFreeLook = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> smoothLook = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> elytraSmoothLook = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Integer> smoothLookTicks = new Settings$Setting<Integer>(this, 5);
    public final Settings$Setting<Boolean> remainWithExistingLookDirection = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> antiCheatCompatibility = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> pathThroughCachedOnly = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> sprintInWater = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> blacklistClosestOnFailure = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> renderCachedChunks = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Float> cachedChunksOpacity = new Settings$Setting<Float>(this, Float.valueOf(0.5f));
    public final Settings$Setting<Boolean> prefixControl = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<String> prefix = new Settings$Setting<String>(this, "#");
    public final Settings$Setting<Boolean> shortBaritonePrefix = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> useMessageTag = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> echoCommands = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> censorCoordinates = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> censorRanCommands = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> itemSaver = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Integer> itemSaverThreshold = new Settings$Setting<Integer>(this, 10);
    public final Settings$Setting<Boolean> preferSilkTouch = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> walkWhileBreaking = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> splicePath = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Integer> maxPathHistoryLength = new Settings$Setting<Integer>(this, 300);
    public final Settings$Setting<Integer> pathHistoryCutoffAmount = new Settings$Setting<Integer>(this, 50);
    public final Settings$Setting<Integer> mineGoalUpdateInterval = new Settings$Setting<Integer>(this, 5);
    public final Settings$Setting<Integer> maxCachedWorldScanCount = new Settings$Setting<Integer>(this, 10);
    public final Settings$Setting<Integer> mineMaxOreLocationsCount = new Settings$Setting<Integer>(this, 64);
    public final Settings$Setting<Integer> minYLevelWhileMining = new Settings$Setting<Integer>(this, 0);
    public final Settings$Setting<Integer> maxYLevelWhileMining = new Settings$Setting<Integer>(this, 2031);
    public final Settings$Setting<Boolean> allowOnlyExposedOres = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Integer> allowOnlyExposedOresDistance = new Settings$Setting<Integer>(this, 1);
    public final Settings$Setting<Boolean> exploreForBlocks = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Integer> worldExploringChunkOffset = new Settings$Setting<Integer>(this, 0);
    public final Settings$Setting<Integer> exploreChunkSetMinimumSize = new Settings$Setting<Integer>(this, 10);
    public final Settings$Setting<Integer> exploreMaintainY = new Settings$Setting<Integer>(this, 64);
    public final Settings$Setting<Boolean> replantCrops = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> replantNetherWart = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> farmUsingSelection = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Integer> farmMaxScanSize = new Settings$Setting<Integer>(this, 256);
    public final Settings$Setting<Boolean> extendCacheOnThreshold = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> buildInLayers = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> layerOrder = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Integer> layerHeight = new Settings$Setting<Integer>(this, 1);
    public final Settings$Setting<Integer> startAtLayer = new Settings$Setting<Integer>(this, 0);
    public final Settings$Setting<Boolean> skipFailedLayers = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> buildOnlySelection = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<class00753> buildRepeat = new Settings$Setting<class00753>(this, new class00753(0, 0, 0));
    public final Settings$Setting<Integer> buildRepeatCount = new Settings$Setting<Integer>(this, -1);
    public final Settings$Setting<Boolean> buildRepeatSneaky = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> breakFromAbove = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> goalBreakFromAbove = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> mapArtMode = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> okIfWater = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Integer> incorrectSize = new Settings$Setting<Integer>(this, 100);
    public final Settings$Setting<Double> breakCorrectBlockPenaltyMultiplier = new Settings$Setting<Double>(this, 10.0);
    public final Settings$Setting<Double> placeIncorrectBlockPenaltyMultiplier = new Settings$Setting<Double>(this, 2.0);
    public final Settings$Setting<Boolean> schematicOrientationX = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> schematicOrientationY = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> schematicOrientationZ = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<class06993> buildSchematicRotation = new Settings$Setting<class06993>(this, class06993.field_11467);
    public final Settings$Setting<class07111> buildSchematicMirror = new Settings$Setting<class07111>(this, class07111.field_11302);
    public final Settings$Setting<String> schematicFallbackExtension = new Settings$Setting<String>(this, "schematic");
    public final Settings$Setting<Integer> builderTickScanRadius = new Settings$Setting<Integer>(this, 5);
    public final Settings$Setting<Boolean> mineScanDroppedItems = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Long> mineDropLoiterDurationMSThanksLouca = new Settings$Setting<Long>(this, 250L);
    public final Settings$Setting<Boolean> distanceTrim = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> cancelOnGoalInvalidation = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Integer> axisHeight = new Settings$Setting<Integer>(this, 120);
    public final Settings$Setting<Boolean> disconnectOnArrival = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> legitMine = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Integer> legitMineYLevel = new Settings$Setting<Integer>(this, -59);
    public final Settings$Setting<Boolean> legitMineIncludeDiagonals = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> forceInternalMining = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> internalMiningAirException = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Double> followOffsetDistance = new Settings$Setting<Double>(this, 0.0);
    public final Settings$Setting<Float> followOffsetDirection = new Settings$Setting<Float>(this, Float.valueOf(0.0f));
    public final Settings$Setting<Integer> followRadius = new Settings$Setting<Integer>(this, 3);
    public final Settings$Setting<Integer> followTargetMaxDistance = new Settings$Setting<Integer>(this, 0);
    public final Settings$Setting<Boolean> disableCompletionCheck = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Long> cachedChunksExpirySeconds = new Settings$Setting<Long>(this, -1L);
    @Settings$JavaOnly
    public final Settings$Setting<Consumer<class00392>> logger = new Settings$Setting<Consumer<class00392>>(this, class003922 -> {
        try {
            class03054 class030542 = (Boolean)this.useMessageTag.value != false ? Helper.MESSAGE_TAG : null;
            ((class01056)class06202.Nq().i_6).i().N(class003922, null, class030542);
        }
        catch (Throwable throwable) {
            LOGGER.warn("Failed to log message to chat: " + class003922.getString(), throwable);
        }
    });
    @Settings$JavaOnly
    public final Settings$Setting<BiConsumer<String, Boolean>> notifier = new Settings$Setting<BiConsumer<String, Boolean>>(this, NotificationHelper::notify);
    @Settings$JavaOnly
    public final Settings$Setting<BiConsumer<class00392, class00392>> toaster = new Settings$Setting<BiConsumer<class00392, class00392>>(this, BaritoneToast::addOrUpdate);
    public final Settings$Setting<Boolean> verboseCommandExceptions = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Double> yLevelBoxSize = new Settings$Setting<Double>(this, 15.0);
    public final Settings$Setting<Color> colorCurrentPath = new Settings$Setting<Color>(this, Color.RED);
    public final Settings$Setting<Color> colorNextPath = new Settings$Setting<Color>(this, Color.MAGENTA);
    public final Settings$Setting<Color> colorBlocksToBreak = new Settings$Setting<Color>(this, Color.RED);
    public final Settings$Setting<Color> colorBlocksToPlace = new Settings$Setting<Color>(this, Color.GREEN);
    public final Settings$Setting<Color> colorBlocksToWalkInto = new Settings$Setting<Color>(this, Color.MAGENTA);
    public final Settings$Setting<Color> colorBestPathSoFar = new Settings$Setting<Color>(this, Color.BLUE);
    public final Settings$Setting<Color> colorMostRecentConsidered = new Settings$Setting<Color>(this, Color.CYAN);
    public final Settings$Setting<Color> colorGoalBox = new Settings$Setting<Color>(this, Color.GREEN);
    public final Settings$Setting<Color> colorInvertedGoalBox = new Settings$Setting<Color>(this, Color.RED);
    public final Settings$Setting<Color> colorSelection = new Settings$Setting<Color>(this, Color.CYAN);
    public final Settings$Setting<Color> colorSelectionPos1 = new Settings$Setting<Color>(this, Color.BLACK);
    public final Settings$Setting<Color> colorSelectionPos2 = new Settings$Setting<Color>(this, Color.ORANGE);
    public final Settings$Setting<Float> selectionOpacity = new Settings$Setting<Float>(this, Float.valueOf(0.5f));
    public final Settings$Setting<Float> selectionLineWidth = new Settings$Setting<Float>(this, Float.valueOf(2.0f));
    public final Settings$Setting<Boolean> renderSelection = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> renderSelectionIgnoreDepth = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> renderSelectionCorners = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> useSwordToMine = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> desktopNotifications = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> notificationOnPathComplete = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> notificationOnFarmFail = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> notificationOnBuildFinished = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> notificationOnExploreFinished = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> notificationOnMineFail = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Integer> elytraSimulationTicks = new Settings$Setting<Integer>(this, 20);
    public final Settings$Setting<Integer> elytraPitchRange = new Settings$Setting<Integer>(this, 25);
    public final Settings$Setting<Double> elytraFireworkSpeed = new Settings$Setting<Double>(this, 1.2);
    public final Settings$Setting<Integer> elytraFireworkSetbackUseDelay = new Settings$Setting<Integer>(this, 15);
    public final Settings$Setting<Double> elytraMinimumAvoidance = new Settings$Setting<Double>(this, 0.2);
    public final Settings$Setting<Boolean> elytraConserveFireworks = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> elytraRenderRaytraces = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> elytraRenderHitboxRaytraces = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> elytraRenderSimulation = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Boolean> elytraAutoJump = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Long> elytraNetherSeed = new Settings$Setting<Long>(this, 146008555100680L);
    public final Settings$Setting<Boolean> elytraPredictTerrain = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> elytraAutoSwap = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Integer> elytraMinimumDurability = new Settings$Setting<Integer>(this, 5);
    public final Settings$Setting<Integer> elytraMinFireworksBeforeLanding = new Settings$Setting<Integer>(this, 5);
    public final Settings$Setting<Boolean> elytraAllowEmergencyLand = new Settings$Setting<Boolean>(this, true);
    public final Settings$Setting<Long> elytraTimeBetweenCacheCullSecs = new Settings$Setting<Long>(this, TimeUnit.MINUTES.toSeconds(3L));
    public final Settings$Setting<Integer> elytraCacheCullDistance = new Settings$Setting<Integer>(this, 5000);
    public final Settings$Setting<Boolean> elytraAllowLandOnNetherFortress = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> elytraTermsAccepted = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> elytraChatSpam = new Settings$Setting<Boolean>(this, false);
    public final Settings$Setting<Boolean> allowWalkOnMagmaBlocks = new Settings$Setting<Boolean>(this, false);
    public final Map<String, Settings$Setting<?>> byLowerName;
    public final List<Settings$Setting<?>> allSettings;
    public final Map<Settings$Setting<?>, Type> settingTypes;

    Settings() {
        Field[] fieldArray = this.getClass().getFields();
        HashMap<String, Settings$Setting> hashMap = new HashMap<String, Settings$Setting>();
        ArrayList<Settings$Setting> arrayList = new ArrayList<Settings$Setting>();
        HashMap<Settings$Setting, Type> hashMap2 = new HashMap<Settings$Setting, Type>();
        try {
            for (Field field : fieldArray) {
                String string;
                if (!field.getType().equals(Settings$Setting.class)) continue;
                Settings$Setting settings$Setting = (Settings$Setting)field.get(this);
                settings$Setting.name = string = field.getName();
                settings$Setting.javaOnly = field.isAnnotationPresent(Settings$JavaOnly.class);
                if (hashMap.containsKey(string = string.toLowerCase())) {
                    throw new IllegalStateException("Duplicate setting name");
                }
                hashMap.put(string, settings$Setting);
                arrayList.add(settings$Setting);
                hashMap2.put(settings$Setting, ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0]);
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalStateException(illegalAccessException);
        }
        this.byLowerName = Collections.unmodifiableMap(hashMap);
        this.allSettings = Collections.unmodifiableList(arrayList);
        this.settingTypes = Collections.unmodifiableMap(hashMap2);
    }

    public <T> List<Settings$Setting<T>> getAllValuesByType(Class<T> clazz) {
        ArrayList<Settings$Setting<T>> arrayList = new ArrayList<Settings$Setting<T>>();
        for (Settings$Setting<?> settings$Setting : this.allSettings) {
            if (!settings$Setting.getValueClass().equals(clazz)) continue;
            arrayList.add(settings$Setting);
        }
        return arrayList;
    }
}

