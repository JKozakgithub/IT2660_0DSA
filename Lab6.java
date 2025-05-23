class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    MyHashMap<String, Integer> creditHours = new MyHashMap();

      creditHours.put("IT-1025", 3);
      creditHours.put("IT-1050", 3);
      creditHours.put("IT-1150", 3);
      creditHours.put("IT-2310", 3);
      creditHours.put("IT-2320", 4);
      creditHours.put("IT-2351", 4);
      creditHours.put("IT-2650", 4);
      creditHours.put("IT-2660", 4);
      creditHours.put("IT-2030", 4);


      System.out.println("Does the hashmap contain IT-1025? "+ creditHours.containsKey("IT-1025"));
      System.out.println("Does the hashmap contain IT-2110? "+ creditHours.containsKey("IT-2110"));    

      for(String key : creditHours.keySet()){
        System.out.println("class " + key + "has " + creditHours.get(key) + " credit hours");
      }

        creditHours.remove("IT-1025");
        creditHours.remove("IT-2110");

        System.out.println("new class list: ");
        for(String key : creditHours.keySet()){
          
          System.out.println("class " + key + "has " + creditHours.get(key) + " credit hours");
        }


  }
}
