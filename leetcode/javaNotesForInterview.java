
import java.util.ArrayList;

public class JavaNotesForInterview {

  public static void main(String[] args) {

      ////////////////////////////////////////////////////////////
      // Java gotcha
      int i=0,j=2; // Can define and assign 2 variables on the same line.
      int i,j;
      i = j = 2; // However, if you write it as 
      // "i = 2, j = 2;" it is NOT correct.
      
      // however, it works in the loop
      for(int i=0, j=0; i<5 && j<5; i++, j++){
          System.out.println(j + " " + j);
      }      
      
      // for the following line, it will complain about "error: bad operand types for binary operator '-'"
      int a = foo*(i - 1 - stk.isEmpty()?(-1):stk.peek());
      // need to change it to below line to avoid the compilation error 
      int a = foo*(i - 1 - (stk.isEmpty()?(-1):stk.peek()));

      
      ////////////////////////////////////////////////////////////
      // byte has Byte
	    // short has Short
	    // int has Integer
	    // long has Long
	    // boolean has Boolean
	    // char has Character
	    // float has Float
	    // double has Double      
      
      ////////////////////////////////////////////////////////////
      // Math
      int max = Math.max(5,7); // 2 inputs, supports int, long, float, double
      // Math.abs(-1), 
      // log(double ), // natural logarithm (base e)
      // log10(double ), 
      // max(a, b), min(a, b)
      // double Math.ceil(double d)
      // double Math.floor(double d)
      // double Math.pow(double a, double b)
      // double Math.random() return a double value d, 0<=d<1;
      // double sqrt(double d) 
      // long Math.round(double a) // Math.round(4.9) is 5; (int)4.9 is 4
      // int Math.round( float a)
                      
      ////////////////////////////////////////////////////////////
      // int / Integer
      int foo = 0; // an int variable has to be initialized
      int i = 5/2; // i is 2
      int j = 5%2; // j is 1; remainder
      
      // Note: Java has no nullable int, just could use Integer instead    

      int i = 0xcafe ; // hexadecimal case
      int j = 077 ;    // octal case
      int l = 42 ;     // decimal case
      int b = 0b01000001 // (for a better readness byte b = 0b0100_0001)

      int max = Integer.MAX_VALUE; // Long.MAX_VALUE
      int min = Integer.MIN_VALUE; // Long.MIN_VALUE
      
      // int to Integer
      Integer one = new Integer(1);


      ////////////////////////////////////////////////////////////
      // Java bitwise operators
      1&1, 1|0;
      2^1 == 3; //is XOR (!!!!it's not PowerOf operator!!!)

      ////////////////////////////////////////////////////////////
      // char / Character
      // in Java, Character is unsigned which is special
      // minumum value is 0 and maximum is 65535.
      char c = 's';
      char d = 43; // same as d = '+', 43 is the Ascii no. of '+'
      Character c = 's';
      
      // Character static methods
      Character.isLetterOrDigit(c);
      Character.isLetter(c); // isDigit(), isUpperCase();
      Character.toUpperCase(c); // String can also do toUpperCase() etc.
      Character.toLowerCase(c);
      

      ////////////////////////////////////////////////////////////
      // String
      // Java String doesn't have null check like C#'s .isNullOrEmpty(), you have to specifically check null, e.g. if(str==null || str.isEmpty()) 
      
      
      String s = "abc"; // must use S... upper case to denote a String class object
      String s1 = new String(charArray) // here charArray is a char[]
      
      s.length();
      s.isEmpty(); // false

      // determine if it's empty string
      if(s==null || s.isEmpty()){}

      s.charAt(0); // 'a'
      s.substring(0, 1); // "a"; start index inclusive, ending is exclusive
      s.substring(1); // "bc" substring from 1 to the end
      s = s.trim(); // remove leading and trailing spaces
        // can use s.trim().length()==0 to check if it's blank
      
      s.equals("bc");
      s.compareTo("bc"); // compare string order

      s.indexOf("a"); // search a substring's index. return -1 if not found
      s.indexOf("a", 1); // starting from the specified index
      s.lastIndexOf("a"); // last index of a substring
      
      s.contains("bc") // true. whether contains a subtring. // method contains(CharSequence str); CharSequence is an interface implemented by String/StringBuilder
      s.contains("Bc") // false. case sensitive
      
      s.startsWith("a"); // if start with a substring
      s.endsWith("c"); // if end with a substring
      
      s = "/ab/.//dc/";
      String[] sa = s.split("/"); // the result is ["ab", ".", "", "dc"]
      
      s = s.toLowerCase(); // change string to lower case
      s = s.toUpperCase(); // change string to upper case
      
      String rev = new StringBuilder(s).reverse().toString(); // how to reverse a string
      
      char[] c = s.toCharArray();
      String s2 = new String(c); // how to convert char array to string
      s = ""; // java uses "" to represent empty string
      
      // check if a string is null or empty
      if(str != null && !str.isEmpty()){};
      
      // string + char is still a string
      s = "abc" + '9';
      // string + int (or double) is still a string
      s = "abc" + 5;

      // int <---> String
      Integer.valueOf("5"); // returns an Integer object from a string
      Integer.parseInt("5"); // returns an int primitive from a string
      // convert int to String      
      String.valueOf(5); // integer to string
      Integer.toString(5);
      
      String joined = String.join("/", "2014", "10", "28" ); // "2014/10/28"
      List<String> list = Arrays.asList("foo", "bar", "baz");
      joined = String.join(";", list); // "foo;bar;baz"

      // String static methods: join, valueOf, format, copyValueOf
      
      /////////////////////////////////////////////////////////////
      // StringBuilder
      StringBuilder sb = new StringBuilder();
      sb.append("a"); sb.append('c'); sb.append(5);
      sb.insert(0, "a"); // insert substring at index
      sb.delete(0, 5); // delete substring from 0 to 4. endIndex is exclusive
      sb.deleteCharAt(sb.length()-1); // delete char
      sb.setLength(sb.length()-1) // setLength() can be used to delete the last chars too. It simply alters the count and overwrites the unwanted value in the array with a zero byte.
      sb.reverse(); // reverse string
      sb.toString();
      sb.length();


      ////////////////////////////////////////////////////////////
      // Array
      int[] arr = new int[10]; // by default, all int item would be 0 after creation
      boolean[] bool = new boolean[2]; // by default, elements are false
      char[] b = { 'a', 'b' }; // this is how to initialize array 
      char[] b = new char[] { 'a', 'b' }; // !!!! cannot have size in [] here. e.g. new char[] foo = new char[2] { 'a', 'b' } will throw syntax errors
      
      int[][] c2 = new int[10][10];      
      int m = c2.length; // 2d array's row size
      int n = c2[0].length; // 2d array's column size
      
      // iterate through array with for loop
      for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
      }
      // enhanced for loop
      for (int x: arr) {
          System.out.println(x);
      }

