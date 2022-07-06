package com.company;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        System.out.println("РЫБА");
        fish.setTypes("Кита");
        System.out.println("Вид рыбы " + fish.getTypes());
        fish.setColor("Серый");
        System.out.println("цвет рыбы " + fish.getColor());
        fish.setWeight(14);
        System.out.println("рыба весит " + fish.getWeight() + " кг");
        fish.setLength(68);
        System.out.println("длина рыбы " + fish.getLength() + " см" + "\n");




        Parrot parrot = new Parrot();
        System.out.println("ПАПУГАЙ");
        parrot.setNameParrot("Кеша");
        System.out.println("этого папугая зовут " + parrot.getNameParrot());
        parrot.setColor("Синий");
        System.out.println("у этого папугая очень красивый цвет: " + parrot.getColor());
        parrot.setGrowth(34);
        System.out.println("рост у него " + parrot.getGrowth() + " см " + "\n");



        Cat cat = new Cat();
        System.out.println("КОТ");
        cat.setNameCat("Борис");
        System.out.println("Кота зовут " + cat.getNameCat());
        cat.setCoior("Белый");
        System.out.println("Цвет у него " + cat.getColor());
        cat.setAge(3);
        System.out.println("Он живет уже " + cat.getAge() + " года");
        cat.setLegs(4);
        System.out.println("у него есть " + cat.getLegs() + " лапы😂😂" + "\n");



        Dog dog = new Dog();
        System.out.println("DOG");
        dog.setBreed("Доберман");
        System.out.println("У меня есть собока ее порода " + dog.getBreed());
        dog.setNameDog("Дарк");
        System.out.println("ее зовут " + dog.getNameDog());
        dog.setColor("черный");
        System.out.println("цвет " + dog.getColor());
        dog.setGrowth(100);
        System.out.println("рост у нее " + dog.getGrowth() + " см");
        dog.setEyeСolor("Темо зеленый");
        System.out.println("у нее " + dog.getEyeСolor() + " красивые глаза");


    }

}