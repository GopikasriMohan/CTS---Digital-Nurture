import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    // Binary Search (array must be sorted by productId)
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    // Sort products by productId for binary search
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
    }

    // Sample test
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Shoes", "Footwear"),
            new Product(101, "Laptop", "Electronics"),
            new Product(103, "Chair", "Furniture"),
            new Product(102, "Phone", "Electronics"),
            new Product(104, "Table", "Furniture")
        };

        // Linear Search
        Product result1 = linearSearch(products, 103);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // Sort for Binary Search
        sortProducts(products);

        // Binary Search
        Product result2 = binarySearch(products, 103);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
