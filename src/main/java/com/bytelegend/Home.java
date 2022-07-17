package com.bytelegend;

import com.bytelegend.pet.Cat;

public class Home implements Cloneable{
    public Cat cat;

    public Home(Cat cat) {
        this.cat = cat;
    }

    public static void main(String[] args) {
        Home home = new Home(new Cat("Tom"));
        Home deepCopy = deepCopy(home);

        System.out.println(home.cat == deepCopy.cat);
    }

    // Deep copy the instance and return the deep copy of `home`
    public static Home deepCopy(Home home) throws CloneNotSupportedException{
        Home temp = (Home)home.clone();
        return temp;
    }
}