      Arrays.sort(arr); //java.util.Arrays. sort an array, default ascending order
      //Arrays.sort(arr, (a,b)->b-a) would only work for Integer[] arrays. Cannot make primitive type e.g. in[] arrays descendingly sorted

      Arrays.fill(arr, 1); // you can use Arrays.fill to set elements to different values
      Arrays.fill(int[] a, int fromIndex, int toIndex, int val); // toIndex is exclusive
      Arrays.equals(arr, arr2); // compare 2 arrays
      
      // copy array
      int[] a = new int[]{1,2,3,4,5};
      int[] b = a.clone(); // copy an array

      // startIndex is the initial index of the range to be copied, inclusive.
      // endIndex is the final index of the range to be copied, exclusive. (This index may lie outside the array)
      int[] newArray = Arrays.copyOfRange(oldArray, startIndex, endIndex); 


      ////////////////////////////////////////////////////////////
      // Generics - List Interface
      List<Integer> list = new ArrayList<Integer>(); // sadly, !!!!cannot assign initialization data like array creation!!!!. Or simply
      List<Integer> list = new ArrayList<>();
      List<List<Integer>> list2 = new ArrayList<List<Integer>>(); // create list of list， or simply
      List<List<Integer>> list2 = new ArrayList<>();
      
      list.add(5); // add(E e), append an element
      list.add(0, 1); // add(int index, E element), insert 1 at index 0
      list.addAll(anotherCollection); // addAll(Collection<? extends E> c)
      list.get(0); // return element at index 0
      list.set(0, 5); // change element at index 0 to 5
      list.remove(5); // remove(int index); new method in List interface, not in Collection interface
      list.remove(new Integer(5)) // remove(Object o)
      list.indexOf(0); // find index of an item, return -1 if not found
      if(list.contains(5)){} // if list contains an item
      list.clear(); // remove all elements from the list

