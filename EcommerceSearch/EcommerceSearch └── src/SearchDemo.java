import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class SearchDemo {

    // LINEAR SEARCH
    public static Product linearSearch(Product[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].productName.equalsIgnoreCase(target)) {
                return arr[i];
            }
        }
        return null;
    }

    // BINARY SEARCH (array must be sorted)
    public static Product binarySearch(Product[] arr, String target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int cmp = arr[mid].productName.compareToIgnoreCase(target);

            if (cmp == 0)
                return arr[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Watch", "Accessories")
        };

        // Linear Search
        Product result1 = linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " +
                (result1 != null ? result1.productName : "Not Found"));

        // Sort array for binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        Product result2 = binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " +
                (result2 != null ? result2.productName : "Not Found"));
    }
}