<p class="has-line-data" data-line-start="0" data-line-end="1">A variable provides us with named storage that our programs can manipulate. Each variable in Java has a specific type, which determines the size and layout of the variable’s memory; the range of values that can be stored within that memory; and the set of operations that can be applied to the variable.</p>
<p class="has-line-data" data-line-start="2" data-line-end="3">You must declare all variables before they can be used. Following is the basic form of a variable declaration −</p>
<ul>
<li class="has-line-data" data-line-start="4" data-line-end="6">data type variable [ = value][, variable [ = value] …] ;</li>
</ul>
<p class="has-line-data" data-line-start="6" data-line-end="7">Here data type is one of Java’s datatypes and variable is the name of the variable. To declare more than one variable of the specified type, you can use a comma-separated list.</p>
<p class="has-line-data" data-line-start="8" data-line-end="9">Following are valid examples of variable declaration and initialization in Java −</p>
<h1 class="code-line" data-line-start=10 data-line-end=11 ><a id="Example_10"></a>Example</h1>
<ul>
<li class="has-line-data" data-line-start="12" data-line-end="13">int a, b, c;         // Declares three ints, a, b, and c.</li>
<li class="has-line-data" data-line-start="13" data-line-end="14">int a = 10, b = 10;  // Example of initialization</li>
<li class="has-line-data" data-line-start="14" data-line-end="15">byte B = 22;         // initializes a byte type variable B.</li>
<li class="has-line-data" data-line-start="15" data-line-end="16">double pi = 3.14159; // declares and assigns a value of PI.</li>
<li class="has-line-data" data-line-start="16" data-line-end="17">char a = ‘a’;        // the char variable a iis initialized with value ‘a’</li>
</ul>

<h2 class="code-line" data-line-start=18 data-line-end=19 ><a id="Types_of_Variables_in_Java_18"></a>Types of Variables in Java</h2>

 <details>
<summary>Local Variable</summary>
<br>
 <ul>
<li class="has-line-data" data-line-start="24" data-line-end="26">
<p class="has-line-data" data-line-start="24" data-line-end="25">A variable defined within a block or method or constructor is called a local variable.</p>
</li>
<li class="has-line-data" data-line-start="26" data-line-end="27">
<p class="has-line-data" data-line-start="26" data-line-end="27">These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.</p>
</li>
<li class="has-line-data" data-line-start="27" data-line-end="28">
<p class="has-line-data" data-line-start="27" data-line-end="28">The scope of these variables exists only within the block in which the variables are declared, i.e., we can access these variables only within that block.</p>
</li>
<li class="has-line-data" data-line-start="28" data-line-end="30">
<p class="has-line-data" data-line-start="28" data-line-end="29">Initialization of the local variable is mandatory before using it in the defined scope.</p>
</li>
</ul>
<br>

### Example
```
public class local {
     
    public void calculate() {
         
        // initialized a local variable "height"
        int height = 0;
         
        // incrementing the value of height
        height = height + 170;
        System.out.println("height is: " + height + " cm");
    }
 
    public static void main(String args[]) {
         
        // a is a reference used to call calculate() method
        local a = new local();
        a.calculate();
    }
}
```
</details>
<br>
 <details>
<summary>Instance Variable</summary>
 <br>
 <ul>
<li class="has-line-data" data-line-start="0" data-line-end="2">
<p class="has-line-data" data-line-start="0" data-line-end="1">Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block.</p>
</li>
<li class="has-line-data" data-line-start="2" data-line-end="3">
<p class="has-line-data" data-line-start="2" data-line-end="3">As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.</p>
</li>
<li class="has-line-data" data-line-start="3" data-line-end="4">
<p class="has-line-data" data-line-start="3" data-line-end="4">Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used.</p>
</li>
<li class="has-line-data" data-line-start="4" data-line-end="6">
<p class="has-line-data" data-line-start="4" data-line-end="6">Initialization of an instance variable is not mandatory. Its default value is 0.<br>
Instance variables can be accessed only by creating objects.</p>
</li>
</ul>

### Example

```
public class instance {
     
    // Declaring instance variables
        public int rollNum; 
        public String name; 
        public int totalMarks;
        public int number;
     
    public static void main(String[] args) {
         
        // created object
        instance in = new instance();
        in.rollNum = 95;
        in.name = "Saket";
        in.totalMarks = 480;
         
        // printing the created objects
        System.out.println(in.rollNum);
        System.out.println(in.name);
        System.out.println(in.totalMarks);
         
        /*
         * we did not assign the value to number so it 
         * will print '0' by default
         */
        System.out.println(in.number);
 
    }
 
}
```
</details>
<br>

 <details>
<summary>Static Variable</summary>
<br>
 <ul>
<li class="has-line-data" data-line-start="0" data-line-end="2">
<p class="has-line-data" data-line-start="0" data-line-end="1">Static variables are also known as class variables.</p>
</li>
<li class="has-line-data" data-line-start="2" data-line-end="3">
<p class="has-line-data" data-line-start="2" data-line-end="3">These variables are declared similarly as instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor or block.</p>
</li>
<li class="has-line-data" data-line-start="3" data-line-end="4">
<p class="has-line-data" data-line-start="3" data-line-end="4">Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.</p>
</li>
<li class="has-line-data" data-line-start="4" data-line-end="5">
<p class="has-line-data" data-line-start="4" data-line-end="5">Static variables are created at the start of program execution and destroyed automatically when execution ends.</p>
</li>
<li class="has-line-data" data-line-start="5" data-line-end="6">
<p class="has-line-data" data-line-start="5" data-line-end="6">Initialization of a static variable is not mandatory. Its default value is 0.</p>
</li>
<li class="has-line-data" data-line-start="6" data-line-end="7">
<p class="has-line-data" data-line-start="6" data-line-end="7">If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically.</p>
</li>
<li class="has-line-data" data-line-start="7" data-line-end="8">
<p class="has-line-data" data-line-start="7" data-line-end="8">If we access a static variable without the class name, the compiler will automatically append the class name.</p>
</li>
</ul>
<br>

### Example
```
public class StaticVariable {
     
    // radius is declared as private static
    private static int radius;
     
    // pi is a constant of type double declared as static
    private static final double pi = 3.14;
 
    public static void main(String[] args) {
         
        // assigning value of radius
        radius = 3;
         
        // calculating and printing circumference
        System.out.println("Circumference of a circle is: " + 2*pi*radius);
 
    }
 
}
```
</details>
