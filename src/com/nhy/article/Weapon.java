package com.nhy.article;

import com.nhy.creature.Creature;

/**
 * @descripton:
 * @author: 刘昊玥
 * @date: Created in 2020/6/4 11:29
 * @version: v1.0
 * @modified By:
 */
public abstract   class Weapon  extends Article{
    private String id;
    private String description;
    private int damagePoints;

   public abstract   void useArticleMethod(Creature targetCreature);



    public Weapon(){
    }

    public Weapon(String id, String description, int damagePoints) {
        this.id = id;
        this.description = description;
        this.damagePoints = damagePoints;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}
