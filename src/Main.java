import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Ensemble de données ordonées qui permet des doublons
        List<String> noms = new ArrayList<>();
        noms.add("William");
        noms.add("Jacques");
        boolean containsWilliam = noms.contains("William");
        System.out.println(noms.get(0));
        noms.set(0, "Jules");
        // Jete une erreur
//        System.out.println(noms.get(5));
//        noms.set(5, "zer");
        System.out.println(noms);

        // Collection d'élément non ordonné sans doublon
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);

        // Map (système de clé valeur)
        Map<String, String> keyValues = new HashMap<>();
        keyValues.put("William", "Bonjour William !");
        keyValues.put("William", "Bonjour William !");
        System.out.println(keyValues.get("William"));
        for (Map.Entry<String, String> elem : keyValues.entrySet()) {
            System.out.println(elem.getKey());
            System.out.println(elem.getValue());
        }

        // Stack
        Stack<String> myStack = new Stack<>();
        myStack.add("5");
        myStack.add("6");
        myStack.add("7");
        myStack.pop();
        System.out.println(myStack);

        // Queue
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("5");
        myQueue.add("6");
        myQueue.add("7");
        myQueue.poll();
        System.out.println(myQueue);

    }
}