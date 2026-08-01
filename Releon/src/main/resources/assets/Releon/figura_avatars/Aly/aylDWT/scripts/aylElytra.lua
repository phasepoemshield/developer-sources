-- Config
local wingContrailParticle = "minecraft:lava"
local tailContrailParticle = "minecraft:smoke"

local wingSpan = 3
local wing = {
    soar = animations.model.soar,--EXCLUSIVE
    up = animations.model.flap,--EXCLUSIVE
    down = animations.model.dive,--EXCLUSIVE
    right = animations.model.wingRight,--INCLUSIVE
    left = animations.model.wingLeft--INCLUSIVE
}

--Thanks to manuel for this great function!
function distanceToWall(startPos, maxDist)
    local look = player:getLookDir()
    local left = vec(0,1,0):crossed(look):normalized()*maxDist
    local right = vec(0,-1,0):crossed(look):normalized()*maxDist
    local leftHit, leftPos = raycast:block(startPos,startPos+left)
    local leftDist = leftHit and (startPos-leftPos):length()
    local rightHit, rightPos = raycast:block(startPos,startPos+right)
    local rightDist = rightHit and (startPos-rightPos):length()
    return leftDist, rightDist
end
-- Main
local lastRightBlend = 0
local lastLeftBlend = 0
function events.entity_init()
    for i, v in pairs(wing) do
        aylDWTModel:addExcluOverrider(wing[i])
    end
end
function contrails()
    if world.getTime() % settings.contrailDensity.value == 0 then -- every contrailInterval ticks
        if settings.wingContrails.value then
            particles:newParticle(wingContrailParticle, models.model.root.Body.rightWing.rightBackArm.rightFrontArm.rightMetacarpus.rightRib1.rightFinger1:partToWorldMatrix():apply())
            particles:newParticle(wingContrailParticle, models.model.root.Body.leftWing.leftBackArm.leftFrontArm.leftMetacarpus.leftRib1.leftFinger1:partToWorldMatrix():apply())
        end
        if settings.tailContrails.value then
            particles:newParticle(tailContrailParticle, models.model.root.Body.tail.segment2.segment3.segment4.segment5.segment6:partToWorldMatrix():apply())
        end
    end
end
function events.render()
    if player:isGliding() then
        local lookY = player:getLookDir().y
        local velocity = math.abs(player:getVelocity().x) + math.abs(player:getVelocity().y)
        if lookY > -0.1 then
            local upBlend = math.clamp(math.map(lookY, -0.1, 1, 0, 1)*(velocity), 0, 1)
            wing.up:setBlend(upBlend)
            wing.soar:setBlend(1 - upBlend)
        elseif -0.1 > lookY and lookY > -0.5 then
            wing.soar:setBlend(1)
        elseif lookY < -0.5 then
            local downBlend = math.map(lookY, -0.5, -1, 0, 1)
            wing.down:setBlend(downBlend)
            wing.soar:setBlend(1 - downBlend)
        end
        wing.soar:setPlaying(true)
        wing.up:setPlaying(lookY > -0.1)
        wing.down:setPlaying(lookY < -0.5)

        -- Wall detection & anims
        if wing.up:getBlend() > 0.75 or wing.down:getBlend() > 0.5 then
            wing.right:setPlaying(false)
            wing.left:setPlaying(false)
        else
            -- The lastBlend values are for smoothing, don't want them don't need them
            local left, right = distanceToWall(player:getPos():add(0,player:getEyeHeight(),0), wingSpan)
            lastRightBlend = math.lerp(lastRightBlend, math.map(right, wingSpan, 0.3, 0, 0.8), 0.05)--when changing the anims adjust 1 to the desired strength of the anim
            lastLeftBlend  = math.lerp(lastLeftBlend, math.map(left, wingSpan, 0.3, 0, 0.8), 0.05)
            wing.right:setBlend(lastRightBlend)
            wing.left:setBlend(lastLeftBlend)
            wing.right:setPlaying(true)
            wing.left:setPlaying(true)
        end
        --Contrails
        if settings.highVelocity.value and settings.soaringOrDiving.value then
            if velocity > 0.75 and not wing.up:isPlaying() then
                contrails()
            end
        elseif settings.highVelocity.value then
            if velocity > 0.75 then
                contrails()
            end
        elseif settings.soaringOrDiving.value then
            if not wing.up:isPlaying() then
                contrails()
            end
        else
            contrails()
        end
    else
        for i, v in pairs(wing) do
            wing[i]:setPlaying(false)
        end
    end
end