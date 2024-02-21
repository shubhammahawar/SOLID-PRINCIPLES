Interface Segregation :

Larger interfaces should be split into smaller ones. 
By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

public interface Creatable{
  void create();
}

public interface Editable {
  void edit();
}

public interface Sharable{
  void share();
}

public class TextDocument implements Creatable, Editable,Sharable{
}

public class SpreadSheetDocument implements Creatable, Sharable{
}
