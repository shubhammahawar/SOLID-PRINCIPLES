
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



Real-life use cases of Single Responsibility Principle


1. Web development: We can have separate classes (with their own single responsibility) for handling user authentication, database access, view rendering, etc.
2. Mobile app development: We can design separate classes with single responsibility for handling user input, displaying data, managing network requests, elc.
3. Game development: We can have separate classes for handling player movement, enemy movement, sound effects, etc.
4. Financial software: We can have separate classes for handling transactions, generating reports, calculating
   taxes, etc.
5. E-commerce websites: We can design separate classes for handling customer orders, product catalog management, payment processing, etc.


