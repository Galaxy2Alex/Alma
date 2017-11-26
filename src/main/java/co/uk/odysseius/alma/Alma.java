package co.uk.odysseius.alma;

import co.uk.odysseius.alma.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Alma.MODID, name = Alma.MODNAME, version = Alma.VERSION, dependencies = "", useMetadata = true)

public class Alma {
    public static final String MODID = "alma";
    public static final String MODNAME = "A Leveling Mod Attempt";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide = "co.uk.odysseius.alma.proxy.ClientProxy", serverSide = "co.uk.odysseius.alma.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Alma instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("Loading...");

            proxy.preInit(event);

        System.out.println("Loading complete.");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
            System.out.println("Loading...");

            proxy.init(event);

            System.out.println("Loading complete.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Loading...");

        proxy.postInit(event);

        System.out.println("Loading complete.");
    }
}
