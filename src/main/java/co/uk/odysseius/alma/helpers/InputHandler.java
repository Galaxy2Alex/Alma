package co.uk.odysseius.alma.helpers;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class InputHandler {

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (KeyBindings.almaMenuKey.isPressed()) {
            // PacketHandler.INSTANCE.sendToServer(new PacketSendKey());
        }
    }

}
