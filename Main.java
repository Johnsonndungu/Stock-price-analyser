import java.util.ArrayList;

public class Main {

    // calculate the average stock price
    public static float calculateAveragePrice(float[] prices) {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    // Method to find the maximum stock price
    public static float findMaximumPrice(float[] prices) {
        float maxPrice = prices[0];
        for (float price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to determine the occurrence count of a specific price
    public static int countOccurrences(float[] prices, float targetPrice) {
        int count = 0;
        for (float price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute the cumulative sum of stock prices
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> prices) {
        ArrayList<Float> cumulativeSum = new ArrayList<>();
        float sum = 0;
        for (float price : prices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }

    public static void main(String[] args) {
        // usage
        float[] stockPrices = {5948f, 5993f, 5438f, 4567f, 5438f, 5621f, 5438f, 5438f, 5376f, 5876f};
        ArrayList<Float> stockPricesArrayList = new ArrayList<>();
        for (float price : stockPrices) {
            stockPricesArrayList.add(price);
        }

        // Calculate average stock price
        float averagePrice = calculateAveragePrice(stockPrices);
        System.out.println("Average stock price: " + averagePrice);

        // Determine occurrence count of a specific price
        float targetPrice = 5438f;
        int occurrences = countOccurrences(stockPrices, targetPrice);
        System.out.println("Occurrences of " + targetPrice + ": " + occurrences);

        // Find maximum stock price
        float maxPrice = findMaximumPrice(stockPrices);
        System.out.println("Maximum stock price: " + maxPrice);


        // Compute cumulative sum of stock prices
        ArrayList<Float> cumulativeSum = computeCumulativeSum(stockPricesArrayList);
        System.out.println("Cumulative sum of stock prices: " + cumulativeSum);
    }
}
