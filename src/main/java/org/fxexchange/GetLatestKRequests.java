package org.fxexchange;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class GetLatestKRequests {
    public static List<String> getLatestKRequests(List<String> requests, int k) {
        LinkedHashSet<String> uniqueRequests = new LinkedHashSet<>();
        LinkedList<String> result = new LinkedList<>();

        for (int i = requests.size() - 1; i >= 0 && k > 0; i--) {

            String current = requests.get(i);
            // Only add if it's not already added
            if (!uniqueRequests
                    .contains(current)) {
                uniqueRequests
                        .add(current);
                result.addFirst(current);
                k--;
            }
        }
        Collections.reverse(result);

        return result;
    }
}
