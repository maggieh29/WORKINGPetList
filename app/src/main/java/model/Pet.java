package model;

public class Pet {
    String name, breed;
    int age;
    public Pet(String nameInput, String breedInput, int ageInput){
        name = nameInput;
        breed = breedInput;
        age = ageInput;

    }
    @Override
    public String toString(){
        //name (breed): age
        String format = name + " (" + breed + "): " + age;
        return format;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
