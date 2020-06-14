package com.nhy.article;

import com.nhy.article.Weapon;
import com.nhy.creature.Creature;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 11:29
 * @version: v1.0
 * @modified By:
 */
public  class WeaponGlove extends Weapon {
    public WeaponGlove(String id, String description, int damagePoints) {
        super(id, description, damagePoints);
    }

    @Override
    public void useArticleMethod(Creature enemyCreature) {
        enemyCreature.setHPvalue(enemyCreature.getHPvalue()+this.getDamagePoints());
    }
}
