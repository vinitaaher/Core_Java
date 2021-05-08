## Output of HashMapDemo.java

      
           Case 1 :
           Output if we are not override hashcode and equals method in Employee Class  :

           {10=pawan}
           {Employee{id=2, name='vinita'}=pawan}

           Case 2 :

           Output if we are overrided hashcode and equals method in Employee Class :

           {10=pawan}
           {Employee{id=2, name='vinita'}=pawan, Employee{id=2, name='vinita'}=Vinita}
        
 
 
 - Reason if we are adding our custom class object as key in hash based collection then it's necessarry to override equal and hash code method. becuase if we are not overriden then it will use objet class hash code method which return hashcode on the basis of reference and that is different so that's why our buisness logic not functioning properly.

 - Same thing happen for has set as well . Beacuse has set uses hashmap internally.

            Case 1 :

            Output if we are not override hashcode and equals method in Employee Class  :

            [12]
            [Employee{id=1, name='vinita'}, Employee{id=1, name='vinita'}]

           Case 2 :

           Output if we are overrided hashcode and equals method in Employee Class :

           [12]
           [Employee{id=1, name='vinita'}]


### Hashcode & equal method contract

- if two object are equal means having same hashcode .but if two object having same hashcode doesnt mean they are equal.

      If o1.equals(o2), then o1.hashCode() == o2.hashCode() should always be true.
      If o1.hashCode() == o2.hashCode is true, it doesn’t mean that o1.equals(o2) will be true.
 


