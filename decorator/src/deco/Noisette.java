package deco;

import boissons.Boisson;

public class Noisette extends DecorateurIngredient{

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au noisette";
    }
}
