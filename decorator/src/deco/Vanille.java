package deco;

import boissons.Boisson;

public class Vanille extends DecorateurIngredient{

    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" à la vanille";
    }
}
