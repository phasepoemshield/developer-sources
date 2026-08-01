vanilla_model.ARMOR:setVisible(false)
vanilla_model.PLAYER:setVisible(false)
vanilla_model.RIGHT_ITEM:setVisible(true)
vanilla_model.LEFT_ITEM:setVisible(true)
renderer:setShadowRadius(0.75)

local rig = animations.Peter_Griffin

local function anim(name)
    if rig == nil then
        return nil
    end
    return rig[name]
end

local keypose = anim("keypose")
local crouch = anim("crouch")
local death = anim("death")
local bird = anim("bird")
local lastKeypose = nil
local lastCrouch = nil

local function setPlaying(animation, state)
    if animation ~= nil then
        animation:setPlaying(state)
    end
end

function events.tick()
    local crouching = player:getPose() == "CROUCHING"

    if lastCrouch ~= crouching then
        setPlaying(crouch, crouching)
        lastCrouch = crouching
    end

    local shouldKeypose = not crouching
    if lastKeypose ~= shouldKeypose then
        setPlaying(keypose, shouldKeypose)
        lastKeypose = shouldKeypose
    end
end

function pings.deathClick(state)
    setPlaying(death, state)
end

function pings.birdClick(state)
    setPlaying(bird, state)
end

local mainPage = action_wheel:newPage()
action_wheel:setPage(mainPage)

mainPage:newAction():title("Death Pose"):setOnToggle(pings.deathClick):item("bone")
mainPage:newAction():title("Bird is the Word"):setOnToggle(pings.birdClick):item("feather")