      list.isEmpty();
      list.size();
      list.remove(list.size()-1); // remove the last element
      
      // simply list.sort() will NOT work. Has to use Comparator
      list.sort( (p1,p2)->p1-p2 ); // ascending. Simply list.sort() will NOT work, it has to have the Comparator argument
      list.sort( (p1,p2)->p2-p1 ); // descending     
      
      Collections.sort(list);
      Collections.sort(list, Collections.reverseOrder());
      Collections.sort(list, (p1, p2)-> p1-p2); // ascending
      Collections.sort(list, (p1, p2)-> p2-p1); // descending
      Collections.sort(list, (p1, p2)-> { return p2-p1; }); // descending, could be more complicated expressions
      
      // old, before Java 8
      Collections.sort(list, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
          return o1�-�o2;// 0->1 ascending order
          // return o2-o1; 1->0 descending order
        }
      });
      
      // loop through a List
      for(int n: list){      }
      
      // reverse a list
      Collections.reverse(list); // list items will be reversed after the call

      ////////////////////////////////////////////////////////////
      // Generics - Set Interface
      Set<Integer> set = new HashSet<Integer>(); // or just new HashSet<>();
      set.add(0); // add item to set; return false if number 0 already exists in the set, so could use the return value to detect if the num already in the set or not
      set.remove(0); // remove item from set
      if (set.contains(0)) {} // check if the set has a given item
      // set.toArray();  // return Object[]
      set.isEmpty();
      set.size();
      
      // loop through a set
      for (String s : set) {
          System.out.println(s);
      }
      // or use iterator to iterate through a set
      Iterator<String> iter = set.iterator();
      while (iter.hasNext()) {
          System.out.println(iter.next());
      } // or
      for (Iterator<String> iter = set.iterator(); iter.hasNext();){
          System.out.println(iter.next());
      }      
      
      // how to get an element from a set
      for(String aSiteId: siteIdSet) {
        siteId = aSiteId;
        break;
      }
      // or
      for (Iterator<String> it = siteIdSet.iterator(); it.hasNext();) {
        siteId = it.next();
        break;
      }

      ////////////////////////////////////////////////////////////
      // Generics - Map Interface. Not thread-safe
      // HashMap supports null key and null value
      
      // cannot initialize a map with values like C# in Java 8. Have to add them one by one
      Map<Character, Integer> map = new HashMap<Character, Integer>();
      map.get('c'); //returns value for a key, or null if this map contains no mapping for the key.
      map.put('c', 1); // set value for a key
      map.remove('c'); // remove the entry for the given key
      map.getOrDefault('c', 0); // return 0 if key 'c' doesn't exist
      
      if (map.containsKey('c')) {	} // if map has the key
      if (map.containsValue(1)) {	} // if map has the value
      for (Character d : map.keySet()) {} // .keySet() returns Set<k>
      for (Integer i : map.values()) {} // .values() return Collection<V>
      
      map.entrySet() // returns Set<Map.Entry<K,V>>
      for (Map.Entry<String, JButton> entry : listbouton.entrySet())
      {
        String key = entry.getKey(); // get key of entry
        JButton value = entry.getValue(); // get value of entry
        // setValue(value) replace the value
      }
      
      map.isEmpty();
      map.clear(); // removes all mappings
      map.size(); // returns the number of key value pairs, Map.Entry
      
      // linked hashmap, access-order
      LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, .75f, true);
      
      
      ////////////////////////////////////////////////////////////
      // Object -> AbstractCollection<E> -> AbstractList<E> -> Vector<E> -> Stack<E>      
      Stack<Integer> stack = new Stack<Integer>();
      
      // Stack's own methods
      stack.push(0); // public E push(E);
      stack.pop(); // public E pop(); throws EmptyStackException - if this stack is empty.
      stack.peek(); // public E peek; throws EmptyStackException - if this stack is empty.
      stack.empty();
      statck.search(1); // int search(Object element). Returns the 1-based position where an object is on this stack.  the topmost item on the stack is considered to be at distance 1. Return -1 for not found. 
      
      // inherited collection methods
      coll.size();  
      coll.isEmpty(); 

      ////////////////////////////////////////////////////////////
      // Generics - Queue Interface; offer�------> poll, peek
      // public interface Queue<E> extends Collection<E>
      
      Queue<Integer> q = new LinkedList<Integer>();
      // Queue interface methods
      q.offer(0); // boolean. 
      q.poll(); // retrieves and removes the head of this queue; returns null if queue is empty
      q.peek(); // retrieves, but does not remove, the head of this queue; returns null if queue is empty
      // Queue interface methods
      q.add(0); // will throw expections
      q.remove(); // return and remove head of queue, will throw expections
      q.element(); // return head of queue, will throw expections if queue empty
      
      // inherited Collection methods
      q.remove(0); // remove an object, inherited from Collection's remove(Object o). Only List can remove at index
      q.isEmpty(); // from Collection interface
      q.size(); // from Collection interface

      // Queue discourages you from inserting null as poll() returns null for empty. 
      //   LinkedList would still allow you to insert null element
      // But Some queue implementations don't allow insertion of null at all.
      //   e.g. PriorityQueue will throw a NullPointerException for that


      ////////////////////////////////////////////////////////////
      // java.lang.Object->class java.util.AbstractCollection<E> -> AbstractQueue<E> -> PriorityQueue<E>
      // It is a sub class, inherited Queue<E>, Collection<E> interfaces from parent abstract classes
      
      // PriorityQueue - min heap by default
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      // to define max heap
      PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
      // or use PriorityQueue(Collection<? extends E> c)
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

      pg.offer(0); // from interface Queue
      pg.poll(); // return null for empty queue
      pq.peek(); // return null for empty queue
      //--------
      pq.add(0); // from interface Collection
      pq.remove(); // from Queue interface, remove the top. throw exception if queue is empty
      pq.element(); // from Queue interface, return first element
      //--------      
      pq.remove(0); // remove an element. inherited from Collection interface
      pg.clear(); // inherited from Collection interface
      pq.isEmpty();
      pq.size();
      
      while (!pq.isEmpty()) {      }
      
      PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.size(),new Comparator<ListNode>(){
          @Override
          public int compare(ListNode o1,ListNode o2){
              if (o1.val<o2.val)
                  return -1;
              else if (o1.val==o2.val)
                  return 0;
              else 
                  return 1;
          }
      });
      
      
      ////////////////////////////////////////////////////////////

      Random rand = new Random(); 
  
      // Generate random integers in range 0 to 999 
      int rand_int1 = rand.nextInt(1000); 

      ////////////////////////////////////////////////////////////

      // int[] foo; foo.length;
      // String s; s.length();
      // List<int> l; l.size();
      
      // 1<<2-1 is actually 2. 
      // (1<<2)-1 is 3.

      ////////////////////////////////////////////////////////////

      // java for each. works on both List and array[]
      List<String> someList = new ArrayList<String>();
      // add "monkey", "donkey", "skeleton key" to someList
      // NO foreach like in C#, just use the same for
      for (String item : someList) {
          System.out.println(item);
      }      

      // switch statement 
      switch(expression)
      {
         // case statements
         // values must be of same type of expression
         case value1 :
            // Statements
            break; // break is optional
         
         case value2 :
            // Statements
            break; // break is optional
         
         // We can have any number of case statements
         // below is default statement,used when none of the cases is true. 
         // No break is needed in the default case.
         default : 
            // Statements
      } 

      // switch example
      switch (day) 
      {
          case 1:  dayString = "Monday";
                   break;
          case 2:  dayString = "Tuesday";
                   break;
          default: dayString = "Invalid day";
                   break;
      }           
      
  }
}


