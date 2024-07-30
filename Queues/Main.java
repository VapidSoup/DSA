package Queues;

public class Main {
    public static void main(String[] args) {
        AnimalQueue animalShelter = new AnimalQueue();

        animalShelter.enqueue(new Dog("Bulldog"));
        animalShelter.enqueue(new Dog("Poodle"));
        animalShelter.enqueue(new Cat("Siamese"));
        animalShelter.enqueue(new Dog("Golden Retriever"));

        System.out.println(animalShelter.dequeueAny().name); // Bulldog
        System.out.println(animalShelter.dequeueAny().name); // Poodle
        System.out.println(animalShelter.dequeueAny().name); // Siamese
        System.out.println(animalShelter.dequeueAny().name); // Golden Retriever
    }

}
