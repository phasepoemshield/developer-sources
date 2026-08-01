
vanilla_model.PLAYER:setVisible(true)
vanilla_model.ARMOR:setVisible(true)
vanilla_model.HELMET_ITEM:setVisible(true)
vanilla_model.CAPE:setVisible(true)
vanilla_model.ELYTRA:setVisible(true)

--=====================================================================================================================--
-- API SETTINGS

local squapi = require("SquAPI")

--==========-- SQUAPI

    -- eyes
    	squapi.ear:new(models.model.root.Head.hat.eyes.lefteye, models.model.root.Head.hat.eyes.righteye, 0.2, horizontalEars, bendStrength, false, earStiffness, earBounce)
    	