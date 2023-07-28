//Question2 (i)
// A private modifier is one that enables attributes of a class to only be accessed in that class.
//A public modifier enables attributes of a class to be accessed any where in that class.
//A protected modifier is usually used during inheritance and protects attributes of the classes and subclasses.



//(ii)
import java.util.ArrayList;
import java.util.List;
    public class  Restaurant {
        //created private attributes of the Restaurant class for access in that class.
        private List<String> menuItems;
        private List<Double> prices;
        private List<Integer> ratings;


//Initialised the ArrayLists in the constructor
        public Restaurant() {
            menuItems = new ArrayList<>();
            prices = new ArrayList<>();
            ratings = new ArrayList<>();
        }
        //method to add a food item with its rating to the menu.
        public void addItem(String item, double price, int rating) {
            menuItems.add(item);
            prices.add(price);
            ratings.add(rating);
        }
        //method to remove a food item from the menu
        public void removeItem(String item) {
            int index = menuItems.indexOf(item);
            if (index != -1) {
                menuItems.remove(index);
                prices.remove(index);
                ratings.remove(index);
            }
        }
        //calculating the average ratings
        public double calculateAverageRating() {
            if (ratings.isEmpty()) {
                return 0.0;
            }

            int totalRatings = 0;
            for (int rating : ratings) {
                totalRatings += rating;

            }

            return (double) totalRatings / ratings.size();
        }


        public static void main(String[] args) {
            Restaurant restaurant = new Restaurant();

            restaurant.addItem("FrenchFries", 9000.90, 10);
            restaurant.addItem("Burger", 5700.0, 31);
            restaurant.addItem("Salad", 2200.56, 5);
            restaurant.addItem("Sausages",3200.0,12);

            double averageRating = restaurant.calculateAverageRating();
            System.out.println("Average rating of the added foodItems:");
            System.out.println("Average rating: " + averageRating);

            restaurant.removeItem("Burger");

            System.out.println();
            System.out.println("Average rating after removing a foodItem:");
            averageRating = restaurant.calculateAverageRating();
            System.out.println("Average rating: " + averageRating);
        }
    }

