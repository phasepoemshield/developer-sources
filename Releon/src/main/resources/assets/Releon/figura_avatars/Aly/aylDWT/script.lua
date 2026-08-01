-- Import libraries
membrane = require("scripts.membrane")
EZAnims = require("scripts.EZAnims")
squAPI = require("scripts.SquAPI")
aylElytra = require("scripts.aylElytra")
-- Add our model to EZAnims
aylDWTModel = EZAnims:addBBModel(animations.model)
-- Hide vanilla models
vanilla_model.PLAYER:setVisible(false)
vanilla_model.CAPE:setVisible(false)

-- Increase GSAnimBlend blend times (I despise the default blend times)
-- the ezanims one only sets ezanims blend times
modelAnimations = animations:getAnimations()
for i, v in ipairs(modelAnimations) do
    modelAnimations[i]:setBlendTime(7)
end

-- Various functions
function showWings(value)
    models.model.root.Body.rightWing:setVisible(value)
    models.model.root.Body.leftWing:setVisible(value)
    models.model.membranes:setVisible(value)
    if value then
        if settings["hover"].value then
            aylDWTModel:setState("hover")
        else
            aylDWTModel:setState()
        end
    else
        aylDWTModel:setState("nowings")
    end
    vanilla_model.ELYTRA:setVisible(not value)
end
function setElytraOnly()
    if player:getItem(5).id == "minecraft:elytra" then
        showWings(true)
        if settings["showCover"].value then
            models.model.root.Body.cover:setVisible(true)
        end
    else
        showWings(false)
        models.model.root.Body.cover:setVisible(false)
    end
end

-- Misc tick events
function events.tick()
    -- Stop flap SFX if the toggle is on
	if not settings["flapSFX"].value then
        sounds:stopSound("entity.ender_dragon.flap")
	end
    -- Hide wings when not wearing elytra if the toggle is on
    if settings["elytraOnly"].value then
        setElytraOnly()
    end
end

-- Setup SQApi
mainTail = squAPI.tail:new({
	models.model.root.Body.tail,
    models.model.root.Body.tail.segment2,
    models.model.root.Body.tail.segment2.segment3,
    models.model.root.Body.tail.segment2.segment3.segment4,
    models.model.root.Body.tail.segment2.segment3.segment4.segment5,
    models.model.root.Body.tail.segment2.segment3.segment4.segment5.segment6
},
    nil,    --(15) idleXMovement
    nil,    --(5) idleYMovement
    nil,    --(1.2) idleXSpeed
    nil,    --(2) idleYSpeed
    1.5,    --(2) bendStrength
    0.5,    --(0) velocityPush
    nil,    --(0) initialMovementOffset
    nil,    --(1) offsetBetweenSegments
    nil,    --(.005) stiffness
    nil,    --(.9) bounce
    nil,    --(90) flyingOffset
    nil,    --(-90) downLimit
    nil     --(45) upLimit
)

 -- Setup membranes
membrane:define(models.model.membranes.rightMembrane.rightMembrane1, {
    models.model.root.Body.rightMBodyDown,
    models.model.root.Body.rightWing.rightMBodyUp,
    models.model.root.Body.rightWing.rightMWing,
    models.model.root.Body.rightWing.rightMWing,
})
membrane:define(models.model.membranes.rightMembrane.rightMembrane2, {
    models.model.root.Body.rightWing.rightMWing,
    models.model.root.Body.rightWing.rightMBodyUp,
    models.model.root.Body.rightWing.rightBackArm.rightMBack,
    models.model.root.Body.rightWing.rightMWing,
})
membrane:define(models.model.membranes.rightMembrane.rightMembrane3, {
    models.model.root.Body.rightWing.rightMBodyUp,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMFront,
    models.model.root.Body.rightWing.rightBackArm.rightMBack,
    models.model.root.Body.rightWing.rightMBodyUp
})
membrane:define(models.model.membranes.rightMembrane.rightMembrane4, {
    models.model.root.Body.rightWing.rightMWing,
    models.model.root.Body.rightWing.rightBackArm.rightMBack,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib3.rightMRib3,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib3.rightFinger3.rightMFinger3
})
membrane:define(models.model.membranes.rightMembrane.rightMembrane5, {
    models.model.root.Body.rightWing.rightBackArm.rightMBack,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMFront,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib3.rightMRib3,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib3.rightMRib3
})
membrane:define(models.model.membranes.rightMembrane.rightMembrane6, {
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib3.rightFinger3.rightMFinger3,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib3.rightMRib3,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib2.rightMRib2,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib2.rightFinger2.rightMFinger2,
})
membrane:define(models.model.membranes.rightMembrane.rightMembrane7, {
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib3.rightMRib3,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMFront,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightMMetacarpus,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib2.rightMRib2,
})
membrane:define(models.model.membranes.rightMembrane.rightMembrane8, {
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib2.rightFinger2.rightMFinger2,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib2.rightMRib2,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib1.rightMRib1,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib1.rightFinger1.rightMFinger1,
})
membrane:define(models.model.membranes.rightMembrane.rightMembrane9, {
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib2.rightMRib2,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightMMetacarpus,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightMMetacarpus,
    models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib1.rightMRib1,
})

membrane:define(models.model.membranes.leftMembrane.leftMembrane1, {
    models.model.root.Body.leftMBodyDown,
    models.model.root.Body.leftWing.leftMBodyUp,
    models.model.root.Body.leftWing.leftMWing,
    models.model.root.Body.leftWing.leftMWing,
})
membrane:define(models.model.membranes.leftMembrane.leftMembrane2, {
    models.model.root.Body.leftWing.leftMWing,
    models.model.root.Body.leftWing.leftMBodyUp,
    models.model.root.Body.leftWing.leftBackArm.leftMBack,
    models.model.root.Body.leftWing.leftMWing,
})
membrane:define(models.model.membranes.leftMembrane.leftMembrane3, {
    models.model.root.Body.leftWing.leftMBodyUp,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMFront,
    models.model.root.Body.leftWing.leftBackArm.leftMBack,
    models.model.root.Body.leftWing.leftMBodyUp
})
membrane:define(models.model.membranes.leftMembrane.leftMembrane4, {
    models.model.root.Body.leftWing.leftMWing,
    models.model.root.Body.leftWing.leftBackArm.leftMBack,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib3.leftMRib3,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib3.leftFinger3.leftMFinger3
})
membrane:define(models.model.membranes.leftMembrane.leftMembrane5, {
    models.model.root.Body.leftWing.leftBackArm.leftMBack,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMFront,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib3.leftMRib3,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib3.leftMRib3
})
membrane:define(models.model.membranes.leftMembrane.leftMembrane6, {
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib3.leftFinger3.leftMFinger3,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib3.leftMRib3,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib2.leftMRib2,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib2.leftFinger2.leftMFinger2,
})
membrane:define(models.model.membranes.leftMembrane.leftMembrane7, {
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib3.leftMRib3,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMFront,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftMMetacarpus,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib2.leftMRib2,
})
membrane:define(models.model.membranes.leftMembrane.leftMembrane8, {
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib2.leftFinger2.leftMFinger2,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib2.leftMRib2,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib1.leftMRib1,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib1.leftFinger1.leftMFinger1,
})
membrane:define(models.model.membranes.leftMembrane.leftMembrane9, {
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib2.leftMRib2,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftMMetacarpus,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftMMetacarpus,
    models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib1.leftMRib1,
})