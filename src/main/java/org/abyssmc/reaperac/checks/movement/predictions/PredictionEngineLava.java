package org.abyssmc.reaperac.checks.movement.predictions;

import org.abyssmc.reaperac.GrimPlayer;
import org.bukkit.util.Vector;

public class PredictionEngineLava extends PredictionEngine {
    @Override
    public void addJumpIfNeeded(GrimPlayer grimPlayer) {
        grimPlayer.clientVelocityJumping = grimPlayer.clientVelocity.clone().add(new Vector(0, 0.04, 0));
        super.addJumpIfNeeded(grimPlayer);
    }
}
