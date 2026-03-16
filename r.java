public class r {
    class Animal{
        void sound(){
            System.out.println("animal makes a sound");

        }
    }
    class dog extends Animal{
        void sound(){
            System.out.println("dog barks");
        }

    }
    class cat extends Animal{
        void sound(){
            System.out.println("cat meows");
        }
    }
    class cow extends Animal{
        void sound(){
            System.out.println("cow moos");
        }
    }
    public static void main(String args[]){
        Animal a = new Animal();
        a.sound();

        dog d = new dog();
        d.sound();

        cat c = new cat();
        c.sound();

        cow co = new cow();
        co.sound();
    }
}
