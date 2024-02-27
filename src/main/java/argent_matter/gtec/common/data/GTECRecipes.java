package argent_matter.gtec.common.data;

import argent_matter.gtec.data.recipe.removal.RemovedRecipes;
import argent_matter.gtec.data.recipe.MonaziteChainRecipes;
import argent_matter.gtec.data.recipe.PlatinumLineRecipes;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;


public class GTECRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {
        PlatinumLineRecipes.init(provider);
        MonaziteChainRecipes.init(provider);
    }

    public static void removedInit(Consumer<ResourceLocation> provider) {
        RemovedRecipes.init(provider);
    }
}
