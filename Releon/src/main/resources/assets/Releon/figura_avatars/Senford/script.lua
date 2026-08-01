-- Mirror @MagicLab --


vanilla_model.PLAYER:setVisible(false)

--hide vanilla armor model
vanilla_model.ARMOR:setVisible(false)

vanilla_model.CAPE:setVisible(false)

local eyeHeightOffest = -0.5
function events.post_render(delta)
  renderer:setOffsetCameraPivot(0, eyeHeightOffest, 0)
  renderer:setEyeOffset(0, eyeHeightOffest, 0)
end
