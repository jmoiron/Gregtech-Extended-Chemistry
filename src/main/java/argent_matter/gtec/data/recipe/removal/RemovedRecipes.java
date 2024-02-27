package argent_matter.gtec.data.recipe.removal;

import net.minecraft.resources.ResourceLocation;
import java.util.function.Consumer;

public class RemovedRecipes {
    public static void init(Consumer<ResourceLocation> registry) {
        platlineRemoval(registry);
    }

    private static void platlineRemoval(Consumer<ResourceLocation> registry) {
        // osmium tetroxide
        //System.out.println("platline removal");
        registry.accept(new ResourceLocation("gtceu:distillery/acidic_osmium_solution_separation_to_hydrochloric_acid"));
        registry.accept(new ResourceLocation("gtceu:distillery/acidic_osmium_solution_separation_to_water"));
    }
}
