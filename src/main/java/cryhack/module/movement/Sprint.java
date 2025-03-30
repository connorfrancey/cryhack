package cryhack.module.movement;

import cryhack.module.Mod;
import org.lwjgl.glfw.GLFW;

public class Sprint extends Mod {

    public Sprint() {
        super("Sprint", "Keeps your sprint", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_V);
    }

    @Override
    public void onTick() {
        mc.player.setSprinting(true);
        super.onTick();
    }
}
