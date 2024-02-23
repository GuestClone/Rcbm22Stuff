package com.rclonebm22.rcbm22stuff.potioneffects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;

import java.util.List;
import java.util.stream.Collectors;

public interface IRemoveBadEffects {

    default void removeNegativeEffects(EntityLivingBase entity) {
        List<PotionEffect> effectsToRemove = entity.getActivePotionEffects().stream().filter(effect -> effect.getPotion().isBadEffect()) // Filter only negative effects
                .collect(Collectors.toList()); // Collect them in a list
        // Remove the collected negative effects
        effectsToRemove.forEach(effect -> entity.removePotionEffect(effect.getPotion()));
    }

}
