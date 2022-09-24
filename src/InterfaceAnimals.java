    interface Animals{
        void sound();
    }
    class Cat implements Animals
    {
        @Override
        public void sound()
        {
            System.out.println("Cat Sounds: Meow");
        }
    }
    class Dog implements Animals
    {
        @Override
        public void sound() {
            System.out.println("Dog Sounds: Bow");
        }
    }
    class Horse implements Animals
    {
        @Override
        public void sound() {
            System.out.println("Horse Sounds: Chez");
        }
    }

public class InterfaceAnimals
    {
        public static void main(String[] args) {

            Animals cat = new Cat();
            Animals dog = new Dog();
            Animals horse = new Horse();


            cat.sound();
            dog.sound();
            horse.sound();
    }
}
