package com.company;

class Cat extends Animal {

    Cat(double animalDistanceRun, double animalDistanceJump, double animalDistanceSwim) {
        super(animalDistanceRun, animalDistanceJump, animalDistanceSwim);
    }

    @Override
    public boolean swim(double value) {
        return false;
    }
}
