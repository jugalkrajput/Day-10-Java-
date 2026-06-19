📘 Day 10 – Map Interface
==========================

1. Map Interface
   -----------------

- Key-Value pair storage

- Key must be unique, Value can be duplicate

- Does NOT extend Collection interface

2. HashMap
   -----------

- Fastest (O(1) average)

- Unordered

- Allows 1 null key, multiple null values

Example
--------

Map<Integer, String> map = new HashMap<>();

map.put(101, "Rahul");

map.put(102, "Priya");


3. LinkedHashMap
   -----------------

- Maintains insertion order

- Slightly slower than HashMap

4. TreeMap
   -----------

- Sorted by key (natural order)

- O(log n) operations

- Does NOT allow null key

5. Practice Task – Word Frequency Counter
   ------------------------------------------

example
--------
String sentence = "java is fun and java is powerful";

String[] words = sentence.toLowerCase().split(" ");

Map<String, Integer> freq = new HashMap<>();

for (String word : words) {

    freq.put(word, freq.getOrDefault(word, 0) + 1);

}

System.out.println(freq);  // {java=2, is=2, fun=1, and=1, powerful=1}

6. HashMap vs TreeMap vs LinkedHashMap
   =======================================

Feature		|	HashMap	|	LinkedHashMap		|	TreeMap
----------------|---------------|-------------------------------|------------------------
Order		|	❌ No	|	✅ Insertion order	|	✅ Sorted by key
Null key	|	✅ Yes	|	✅ Yes			|	❌ No
Performance	|	O(1)	|	O(1)			|	O(log n)
