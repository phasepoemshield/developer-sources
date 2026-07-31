local ezitems = require("EZItems")
local confetti = require("confetti")
require("GSAnimBlend")
--hide vanilla model
vanilla_model.PLAYER:setVisible(false)

--hide vanilla armor model
vanilla_model.ARMOR:setVisible(false)

--re-enable the helmet item
vanilla_model.HELMET_ITEM:setVisible(true)

--hide vanilla cape model
vanilla_model.CAPE:setVisible(false)

--hide vanilla elytra model
vanilla_model.ELYTRA:setVisible(false)

--made by adaptor_hebat, these code are mess for me



--models
local modelroot = models.FireSlasher.root
local modelintro = models.FireSlasher.Intro
local CresendoItem = models.FireSlasher.Cresendo_item
local ChainsawItem = models.FireSlasher.Chainsaw_item
local Cresendo = modelroot.Body.Cresendo
local Chainsaw = modelroot.Body.Chainsaw
local itempivot1 = modelroot.RightArm.RightItemPivot
local itempivot2 = modelroot.RightItemPivot2
local itempivot3 = modelroot.Body.RightItemPivot3
local ChainsawAnim = modelroot.RightArm.Chainsaw_Anim
local ChainsawIntro = models.FireSlasher.Chainsaw_intro
local FireEffectsHead = modelroot.Head.Mask_Head.FireEffect:getChildren()
local FireEffectsRightArm = modelroot.RightArm.FireEffect_RightArm:getChildren()
local FireEffectsLeftArm = modelroot.LeftArm.FireEffect_LeftArm:getChildren()
local FireEffectsBody = modelroot.Body.FireEffect_Body:getChildren()
local RagingPace = modelroot.Head.Mask_Head.RagingPace

--animations
local a = animations.FireSlasher
local anim_Idle = a.Idle
local anim_Walk = a.Walk
local anim_Sprint = a.Sprint
local anim_RagingStart = a.RagingStart
local anim_RagingIdle = a.RagingIdle
local anim_RagingWalk = a.RagingWalk
local anim_RagingSprint = a.RagingSprint
local anim_M1 = a.M1
local anim_Behead = a.Behead
local anim_GashingWound = a.GashingWound
local anim_intro = a.Intro
local anim_hideshield = a.hideshield
local anim_RagingPace = a.RagingPace

--animations priority
anim_RagingStart:setPriority(4)
anim_RagingIdle:setPriority(1)
anim_RagingWalk:setPriority(1)
anim_RagingSprint:setPriority(1)
anim_M1:setPriority(2)
anim_Behead:setPriority(3)
anim_GashingWound:setPriority(5)
anim_intro:setPriority(6)
anim_hideshield:setPriority(7)

--GSAnimBlend, tiny version
anim_RagingStart:setBlendTime(2)
anim_RagingIdle:setBlendTime(2)
anim_RagingWalk:setBlendTime(2)
anim_RagingSprint:setBlendTime(2)
anim_M1:setBlendTime(2)
anim_Behead:setBlendTime(2)
anim_GashingWound:setBlendTime(2)
anim_Idle:setBlendTime(2)
anim_Walk:setBlendTime(2)
anim_Sprint:setBlendTime(2)

--boolean
local raging = false
local doingarmswing = false
itempivot2:setVisible(false)
itempivot3:setVisible(false)
ChainsawAnim:setVisible(false)
modelintro:setVisible(false)
local wasintro = false
local hideitem = false
local Beheadm1 = false
local ragingstart = false
local usingShield = false
local didswing = false
local breakingblock = false
local GashingWound = false
local alwaysbehead = false
local alwaysragingpace = false

--variable
local m1stand = 0
local m1walk = 0
local m1sprint = 0
local mode
local newdelay = 0
local beheaddelay = 10
local lastValue = nil
local lastMode = nil

--how many m1's to performs behead
local standm1 = 6
local walkm1 = 4
local sprintm1 = 3

