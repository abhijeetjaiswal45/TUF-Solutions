import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;
    Item(int v, int w) {
        this.value = v;
        this.weight = w;
    }
}

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, long capacity) {
        int n = val.length;
        Item[] items = new Item[n];
        

        for (int i = 0; i < n; i++) {
            items[i] = new Item(val[i], wt[i]);
        }
        

        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item a, Item b) {
                double r1 = (double) a.value / (double) a.weight;
                double r2 = (double) b.value / (double) b.weight;
        
                return Double.compare(r2, r1);
            }
        });
        
        double totalValue = 0.0;
        long currentCapacity = capacity;
        
        for (int i = 0; i < n; i++) {
            if (currentCapacity <= 0) {
                break;
            }
            
            if (items[i].weight <= currentCapacity) {
                currentCapacity -= items[i].weight;
                totalValue += items[i].value;
            } else {
                totalValue += ((double) currentCapacity / items[i].weight) * items[i].value;
                break;
            }
        }
        
        return totalValue;
    }
}