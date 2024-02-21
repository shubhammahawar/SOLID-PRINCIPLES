
Single Responsibility - 

 A class should only have one responsibility. Furthermore, it should only have one reason to change.
  
  Benefits:

Testing – A class with one responsibility will have far fewer test cases.
Lower coupling – Less functionality in a single class will have fewer dependencies.
Organization – Smaller, well-organized classes are easier to search than monolithic ones.

// Separate class to to check Word in Text 

public class Book {
  String name;
  String author;
  String text;

public boolean isWordInText(String word){
  return text.contains(word);
}
}

// Separate Class to print text 


public class BookPrinter{

void printTextToConsole(String text){
}
}