--Timers
local tickCount = 0 --confetti
local tickCount1 = 0  --beheadm1
local tickCount2 = 0 --breakingblock, ever heard of breakingblock ?
local frame = 0 --animated texture

--confetti
confetti.registerMesh("fire", modelroot.FireParticle, 10) -- 10 ticks means it dissapears in 0.5 second, 20 ticks means 1 seconds and so on
local spawnAmount = 3

--action wheel
local mainPage = action_wheel:newPage()
action_wheel:setPage(mainPage)

function pings.dointro()
  wasintro = false
end

local action1 = mainPage:newAction()
    :title("intro")
    :item("minecraft:iron_door")
    :hoverColor(250, 112, 0)
    :onLeftClick(pings.dointro)

function pings.togglealwaysbehead()
  alwaysbehead = not alwaysbehead
  return alwaysbehead
end

local action2= mainPage:newAction()
    :hoverColor(255, 255, 255)
    :title("disabled, AlwaysBehead")
    :toggleTitle("enabled, AlwaysBehead")
    :item("red_wool")
    :toggleItem("green_wool")
    :setOnToggle(pings.togglealwaysbehead)

function pings.dogashingwound()
  GashingWound = true
end

local action3 = mainPage:newAction()
    :title("Gashing Wound")
    :item("minecraft:trident")
    :hoverColor(255, 0, 0)
    :onLeftClick(pings.dogashingwound)

function pings.enableragingpace()
  ragingstart = true
end

local action3 = mainPage:newAction()
    :title("Raging Pace")
    :item("minecraft:redstone")
    :hoverColor(255, 255, 0)
    :onLeftClick(pings.enableragingpace)

function pings.togglealwaysrage()
  alwaysragingpace = not alwaysragingpace
  return alwaysragingpace
end

local action2= mainPage:newAction()
    :hoverColor(255, 0, 255)
    :title("disabled, AlwaysRagingPace")
    :toggleTitle("enabled, AlwaysRagingPace")
    :item("red_wool")
    :toggleItem("green_wool")
    :setOnToggle(pings.togglealwaysrage)

--functions
--for instruction keyframe
function start_intro()
  ChainsawIntro:setVisible(true)
  Chainsaw:setVisible(false)
  modelintro:setVisible(true)
end
function tridentthrow()
  sounds:playSound("minecraft:item.trident.hit",player:getPos())
end
function tridenthitground()
  sounds:playSound("minecraft:item.trident.hit_ground",player:getPos())
end
function irondooropen()
  sounds:playSound("minecraft:block.iron_door.open",player:getPos())
end
function sweep()
    sounds:playSound("minecraft:entity.player.attack.sweep",player:getPos(),0.7)
end
function tridenthit()
  sounds:playSound("minecraft:item.trident.hit",player:getPos())
end
function knockback()
  sounds:playSound("minecraft:entity.player.attack.knockback",player:getPos())
end
function end_intro()
  wasintro = true
  modelintro:setVisible(false)
  Chainsaw:setVisible(true)
end
function start_wound()
  itempivot1:setVisible(true)
  itempivot2:setVisible(false)
  itempivot3:setVisible(false)
  ChainsawAnim:setVisible(false)
  Chainsaw:setVisible(true)
end
function at0_88_wound()
  itempivot1:setVisible(false)
  itempivot2:setVisible(true)
end
function at1_17_wound()
  Chainsaw:setVisible(false)
  ChainsawAnim:setVisible(true)
end
function at2_08_wound()
  itempivot2:setVisible(true)
end
function at2_21_wound()
  Cresendo:setVisible(false)
  itempivot3:setVisible(true)
  itempivot2:setVisible(false)
end
function at3_wound()
  Chainsaw:setVisible(true)
  ChainsawAnim:setVisible(false)
end
function at3_75_wound()
  itempivot3:setVisible(false)
  itempivot1:setVisible(true)
end
function at4_13_wound()
  Cresendo:setVisible(true)
  itempivot3:setVisible(false)
