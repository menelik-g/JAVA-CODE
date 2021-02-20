public class Foo {
    public static void main(String[] args){
        int[] vals = {1, 2, 3, 4, 5};
        Math.pow(2,10); // this is fine, because pow() is a static method
       // Math m = new Math();//cannot create instance of Math because Math is private/ already has a Math()
        
        Foo f = new Foo(); 
        Foo.add5(vals); // this is FINE, because add5() is a static method
        printArray(vals); //what do you expect to be printed? 
        // Notice I didn't write Foo.printArray(vals)  
        // This works because this main method is inside class Foo
        // and printArray is static inside class Foo
        
        f.add5(vals); // this is FINE, because objects can "call" static methods
        printArray(vals); //what do you expect to be printed?
        
        f.add10(vals); // this is FINE, because objects can "call" non-static methods
        printArray(vals); //what do you expect to be printed?
        //Foo.add10(vals); // this is NOT fine, because add10() is an instance method
    }

    static void add5(int[] a) { // static method in Foo (can call from class scope)
        for(int i = 0; i< a.length; i++) 
            a[i] = a[i] + 5;
    }
    
    void add10(int[] a) { // instance method in Foo (needs an instance to "work")
        for(int i = 0; i< a.length; i++) 
            a[i] = a[i] + 10;
    }
    
    static void printArray(int[] array) { // Can be called from class scope
        System.out.println("Printing array " + array + ":");
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]); //what do you expect to be printed?
        System.out.println();
    }
}