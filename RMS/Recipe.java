package RMS;
import java.util.ArrayList;

public class Recipe{
    private ArrayList<String> ingredients;
    private ArrayList<String> instructions;
    private String name;
    private ArrayList<String> dietary_needs;
    private String time_taken;
    private ArrayList<String> food_allergy;

    public Recipe(String name_of_food) { //initiates every variable set to default, also sets the name of the dish.
        this.name=name_of_food;
        this.dietary_needs = new ArrayList<String>();
        this.food_allergy = new ArrayList<String>();
        this.ingredients = new ArrayList<String>();
        this.instructions = new ArrayList<String>();
        this.time_taken = "0 mins";
    }

    //setting purposes
    public void add_time (String time) { //add time taken
        this.time_taken = time;
    }
    public void add_ingredient (String ingredient) { //add ingredient
        this.ingredients.add(ingredient);
    }

    public void add_instruction (String instruction) { // add instruction
        this.instructions.add(instruction);
    }

    public void set_dietary_needs (String need) { //to set dietary needs
        switch (need) {
            case "veg":
                this.dietary_needs.add("Vegetarian");
                break;
            case "lactose-free":
                this.dietary_needs.add("Lactose-free");
                break;
            case "vegan":
                this.dietary_needs.add("Vegan");
                break;
            case "gluten-free":
                this.dietary_needs.add("Gluten-free");
                break;
            case "dairy-free":
                this.dietary_needs.add("Dairy-free");
                break;
        }
    }

    public void set_allergy (String allergy) { // to set food allergies
        switch (allergy) {
            case "wheat":
                this.food_allergy.add("Contains wheat");
                break;
            case "nuts":
                this.food_allergy.add("Contains nuts");
                break;
            case "fish":
                this.food_allergy.add("Contains fish");
                break;
            case "eggs":
                this.food_allergy.add("Contains eggs");
                break;
            case "soy":
                this.food_allergy.add("Contains soy");
                break;
        }
    }

    //getting purposes
    public String getName() {
        return this.name;
    }
    public String getTime_taken() {
        return this.time_taken;
    }
    public void print_Ingredients() { //this will be modified to fit with gui format but for now this is gonna be written in terminal style
        for (int i=0; i<ingredients.size(); i++) {
            System.out.println(" - " + ingredients.get(i));
        }
    }
    public void print_Instructions() { //this will be modified to fit with gui format but for now this is gonna be written in terminal style
        for (int i=0; i<instructions.size(); i++) {
            System.out.println((i+1) + ") " + instructions.get(i));
        }
    }

}