end
function end_wound()
  GashingWound = false
  if not alwaysragingpace then
    raging = false
  end
  itempivot1:setVisible(true)
  itempivot2:setVisible(false)
  itempivot3:setVisible(false)
  ChainsawAnim:setVisible(false)
  Chainsaw:setVisible(true)
end
function ragingpace_Raging()
  sounds:playSound("Rage", player:getPos())
  raging = true
end
function end_Raging()
   ragingstart = false
end
function end_Behead()
  if not alwaysragingpace then
    raging = false
  end
  Beheadm1 = false
end
function start_M1()
  if anim_Walk:isPlaying() or anim_RagingWalk:isPlaying() then
    m1walk = m1walk + 1
  elseif anim_Sprint:isPlaying() or anim_RagingSprint:isPlaying() then          
    m1sprint = m1sprint + 1
  else
    m1stand = m1stand + 1
  end
end
function end_M1()
  if not alwaysragingpace then
    raging = false
  end
  doingarmswing = false
end
events.tick:register(function()
  
  if not anim_GashingWound:isPlaying() then
    itempivot1:setVisible(true)
    itempivot2:setVisible(false)
    itempivot3:setVisible(false)
    ChainsawAnim:setVisible(false)
    Chainsaw:setVisible(true)
  end
  
  if not anim_intro:isPlaying() then
      ChainsawIntro:setVisible(false)
      Chainsaw:setVisible(true)
      modelintro:setVisible(false)
  end

  if raging then
    RagingPace:setVisible(true)
  else
    RagingPace:setVisible(false)
  end

end)
function switchMode(mode)
    --clean the table first before inputting
    ezitems:simpleReplace("_sword", CresendoItem, nil)
    ezitems:simpleReplace("_axe", CresendoItem, nil)
    ezitems:simpleReplace("trident", ChainsawItem, nil)
    if mode == "sword" then ezitems:simpleReplace("_sword", CresendoItem, Cresendo)
    elseif mode == "axe" then ezitems:simpleReplace("_axe", CresendoItem, Cresendo)
    elseif mode == "trident" then ezitems:simpleReplace("trident", ChainsawItem, Chainsaw) end

end -- ezitems only need to be called once and not all times(bad idea)

