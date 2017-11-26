package co.uk.odysseius.alma.helpers;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class KeyBindings {

    public static KeyBinding almaMenuKey;

    public static void initialise() {
        almaMenuKey = new KeyBinding("key.alma", Keyboard.KEY_0, "key.categores.alma");
        ClientRegistry.registerKeyBinding(almaMenuKey);
    }

}
