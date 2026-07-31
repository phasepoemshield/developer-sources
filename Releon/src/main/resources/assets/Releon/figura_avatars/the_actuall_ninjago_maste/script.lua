-- Auto generated script file --
--credits:
--kcin2001




-----------------------------------------------
--hide vanilla model
vanilla_model.PLAYER:setVisible(false)

--hide vanilla armor model
vanilla_model.ARMOR:setVisible(false)
--re-enable the helmet item
vanilla_model.HELMET_ITEM:setVisible(true)
-----------------------------------------------
--calling the other scripts for use:  








require("EZSounds")
-----------------------------------------------



-----------------------------------------------
-- this stuff is what makes it so your eyes and cursor line up
renderer:offsetCameraPivot(0,-0.7,0)
renderer:setEyeOffset(0,-0.7,0)
-----------------------------------------------
-----------------------------------------------
--this is what replaces the sounds try not to touch

sounds:replaceSound("hurt","lego-breaking",0.5)
sounds:replaceSound("death","lego-yoda-death-sound-effect",0.5)
-----------------------------------------------
-----------------------------------------------
--this calls the action wheel so yeah thats a thing

local mainPage = action_wheel:newPage()
local secondPage = action_wheel:newPage()
action_wheel:setPage(mainPage)
-----------------------------------------------

--__________                   .___                        
--\______   \ ____ _____     __| _/          _____   ____  
-- |       _// __ \\__  \   / __ |  ______  /     \_/ __ \ 
-- |    |   \  ___/ / __ \_/ /_/ | /_____/ |  Y Y  \  ___/ 
-- |____|_  /\___  >____  /\____ |         |__|_|  /\___  >
--        \/     \/     \/      \/               \/     \/ 
--
--below is what controls the models head movement and body movement. 
--if you wish to increase or decrease the rotation intensity, change the multiplier values 
--at default the rotation intensity is set to 1x for the torso and 2x for the head.
local headintensity = 0.3
local torsointensity = 1
----------------------------------------------- DO NOT TOUCH BELOW THIS LINE UNLESS YOU KNOW WHAT YOU ARE DOING -----------------------------------------------
function events.render()
 head = vanilla_model.HEAD:getOriginRot()
 models.legoman.root.torso1.mainhead:setRot(head._y_ * headintensity)
 models.legoman.root.torso1:setRot(head.x_z* torsointensity)

end
----------------------------------------------- This is what changes the crouch anim
function events.render()
    local crouching = player:getPose() == "CROUCHING"
    -- This detects if you are crouching and stores it into crouch.
    -- So: crouch == true when crouching, and crouch == false when you're not crouching
    animations.legoman.crouch:setPlaying(crouching)
end
----------------------------------------------- DO NOT TOUCH ABOVE THIS LINE UNLESS YOU KNOW WHAT YOU ARE DOING -----------------------------------------------













--__________                   .___                        
--\______   \ ____ _____     __| _/          _____   ____  
-- |       _// __ \\__  \   / __ |  ______  /     \_/ __ \ 
-- |    |   \  ___/ / __ \_/ /_/ | /_____/ |  Y Y  \  ___/ 
-- |____|_  /\___  >____  /\____ |         |__|_|  /\___  >
--        \/     \/     \/      \/               \/     \/ 
--
--from here onwards is the anim point this area will contain all anims for this model
--if you wish to edit any of these anims i will try to make it easy and accessable so GL
--I will have notes about each anim and what they do before each one
------------------------------------------------- DO NOT TOUCH BELOW THIS LINE UNLESS YOU KNOW WHAT YOU ARE DOING -----------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
--
--These first 2 anims are just to swap back a forth between the second page and main page I SERIOUSLY DONT RECOMMEND TOUCHING THEM
--
--You can probably tell but these anims are quite similar to the figura docs... Yeah I just took them from there so all cred goes to the figura team for that one
--
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
local toSecond = mainPage:newAction()
    :title("Change To Second Page")
    :item("item_frame")
    :onLeftClick(function()
    -- this is a new action on mainPage. its purpose will be to swap to secondPage
    -- this doesn't need to be pinged
    log("Swapped to the second page")
    action_wheel:setPage(secondPage)
end)

local toMain = secondPage:newAction()
    :title("Change To Main Page")
    :item("glow_item_frame")
    :onLeftClick(function()
    -- this is a new action on secondPage. its purpose will be to swap to mainPage
    log("Swapped to the main page")
    action_wheel:setPage(mainPage)
    end)
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
--
--Ok next is the name sawp :) I actually designed this one myself so you can easily change your name on the fly without actually having to go into the script for it 
--
--It is pretty simple and you can actually add more names to it infinitly but that explanation is for another script 
--
--so for ease of use all you need is to change the strings below to what ever names you want and touch nothing else cause that could break it :)
--
-- there is also the color factor where i have it set that if you input a hex color code for one of the vars stirngs that are named corrispondingly with C and a number it will change the corresponding name with the same number to that color.
--
--yet there is one rule to follow when inputing the hex codes and that would be NO POUNDSIGNS/HASHTAGS these : "#"
--
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
local n1 = "Ninjago master"
local n2 = "THE MASTER"
local n3 = "HIM"


-----------------------------------------------------------------------------------------------------------------------------------------------------------------
--the name vars are above and the color vars are below
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
local c1 = "6495ED"
local c2 = "800020"
local c3 = "F59D2A"
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
--below is the actual anim 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
local namechange = secondPage:newAction()
namechange:title("name toggle")
namechange:item("minecraft:name_tag")
namechange:hoverColor(1,0,1)

local current_name = 0

function pings.namechange(id)
  -- Check which number this ping was given.
  if id == 1 then
  local color = c1
 nameplate.ALL:setText('{"text":"'..n1..'","color":"#' .. color  .. '"}')
    -- enable hat 1, disable all others.

    log('{Current Name is set to: '..n1..' }')
  elseif id == 2 then

      local color = c2
nameplate.ALL:setText('{"text":"'..n2..'","color":"#' .. color  .. '"}')
    -- enable hat 2, disable all others.

    log('{Current Name is set to: '..n2..' }')
  elseif id == 3 then

  local color = c3
  
  nameplate.ALL:setText('{"text":"'..n3..'","color":"#' .. color  .. '"}')

  log('{Current Name is set to: '..n3..' }')
  end
end

namechange:onLeftClick(function()
  -- Make the variable cycle between 1 and 3.
  current_name = current_name % 3 + 1

  -- Give the ping our new number.
  pings.namechange(current_name)

end)
  namechange:onToggle(pings.namechangeClicked)
  

 
  
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
--
--
--
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
--
--  
--
--
--
--
--
--
--

-----------------------------------------------------------------------------------------------------------------------------------------------------------------
--item replacement for the staff
--
--
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
--

function events.item_render(item, pos)
  if item.id == "minecraft:stick" then
      return models.legoman.ItemSword
  end
end
--  
--
--
--
--
--
--
--
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
--long before time had a name meme
--
--
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
--

function pings.green(state)
	sounds:playSound("ninjago", player:getPos(),5,1,false)
	
end


local action = mainPage:newAction()
    :title("Long before time had a name")
    :item("minecraft:green_dye")
    :hoverColor(1, 0, 1)
    :onLeftClick(pings.green)