function events.tick()
  
  --player and animations
  local itemdelay = player:getChargedAttackDelay()
  local off = player:getHeldItem(true) 
  local item = player:getHeldItem(false)
  local id = item.id
  local breaking = player:getSwingTime()
  local swingarm = player:isSwingingArm()
  local crouching = player:getPose() == "CROUCHING"
  local sprinting = player:isSprinting()
  local fishing = player:isFishing()
  local sleeping = player:getPose() == "SLEEPING"
  local swimming = player:getPose() == "SWIMMING"
  local flying = player:getPose() == "FALL_FLYING"
  local walking = player:getVelocity().xz:length() > .01

  anim_Idle:setPlaying(wasintro and not crouching and not sprinting and not walking and not sleeping and not raging)
  anim_Walk:setPlaying(wasintro and not sprinting and walking and not crouching and not sleeping and not raging)
  anim_RagingWalk:setPlaying(wasintro and not sprinting and walking and not crouching and not sleeping and raging)
  anim_Sprint:setPlaying(wasintro and sprinting and not crouching and not sleeping and not raging)
  anim_RagingSprint:setPlaying(wasintro and sprinting and not crouching and not sleeping and raging)
  anim_RagingStart:setPlaying(wasintro and ragingstart)
  anim_RagingIdle:setPlaying(wasintro and not crouching and not sprinting and not walking and not sleeping and raging)
  anim_GashingWound:setPlaying(wasintro and breakingblock or GashingWound)
  anim_intro:setPlaying(not wasintro)
  anim_hideshield:setPlaying(hideitem)
  anim_RagingPace:setPlaying(raging)
  anim_M1:setPlaying(wasintro and doingarmswing and not anim_RagingStart:isPlaying() and not anim_GashingWound:isPlaying())
  anim_Behead:setPlaying(wasintro and Beheadm1 and not anim_GashingWound:isPlaying())
  --attempt to sync to the player current weapon cooldown
  --basicly behead animation have windup of  0.5 sec and have to catch up to max player current item cooldown
  --example: sword have cooldown of about 0.6 sec then the behead plays when the sword is at 0.1 cooldown
  --in results the behead at 0.5 sec will also have swordcooldown ready, EXPECTING you to m1 at that moment
  --if the item cooldown is to low then the behead animation will not play
  newdelay = itemdelay - beheaddelay
  if alwaysbehead and m1walk < (walkm1 - 1) or alwaysbehead and m1sprint < (sprintm1 - 1) or alwaysbehead and m1stand < (standm1 - 1) then
      m1walk = walkm1 - 1
      m1sprint = sprintm1 - 1
      m1stand = standm1 - 1
    end
  if didswing and not anim_GashingWound:isPlaying() and not anim_Behead:isPlaying() then
    tickCount1 = tickCount1 + 1
    if tickCount1 >= newdelay and newdelay > 0 then
      if m1walk >= walkm1 then
        --log("BEHEADWALK")
        Beheadm1 = true
        m1walk = 0
        m1sprint = 0
        m1stand = 0
      elseif m1sprint >= sprintm1 then
        --log("BEHEADSPRINT")
        Beheadm1 = true
        m1walk = 0
        m1sprint = 0
        m1stand = 0
      elseif m1stand >= standm1 then
        --log("BEHEADSTAND")
        Beheadm1 = true
        m1walk = 0
        m1sprint = 0
        m1stand = 0
      end
    end
  end

  local current = breaking

  if lastValue ~= nil and current == lastValue then
    tickCount2 = 0
  else
    tickCount2 = tickCount2 + 1
  end
  lastValue = current
  if tickCount2 > 10 then breakingblock = true else breakingblock = false end  
  if tickCount1 >= itemdelay then tickCount1 = 0 didswing = false end
  if swingarm then doingarmswing = true didswing = true end
  --log(m1walk, m1sprint, m1stand, didswing, tickCount1)
  --log(newdelay)
  --spawn fire particles
  tickCount = tickCount + 1
  -- 1 second = 20 tick, put 2 second for 2x slower and so on
  if tickCount % 0.5 ~= 0 then return end

  local pos = player:getPos()

  for i = 1, spawnAmount do
    confetti.newParticle(
        "fire",
        pos + vec(0, math.random(), 0),
          vec((math.random()-0.5)*0.2,math.random()*0.2,(math.random()-0.5)*0.2),
          {
              scale = 0.5 + math.random() * 0.5,
              rotation = vec(math.random()*360,math.random() * 360,math.random() * 360), -- rotate when spawned
              rotationOverTime = vec(math.random(-10,10),math.random(-10,10),math.random(-10,10)) -- spin in real time
          }
      )
  end

  --animated texture 
  frame = frame + 1
  for _, effect in ipairs(FireEffectsHead) do
    effect:setUV((frame/8)/2,0) -- double the 8 to make it slower or divide it to make it faster
  end

  for _, effect in ipairs(FireEffectsRightArm) do
    effect:setUV((frame/8)/2,0)
  end

  for _, effect in ipairs(FireEffectsLeftArm) do
    effect:setUV((frame/8)/2,0)
  end

  for _, effect in ipairs(FireEffectsBody) do
    effect:setUV((frame/8)/2,0)
  end

  --what are you holding
  if off.id:find("shield") and player:isUsingItem() or item.id:find("shield") and player:isUsingItem() then
    if not usingShield and not raging then
      usingShield = true
      ragingstart = true
    end
  else
    usingShield = false
  end

  local held = player:getHeldItem(true)
    
  if held and held.id and held.id:find("shield") then
    hideitem = true
  else
    hideitem = false
  end

  if id:find("trident") then
     mode = "trident"
  elseif id:find("_axe") then
    mode = "axe"
  else
    mode = "sword"
  end

  if mode ~= lastMode then
    switchMode(mode)
    lastMode = mode
  end
end
