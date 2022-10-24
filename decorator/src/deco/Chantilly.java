package deco;

import boissons.Boisson;

public class Chantilly extends DecorateurIngredient{

    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au chantilly";
    }
}
