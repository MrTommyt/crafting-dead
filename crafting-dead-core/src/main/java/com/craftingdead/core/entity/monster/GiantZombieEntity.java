/**
 * Crafting Dead
 * Copyright (C) 2020  Nexus Node
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.craftingdead.core.entity.monster;

import com.craftingdead.core.item.ModItems;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class GiantZombieEntity extends AdvancedZombieEntity {

  public GiantZombieEntity(EntityType<? extends AdvancedZombieEntity> type, World world) {
    super(type, world);
  }

  @Override
  protected Item getMelee() {
    return ModItems.M4A1.get();
  }

  @Override
  protected Item getClothing() {
    return ModItems.ARMY_CLOTHING.get();
  }

  @Override
  protected Item getHat() {
    return ModItems.ARMY_HELMET.get();
  }

  public static AttributeModifierMap.MutableAttribute registerAttributes() {
    return AdvancedZombieEntity.registerAttributes()
        .createMutableAttribute(Attributes.MAX_HEALTH, 100.0D)
        .createMutableAttribute(Attributes.ATTACK_DAMAGE, 50.0D)
        .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D);
  }

  @Override
  protected float getStandingEyeHeight(Pose pose, EntitySize entitySize) {
    return 10.440001F;
  }
}
