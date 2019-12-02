import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        Person[] persons = {new Person("Colin"), new Person("Ethan"), new Person("Christian")};
        for(int i = 0; i<persons.length;i++){
            System.out.println(persons[i].getName());
        }
        persons = addPerson(persons,new Person("Bobby"));
        for(int i = 0; i<persons.length;i++){
            System.out.println(persons[i].getName());
        }
    }

    public static Person[] addPerson(Person[] arr, Person person){
        Person[] newArr = Arrays.copyOf(arr,arr.length+1);
        newArr[newArr.length-1] = person;
        return newArr;
    }
}

